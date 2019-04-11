package xdd.service;

import java.sql.SQLException;
import java.util.Map;

import xdd.ben.Blog;
import xdd.dao.BlogDAO;

public class BlogService {
	
	public static Blog insert(String blogName1,String nickName1,String photo1,
									String description1,String affiche1,int userId1) throws SQLException {
		
		Blog u = null;
		String sql = "insert into blog(blogName,nickName,photo,description,affiche,userId) values(?,?,?,?,?,?)";
		Map<String, Object> m = BlogDAO.selectOne(sql, blogName1,nickName1,photo1,description1,affiche1,userId1);
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
	
	public static void main(String[] args) {
		
	}

}
