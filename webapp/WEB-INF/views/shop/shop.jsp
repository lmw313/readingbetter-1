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
<link href="/readingbetter/assets/css/shop.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="container-fluid">
		<c:import url='/WEB-INF/views/include/header.jsp' />
		<div class="row asideWrap">
			<div id="navigation" class="col-lg-2">
				<c:import url='/WEB-INF/views/include/navi_shop.jsp' />
			</div>
			<div id="content" class="col-lg-10">
				<div id="shop">
					<div class="small-menu">
						<a href="/readingbetter/main">홈</a> > 상점
					</div>
					<p class="menu-title">상점</p>
					
					<div class="imggroup">
						<div class="col-lg-3">
							<a href="">
								<img id="img-shop" class="img-thumbnail"
									src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/ramen1.png" />
							</a>
							<table class="table">
								<tr>
									<td>상품명</td>
									<br>
									<td>신라면</td>
								</tr>
								<tr>
									<td>캔디</td>
									<br>
									<td>1</td>
								</tr>
							</table>
							<br>
						</div>

						<div class="col-lg-3">
							<a href="http://www.naver.com">
								<img id="img-shop" class="img-thumbnail"
									src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/ramen2.png" />
							</a>
							<table class="table">
								<tr>
									<td>상품명</td>
									<br>
									<td>불닭볶음면</td>
								</tr>
								<tr>
									<td>캔디</td>
									<br>
									<td>2</td>
								</tr>
							</table>
							<br>
						</div>

						<div class="col-lg-3">
							<a href="http://www.naver.com">
								<img id="img-shop" class="img-thumbnail"
								src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/ramen3.png">
							</a>
							<table class="table">
								<tr>
									<td>상품명</td>
									<br>
									<td>부대찌개</td>
								</tr>
								<tr>
									<td>캔디</td>
									<br>
									<td>1</td>
								</tr>
							</table>
							<br>
						</div>

						<div class="col-lg-3">
							<a href="http://www.naver.com">
								<img id="img-shop" class="img-thumbnail"
									src="http://ec2-52-34-170-68.us-west-2.compute.amazonaws.com/images/ramen3.png">
							</a>
							<table class="table">
								<tr>
									<td>상품명</td>
									<br>
									<td>부대찌개</td>
								</tr>
								<tr>
									<td>캔디</td>
									<br>
									<td>1</td>
								</tr>
							</table>
							<br>
						</div>
					</div>
				</div>
			</div>
		</div>
		<c:import url='/WEB-INF/views/include/footer.jsp' />
	</div>
</body>
</html>