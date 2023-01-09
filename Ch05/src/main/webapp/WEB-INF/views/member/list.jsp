<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member::list</title>
	</head>
<body>
	<h3>member 목록</h3>
	<a href='<c:url value='/'/>'>Ch05 메인</a>
	<a href='<c:url value='/member/register'/>'>member 등록</a>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>휴대폰</th>
			<th>직책</th>
			<th>부서</th>
			<th>입사일</th>
			<th>관리</th>
		</tr>
		<c:forEach var='member' items="${members}">
			<tr>
				<td>${member.uid}</td>
				<td>${member.name}</td>
				<td>${member.hp}</td>
				<td>${member.pos}</td>
				<td>${member.depStr}</td>
				<td>${member.rdate}</td>
				<td>
					<a href='<c:url value='/member/modify?uid=${member.uid}'/>'>수정</a>			
					<a href='<c:url value='/member/delete?uid=${member.uid}'/>'>삭제</a>			
				</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>