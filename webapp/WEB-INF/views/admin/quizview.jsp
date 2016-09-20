<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!doctype html>
<html>
<head>
<title>ReadingBetter</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/readingbetter/assets/dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="/readingbetter/assets/css/board.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/admin/header.jsp' />
		<h4>등록 퀴즈 내용</h4>
		<table class="table" id="board">
			<tr>
				<td class="active">책제목</td>
				<td>두더지 나라</td>
				<td></td>
				<td class="active">작성일</td>
				<td>2016-01-01</td>
				<td></td>
			</tr>

			<tr>
				<td class="active">작성자</td>
				<td>GM 미미</td>
				<td class="active">출판사</td>
				<td>두더지 만만세</td>
				<td class="active">승인여부</td>
				<td>대기</td>
			</tr>
			<tr>
				<td class="active" colspan="6">문제</td>
			</tr>
			<tr>
				<td colspan="6">두더지가 받은 최고의 벌레는?</td>
			</tr>
			<tr>
				<td class="active" colspan="6">보기</td>
			</tr>
			<tr>
				<td class="active">1</td>
				<td colspan="5">잠자리</td>
			</tr>

			<tr>
				<td class="active">2</td>
				<td colspan="5">고추 잠자리</td>
			</tr>

			<tr>
				<td class="active">3</td>
				<td colspan="5">귀뚜라미</td>
			</tr>

			<tr>
				<td class="active">4</td>
				<td colspan="5">벼멀구</td>
			</tr>

			<tr>
				<td class="active">5</td>
				<td colspan="5">코코아</td>
			</tr>
		</table>

		<a class="btn btn-default" href="/readingbetter/admin/quizlist" role="button">목록</a> 
		<a class="btn btn-default" href="" role="button">승인</a> 
		<a class="btn btn-default" href="" role="button">반려</a>

	</div>
</body>
</html>