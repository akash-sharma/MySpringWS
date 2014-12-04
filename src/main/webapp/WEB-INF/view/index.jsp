<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<c:url value="${contextPath}/endpoints/EmployeeWsdlService.wsdl"
		var="employeeWsdlUrl" />
	<c:url value="${contextPath}/endpoints/UserDetailsWsdlService.wsdl"
		var="userDetailWsdlUrl" />

	<a href="${employeeWsdlUrl}" target="_blank">Employee Wsdl Url</a>
	<br>
	<a href="${userDetailWsdlUrl}" target="_blank">UserDetails Wsdl Url</a>
</body>
</html>
