package com.thzm.eye025.serviets.wx;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thzm.eye025.bean.Department;
import com.thzm.eye025.service.DepartmentService;


@WebServlet("/showdepartment")
public class Showdepartment extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String json = "{}";
		
		try {
			List<Department> abs =  DepartmentService.listall();
			
			if(abs != null){
				
//				json = "{\"p1\":\""+abs.getPicture1()+"\", \"p2\":\""+ abs.getPicture2()+"\","
//						+ "\"p3\":\""+abs.getPicture3()+"\",\"content\":\""+abs.getContent()+"\"}";
				
				//用ObjectMapper这个类可以自动把对象转换成json字符串，不用手动拼接
				ObjectMapper mapper = new ObjectMapper(); //ObjectMapper java对象和json之间相互转换 要单独导入包
				json = mapper.writeValueAsString(abs); //writeValueAsString 把java对象转换成json字符串
				System.out.println(json);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.setHeader("Content-type", "application/json; charset=utf-8"); //setHeader 设置响应头
		
		PrintWriter out = response.getWriter();//PrintWriter提供一个方法，是发送请求内容到页面 getWriter() 直接在页面输出
		out.println(json); //println换行输入json的内容
		
	}
	

}
