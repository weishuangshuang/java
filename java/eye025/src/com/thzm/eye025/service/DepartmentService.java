package com.thzm.eye025.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.thzm.eye025.bean.Department;
import com.thzm.eye025.dao.DepartmentDAO;
import com.thzm.eye025.dao.JdbcTemplate;

public class DepartmentService {
	
	public static Map<String, Object> selectOne(int id) throws SQLException{
		
		String sql = "select * from department where id=?"; 
		return DepartmentDAO.selectOne(sql, id);
	}
	
	public static List<Department> selectAll() throws SQLException{
		String sql = "select * from department";
		return DepartmentDAO.select(sql);
	}
	
	public static boolean pic (String name,String picture,String content) {
		
		boolean ok = true;
		
		String sql = "insert into department(name,picture,content) values(?,?,?)";
		
		try {
			DepartmentDAO.inset( sql,name,picture,content);
		} catch (SQLException e) {
			ok = false;
			e.printStackTrace();
		}
		return ok;
	}
	
	
	public static void main(String[] args) throws SQLException {
//		System.out.println(selectAll());
		System.out.println( pic("科室", "s", "你好啊"));
		
	}
}

