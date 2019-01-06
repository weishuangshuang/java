package com.thzm.eye025.serviets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thzm.eye025.bean.Sysadmin;
import com.thzm.eye025.service.UserService;

import sun.rmi.server.Dispatcher;



public class LoginServiet implements Servlet{

	private String contentType;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg) throws ServletException {
		String charset = arg.getServletContext().getInitParameter("charset");
		this.contentType = "text/html;charset="+charset;
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		
		String admin = request.getParameter("adminName");//获取用户发送的请求数据
		String password = request.getParameter("password");
		System.out.println(admin);
		System.out.println(password);
		boolean ok = true;
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		Sysadmin user = null;
		
		try {
			user = UserService.login(admin, password);
		} catch (SQLException e) {
			e.printStackTrace();
			ok =false;
		}
		System.out.println("----------- 我可以为你进行登录服务------------");
		if(!ok) {
			response.getWriter().print(" 服务器出现错误。 "); // 响应。输出给浏览器的内容。
			
		}
		else {
			if(user != null) {//登录成功
				
				//自动登录处理
				String auto = request.getParameter("autologin");
				if("on".equals(auto)) {
					Cookie c1 = new Cookie("adminName",admin);
					Cookie c2 = new Cookie("password",password);
					c1.setMaxAge(60*60*24*10);
					c2.setMaxAge(60*60*24*10);
					
					HttpServletResponse rsp = (HttpServletResponse) response;
					rsp.addCookie(c1);
					rsp.addCookie(c2);
				}
								
				// 获取用户的Session 对象。
				HttpSession session = req.getSession(true);
				// 把用户信息放到Session 中。
				session.setAttribute("userInfo", user);
				
				HttpServletResponse res  = (HttpServletResponse) response;
				res.sendRedirect("./admin.jsp");//向浏览器发送一个重定向。定向到/admin.jsp
				
				//response.getWriter().print(" login success. "); // 响应。输出给浏览器的内容。
				//RequestDispatcher dispatcher = request.getRequestDispatcher("admin.html"); //getRequestDispatcher获取一个请求转发对象
				//request 请求
				//dispatcher.forward(request,response);
			}else {//登录失败
				//response.getWriter().print(" user name or password error. "); // response响应。输出给浏览器的内容。
				request.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}		
		
	}

}
