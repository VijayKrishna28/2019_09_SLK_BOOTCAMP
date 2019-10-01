package com.p1;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Details extends SimpleTagSupport {

	StringWriter sw=new StringWriter();
	
	public void doTag() throws JspException,IOException
	{
		getJspBody().invoke(sw);
		
		JspWriter out=getJspContext().getOut();
		
		out.println("Spider Man is the King of Kings!!! "+sw);
	}
	
}
