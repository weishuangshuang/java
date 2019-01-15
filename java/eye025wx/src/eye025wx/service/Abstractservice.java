package eye025wx.service;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import eye025wx.dao.ResultSetExtractor;

import eye025wx.bean.Abstract;
import eye025wx.dao.AbstractDAO;
import eye025wx.dao.JdbcTemplate;




public class Abstractservice {

	public static List<Abstract> listAll() throws SQLException{
		String sql = "select * from abstract";
		return AbstractDAO.select(sql);
	}
	
	public static Abstract getabstract() throws SQLException {
		String sql = "select * from abstract where publish_status=1";
		
		ResultSetExtractor<Abstract> ext = new ResultSetExtractor<Abstract>() {

			@Override
			public Abstract extract(ResultSet rst) throws SQLException {
				if(rst.next()) {
					int id = rst.getInt("id");
					String picture1 = rst.getString("picture1");
					String picture2 = rst.getString("picture2");
					String picture3 = rst.getString("picture3");
					String content = rst.getString("content");
					boolean publishStatus = rst.getBoolean("publish_status");
					Date publishDate = rst.getDate("publish_data");
					
					return new Abstract(id, picture1, picture2, picture3, content, publishStatus, publishDate);
				}
				return null;
			}
		}; 
		
		return JdbcTemplate.select(sql, ext);
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(getabstract());
	}
}
