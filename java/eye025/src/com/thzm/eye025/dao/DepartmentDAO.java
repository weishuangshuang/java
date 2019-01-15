package com.thzm.eye025.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.thzm.eye025.bean.Abstract;
import com.thzm.eye025.bean.Department;

public class DepartmentDAO {
	
public static Map<String, Object>  selectOne(String sql,Object args) throws SQLException {
		
		return JdbcTemplate.selectOne(sql, args);
	}

public static int inset(String sql,String...args) throws SQLException {
	return JdbcTemplate.update(sql, args);
}

public static List<Department> select(String sql, Object...args) throws SQLException{
	
	ResultSetExtractor<List<Department>> ext = new ResultSetExtractor<List<Department>>() {
		
		@Override
		public List<Department> extract(ResultSet rst) throws SQLException {
			List<Department> dep = new ArrayList<>();
			while(rst.next()) {
				
				int id = rst.getInt("id");
				String name = rst.getString("name");
				String pictuer = rst.getString("picture");
				String content = rst.getString("content");
				
				Department abs = new Department(id, name, pictuer, content);
				dep.add(abs);
			}
			
			return dep;
			
		}
	};
	
	return (List<Department>) JdbcTemplate.select(sql, ext, args);
	
	}

}
