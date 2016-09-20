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
				<div id="makequiz">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > 
						<a href="/readingbetter/book/booklist">독서활동</a> > 
						<a href="/readingbetter/book/booklist">책 목록</a> > 문제 내기
					</div>
					<p class="menu-title">문제 내기</p>
					<div id="quiz-content" class="col-lg-6">
						<img id="img" class="img-thumbnail" 
							src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/book.png"><br>
						
						<table class="table">
							<tr>
								<td>제목</td>
								<br>
								<td>누가 내머리에 똥 쌌어?</td>
							</tr>
							<tr>
								<td>출판사</td>
								<br>
								<td>두더지 나라 만세</td>
							</tr>
							<tr>
								<td>추천 학년</td>
								<br>
								<td>6학년</td>
							</tr>
						</table>
						<br>
					</div>

					<div class="col-lg-6">
						<div id="radio-group">
							<h4>문제</h4>
							<textarea class="form-control" rows="3"></textarea><br>
							<h6>보기1</h6>
							<input type="text" class="form-control" placeholder="Text input"><br>
							<h6>보기2</h6>
							<input type="text" class="form-control" placeholder="Text input"><br>
							<h6>보기3</h6>
							<input type="text" class="form-control" placeholder="Text input"><br>
							<h6>보기4</h6>
							<input type="text" class="form-control" placeholder="Text input"><br>

							<form class="form-horizontal">
								<div class="form-group">
									<br><label for="inputanswer" class="col-sm-2 control-label">정답</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="inputanswer"
											placeholder="Text input">
									</div>
								</div>
							</form>
						</div>
						<a type="submit" class="btn btn-default">제출</a>
					</div>
				</div>
			</div>
		</div>
		<c:import url='/WEB-INF/views/include/footer.jsp' />
	</div>
</body>
</html>