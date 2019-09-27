package com.communicate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		
		System.out.println("Inside SecondServlet @ "+new java.util.Date());
		
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		out.println("<H1> Hello from SecondServlet. </H1>");
		out.println("</body></html>");
		
	}

}
