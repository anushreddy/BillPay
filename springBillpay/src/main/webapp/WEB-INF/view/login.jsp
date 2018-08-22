<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<div class="container">

		<jsp:include page="header.jsp" />

		<jsp:include page="navbar.jsp" />

		<div class="col-xs-12" style="height: 60px"></div>

		<form:form modelAttribute="userLoginModel" action="loginreq" method="POST">
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<form:input type="text" path="email" class="form-control name"
						placeholder="email" aria-label="email" />
					<div class="col-xs-12" style="height: 20px;"></div>
					<form:input type="password" path="password"
						class="form-control password" placeholder="Password"
						aria-label="Password" />
					<div class="col-xs-12" style="height: 20px;"></div>

					<div class="row">
						<div class="col-md-8"></div>
						<div class="col-md-4">
							<button type="submit" class="btn btn-primary submit">Login</button>
						</div>
					</div>
				</div>
			</div>
		</form:form>

		<div id="info"></div>

	</div>

</body>

<script
	src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>

</html>
