<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 021 21.08.17
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <%@ include file="basic/meta.jsp" %>
    <title>Login | E-Shopper</title>
    <%@ include file="basic/res.jsp" %>
</head><!--/head-->

<body>
<%@ include file="basic/header.jsp" %>

<section id="form"><!--form-->
    <div class="container">
        <div class="row">
            <div class="col-sm-4 col-sm-offset-1">
                <div class="login-form"><!--login form-->
                    <h2>Login to your account</h2>
                    <c:if test="${not empty errorLogin}" >
                        ${errorLogin}
                    </c:if>
                    <form method="post" action="login.html">
                        <input type="text" placeholder="Login" name="login"/>
                        <input type="password" placeholder="Password" name="pass" />
                        <button type="submit" class="btn btn-default">Login</button>
                    </form >
                </div><!--/login form-->
            </div>
            <div class="col-sm-1">
                <h2 class="or">OR</h2>
            </div>
            <div class="col-sm-4">
                <div class="signup-form"><!--sign up form-->
                    <h2>New User Signup!</h2>
                    <c:if test="${not empty error}" >
                        ${error}
                    </c:if>
                    <form method="post" action="/signup">
                        <input type="text" placeholder="Name" name="login"/>
                        <input type="email" placeholder="Email Address" name="email"/>
                        <input type="password" placeholder="Password" name="pass"/>
                        <input type="password" placeholder="Repeat password" name="pass2"/>
                        <button type="submit" class="btn btn-default">Signup</button>
                    </form>
                </div><!--/sign up form-->
            </div>
        </div>
    </div>
</section><!--/form-->

<%@ include file="basic/footer.jsp" %>

</body>
</html>