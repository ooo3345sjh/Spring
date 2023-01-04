<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>Spring MVC</h3>
		<h1>greeting</h1>
		<a href='<c:url value='/hello'/>'>hello</a>
		<a href='<c:url value='/welcome'/>'>welcome</a>
		<a href='<c:url value='/greeting'/>'>greeting</a>
	</body>
</html>