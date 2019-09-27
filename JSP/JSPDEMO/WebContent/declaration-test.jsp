<html>

<body>

<H3> <i>JSP DECLARATION DEMO</i> </H3>

<hr> <br>

  <%!
  
  int class_strength=17; //varaiable declared
  
  String makeItLower(String data) //method declared
  {
	  return data.toLowerCase();
  }
  //class declared
  abstract class Shape{
	  
	  public abstract double area();
	  public abstract double perimeter();
  }
  
   %>
<hr> <br>

Lower Case of "HELLO WORLD"  : <%= makeItLower("HELLO WORLD") %> <br><br>
My beautiful class strength : <%= class_strength %>

</body>


</html>