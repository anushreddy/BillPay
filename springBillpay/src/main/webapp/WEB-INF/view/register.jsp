<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Register</title>
</head>
<body>
	<div class="container">

		<jsp:include page="header.jsp" />

		<jsp:include page="navbar.jsp" />

		<div class="col-xs-12" style="height: 60px"></div>

		<form:form modelAttribute="userRegisterModel" action="userRegisterReq"
			method="POST">
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<form:input path="username" name="username" class="form-control name" placeholder="Username" id="username" aria-label="Username" />
					<div class="col-xs-12" style="height: 20px;"></div>
					<form:input type="text" path="email" name="email"
						class="form-control name" placeholder="email" aria-label="email" id="email" />
					<div class="col-xs-12" style="height: 20px;"></div>
					<form:input type="password" path="password" name="password"
						class="form-control password" placeholder="Password"
						aria-label="Password" id="password" />
					<div class="col-xs-12" style="height: 20px;"></div>
					<select name="country" style="width: 150px">
						<option>India</option>
						<option>USA</option>
						<option>UK</option>
						<option>Other</option>
					</select>
					<div class="col-xs-12" style="height: 20px;"></div>
					<div class="row">
						<div class="col-md-8"></div>
						<div class="col-md-4">
							<button type="submit" class="btn btn-primary submit">Register</button>
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
