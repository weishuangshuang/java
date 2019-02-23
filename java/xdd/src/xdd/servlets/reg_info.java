package xdd.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import xdd.ben.RegUser;
import xdd.service.RegUserService;

/**
 * Servlet implementation class reg_info
 */
@WebServlet("/reginfo")
public class reg_info implements Servlet {
	private static final long serialVersionUID = 1L;

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
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String adminName = request.getParameter("adminName");
		String password = request.getParameter("password");
		String password1 = request.getParameter("password1");
		String pwdproblem = request.getParameter("pwdproblem");
		String pwdanswer = request.getParameter("pwdanswer");
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		boolean user = false;
		
		if(true) {
			try {
				user = RegUserService.insert(adminName, password, pwdproblem, pwdanswer);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(adminName);
		System.out.println(password);
		System.out.println(password1);
		System.out.println(pwdproblem);
		System.out.println(pwdanswer);
		System.out.println(user);
		
		if(user != false) {
			
			HttpServletResponse res  = (HttpServletResponse) response;
			res.sendRedirect("./reg_success.html");//向浏览器发送一个重定向。定向到
		}else {
			HttpServletResponse res  = (HttpServletResponse) response;
			res.sendRedirect("./reg_info.jsp");//向浏览器发送一个重定向。定向到
		}
		
		
		
		
		
	}
       
   

}
