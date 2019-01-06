package com.thzm.eye025.service;

import java.sql.SQLException;

import com.thzm.eye025.dao.ProfessorDAO;

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
	
	

}
