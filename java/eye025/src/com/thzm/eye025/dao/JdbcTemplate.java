package com.thzm.eye025.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据库模板类
 * @description 数据库操作的模板类，提供公共的数据库JDBC操作功能。
 * 最大化将用户公共相同的代码抽取出来，在这里实现。
 * 用户在访问数据库时，只要写必须的部分就可以了。
 * @author weishauangshuang
 * @version 1.0
 */
public class JdbcTemplate {

	private static final String name = "eye025"; // 数据类用户名
	private static final String password = "123456"; // 数据库用户密码
	private static final String url = "jdbc:mariadb://localhost:3306/eye025"; // 连接数据库的URL
	private static final boolean load;
	
	static {
		boolean ok = true;
		try {
			Class.forName("org.mariadb.jdbc.Driver");  // 注册驱动
		} catch (ClassNotFoundException e) {
			ok = false;
			e.printStackTrace();
		} finally {
			load = ok;
		}
	}
	
	private static Connection getConn() throws SQLException {
		Connection conn = null;
		if(load) {
			conn = DriverManager.getConnection(url, name, password); // 	获取连接对象。
		}
		return conn;
	}
	
	
	public static int update(String sql) throws SQLException {
		int count = -1;
		Connection conn = null;  //Connection与特定数据库连接。执行SQL语句并在连接的上下文中返回结果
		Statement stm = null;    //Statment用于执行静态SQL语句并返回其生成的结果
		try {
			conn = getConn();   //调用getCoon方法（自己定义的）
			stm = conn.createStatement();//连接对象，创建语句对象，用于缉拿个SQL语句发送到数据库；
			count = stm.executeUpdate(sql);//执行查询语句，语句对象将SQL语句发送给数据库以执行,查询数据库是executeQuery,其它都是executeUpdate
		} catch (SQLException e) {
			throw e;
		} finally {
			if(null != stm) {
				stm.close();
			}
			if(null != conn) {
				conn.close();
			}
		}
		
		return count;
	}
	
	public static int update(String sql, Object...args) throws SQLException {
		int count = -1;
		Connection conn = null;
		PreparedStatement stm = null; //表示预编译的SQL语句的对象，SQL语句已经预编译并存出在PreparedStatement对象中
		try {
			conn = getConn();
			conn.setAutoCommit(false);//关闭自动提交
			stm = conn.prepareStatement(sql);//创建一个PreparedStatement对象，用于将参数化的SQL语句发送到数据库
			if(args != null) {
				for(int i=0; i<args.length; i++) {
					stm.setObject(i+1, args[i]);//给?加参数（？是sql语句里的)
				}
			}
			count = stm.executeUpdate();
			conn.commit();//执行完全部后手动提交
		} catch (SQLException e) {
			conn.rollback();//回滚事物，变成初始状态
			throw e;
		} finally {
			conn.setAutoCommit(true);//改成原来值
			if(null != stm) {
				stm.close();
			}
			if(null != conn) {
				conn.close();
			}
		}
		
		return count;
	}
	
	public static <T> T select(String sql, ResultSetExtractor<T> ext,Object...args) throws SQLException {
		T t = null;
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rst = null;
		
		try {
			conn = getConn();
			stm = conn.prepareStatement(sql);
			if(args != null) {
				for(int i=0;i<args.length; i++) {
					stm.setObject(i+1, args[i]);
				}
				rst = stm.executeQuery();
				t = ext.extract(rst);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rst != null) {
				rst.close();
			}
			if(null != stm) {
				stm.close();
			}
			if(null != conn) {
				conn.close();
			}
		}
		
		return t;
	}
	
	public static Map<String, Object> selectOne(String sql, Object...args) throws SQLException{
		Map<String, Object> m = null;
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rst = null;
		
		try {
			conn = getConn();
			stm = conn.prepareStatement(sql);//表示预编译的SQL语句的对象，SQL语句已经预编译并存出在PreparedStatement对象中
			if(null != args) {
				for(int i=0; i<args.length; i++) {
					stm.setObject(i+1, args[i]);
				}
			}
			rst = stm.executeQuery(); // 执行PreparedStatement对象中的SQL查询，并返回PreparedStatement的ResultSet对象
			ResultSetMetaData metaData = rst.getMetaData(); // 取得元数据对象。
			int clCnt = metaData.getColumnCount(); // 从元数据中获取，查询了多少个列。
			
			if(rst.next()) {    //将光标从当前位置向前移动一行
				m = new HashMap<>();
				for(int i=1; i<=clCnt; i++) {
					Object val = rst.getObject(i); // 获取当前行中指定列的值
					String colName = metaData.getColumnLabel(i); // 从元数据中取i列的列名。
					
					m.put(colName, val); // 将列名和对应的值，存入map中。
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rst!= null) {
				rst.close();
			}
			if(null != stm) {
				stm.close();
			}
			if(null != conn) {
				conn.close();
			}
		}
		
		return m;
	}
}