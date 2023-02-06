<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
<link rel="stylesheet" href="resources/css/index.css">
</head>
<body>
	<h1>게시글 리스트 페이지</h1>
	<div class="wrap">
		<div class="title">
			<div>No</div>
			<div>제목</div>
			<div>작성자</div>
			<div>날짜</div>
		</div>
		<!-- react map과 비슷한 기능 반복문 돌려서 태그 생성 -->
		<c:forEach var="l" items="${list}">
		<div class="listSet" onclick="location.href='/boardetail/${l.id}'">
		<!-- id번호로 식별하여 detailpage로 이동 -->
			<div>${l.id}</div>
			<div>${l.title}</div>
			<div>${l.writer}</div>
			<div>${l.date}</div>
		</div>
		</c:forEach>
		<div>
			<button class="btn" type="button" onclick="location.href='/boardwrite'">글쓰기</button>
		</div>
	</div>
</body>
</html>