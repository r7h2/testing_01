<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="handle-error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String responseCheck = request.getParameter("office");
if(responseCheck != null){
	response.setStatus(response.SC_MOVED_TEMPORARILY);
	response.setHeader("Location", "response-redirect.jsp?office=" + responseCheck);
}

String errorCheck = request.getParameter("error");
if (errorCheck != null) {
	int x = 0;
	if (x == 0)
		throw new RuntimeException("Exception has been raise");
}
%>
<%
	int serverPort = request.getServerPort();
	out.println("The server is running in port " + String.valueOf(serverPort) + "<br>");
	out.println("Servlet name is " + config.getServletName() + "<br>");
	out.println("Server info:"+  application.getServerInfo() + "<br>");
	String pageName = page.toString();
	out.println("the name of the page is " + pageName + "<br>");
	
	pageContext.setAttribute("userid", "John Doe");
	out.println("userid attribute from pageContext: " + pageContext.getAttribute("userid") + "<br>");
%>

<a href="index.jsp?office=head_office">Show usage of response object</a><br>
<a href="index.jsp?error=1">Show usage of error object</a><br>

<%
	if (response.containsHeader("Office")){
		out.println("Current location is " + response.getHeader("Office"));
	}
	
%>

<%out.println("Hello from my simple jsp"); %>
</body>
</html>