<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/boardWrite.css" type="text/css">
<title>BoardWrite</title>
</head>
<body>
	<h1>게시글 작성 페이지</h1>
	<form action="/boardwriteinsert" method="post" id="writeForm" accept-charset = "UTF-8">
		<div>
			<input type="text" placeholder = "작성자" name="writer" id="writer">
			<input type="text" placeholder = "제목"	name="title" id="title">
			<textarea placeholder = "내용" name="contents" id="contents"></textarea>
			<input type="hidden" name="date" id="formDate">
		</div>
		<div>
			<button class="btn" onclick="testclick()" type="submit">작성하기</button>
		</div>
	</form>
<script src="resources/js/boardWrite.js"></script>
</body>
</html>