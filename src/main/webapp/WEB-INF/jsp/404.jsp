<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 021 21.08.17
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="basic/meta.jsp" %>
    <title>Home | E-Shopper</title>
    <%@ include file="basic/res.jsp" %>
</head><!--/head-->

<body>
<div class="container text-center">
    <div class="logo-404">
        <a href="<c:url value="/index.html" />" /><img src="<c:url value="../../resources/e-shop_resources/images/home/logo.png" />" alt="" /></a>
    </div>
    <div class="content-404">
        <img src="<c:url value="../../resources/e-shop_resources/images/404/404.png" />" class="img-responsive" alt="" />
        <h1><b>OPPS!</b> We Couldn’t Find this Page</h1>
        <p>Uh... So it looks like you brock something. The page you are looking for has up and Vanished.</p>
        <h2><a href="<c:url value="/index.html" />">Bring me back Home</a></h2>
    </div>
</div>


<script src="<c:url value="/resources/e-shop_resources/js/jquery.js" />"></script>
<script src="<c:url value="/resources/e-shop_resources/js/price-range.js" />"></script>
<script src="<c:url value="/resources/e-shop_resources/js/jquery.scrollUp.min.js" />"></script>
<script src="<c:url value="/resources/e-shop_resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/e-shop_resources/js/jquery.prettyPhoto.js" />"></script>
<script src="<c:url value="/resources/e-shop_resources/js/main.js" />"></script>
</body>
</html>