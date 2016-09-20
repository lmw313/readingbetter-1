<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!doctype html>
<html>
<head>
<title>ReadingBetter</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/readingbetter/assets/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/admin.css" rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/board.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/admin/header.jsp' />
		<h4>카드</h4>
		<form id="search_form" action="" method="post">
			<input type="text" id="add" name="add" value="${kwd }"> 
			<input type="submit" value="찾기">
		</form>
		<table class="table" id="board">
			<tr class="info">
				<td>번호</td>
				<td>이름</td>
				<td>능력</td>
				<td>점수</td>
				<td></td>
			</tr>

			<tr>
				<td>2</td>
				<td>김민정</td>
				<td>+</td>
				<td>20</td>
				<td>
					<a href="" class="btn btn-default">삭제</a>
					<a href="/readingbetter/admin/cardmodifyform" class="btn btn-default">수정</a>
				</td>
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

		<a class="btn btn-default" href="/readingbetter/admin/cardaddform" role="button">추가</a>
	</div>
</body>
</html>