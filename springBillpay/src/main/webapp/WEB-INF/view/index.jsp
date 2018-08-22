<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div class="container">

		<jsp:include page="header.jsp" />

		<jsp:include page="navbar.jsp" />

		<div class="col-xs-12" style="height: 60px"></div>

		<h2>Welcome to Bill Pay</h2><br>
		
		<h3>Pay all your bills online here</h3>

		<div id="info"></div>

	</div>

</body>

<script
	src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>

</html>