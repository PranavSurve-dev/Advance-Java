<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Demo JSP page</h1>

	<!-- Declaration Tag -->
	<%!
		int a = 10 ;
		public String greet()
		{
			return "Hello" ;
		}
	%>
	<!-- Script-let Tag -->
	<%
		//String p = request.getParameter("fdajsk");
		int b = 20 ;//local variable
		int c = 30;
	%>
	<!-- Expression Tag -->
	<h2>a : <%=a %></h2>
	<h2>b : <%=b %></h2> 	
	<h2>c : <%=c %></h2>
	<h2>Greetings : <%=greet()%></h2>
	
	<%
	String name = "Pranav Surve";
	//out.println(name);
	%>
	
	<% 
	//session.setAttribute("uname", "Pranav Surve");
	%>
	
	<% String a = " Jspider"; 
    //out.println(a);
	
	%>
	
	<h2>Hello :<%=a%></h2>
	
	
</body>
</html>