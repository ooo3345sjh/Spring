<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>${type}::modify</title>
	</head>
<body>
	<h3>${type} 수정</h3>
	<a href='<c:url value='/'/>'>Ch05 메인</a>
	<a href='<c:url value='/user/list?type=${type}'/>'>${type} 목록</a>
	
	<form action='<c:url value='/user/modify?type=${type}'/>' method="post">
		<table border="1">
			<c:forEach var="row" items="${columnKList}" begin="${type eq 'user4'? 1:0}" varStatus="loop">
				<tr>
					<td>${row}</td>
					<td><input type="text" name="${columnList.get(loop.index)}" value="${rowList.get(0).get(loop.index)}"></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>	
</body>
</html>