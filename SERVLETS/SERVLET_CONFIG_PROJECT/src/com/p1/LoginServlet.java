package com.p1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

// SERVLET CONFIG INIT PARAMETERS DEMO
public class LoginServlet extends HttpServlet {



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	ServletConfig sc=this.getServletConfig();
	//STOP HARDCODING NOW IMMEDIATELY !!! PLEASE STOP & go for config files !!
	//String uname="user1";
	//String pwd="user1";
	String uname=sc.getInitParameter("username");
	String pwd=sc.getInitParameter("password");
	
	response.setContentType("text/html");
	
	PrintWriter out=response.getWriter();
	 out.println("<b><marquee>Username = "+uname+" ; Password = "+pwd+"</marquee></b>");
	
	}

}
