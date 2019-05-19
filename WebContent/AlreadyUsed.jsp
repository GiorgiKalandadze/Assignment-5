<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<html>
<head>
    <title>Create Account</title>
</head>
<body>

<form action="CreateServlet" method="POST">
	<% String name = request.getParameter("username"); %>
	<h1><%= "The Name " + name + " is Already In Use" %></h1>
	
	<label>Please enter another name and password</label>
	<br>
	<br>
	
    <label for="username"><b>User Name</b></label>
    <input id="username" type="text"
           name="username" required>
    <br>
	<br>
    <label for="password"><b>Password</b></label>
    <input id="password" type="password"
           name="password" required>
    <button type="submit">Login</button>
    
    
    
</form>

</body>
</html>
