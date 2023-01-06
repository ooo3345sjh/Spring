<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>${type}::list</title>
	</head>
<body>
	<h3>${type} 목록</h3>
	<a href='<c:url value='/'/>'>Ch05 메인</a>
	<a href='<c:url value='/user/register?type=${type}'/>'>${type} 등록</a>
	
	<table border="1">
		<tr>
			<c:choose>
				<c:when test="${type ne 'user4' }">
					<th>아이디</th>
				</c:when>
				<c:otherwise>
					<th>NO.</th>
				</c:otherwise>
			</c:choose>
			<th>이름</th>
			<th>휴대폰</th>
			<th>나이</th>
			<th>관리</th>
		</tr>
		<c:forEach var='user' items="${users}">
			<tr>
				<c:choose>
					<c:when test="${type ne 'user4' }">
						<td>${user.uid}</td>
					</c:when>
					<c:otherwise>
						<td>${user.seq}</td>
					</c:otherwise>
				</c:choose>
				<td>${user.name}</td>
				<td>${user.hp}</td>
				<td>${user.age}</td>
				<td>
					<a href='<c:url value='/user/modify?uid=${type ne "user4"? user.uid : user.seq}&type=${type}'/>'>수정</a>			
					<a href='<c:url value='/user/delete?uid=${type ne "user4"? user.uid : user.seq}&type=${type}'/>'>삭제</a>			
				</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>