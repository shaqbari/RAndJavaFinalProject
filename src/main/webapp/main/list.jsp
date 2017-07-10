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
	<%-- <%=application.getRealPath("/") %> --%>
		<table id="table_content" width=700>
			<tr>
				<td align="left">
					<form action="find.do" method="get">
						Search:
						<select name="fs">
							<option value="name">이름</option>
							<option value="subject">전공</option>
						</select>
						<input type="text" name="ss" size="12" />
						<input type="submit" value="찾기">
					</form>
				</td>
				<td align="right">
					<form action="graph.do" method="post">
						<select name="no">
							<option value="1">BarPlot</option>
							<option value="2">Pie</option>
							<option value="3">Pie3D</option>
							<option value="4">TreeMap</option>
							<option value="5">Geom_bar</option>
							<option value="6">Geom_point</option>
							<option value="7">Geom_line</option>
							<option value="8">BoxPlot</option>
							<option value="9">Stars</option>
							<option value="10">HistGram</option>
						</select>
						<input type="submit" value="전송"/>
					</form>
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