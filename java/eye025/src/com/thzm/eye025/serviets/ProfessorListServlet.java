package com.thzm.eye025.serviets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thzm.eye025.bean.Professor;
import com.thzm.eye025.service.ProfessorService;

/**
 * Servlet implementation class ProfessorListServlet
 */
@WebServlet("/professorList")
public class ProfessorListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Professor> pro = null;
		
		try {
			pro = ProfessorService.listall();
		//	System.out.println(pro);
			request.setAttribute("pro", pro);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			request.getRequestDispatcher("pro_list.jsp").forward(request, response);
		}
	}


}
