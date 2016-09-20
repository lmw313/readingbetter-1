<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="main">
<div id="loginbox">
	<div id="login_before">
		<h4>
			로그인<a href="/readingbetter/mypage/join">가입하기</a>
		</h4>
		<form>
			<div class="form-group">
				<label for="email">아이디:</label>
				<input type="email" class="form-control input-sm" id="email">
			</div>
			<div class="form-group">
				<label for="pwd">비밀번호:</label>
				<input type="password" class="form-control input-sm" id="pwd">
			</div>
			<!--<div class="checkbox">
			<label><input type="checkbox"> Remember me</label></div> -->
			<button type="submit" class="btn btn-default">로그인</button>
		</form>
		<a href="/readingbetter/mypage/findjoin">아이디/비밀번호 찾기</a>
	</div>

	<div id="login_after">
		<h5>님 환영합니다 !</h5>
		<div id="myinfo_mini">
			<p>보유 캔디 : 개</p>
			<p>누적점수 : 점</p>
			<p>이번 달 점수 : 점</p>
			<p>이번 달 전체 순위 : 위</p>
			<p>명예의 전당 순위 : 위</p>
		</div>
	</div>
</div>

<div id="search">
	<h5>책 검색</h5>
	<form class="searchform">
		<div class="form-group">
			<input type="email" class="form-control input-sm" id="email">
		</div>
		<button type="submit" class="btn btn-default">검색</button>
	</form>
</div>

<div id="helpcall">
	<h4>상담전화 :</h4>
	<h4>010) xxx - xxxx</h4>
</div>
</div>