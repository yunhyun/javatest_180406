<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Request 예제입니다.</h1>
<table border="1" width="400">
	<tr>
		<td>이름</td>
		<td>${request_data.name}</td>
	</tr>
	<tr>
		<td>성별</td>
		<td>
			${request_data.gender}
		</td>
	</tr>
	<tr>
		<td>취미</td>
		<td>
			<c:forEach var="hobby" items="${request_data.hobby}">
				${hobby}
			</c:forEach>
		</td>
		<tr>
		<td>취미취미</td>
		<td>
			${request_data.hobby}
		</td>
	</tr>
	</tr>
</table>
</body>
</html>