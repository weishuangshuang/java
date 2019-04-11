package com.thzm.eye025.serviets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thzm.eye025.bean.Department;
import com.thzm.eye025.service.DepartmentService;



/**
 * Servlet implementation class ErDetail
 */
@WebServlet("/erDetail")
public class ErDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		if(request.getParameter("id") != null) {
			String idd = request.getParameter("id");
			int id = Integer.parseInt(idd);
		
		
		String json = "{}";
		
		try {
			List<Department> abs =  DepartmentService.listaone(id);
		//	System.out.println(abs);
			
			if(abs != null){	
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
}
