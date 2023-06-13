<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<nav>
	<ul>
		<c:if test="${empty id }">
			<li><a href="memberLoginForm.do">Login</a></li>
		</c:if>
		<c:if test="${not empty id }">
			<li><a href="#">Logout</a></li>
		</c:if>
		<c:if test="${not empty id }">
			<li><a href="memberMyPageForm.do">마이 페이지</a></li>
		</c:if>
	</ul>
	<hr>
</nav>
</div>
</body>
</html>
