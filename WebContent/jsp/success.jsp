<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "../header.html" %>
<link href="../design.css" media="all" rel="stylesheet">

<section>
<p>ようこそ、${user.id}さん！</p>
</section>


<form action = "../jp.co.aforce.servlets/logout" method = "post">
<input type = "submit" value = "ログアウト">
</form>

<p><a href = "../jsp/other.jsp" >別ページ</a></p>

<%@include file = "../footer.html" %>