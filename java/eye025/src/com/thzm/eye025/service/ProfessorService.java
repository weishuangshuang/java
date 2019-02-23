package com.thzm.eye025.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thzm.eye025.bean.Professor;
import com.thzm.eye025.dao.JdbcTemplate;
import com.thzm.eye025.dao.ProfessorDAO;
import com.thzm.eye025.dao.ResultSetExtractor;

public class ProfessorService {
	
	public static boolean pic(String...args){
		
		boolean ok = true;
		 String sql = "insert into professor(name,photo,summary,department_id) values(?,?,?,?)";
		
		 try {
			 ProfessorDAO.insert(sql, args);
		 } catch (SQLException e) {
			 ok =false;
			 e.printStackTrace();
		 }
		 return ok;
	}
	
	public static List<Professor> listall() throws SQLException{
		String sql = "select * from professor";
		return ProfessorDAO.select(sql);
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(listall());
	}

}
