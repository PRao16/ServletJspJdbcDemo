package com.qcs.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.qcs.web.dao.EmployeeDao;
import com.qcs.web.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetEmployeeController
 */
public class GetEmployeeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id =Integer.parseInt(request.getParameter("id"));
		EmployeeDao dao = new EmployeeDao();
		Employee a1 = dao.getEmployee(id);
		
		request.setAttribute("employee", a1);
		
		jakarta.servlet.RequestDispatcher rd = request.getRequestDispatcher("showEmployee.jsp");
		rd.forward(request, response);
	}

	

}
