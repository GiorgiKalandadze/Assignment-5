<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<html>
<head>
    <title>Create Account</title>
</head>
<body>

<form action=CreateServlet method="POST">
	<h1>Create New Account</h1>
	
	<label for="pleaseLogIn"><b>Please enter proposed name and password.</b></label>
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
    
    
    
</form>

</body>
</html>
