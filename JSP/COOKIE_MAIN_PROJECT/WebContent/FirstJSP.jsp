<body>

<%

  String myname=request.getParameter("realname");

  Cookie thecookie= new Cookie("uname",myname);
  
  thecookie.setMaxAge(60*60*24*2);// 2 days
  
  response.addCookie(thecookie);
  
  response.sendRedirect("SecondJSP.jsp");


%>




</body>