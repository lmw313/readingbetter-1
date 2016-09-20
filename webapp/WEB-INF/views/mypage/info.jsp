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
<link href="/readingbetter/assets/css/mypage.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/include/header.jsp' />
		<div class="row asideWrap">
			<div id="navigation" class="col-lg-2">
				<c:import url='/WEB-INF/views/include/navi_mypage.jsp' />
			</div>
			<div id="content" class="col-lg-10">
				<div id="info">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > 
						<a href="/readingbetter/mypage/info">내정보</a> > 내정보 보기
					</div>
					<p class="menu-title">내 정보 보기</p>

					<div id="radio-group">
						<form class="form-horizontal">
							<img id="img-mypage" class="img-circle"
								src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/pikachu.png"><br>
							<br>
							<div class="form-group">
								<label class="col-sm-3 control-label">초등학교</label>
								<div class="col-sm-9">
									<p class="form-control-static">두더지 초등학교</p>
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">학년 반</label>
								<div class="col-sm-9">
									<p class="form-control-static">2학년 4반</p>
								</div>
							</div>
						</form>
					</div>

					<div id="radio-group">
						<h4>연락처</h4>
						<form class="form-horizontal">
							<div class="form-group">
								<label class="col-sm-3 control-label">기본이메일</label>
								<div class="col-sm-9">
									<p class="form-control-static">kmg878@naver.com</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">본인 확인 이메일</label>
								<div class="col-sm-9">
									<p class="form-control-static">kmg878@naver.com</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">휴대전화</label>
								<div class="col-sm-9">
									<p class="form-control-static">010-7274-3349</p>
								</div>
							</div>
							<a class="btn btn-default" href="/readingbetter/mypage/modifyform" role="button">수정하기</a>
						</form>
					</div>

					<table class="table table-striped" id="myscore-table">
						<tr>
							<td>캔디 수</td>
							<br>
							<td>점수</td>
							<td>순위</td>
						</tr>
						<tr>
							<td>20</td>
							<br>
							<td>300</td>
							<td>1</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<c:import url='/WEB-INF/views/include/footer.jsp' />		
	</div>
</body>
</html>