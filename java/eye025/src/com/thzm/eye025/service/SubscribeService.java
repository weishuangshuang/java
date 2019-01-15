package com.thzm.eye025.service;

import java.sql.SQLException;
import java.util.Date;

import com.thzm.eye025.dao.SubscribeDAO;
import com.thzm.eye025.util.Util;

public class SubscribeService {
	
	public static boolean pic(String name,String connect,String email,String gender,int age,String item,Date date,String description) {
		
		boolean ok = true;
		
		String sql = "insert into subscribe(name,connect,email,gender,age,item,date,description) values(?,?,?,?,?,?,?,?)"; 
		
		try {
			SubscribeDAO.insert(sql, name,connect,email,gender,age,item,date,description);
		} catch (SQLException e) {
			ok = false;
			e.printStackTrace();
		}
		
		return ok;
	}
	
	public static void main(String[] args) {
		System.out.println(pic("李四","10010","1234567@qq.com","男",19,"7",Util.parseDate("2018-01-02"),"眼睛"));
	}

}
