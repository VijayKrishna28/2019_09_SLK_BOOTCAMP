package com.use;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.*;

public class DateServlet extends HttpServlet {
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		Date obj=new Date();
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<i><b>Date and TimeStamp is "+obj.toString()+"</b></i>" );
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
