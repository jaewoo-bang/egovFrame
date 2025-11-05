<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<form method="post" action="/board/register">
			<div>
				제목 <input name="title">
				작성자 <input name="writer">
				내용 <textarea name="content" rows="5" cols="5"></textarea>
				<button type="submit">등록</button>
			</div>
		</form>
	</table>

</body>
</html>