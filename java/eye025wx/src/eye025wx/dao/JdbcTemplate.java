package eye025wx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





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
	
	public static void main(String[] args) {
		
	}

}
