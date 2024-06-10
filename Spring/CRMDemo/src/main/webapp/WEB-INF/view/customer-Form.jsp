<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Customer</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/Resources/css/add-Customer-style">
</head>
<body>
<div id="wrapper">
<div id="header">
<h2>CRM-Customer Relationship Manager</h2>
</div>
</div>
<div id="container">
<h3>Save Customer</h3>
<form:form action="saveCustomer" modelAttribute="Customer" method="post">
<table>
<tbody>
<tr>
<td><label>First Name:</label></td>
<td><form:input path="firstname"/></td>
</tr>
<tr>
<td><label>Last Name:</label></td>
<td><form:input path="lastName"/></td>
</tr>

<tr>
<td><label>Email:</label></td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td><label></label></td>
<td input type="submit" value="Save" class="save"></td>
</tr>
</tbody>
</table>
</form:form>
<div style="clear":both:></div>
<p>
<a ref="${pageContext.request.contextPath }/Customer/List">Back to List</a>
</p>
</div>
</body>
</html>