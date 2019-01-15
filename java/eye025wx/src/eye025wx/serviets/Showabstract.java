package eye025wx.serviets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import eye025wx.bean.Abstract;
import eye025wx.service.Abstractservice;


@WebServlet("/showabstract")
public class Showabstract extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String json = "{}";
		
		try {
			Abstract abs = Abstractservice.getabstract();
			
			
			if(abs != null){
				
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String json = "{}";
		
		try {
			Abstract abs = Abstractservice.getabstract();
			System.out.println(abs);
			
			if(abs != null){
				
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


