<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page isELIgnored = "false" %>
<form action = "DataServlet" method="post">
	Search By Location: <input name = loc><br><br>
	<input type = submit value = Search>
	</form>
	
	<table border = "3px">
	<tr>
		<th>deptno</th>
		<th>dname</th>
		<th>location</th>
	</tr>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:forEach var="x" items="${requestScope.mylist}" >
		<tr>
			<td>${x.deptno}</td>
			<td>${x.dname}</td>
			<td>${x.loc}</td>
		</tr>
	</c:forEach>
	</table>
	
</body>
</html>
