<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 ${ empty board.bno ? "등록" : "수정" }</title>

<!-- ✅ Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
	body {
		background-color: #f8f9fa;
	}
	.card {
		max-width: 600px;
		margin: 50px auto;
		box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
		border-radius: 12px;
	}
	.card-header {
		background-color: #0d6efd;
		color: white;
		font-size: 1.25rem;
		font-weight: 600;
		text-align: center;
		border-top-left-radius: 12px;
		border-top-right-radius: 12px;
	}
	.btn {
		font-weight: 600;
	}
</style>
</head>
<body>

<div class="card">
	<div class="card-header">
		${ empty board.bno ? "게시글 등록" : "게시글 수정" }
	</div>
	<div class="card-body">
		<form name="form" method="post" action="/board/register">
			<input type="hidden" name="bno" value="${board.bno}" />

			<div class="mb-3">
				<label class="form-label">제목</label>
				<input type="text" class="form-control" name="title" value="${board.title}" placeholder="제목을 입력하세요">
			</div>

			<div class="mb-3">
				<label class="form-label">작성자</label>
				<input type="text" class="form-control" name="writer" value="${board.writer}" placeholder="작성자명을 입력하세요">
			</div>

			<div class="mb-3">
				<label class="form-label">내용</label>
				<textarea class="form-control" name="content" rows="5" placeholder="내용을 입력하세요">${board.content}</textarea>
			</div>

			<div class="d-flex justify-content-between">
				<button type="submit" class="btn btn-primary w-50 me-2">
					${ empty board.bno ? "등록" : "수정" }
				</button>

				<c:if test="${not empty board.bno}">
					<button type="button" class="btn btn-danger w-50" onclick="boardDelete()">삭제</button>
				</c:if>
			</div>
		</form>
	</div>
</div>

<!-- ✅ Bootstrap JS (optional for modal, dropdown, etc.) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<script>
	function boardDelete() {
		if (confirm("정말 삭제하시겠습니까?")) {
			document.form.action = "/board/delete";
			document.form.submit();
		}
	}
</script>

</body>
</html>
