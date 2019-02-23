package xdd.dao;

import java.sql.SQLException;
import java.util.Map;

import xdd.dao.JdbcTemplate;

public class RegUserDAO {
	
	public static int insert(String sql,Object...args) throws SQLException {
		return JdbcTemplate.update(sql, args);
	}
	
	public static Map<String, Object> selectOne(String sql, Object...args) throws SQLException {
		return JdbcTemplate.selectOne(sql, args);
	}
	
//	public static void main(String[] args) throws SQLException {
//		String sql = "select * from regUser where userName=\"王二\" and password=\"123456\"";
//		System.out.println(selectOne(sql));
//	}

}
