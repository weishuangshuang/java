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

import xdd.ben.Blog;
import xdd.ben.RegUser;
import xdd.service.BlogService;

/**
 * Servlet implementation class BlogServlets
 */
@WebServlet("/py")
public class BlogServlets implements Servlet {
	private static final long serialVersionUID = 1L;
	

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String blogName = request.getParameter("blogName");
		String nickName = request.getParameter("nickName");
		String photo = request.getParameter("photo");
		String description = request.getParameter("description");
		String affiche = request.getParameter("affiche");
		
		boolean ok = true;
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		Blog user = null;
		
		HttpSession sessio = req.getSession();
		RegUser us =  (RegUser) sessio.getAttribute("userInfo");
		
		int userId =  us.getUserId();
		System.out.println(userId);
		
		try {
			user = BlogService.insert(blogName, nickName, photo, description, affiche,userId);
		} catch (SQLException e) {
			e.printStackTrace();
			ok = false;
			
		}
		
		if(!ok) {
			response.getWriter().print(" 服务器出现错误。 "); // 响应。输出给浏览器的内容。
			
		}
		else {
			if(user != null) {
				// 获取用户的Session 对象。
				HttpSession session = req.getSession(true);
				// 把用户信息放到Session 中。
				//session.setAttribute("blogInfo", user);
				
				HttpServletResponse res  = (HttpServletResponse) response;
				//res.sendRedirect("./index.jsp");//向浏览器发送一个重定向。定向到
				response.getWriter().print(" 服务器出现正常。 ");
			}
		}
		
	}

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
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
		
		
		
		
	}
	


