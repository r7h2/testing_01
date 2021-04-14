<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error handing page</title>
</head>
<body>
<%

exception.printStackTrace(response.getWriter());

%>

An exception was generated. Details are above. <br>
</body>
</html>