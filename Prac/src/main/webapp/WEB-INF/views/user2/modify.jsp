<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user2::modify</title>
	</head>
<body>
	<h3>user2 수정</h3>
	<a href='<c:url value='/'/>'>Prac 메인</a>
	<a href='<c:url value='/user2/list'/>'>user2 목록</a>
	
	<form action='<c:url value='/user2/modify'/>' method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" value="${user2VO.uid}"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${user2VO.name}"></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp" value="${user2VO.hp}"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="number" name="age" value="${user2VO.age}"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>	
</body>
</html>