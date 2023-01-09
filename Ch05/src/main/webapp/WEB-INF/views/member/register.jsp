<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member::register</title>
	</head>
<body>
	<h3>member 등록</h3>
	<a href='<c:url value='/'/>'>Ch05 메인</a>
	<a href='<c:url value='/member/list'/>'>member 목록</a>
	
	<form action='<c:url value='/member/register'/>' method="post">
		<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="uid"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="tel" name="hp"></td>
				</tr>
				<tr>
					<td>직책</td>
					<td><input type="text" name="pos"></td>
				</tr>
				<tr>
					<td>부서</td>
					<td>
						<select name="dep">
							<option value='' selected disabled>-- 선택 --</option>
							<option value="101">인사부</option>
							<option value="102">영업부</option>
							<option value="103">영업지원부</option>
							<option value="104">기획부</option>
							<option value="105">재정부</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="등록"></td>
				</tr>
		</table>
	</form>	
</body>
</html>