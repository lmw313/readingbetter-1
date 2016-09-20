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
			<div id="navigation" class="col-lg-2">
				<c:import url='/WEB-INF/views/include/navi_service.jsp' />
			</div>
			<div id="content" class="col-lg-10">
				<div id="wishbookview">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > <a
							href="/readingbetter/service/noticelist">고객센터</a> > <a
							href="/readingbetter/service/wishbooklist">희망 도서 신청</a> > 글 보기
					</div>
					<p class="menu-title">희망도서 정보</p>

					<table class="table table-bordered" id="board">
						<colgroup>
							<col width="25%"/>
							<col width="25%"/>
							<col width="25%"/>
							<col width="25%"/>
						</colgroup>
						<tr>
							<td class="active">책 제목</td>
							<td colspan="4">누가 내머리에 똥 쌌어?</td>
						</tr>
						<tr>
							<td class="active">작성자</td>
							<td>미미</td>
							<td class="active">출판사</td>
							<td>두더지 나라</td>
						</tr>
						<tr>
							<td colspan="4">두더지가 되고 싶은 나의 마음이 있다.<br>
							<br></td>
						</tr>
					</table>
					<a class="btn btn-default" href="/readingbetter/service/wishbooklist" role="button">목록</a>
				</div>
			</div>
		</div>
		<c:import url='/WEB-INF/views/include/footer.jsp' />
	</div>
</body>
</html>