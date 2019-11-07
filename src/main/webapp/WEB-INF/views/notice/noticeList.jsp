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
<c:import url="../layout/bootStrap.jsp"/>
<c:import url="../layout/nav.jsp" />
	<div class= "container">
	<h1>Notice List Page</h1>
	<table class="table">
	<thead>
	<tr>
		<td>num</td>
		<td>title</td>
		<td>writer</td>
		<td>contents</td>
		<td>date</td>
		<td>hit</td>
	</tr>
	</thead>
	<c:forEach items="${requestScope.list}" var="dto">
	<tr>
		<td>${pageScope.dto.num}</td>
		<td><a href="noticeSelect?num=${pageScope.dto.num}">${pageScope.dto.title }</a></td>
		<td>${pageScope.dto.writer}</td>
		<td>${pageScope.dto.contents }</td>
		<td>${pageScope.dto.reg_date }</td>
		<td>${pageScope.dto.hit}</td>
	</tr>
	</c:forEach>
	</table>
	
	<a href = "./notice/noticeWrite">Write</a>
	</div>
</body>
</html>