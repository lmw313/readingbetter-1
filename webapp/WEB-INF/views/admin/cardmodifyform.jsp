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
<link href="/readingbetter/assets/css/admin.css" rel="stylesheet" type="text/css">
</head>
<body>
   <div class="container-fluid">
      <c:import url='/WEB-INF/views/admin/header.jsp'/>
      <h4>카드 수정</h4>
      <table class="table" id="board">
          <tr class="info">
             <td>이름</td>
             <td><input type="text" class="form-control" id="card-name" placeholder="이름"></td>
          </tr>
          <tr>
             <td>내용</td>
             <td><input type="text" class="form-control" id="card-content" placeholder="내용"></td>
          </tr>
          <tr>
             <td>능력</td>
             <td><input type="text" class="form-control" id="card-power" placeholder="능력"></td>
          </tr>
          <tr>
             <td>점수</td>
             <td><input type="text" class="form-control" id="card-score" placeholder="점수"></td>
          </tr>
          <tr>
             <td>사진</td>
             <td><input type="text" class="form-control" id="card-pic" placeholder="사진 경로"></td>
          </tr>
      </table>
      
      <a href="/readingbetter/admin/cardlist" id="admin-button" type="button" class="btn btn-default">목록</a>
      <button id="admin-button" type="submit" class="btn btn-default">수정</button>  
   </div>
</body>
</html>