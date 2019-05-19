<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<html>
<head>
	<% String name = request.getParameter("username"); %>
    <title><%= "Welcome " + name %></title>
</head>
<body>

<form action="LoginServlet" method="POST">
	<h1><%= "Welcome " + name %></h1>

</form>

</body>
</html>
