<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add records</title>
</head>
<body>
	<b>Enter Student Details</b>
	<form action="AddServlet" method ="post">
		Name : <input name = "name"><br><br>
		Address : <input name = "address"><br><br>
		Where do you want to save:
		<select name = "impl">
		<option value = "Database">Database</option>
		<option value = "FileSystem">FileSystem</option>
		</select>
		
		<input type = "submit" value = "Add to Database">
		
	</form>
</body>
</html>