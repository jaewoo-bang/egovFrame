<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/board/list.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
</head>

<body>
	<div class="container-lg">
		<h3>게시글 목록</h3>
		<table class="table">
			<thead>
				<tr>
					<th scope="col"></th>
					<th class="col">번호</th>
					<th class="col">작성자</th>
					<th class="col">제목</th>
				</tr>
			</thead>
			<c:forEach items="${list}" var="board">
				<tbody>
					<tr>
						<th scope="row"></th>
						<th class="col">${board.bno}</th>
						<th class="col">${board.writer}</th>
						<th class="col">${board.title}</th>
					</tr>

					<c:if test="${not empty board.reply}">
						<div class="card">
							<div class="header">댓글목록</div>
							<div class="body">
								<c:forEach items="${board.reply}" var="reply">
									<div class="col-md-3">${reply.reply}</div>
									<div class="col-md-8">${reply.replyer}</div>

								</c:forEach>
							</div>
						</div>
					</c:if>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>