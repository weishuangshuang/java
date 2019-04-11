package com.thzm.eye025.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thzm.eye025.bean.Department;
import com.thzm.eye025.bean.Subscribe;

public class SubscribeDAO {
	
	public static int insert ( String sql, Object...args) throws SQLException {
		
		return JdbcTemplate.update(sql, args);
	}
	
	public static List<Subscribe> selectAll(String sql,Object...args) throws SQLException{
	
		ResultSetExtractor<List<Subscribe>> ext = new ResultSetExtractor<List<Subscribe>>() {

			@Override
			public List<Subscribe> extract(ResultSet rst) throws SQLException {
				List<Subscribe> sub = new ArrayList<>();
				while(rst.next()) {
					String name = rst.getString("name");
					String connect = rst.getString("connect");
					String email = rst.getString("email");
					String gender = rst.getString("gender");
					String age = rst.getString("age");
					String item = rst.getString("item");
					String date = rst.getString("date");
					String  description = rst.getString("description");
					String  project = rst.getString("project");
					
					Subscribe abs = new Subscribe(name, connect, email, gender, age, item, date, description, project);
					sub.add(abs);
				}
				return sub;
			}
			
		};
		return (List<Subscribe>) JdbcTemplate.select(sql, ext, args);
	}
}
