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
			<c:forEach var="th" items="${columnKList}">
				<th>${th}</th>
			</c:forEach>
			<th>관리</th>
		</tr>
		<c:forEach var='users' items="${rowList}">
				<tr>
			<c:forEach var="user" items="${users}">
					<td>${user}</td>
			</c:forEach>
					<td>
						<a href='<c:url value='/user/modify?type=${type}&uidOrSeq=${users.get(0)}'/>'>수정</a>			
						<a href='<c:url value='/user/delete?type=${type}&uidOrSeq=${users.get(0)}'/>'>삭제</a>			
					</td>
				</tr>
		</c:forEach>
	
	</table>
</body>
</html>