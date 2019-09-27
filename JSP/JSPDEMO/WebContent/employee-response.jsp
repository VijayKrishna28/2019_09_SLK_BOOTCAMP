<html>

<body>

<%

String name=request.getParameter("ename");

String sal=request.getParameter("esal");

int realsal=Integer.parseInt(sal);


out.println(name+" , your annual salary is "+ (realsal*12));



 %>

</body>



</html>