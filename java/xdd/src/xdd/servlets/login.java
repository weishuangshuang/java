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
import xdd.service.RegUserService;

@WebServlet("/login")
public class login implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
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

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String admin = request.getParameter("adminName");//获取用户发送的请求数据
		String password = request.getParameter("password");
		System.out.println(admin);
		System.out.println(password);
		boolean ok = true;
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		RegUser user = null;
		boolean blog;
		
		try {
			user = RegUserService.logo(admin, password);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			ok = false;
		}
		
		System.out.println("----------- 我可以为你进行登录服务------------");
		if(!ok) {
			response.getWriter().print(" 服务器出现错误。 "); // 响应。输出给浏览器的内容。
			
		}
		else {
			if(user != null) {
				// 获取用户的Session 对象。
				HttpSession session = req.getSession(true);
				// 把用户信息放到Session 中。
				session.setAttribute("userInfo", user);
				
				HttpSession s = req.getSession();
				RegUser u = (RegUser) s.getAttribute("userInfo");
				int id = u.getUserId();
				
				try {
					Blog blo = RegUserService.sele(id);
					session.setAttribute("blogInfo", blo);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
				HttpServletResponse res  = (HttpServletResponse) response;
				res.sendRedirect("./index.jsp");//向浏览器发送一个重定向。定向到
			}else {
				
				request.getRequestDispatcher("logo.jsp").forward(request, response);
			}
		}
		
	}

}
