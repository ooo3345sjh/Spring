<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member::modify</title>
	</head>
<body>
	<h3>memeber 수정</h3>
	<a href='<c:url value='/'/>'>Ch05 메인</a>
	<a href='<c:url value='/member/list'/>'>memeber 목록</a>
	
	<form action='<c:url value='/member/modify'/>' method="post">
		<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="uid" value="${member.uid}"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${member.name}"></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="tel" name="hp" value="${member.hp}"></td>
				</tr>
				<tr>
					<td>직책</td>
					<td><input type="text" name="pos" value="${member.pos}"></td>
				</tr>
				<tr>
					<td>부서</td>
					<td><input type="text" name="dep" value="${member.depStr}"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="등록"></td>
				</tr>
		</table>
	</form>	
</body>
</html>