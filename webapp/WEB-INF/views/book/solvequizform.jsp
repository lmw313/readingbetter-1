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
				<div id="solvequiz">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > 
						<a href="/readingbetter/book/booklist">독서활동</a> > 
						<a href="/readingbetter/book/booklist">책 목록</a> > 문제 풀기
					</div>
					<p class="menu-title">문제 풀기</p>
					<form class="form-horizontal">
						<div class="form-group">
							<div class="col-sm-6">
								<img id="img-solvequiz" class="img-thumbnail"
									src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/book.png"><br>
							</div>
							<div class="col-sm-6">
								<table id="table-solve" class="table">
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
							</div>
						</div>
					</form>
					
					<div class="col-lg-6">
						<div id="radio-group">
							<h4>문제1 : 두더지 머리에 누가 똥을 쌌을 까요?</h4>
							<div class="radio">
								<label> <input type="radio" name="optionsRadios"
									id="optionsRadios1" value="option1" checked> 지나가던 강아지
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 옆집 고양이
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios3" value="option3"> 춤추던 사자
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 강아지를 보던 사람
								</label>
							</div>

							<h4>문제2 : 두더지 머리에 누가 똥을 쌌을 까요?</h4>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked> 지나가던 강아지
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 옆집 고양이
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios3" value="option3"> 춤추던 사자
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 강아지를 보던 사람
								</label>
							</div>

							<h4>문제3 : 두더지 머리에 누가 똥을 쌌을 까요?</h4>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked> 지나가던 강아지
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 옆집 고양이
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios3" value="option3"> 춤추던 사자
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 강아지를 보던 사람
								</label>
							</div>
						</div>

						<br>
					</div>

					<div class="col-lg-6">
						<div id="radio-group">
							<h4>문제4 : 두더지 머리에 누가 똥을 쌌을 까요?</h4>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked> 지나가던 강아지
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 옆집 고양이
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios3" value="option3"> 춤추던 사자
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 강아지를 보던 사람
								</label>
							</div>

							<h4>문제5 : 두더지 머리에 누가 똥을 쌌을 까요?</h4>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked> 지나가던 강아지
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 옆집 고양이
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios3" value="option3"> 춤추던 사자
								</label>
							</div>
							<div class="radio">
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 강아지를 보던 사람
								</label>
							</div>
						</div>
						<a class="btn btn-default" href="/readingbetter/book/resultquiz" type="submit">결과보기</a>
					</div>
				</div>
			</div>

		</div>
		<c:import url='/WEB-INF/views/include/footer.jsp' />
	</div>
</body>
</html>