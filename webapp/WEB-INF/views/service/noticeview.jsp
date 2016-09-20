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
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/include/header.jsp' />
		<div class="row asideWrap">
			<div class="col-lg-2" id="navigation">
				<c:import url='/WEB-INF/views/include/navi_service.jsp' />
			</div>
			<div id="" class="col-lg-10">
				<div id="noticeview">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > 
						<a href="/readingbetter/service/noticelist">고객센터</a> > 
						<a href="/readingbetter/service/noticelist">공지</a> > 글 보기
					</div>
					<p class="menu-title">공지</p>

					<div id="board">
						<table class="table table-bordered">
							<tr>
								<td class="active">제목</td>
								<td colspan=7></td>
							</tr>
							<tr>
								<td class="active">작성자</td>
								<td>GM</td>
								<td class="active">번호</td>
								<td>1</td>
								<td class="active">조회수</td>
								<td>23</td>
								<td class="active">작성일</td>
								<td>2016-09-08</td>
							</tr>
							<tr>
								<td colspan=8 class="active"></td>
							</tr>
							<tr>
								<td id="notice-content" colspan=8 rowspan=5>공지입니다.</td>
							</tr>
						</table>
						
						<div id="button-set">							
							<a href="/readingbetter/service/noticelist" class="btn btn-default">목록</a>
						</div>

						<table class="tbl-ex">
							<tr>
								<th>내용</th>
								<th>글쓴이</th>
								<th>신고</th>
								<th>작성일</th>
								<th>&nbsp;</th>
							</tr>
							<tr>
								<td id="review-content">내용</td>
								<td>글쓴이</td>
								<td>
									<a href="">
										<img id="img-singo" src="/readingbetter/assets/images/singo.png">
									</a>
								</td>
								<td>2016-09-07</td>
								<td id="review-modify"><a href="">수정</a> <a href="">삭제</a></td>
							</tr>
							<tr>
								<td id="review-content">내용</td>
								<td>글쓴이</td>
								<td>
									<a href="">
									<img id="img-singo"
										src="/readingbetter/assets/images/singo.png"></a>
								</td>
								<td>2016-09-07</td>
								<td><a href="">수정</a><a href="">삭제</a></td>
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

						<form class="form-inline">
							<div class="form-group">
								<label class="sr-only" for="insertReview">review</label>
								<input type="text" class="form-control input-sm" id="review">
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