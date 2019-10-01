<body>

<%

 Cookie[] arr=request.getCookies();

 String name="";
 
 for(Cookie c: arr)
 {
	 if(c.getName().equals("uname"))
	 {
		 name=c.getValue();
	 }
 }

 out.println("Welcome "+name);

%>



</body>