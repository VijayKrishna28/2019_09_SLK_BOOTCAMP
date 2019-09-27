package com.compute;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.*;

public class AddServlet extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		int i=Integer.parseInt(  request.getParameter("num1")  );
		int j=Integer.parseInt(  request.getParameter("num2")  );
		
		int k = (i+j);//addition done
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		
		out.println("<html><body>");
		out.println("<H2> Total = "+k+"</H2>");
		out.println("</body></html>");
		
		
	}

}
