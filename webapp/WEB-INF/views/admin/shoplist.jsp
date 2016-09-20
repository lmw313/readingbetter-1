<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/readingbetter/assets/dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="/readingbetter/assets/css/boarddxs.css" rel="stylesheet"
	type="text/css">
<title>상점 관리</title>
</head>
<body>
	<c:import url='/WEB-INF/views/admin/header.jsp' />
	<br>
	<br>
	<h4>상점</h4>
	<br>
	<br>
	<div id="searchbundle">
		<input type="text" class="form-control col-lg-8" id="goodsname">
		<button type="submit" id="searchgoods" class="btn btn-default col-lg-2">찾기</button>
	</div>

	<div>
		<br> <br> <br> <br>
		<table id="board" class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>사진</th>
					<th>상품명</th>
					<th>가격</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>5</td>
					<td><img id="goodsimage" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/ramen1.png"></td>
					<td>왕뚜껑</td>
					<td>10</td>
					<td><a href="" class="btn btn-default">삭제</a></td>
				</tr>
				<tr>
					<td>4</td>
					<td><img id="goodsimage" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/ramen3.png"></td>
					<td>부대찌개면</td>
					<td>8</td>
					<td><a href="" class="btn btn-default">삭제</a></td>
				</tr>
				<tr>
					<td>3</td>
					<td><img id="goodsimage" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/ramen2.png"></td>
					<td>불닭볶음면</td>
					<td>7</td>
					<td><a href="" class="btn btn-default">삭제</a></td>
				</tr>
				<tr>
					<td>2</td>
					<td><img id="goodsimage" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/bita500.png"></td>
					<td>비타 500</td>
					<td>5</td>
					<td><a href="" class="btn btn-default">삭제</a></td>
				</tr>
				<tr>
					<td>1</td>
					<td><img id="goodsimage" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/ferrero.png"></td>
					<td>페레로로쉐</td>
					<td>10</td>
					<td><a href="" class="btn btn-default">삭제</a></td>
				</tr>
			</tbody>
		</table>
		
		<!-- begin:paging -->
		<div class="pager">
			<ul>
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
		
		<div id="buttons">
			<a href="/readingbetter/admin/shopaddform" class="btn btn-default">추가</a>
		</div>
	
	</div>
</body>
</html>