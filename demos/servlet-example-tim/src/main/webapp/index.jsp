<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="bmiForm" action="calculateServlet" method="POST">
    <table>
        <tr>
            <td>Your Weight:</td>
            <td><input type="text" name="weight"/></td>
        </tr>
        <tr>
            <td>Your Height:</td>
            <td><input type="text" name="height"/></td>
        </tr>
        <th><input type="submit" value="Submit" name="find"/></th>
        <th><input type="reset" value="Reset" name="reset" /></th>
    </table>
    <h2>${bmi}</h2>
</form>

</body>
</html>