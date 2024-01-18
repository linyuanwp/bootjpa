<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Hi Pankaj</h3><br>
<strong>Current Time is</strong>: <%=new Date() %>

<form action="addAlien">
<input type="text" name="aid"><br>
<input type="text" name="aname"><br>
<input type="submit"><br>
</form>

<form action="getAlien">
<input type="text" name="aname"><br>
<input type="submit"><br>
</form>

</body>
</html>