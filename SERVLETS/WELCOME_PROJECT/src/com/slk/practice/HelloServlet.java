package com.slk.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HelloServlet extends HttpServlet {
	

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		System.out.println("Hello All, welcome to Servlets!!!");
		
		response.setContentType("text/html");
		 
		PrintWriter out=response.getWriter();
		
		out.println("<marquee><b style='color:green;'>Hello All, welcome to Servlets!!!</b></marquee>");
		
	}

}
