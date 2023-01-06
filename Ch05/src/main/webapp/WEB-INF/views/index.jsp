<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
<body>
	<h3>5장 Mybatis 실습하기</h3>
	
	<a href='<c:url value='/user/list?type=user1' />'>user1 목록</a>
	<a href='<c:url value='/user/list?type=user2' />'>user2 목록</a>
	<a href='<c:url value='/user/list?type=user3' />'>user3 목록</a>
	<a href='<c:url value='/user/list?type=user4' />'>user4 목록</a>
	<a href='<c:url value='/user/list?type=user5' />'>user5 목록</a>
	<a href='<c:url value='/user/list?type=user6' />'>user6 목록</a>
</body>
</html>