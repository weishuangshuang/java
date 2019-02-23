package com.thzm.eye025.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thzm.eye025.bean.Professor;




public class ProfessorDAO {
	
	public static int insert(String sql,Object...args) throws SQLException {
		return JdbcTemplate.update(sql, args);
	}
	
	public static List<Professor> select(String sql, Object...args) throws SQLException {
			
			ResultSetExtractor<List<Professor>> ext = new ResultSetExtractor<List<Professor>>() {
	
				@Override
				public List<Professor> extract(ResultSet rst) throws SQLException {
					
					List<Professor> dep = new ArrayList<>();
					while(rst.next()) {
						String name = rst.getString("name");
						String photo = rst.getString("photo");
						String summary = rst.getString("summary");
						int id = rst.getInt("id");
						
						Professor pro = new Professor(name, photo, summary, id);
						dep.add(pro);
					}
					
					return dep;
				}
			};
			return (List<Professor>) JdbcTemplate.select(sql, ext, args);
		}

	public static void main(String[] args) throws SQLException {
		
		//System.out.println(select("select * from professor"));
		
	}

}
