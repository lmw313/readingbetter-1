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
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/admin/header.jsp' />
		<div class="row asideWrap">
			<br>
			<h4>출판사/작가 관리</h4>
			<br>
			<br>
			<div id="content" class="col-lg-6">
				<h5>출판사 관리</h5>
				<select multiple class="form-control">
					<option>1 . 호랑이 출판사</option>
					<option>2 . 나비출판사</option>
				</select> <br>
				<br>
				<form id="search_form" action="/mysite/board" method="post">
					<input type="text" id="kwd" name="kwd" value="${kwd }">
					<input type="submit" value="출판사추가">
				</form>
				<br>
				<form id="search_form" action="/mysite/board" method="post">
					<input type="text" id="kwd" name="kwd" value="${kwd }">
					<input type="submit" value="출판사검색">
				</form>
			</div>
			<div id="content" class="col-lg-6">
				<h5>작가 관리</h5>
				<select multiple class="form-control">
					<option>김작가</option>
					<option>전작가</option>
					<option>양작가</option>
					<option>숙작가</option>

				</select> <br>
				<br>
				<form id="search_form" action="/mysite/board" method="post">
					<input type="text" id="kwd" name="kwd" value="${kwd }">
					<input type="submit" value="작가추가">
				</form>
				<br>
				<form id="search_form" action="/mysite/board" method="post">
					<input type="text" id="kwd" name="kwd" value="${kwd }">
					<input type="submit" value="작가검색">
				</form>
			</div>
		</div>
		<div class="row"></div>
	</div>
</body>
</html>