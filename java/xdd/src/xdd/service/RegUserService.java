package xdd.service;

import java.sql.SQLException;
import java.util.Map;

import xdd.ben.Blog;
import xdd.ben.RegUser;
import xdd.dao.RegUserDAO;

public class RegUserService {
	private static int count = 0;
	
	public static RegUser logo(String adminName, String pwd) throws SQLException {
		
		RegUser u = null;
		String sql = "select * from regUser where userName=? and password=?";
		Map<String, Object> m = RegUserDAO.selectOne(sql,adminName, pwd);
		
		if(m != null) {
			int userId = (int) m.get("userId");
			String userName =  (String) m.get("userName");
			String password = (String) m.get("password");
			String gender = (String) m.get("gender");
			String pwdproblem = (String) m.get("pwdproblem");
			String pwdanswer = (String) m.get("pwdanswer");
			
			u = new RegUser(userId, userName, password, gender,pwdproblem,pwdanswer);
		}
		
		return u;
	}
	
	public static boolean insert(String adminName, String pwd,String pwdproblem,String pwdanswer) throws SQLException {
		
		
		boolean u = false;
		String sql = "insert into regUser(userName,password,pwdproblem,pwdanswer) values(?,?,?,?)";
		Map<String, Object> m = RegUserDAO.selectOne(sql,adminName, pwd,pwdproblem,pwdanswer);
		if(m != null) {
			u = true;
			
		}
		
		return u;
	
	}
	
	public static Blog sele(int userId1) throws SQLException {
		Blog u = null;
		String sql = "select * from blog where userId = ?";
		Map<String, Object> m = RegUserDAO.selectOne(sql, userId1);
		if(m != null) {
			int blogId = (int) m.get("blogId");
			String blogName = (String) m.get("blogName");
			String nickName = (String) m.get("nickName");
			String photo = (String) m.get("photo");
			String description = (String) m.get("description");
			String affiche = (String) m.get("affiche");
			int userId = (int) m.get("userId");
			String accessCount = (String) m.get("accessCount");
			
			u = new Blog(blogId, blogName, nickName, photo, description, affiche, userId, accessCount);
		}
		
		return u;
	}
	
	public static void main(String[] args) throws SQLException {
		//System.out.println(logo("wss", "123456"));
		System.out.println(insert("wss", "123456", "s", "s"));
	}

}
