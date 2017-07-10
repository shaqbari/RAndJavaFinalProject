<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html >
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="table.css" />
<script>

</script>
</head>
<body>
	<center>
		<table id="table_content" width=700>
			<tr>
				<td align="left">
					<a href="list.do">목록</a>
				</td>
			</tr>
		</table>
		<table id="table_content" width=700>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>전공</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
				<th>국사</th>
				<th>물리</th>
				<th>화학</th>
				<!-- 총점과 평균은 입력하면서 java에서 처리했다. -->
				<th>총점</th>
				<th>평균</th>
			</tr>
			<c:forEach var="vo" items="${list }">
				<tr>
					<td>${vo.hakbun}</td>
					<!-- vo.getHackbun() -->
					<td>${vo.name }</td>
					<td>${vo.subject }</td>
					<td>${vo.kor }</td>
					<td>${vo.eng }</td>
					<td>${vo.math }</td>
					<td>${vo.history }</td>
					<td>${vo.phy }</td>
					<td>${vo.chem }</td>
					<td>${vo.total }</td>
					<td>${vo.avg}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>