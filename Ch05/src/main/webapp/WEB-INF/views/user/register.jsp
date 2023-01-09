<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>${type}::register</title>
	</head>
<body>
	<h3>${type} 등록</h3>
	<a href='<c:url value='/'/>'>Ch05 메인</a>
	<a href='<c:url value='/user/list?type=${type}'/>'>${type} 목록</a>
	
	<form action='<c:url value='/user/register?type=${type}'/>' method="post">
		<table border="1">
			<c:forEach var="row" items="${columnKList}" begin="${type eq 'user4' ? 1:0}" varStatus="loop">
				<tr>
					<td>${row}</td>
					<c:choose>
						<c:when test="${row eq '성별'}">
							<td>
								<label>
									 남<input type="checkbox" name="gender" value="1">
								</label>
								<label>
									 여<input type="checkbox" name="gender" value="2">
								</label>
							</td>
						</c:when>
						
						<c:when test="${row eq '생년월일'}">
							<td><input type="date" name="birth"></td>
						</c:when>
						
						<c:otherwise>
							<td><input type="text" name="${columnList.get(loop.index)}"></td>
						</c:otherwise>
					</c:choose>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>	
</body>
</html>