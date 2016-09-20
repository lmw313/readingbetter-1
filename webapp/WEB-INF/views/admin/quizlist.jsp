<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!doctype html>
<html>
<head>
<title>ReadingBetter</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/readingbetter/assets/dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="/readingbetter/assets/css/board.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/admin/header.jsp' />
		<h4>퀴즈 관리</h4>

		<table class="table" id="board">
			<tr class="info">
				<td>번호</td>
				<td>책 제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>승인여부</td>
			</tr>

			<tr>
				<td>1</td>
				<td>누가 내머리에 똥쌌어?</td>
				<td>GM미미</td>
				<td>2016-01-01</td>
				<td><a href="/readingbetter/admin/quizview">대기</a></td>
			</tr>
		</table>

		<!-- begin:paging -->
		<div class="pager">
			<ul>
				<li>
				<li><a href="">◀</a></li>
				<li><a href="">1</a></li>
				<li><a href="">2</a></li>
				<li><a href="">3</a></li>
				<li><a href="">4</a></li>
				<li><a href="">5</a></li>
				<li><a href="">▶</a></li>
			</ul>
		</div>
		<!-- end:paging -->

		<a class="btn btn-default" href="/readingbetter/admin/quizaddform" role="button">등록</a>

	</div>
</body>
</html>