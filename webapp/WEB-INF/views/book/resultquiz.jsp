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
<link href="/readingbetter/assets/css/book.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/include/header.jsp' />
		<div class="row asideWrap">
			<div id="navigation" class="col-lg-2">
				<c:import url='/WEB-INF/views/include/navi_book.jsp' />
			</div>
			<div id="content" class="col-lg-10">
				<div id="resultquiz">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > 
						<a href="/readingbetter/book/booklist">독서활동</a> > 
						<a href="/readingbetter/book/booklist">책목록</a> > 문제 풀기 > 결과 화면
					</div>
					<p class="menu-title">퀴즈 결과</p>
					<br>

					<form class="form-horizontal">
						<img id="img-result" class="img-thumbnail"
							src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/book.png"><br>
						<table class="table">
							<tr>
								<td>제목</td>
								<td>누가 내머리에 똥 쌌어?</td>
							</tr>
							<tr>
								<td>출판사</td>
								<td>두더지 나라 만세</td>
							</tr>
							<tr>
								<td>추천 학년</td>
								<br>
								<td>6학년</td>
							</tr>
						</table>
						<br>

						<table class="table">
							<tr class="info">
								<td>점수</td>
								<td>캔디</td>
								<td>인증 성공</td>
							</tr>
							<tr>
								<td>80</td>
								<td>2</td>
								<td>성공</td>
							</tr>
						</table><br>
						
						<img id="img-ball" class="img-rounded"
							src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/monsterball.png">
						<img id="img-ball" class="img-rounded"
							src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/monsterball.png">
						<img id="img-ball" class="img-rounded"
							src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/monsterball.png"><br>

						<a class="btn btn-default" href="/readingbetter/book/list" type="submit">다시풀기</a>

					</form>
				</div>
			</div>
		</div>
		<c:import url='/WEB-INF/views/include/footer.jsp' />
	</div>
</body>
</html>