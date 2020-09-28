
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Records</title>
</head>
<body>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<table border="5" >
<tr>
<th>id</th>
<th>name</th>
<th>qty</th>
<th>price</th>
</tr>
<c:forEach var="mylist" items="${requestScope.mylist}">
<tr>
	<td>${mylist.id}</td>
	<td>${mylist.name}</td>
	<td>${mylist.qty}</td>
	<td>${mylist.price}</td>
</tr>
	</c:forEach>
	</table>
<br><br>
To go back to homepage <a href="Home.jsp">Click here</a>
</body>
</html>