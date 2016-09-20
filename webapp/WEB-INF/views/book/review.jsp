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
						<a href="/readingbetter/book/booklist">책 목록</a> > 리뷰 보기
					</div>
					<p class="menu-title">리뷰</p>
					<div>
						<img id="img-book" class="img-thumbnail" src="${vo.cover }">
					</div>

					<div id="board">
						<table class="tbl-ex">
							<colgroup>
								<col width="40%" />
								<col width="10%" />
								<col width="10%" />
								<col width="20%" />
								<col width="10%" />
							</colgroup>
							<tr>
								<th>내용</th>
								<th>글쓴이</th>
								<th>신고</th>
								<th>작성일</th>
								<th></th>
							</tr>
							<c:set var="countList" value="${fn:length(list)}"/>
	  						<c:forEach var='vo' items='${reviewlist}' varStatus='s'>	
							<tr>
								<td>${vo.review }</td>
								<td>${vo.id }</td>
								<td>
									<a href="/readingbetter/book/accusation">
									<img id="img-singo" src="/readingbetter/assets/images/singo.png"></a>
								</td>
								<td>${vo.regDate }</td>
								<td><a href="">삭제</a></td>
							</tr>
							</c:forEach>							
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

						<form class="form-inline">
							<div class="form-group">
								<label class="sr-only">review</label>
								<input  name="review" type="text" class="form-control input-sm" id="write-review">
								<button type="submit" class="btn btn-default">등록</button>
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