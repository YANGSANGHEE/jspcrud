<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/boardDetail.css" type="text/css">
<!--pageContext.request.contextPath : 상대경로 위치를 알아서 잘 찾아줌(페이지가 동적이기 떄문에)-->
<title>BoardDetail</title>
</head>
<body>
	<h1>게시글 정보 페이지</h1>
	<div class="wrap">
		<div>
			<span>게시글번호</span>
			<span>${detail.id}</span>
		</div>
		<div>
			<span>작성자</span>
			<span>${detail.writer}</span>
		</div>
		<div>
			<span>제목</span>
			<span>${detail.title}</span>
		</div>
		<div>
			<span>내용</span>
			<p>${detail.con}</p>
		</div>
		<div>
			<button class="btn" type="button" onclick="location.href='/boardupdate/${detail.id}'">수정하기</button>
			<button class="btn" type="button" id="delete" onclick="ClickEvent(${detail.id})">삭제하기</button>
			<button class="btn" type="button" onclick="location.href='/'">목록</button>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/resources/js/boardDetail.js"></script>
</body>
</html>