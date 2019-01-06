package com.thzm.eye025.filter;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thzm.eye025.bean.Sysadmin;
import com.thzm.eye025.service.UserService;


@WebFilter("/*")
public class Accessfilter implements Filter {

  

	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String s = req.getScheme(); //获取请求头是http还是https
		String host = req.getLocalName();//获取主机号
		int port = req.getLocalPort();//获取端口号
		String ctx = req.getContextPath();//获取服务器根目录 /eye025
		String url = s + "://"+ host +":" + port +ctx; //拼接成一个url地址
		
		String path = req.getServletPath();//获得服务器名称(eye025)后面的地址
		HttpSession session = req.getSession(true);
		Object o = session.getAttribute("userInfo");
		 
		 if(o != null) { //已登陆
			 chain.doFilter(request, response); //放行
		 }else { //未登录
			 if(-1 != path.indexOf("index.jsp") || -1!=(path.indexOf("login"))) { //看当前页面是否是登录界面，是的话允许到登录界面
				 chain.doFilter(request, response);
				 
			 }else {
				
				 Cookie[] cks = req.getCookies(); //获取请求的Cookie数组
				 Map<String, String> map = new HashMap<>(); //HashMap是键值对，反映映射关系，里面有key和对应的vale键值对
				 
				 for(Cookie c : cks) { //循环遍历cks中的有效数组 c代表cks数组里的具体数值，不是下标
					 map.put(c.getName(), c.getValue());//第一遍执行是把c1里的第一个值给key，第二个值给value
				 }
				 
				 try {
						Sysadmin u = UserService.login(map.get("adminName"), map.get("password")); //把账户和密码给UserService.login方法重新登录
						session.setAttribute("userInfo", u); //登录信息放在userInfo里
						if(u!=null) { //如果UserService.login 返回结果不为null，说明账号和密码正确
							res.sendRedirect(url+"/admin.jsp");  //重定向到admin.jsp页面
						}else {
							res.sendRedirect(url); //帐号密码不正确返回到登录界面
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
				 
			 }
		 }
		
		
		
	}
	
	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
