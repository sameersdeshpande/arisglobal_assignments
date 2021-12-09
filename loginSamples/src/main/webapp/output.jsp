<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Result</title>
</head>
<body>

Number 1:<%=request.getAttribute("num1") %>
<br>
Number 2:<%=request.getAttribute("num2")%>
<br>
Result:<%=request.getAttribute("c")%>
</body>
</html>