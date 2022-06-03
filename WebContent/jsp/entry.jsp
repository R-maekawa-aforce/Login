<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "../header.html" %>
<link href="../design.css" media="all" rel="stylesheet">

<form action = "../jp.co.aforce.servlets/insert" method = "post">
	<p>ID:<input type = "text" name = "id" required="required"></p>
	<p>パスワード:<input type = "password" name = "pass" required="required"></p>
	<p><input type = "submit" value = "登録">
</form>

<%@include file = "../footer.html" %>