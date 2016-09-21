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
<link href="/readingbetter/assets/css/board.css" rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/book.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/include/header.jsp' />
		<div class="row asideWrap">
			<div class="col-lg-2" id="navigation">
				<c:import url='/WEB-INF/views/include/navi_book.jsp' />
			</div>
			<div id="content" class="col-lg-10">
				<div id="review">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > 
						<a href="/readingbetter/book/booklist">독서활동</a> > 
						<a href="/readingbetter/book/booklist">책 목록</a> > 
						<a href="/readingbetter/book/review">리뷰</a> > 신고
					</div>
					<p class="menu-title">신고</p>
					<br>
					<div>
						<form method="post" action="../update">
							<input type="hidden" name="no" value="${vo.no }">
							<table id="board" class="table table-bordered">
								<tr>
									<th class="active">신고자</th>
									<td colspan=2>양송이</td>
									<th class="active">피신고자</th>
									<td colspan=2>김민정</td>
								</tr>
								<tr>
									<th class="active">신고일</th>
									<td colspan=4>2016-01-01</td>
								</tr>
								<tr>
									<th  class="active" colspan=6>글 내용</th>
								</tr>
								<tr>
									<td id="content" colspan=6>씨바*시귀</td>
								</tr>
								<tr>
									<th  class="active" colspan=6>신고 이유</th>
								</tr>
								<tr>
									<td id="content" colspan=6>
										<input name="content" type="text" class="form-control" id="exampleInputEmail1">
									</td>
								</tr>
							</table>
								
							<div id="buttons">
								<a href="/readingbetter/admin/accusationlist" class="btn btn-default">승인</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<c:import url='/WEB-INF/views/include/footer.jsp' />
	</div>
</body>
</html>