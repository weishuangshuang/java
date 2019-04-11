package xdd.dao;

import java.sql.SQLException;
import java.util.Map;

public class BlogDAO {
	
	public static  Map<String, Object> selectOne(String sql, Object...args) throws SQLException{
		
		return JdbcTemplate.selectOne(sql, args);
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		String sql = "insert into blog(blogId,blogName) values(2,'wss')";
		String sql1 = "insert into blog values(3,'wss','wss','pic','halou','haha',1,'xx')";   
		System.out.println(selectOne(sql1));
	
	}
	
	

}
