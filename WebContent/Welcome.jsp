<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<form action="LoginServlet" method="POST">
	<h1>Welcome to Homework 5</h1>
	
	<label for="pleaseLogIn"><b>Please log in.</b></label>
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
    <br>
    <br>
    
    <a href="CreateNewAccount.jsp">Create New Account</a>
    
</form>

</body>
</html>
