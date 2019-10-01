package com.p1;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet implements Servlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Inside FirstServlet @ "+ new java.util.Date());
		
		
		String myname=request.getParameter("realname");
		//"myname" is realname and it is client data ; read intoservlet!!
		
		HttpSession session=request.getSession();
		
		session.setAttribute("uname", myname);
		
		response.sendRedirect("SecondServlet");
		
		
	}

}
