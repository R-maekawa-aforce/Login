<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "../header.html" %>
<link href="../design.css" media="all" rel="stylesheet">

<form action = "../jp.co.aforce.servlets/login" method ="post">

	<p>ID:<input type = "text" name = "id" required="required"></p>
	<p>ログイン:<input type = "password" name = "pass" required="required"></p>
	<p><input type = "submit" value = "ログイン"></p>
</form>

<p class = "link"><a href = "../jsp/entry.jsp">会員登録が済んでない人はこちら</a></p>

<%@include file = "../footer.html" %>