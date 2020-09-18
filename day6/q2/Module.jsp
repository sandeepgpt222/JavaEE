<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="java.util.*" %>
	<%
	List<String> list = new ArrayList<String>();
	list.add("c++");
	list.add("java");
	list.add("oracle");
	request.setAttribute("module",list);
	%>
	<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<form action=Servlet2 method="get">
		<select name="module">
			<c:forEach var="x" items="${requestScope.module}">	
			<option value=${x}>${x}</option>
			</c:forEach>
		</select>
		<input type = submit>
	</form>
</body>
</html>