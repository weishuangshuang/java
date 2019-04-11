package com.thzm.eye025.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.thzm.eye025.bean.Subscribe;
import com.thzm.eye025.dao.SubscribeDAO;
import com.thzm.eye025.util.Util;

public class SubscribeService {
	public static List<Subscribe> listAll() throws SQLException{
		String sql = "select * from subscribe";
		return SubscribeDAO.selectAll(sql);
		
	}
	
	public static boolean pic(String name,String connect,String email,String gender,String age,String item,String date,String description,String project) {
		
		boolean ok = true;
		
		String sql = "insert into subscribe(name,connect,email,gender,age,item,date,description,project) values(?,?,?,?,?,?,?,?,?)"; 
		
		try {
			SubscribeDAO.insert(sql, name,connect,email,gender,age,item,date,description,project);
		} catch (SQLException e) {
			ok = false;
			e.printStackTrace();
		}
		
		return ok;
	}
	
	public static void main(String[] args) throws SQLException {
//		System.out.println(pic("李四","10010","1234567@qq.com","男","19","7","2018-01-02","眼睛","视觉"));
//		System.out.println(pic("王二","10010","1234567@qq.com","男","19","7","2018-01-02","眼睛","视觉"));
//		System.out.println(listAll());
	}

}
