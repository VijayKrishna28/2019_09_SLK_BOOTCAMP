<html>


<body>

<H3> Built-in Server Objects Demo</H3>


Request Header Info :    <%= request.getHeader("User-Agent") %> <br><br><br>


Request Locale Info :    <%= request.getLocale() %>


 <%
     response.setContentType("text/html");
 %>

</body>



</html>