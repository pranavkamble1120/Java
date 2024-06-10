<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Customer</title>
<link type="text/css" ref="stylesheet" href="${pageContext.request.contextPath }/resourcse/css/style.css"/>
</head>
<body>
<div id="wrapper">
	<div id="header">
	<h2> CRM-Customer Relationship Manager<h2>
	</div>
</div>

<div id="container>
	<div id="content">

<input type="button" value="Add Customer" onclick="window.location.href="showFormForAdd";return false; class="add_button"/>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
</tr>
<c:forEach var="tempcustomer" items="${customer }">
<tr>
${tempcustomer.firstName}
${tempcustomer.lastName }
${tempcustomer.email}
</tr>
</c:forEach>
</table>
</div>
</body>
</html>