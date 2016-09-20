<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ReadingBetter_Admin</title>
<link href="/readingbetter/assets/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/board.css" rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/admin.css" rel="stylesheet" type="text/css">
</head>
<body>
<c:import url='/WEB-INF/views/admin/header.jsp'></c:import>
<h4>상점 아이템 추가</h4>
<form action="" method="post">
	<div id="board">
		<table class="tbl-ex tbl-addbook">
			<tr>
				<th></th>
				<th></th>
			</tr>
			<tr>
				<td class="left-label">상품명</td>
					<td>
						<label for=""></label>
						<input type="text" class="form-control" id="" placeholder="상품명">
					</td>
			</tr>
			<tr>
				<td class="left-label">가격</td>
				<td>
					<select class="form-control">
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
						<option>6</option>
						<option>7</option>
						<option>8</option>
						<option>9</option>
						<option>10</option>
					</select>
				</td>
			</tr>
			<tr>
				<td class="left-label">사진</td>
				<td>
					<label for=""></label>
					<input type="text" class="form-control" id="" placeholder="경로">
				</td>
			</tr>
		</table>

		<a href="/readingbetter/admin/shoplist" class="btn btn-default">목록</a>
		<button type="submit" class="btn btn-default">등록</button>
	</div>
</form>
</body>
</html>