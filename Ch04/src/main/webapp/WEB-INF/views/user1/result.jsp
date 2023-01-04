<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::result</title>
	</head>
	<body>
		<h3>user1 결과</h3>
		
		<p>이름 : ${name}</p>
		<p>나이 : ${age}</p>
		
		<a href='<c:url value='/user1/register'/>'>등록하기</a>		

	</body>
</html>