package com.thzm.eye025.serviets.wx;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thzm.eye025.service.SubscribeService;

import net.sf.json.JSONObject;



/**
 * Servlet implementation class Showsub
 */
@WebServlet("/showsub")
public class Showsub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Showsub() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		response.setContentType("application/x-www/form-urlencoded;charset=utf-8");
		
		ObjectMapper mapper = new ObjectMapper();
		
		JSONObject json = JSONObject.fromObject(request.getParameter("id"));
		
		String name = (String) json.get("name");
		String connect = (String) json.get("phone");
		String email = (String) json.get("emil");
		String gender = (String) json.get("radio");
		String age = (String) json.get("age");
		String item = "not";
		String date = (String) json.get("date");
		String description = (String) json.get("describe");
		String project = (String) json.get("project");
		
		
		System.out.println(request.getParameter("id"));
		
		SubscribeService.pic(name, connect, email, gender, age, item, date, description,project);
	}

}
