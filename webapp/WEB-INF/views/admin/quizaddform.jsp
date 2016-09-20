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
<link href="/readingbetter/assets/css/admin.css" rel="stylesheet" type="text/css">
<link href="/readingbetter/assets/css/board.css" rel="stylesheet" type="text/css">
</head>
<body>
   <div class="container-fluid">
      <c:import url='/WEB-INF/views/admin/header.jsp'/>
      <h4>퀴즈 등록</h4>
      <form id="quiz-insert" name="quizinsert" method="post" action="###">      
      <table class="table" id="board">
         <tr>
            <td class="active">책제목</td>
            <td colspan="2"> <input type="text" class="form-control" id="booktitle" placeholder="책 제목"></td>
            <td class="active">작성일</td>
            <td colspan="2"> <input  type="text" class="form-control" id="date" placeholder="날짜"></td>
         </tr>
         
         <tr>
            <td class="active">작성자</td>
            <td><input  type="text" class="form-control" id="writer" placeholder="GM미미"></td>
            <td class="active">출판사</td>
            <td colspan="3"><input  type="text" class="form-control" id="publishing" placeholder="두더지나라"></td>
            
         </tr>
         <tr>
            <td class="active" colspan="6">문제</td>
         </tr>
         <tr>
            <td colspan="6">
            <textarea class="form-control" rows="3"></textarea>
            </td>
         </tr>
         <tr>
            <td class="active"  colspan="6">보기</td>
         </tr>
         <tr>
            <td class="active">1</td>
            <td colspan="5"><input  type="text" class="form-control" id="ex1" placeholder="보기1"></td>
         </tr>
         
         <tr>   
            <td class="active">2</td>
            <td colspan="5"><input  type="text" class="form-control" id="ex2" placeholder="보기2"></td>
         </tr>
         
         <tr>
            <td class="active">3</td>
            <td colspan="5"><input  type="text" class="form-control" id="ex3" placeholder="보기3"></td>
         </tr>
         
         <tr>
            <td class="active">4</td>
            <td colspan="5"><input  type="text" class="form-control" id="ex4" placeholder="보기4"></td>
         </tr>
         
         <tr>
            <td class="active">정답</td>
            <td colspan="5"><input  type="text" class="form-control" id="answer" placeholder="정답"></td>
         </tr>
      </table>
      </form>
      
      <a class="btn btn-default" href="/readingbetter/admin/quizlist" role="button">목록</a>
      
      <button class="btn btn-default" type="submit">등록</button>
   </div>
</body>
</html>