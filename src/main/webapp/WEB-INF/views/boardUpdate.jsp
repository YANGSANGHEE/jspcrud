<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardUpdate</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/boardUpdate.css" type="text/css">
</head>
<body>
		<h1>게시글 수정 페이지</h1>
	<form action="/boardupdateproc" method="post" id="updateForm" accept-charset = "UTF-8">
		<div>
			<input type="text"  name="writer" id="writer" value="${update.writer}">
			<input type="text" name="title" id="title" value="${update.title}">
			<textarea name="contents" id="contents">${update.con}</textarea>
			<input type="hidden" name="id" value="${id}">
			<input type="hidden" name="date" value="" id="formUpDate">
		</div>
		<div>
			<button class="btn" type="submit">수정하기</button>
		</div>
	</form>
	<script src="${pageContext.request.contextPath}/resources/js/boardUpdate.js"></script>
</body>
</html>