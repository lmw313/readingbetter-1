<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 해더 -->
<script type="text/javascript" src="/readingbetter/assets/js/header.js"></script>
<!-- /해더 -->

<div class="row">
	<div id="header" class="col-lg-12">
 		<ul id="headeritem1">
			<c:choose>
				<c:when test='${empty authUser }'>
					<li><a href="/readingbetter/member/loginform">로그인</a></li>
					<li><a href="/readingbetter/member/joinform">회원가입</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="/readingbetter/mypage/modifyform">회원정보수정</a></li>
					<li><a href="/readingbetter/main/logout">로그아웃</a></li>
					<li>${authUser.name}님 반갑습니다 ^0^</li>
				</c:otherwise>
			</c:choose>
		</ul>
		<table>
			<tr>
				<td rowspan="3" width="415px">
					<img id="logo" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/logo.png">
				</td>
				<td rowspan="3" valign="bottom">
					<a href="/readingbetter/book/booklist"> 
						<img id="btn-book" align="bottom" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/b_reading.png">
					</a>
				</td>
				<td rowspan="3" valign="bottom">
					<a href="/readingbetter/ranking/summary">
						<img id="btn-rank" align="bottom" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/b_ranking.png">
					</a>
				</td>
				<td rowspan="2">
					<a href="/readingbetter/main">
						<img id="anim" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/anim.gif">
					</a>
				</td>
				<td rowspan="3" valign="bottom">
					<a href="/readingbetter/mypage/info">
						<img id="button" align="bottom" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/b_myinfo.png">
					</a>
				</td>
				<td rowspan="3" valign="bottom">
					<a href="/readingbetter/service/noticelist">
						<img id="button" align="bottom" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/b_center.png">
					</a>
				</td>
			</tr>

			<tr>
			</tr>
			<tr>
				<td>
					<a href="/readingbetter/shop">
						<img id="button" align="bottom" src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/b_store.png">
					</a>
				</td>
			</tr>
		</table>
		
<%--  		<a href="/readingbetter/main">
			<img id="img"
				src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/rb_logo.png">
		</a>
		<ul id="headeritem1">
			<c:choose>
				<c:when test='${empty authUser }'>
					<li><a href="/readingbetter/member/loginform">로그인</a></li>
					<li><a href="/readingbetter/member/joinform">회원가입</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="/readingbetter/mypage/modifyform">회원정보수정</a></li>
					<li><a href="/readingbetter/main/logout">로그아웃</a></li>
					<li>${authUser.name}님 반갑습니다 ^0^</li>
				</c:otherwise>
			</c:choose>
		</ul>
		<br> <br>
		<div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<div class="dropdown">
					<a id="dLabel1" class="dropdown-toggle" data-target=""
						href="/readingbetter/book/booklist" data-toggle="dropdown" aria-haspopup="true"
						role="button" aria-expanded="false"> 독서활동 <span class="caret"></span>
					</a>
	
					<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel1">
						<li><a href="/readingbetter/book/booklist">책 목록</a></li>
					</ul>
				</div>
			</div>
			
			<div class="col-lg-2">
				<div class="dropdown">
					<a id="dLabel2" class="dropdown-toggle" data-target=""
						href="/readingbetter/ranking/summary" data-toggle="dropdown" aria-haspopup="true"
						role="button" aria-expanded="false"> 순위 <span class="caret"></span>
					</a>
	
					<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel2">
						<li><a href="/readingbetter/ranking/summary">순위 한눈에 보기</a></li>
						<li><a href="/readingbetter/ranking/monthlytotal">이번달 전체 순위</a></li>
						<li><a href="/readingbetter/ranking/monthlyschool">이번달 학교별 순위</a></li>
						<li><a href="/readingbetter/ranking/monthlygrade?grade=1">이번달 학년별 순위</a></li>
						<li><a href="/readingbetter/ranking/honor">명예의 전당</a></li>
					</ul>
				</div>
			</div>

			<div class="col-lg-2">
				<div class="dropdown">
					<a id="dLabel3" class="dropdown-toggle" data-target=""
						href="/readingbetter/shop" data-toggle="dropdown" aria-haspopup="true"
						role="button" aria-expanded="false"> 상점 <span class="caret"></span>
					</a>
	
					<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel3">
						<li><a href="/readingbetter/shop">상점</a></li>
					</ul>
				</div>
			</div>
			
			<div class="col-lg-2">
				<div class="dropdown">
					<a id="dLabel4" class="dropdown-toggle" data-target=""
						href="/readingbetter/mypage/info" data-toggle="dropdown" aria-haspopup="true"
						role="button" aria-expanded="false"> 내정보 <span class="caret"></span>
					</a>
	
					<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel4">
						<li><a href="/readingbetter/mypage/info">내 정보 보기</a></li>
						<li><a href="/readingbetter/mypage/history">나의 활동</a></li>
					</ul>
				</div>
			</div>
			
			<div class="col-lg-2">
				<div class="dropdown">
					<a id="dLabel5" class="dropdown-toggle" data-target=""
						href="/readingbetter/service/noticelist" data-toggle="dropdown" aria-haspopup="true"
						role="button" aria-expanded="false"> 고객센터 <span class="caret"></span>
					</a>
	
					<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel5">
						<li><a href="/readingbetter/service/noticelist">공지</a></li>
						<li><a href="/readingbetter/service/questionlist">문의 게시판</a></li>
						<li><a href="/readingbetter/service/wishbooklist">희망도서 신청</a></li>
					</ul>
				</div>
			</div>
			<div class="col-lg-1"></div>
		</div> --%>
	</div>
</div>