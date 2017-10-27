<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<c:set var="menu" value="board" />
<%@ include file="/WEB-INF/views/include/nav.jsp" %>
<div class="container">
	<h1>게시글</h1>
	
	<table class="table table-condensed">
		<colgroup>
			<col width="10%">
			<col width="40%">
			<col width="10%">
			<col width="40%">
		</colgroup>
		<tbody>
			<tr>
				<th>제목</th><td colspan="3"><c:out value="${board.title }" /></td>
			</tr>
			<tr>
				<th>번호</th><td>${board.no }</td>
				<th>추천수</th><td>${board.likes }</td>
			</tr>
			<tr>
				<th>작성자</th><td>${board.writer.fullname }</td>
				<th>작성일</th><td><fmt:formatDate value="${board.createdate }" pattern="yyyy-MM-dd"/></td>
			</tr>
			<tr>
				<c:if test="${not empty board.filename }">
				<th>첨부파일</th>
				<td colspan="3">${fn:substring(board.filename, 13, fn:length(board.filename)) }
				<a href="filedownload.do?no=${board.no }" class="btn btn-default btn-xs">다운</a></td>
				</c:if>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="3"><c:out value="${board.contents }" /></td>
			</tr>
		</tbody>
	</table>
	<div class="text-right">
		<a href="home.do" class="btn btn-primary btn-sm">목록</a>
	</div>
</div>
</body>
</html>