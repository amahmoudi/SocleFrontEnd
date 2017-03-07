<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title><spring:message code="socle.pageAccessDenied" text="default text" /></title>
</head>
<body>
	<div class="generic-container">
		<div class="authbar">
			<span><strong>${loggedinuser}</strong>,<spring:message code="socle.userNotAuthorized" text="default text" /></span> <span class="floatRight"><a href="<c:url value="/logout" />"><spring:message code="socle.logout" text="default text" /></a></span>
		</div>
	</div>
</body>
</html>