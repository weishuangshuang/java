package com.thzm.eye025.dao;

import java.sql.SQLException;

public class SubscribeDAO {
	
	public static int insert ( String sql, Object...args) throws SQLException {
		
		return JdbcTemplate.update(sql, args);
	}

}
