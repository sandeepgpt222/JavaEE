<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Register</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;    
}
</style>
</head>
<body>
	<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
	<table style="width:100%">
		<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
		</tr>
	 <c:forEach var= "mylistIterator" items = "${requestScope.mylist}">
	 	<tr>
	 	<c:forEach var="objectArrayIterator" items = "${mylistIterator}">
	 	<td>${objectArrayIterator}</td>
	 	</c:forEach>
	 	</tr>
	 </c:forEach>
	 </table>
</body>
</html>

