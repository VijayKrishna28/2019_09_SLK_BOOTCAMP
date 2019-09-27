package com.retry;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/magic")
public class MagicServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name=request.getParameter("fullname");
		
		 String reverse = "";
	        
	        
	        for(int i = name.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + name.charAt(i);
	        }
	        
	//result is reverse
	        
	        
	        response.setContentType("text/html");
	        
	        PrintWriter out=response.getWriter();
	        
	        out.println("<b> Magic = "+reverse+"</b>");
	        
	        
		
	}

}
