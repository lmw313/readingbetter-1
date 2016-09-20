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
			<div id="navigation" class="col-lg-2"></div>
			<div id="content" class="col-lg-10">
				<div id="join">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > 회원가입
					</div>
					<p class="menu-title">회원가입</p>

					<div id="radio-group">
						<form class="form-horizontal">
							<div class="form-group">
								<label class="col-sm-3 control-label">이름</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="inputName" placeholder="Name">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">아이디</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="inputID" placeholder="ID">
								</div>
								<div class="col-sm-1">
									<a class="btn btn-default" role="button">중복확인</a>
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">비밀번호</label>
								<div class="col-sm-6">
									<input type="password" class="form-control" id="inputPassword" placeholder="Password">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">이메일</label>
								<div class="col-sm-6">
									<input type="Email" class="form-control" id="inputEmail" placeholder="Email">
								</div>
								<div class="col-sm-1">
									<a class="btn btn-default" role="button">중복확인</a>
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">전화번호</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="inputPhone" placeholder="PhoneNumber">
								</div>
							</div>


							<label class="radio-inline">
								<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">초등학생
							</label>
							<label class="radio-inline">
								<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option3">기타
							</label><br><br>

							<div class="form-group">
								<label class="col-sm-3 control-label">학교이름</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="inputSchoolName" placeholder="SchoolName">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">학년</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="inputSchoolGrade" placeholder="Grade">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">반</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="inputSchoolClass" placeholder="Class">
								</div>
							</div>
							<a class="btn btn-default" type="submit">가입하기</a>
						</form>
					</div>
				</div>
			</div>
		</div>
		<c:import url='/WEB-INF/views/include/footer.jsp' />
	</div>
</body>
</html>