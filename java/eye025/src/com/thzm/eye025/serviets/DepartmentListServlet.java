package com.thzm.eye025.serviets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thzm.eye025.bean.Department;
import com.thzm.eye025.service.DepartmentService;

/**
 * Servlet implementation class DepartmentListServlet
 */
@WebServlet("/departmentList")
public class DepartmentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Department> depart = null;
		
		try {
			depart = DepartmentService.listall();
			request.setAttribute("depart", depart);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			request.getRequestDispatcher("depart_list.jsp").forward(request, response);
		}
	}


}
