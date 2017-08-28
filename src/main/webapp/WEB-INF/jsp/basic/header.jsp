<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 023 23.08.17
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header id="header"><!--header-->
   <%-- <div class="header_top"><!--header_top-->
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="contactinfo">
                        <ul class="nav nav-pills">
                            <li><a href="#"><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
                            <li><a href="#"><i class="fa fa-envelope"></i> info@domain.com</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="social-icons pull-right">
                        <ul class="nav navbar-nav">
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                            <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header_top-->--%>

    <div class="header-middle"><!--header-middle-->
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <div class="logo pull-left">
                        <a href="<c:url value="/index.html" />">
                            <img src="<c:url value="/resources/e-shop_resources/images/home/logo.png" />" alt="" /></a>
                    </div>

         <%--                <div class="btn-group pull-right">
                             <div class="btn-group">
                                 <button type="button" class="btn btn-default dropdown-toggle usa" data-toggle="dropdown">
                                     USA
                                     <span class="caret"></span>
                                 </button>
                                 <ul class="dropdown-menu">
                                     <li><a href="#">Canada</a></li>
                                     <li><a href="#">UK</a></li>
                                 </ul>
                             </div>

                             <div class="btn-group">
                                 <button type="button" class="btn btn-default dropdown-toggle usa" data-toggle="dropdown">
                                     DOLLAR
                                     <span class="caret"></span>
                                 </button>
                                 <ul class="dropdown-menu">
                                     <li><a href="#">Canadian Dollar</a></li>
                                     <li><a href="#">Pound</a></li>
                                 </ul>
                             </div>
                         </div>--%>

                </div>
                <div class="col-sm-8">
                    <div class="shop-menu pull-right">
                        <ul class="nav navbar-nav">
                            <li><a href="#"><i class="fa fa-user"></i> Account</a></li>
                            <li><a href="#"><i class="fa fa-star"></i> Wishlist</a></li>
                            <li><a href="<c:url value="/checkout.html" />"><i class="fa fa-crosshairs"></i> Checkout</a></li>
                            <li><a href="<c:url value="/cart.html" />"><i class="fa fa-shopping-cart"></i> Cart</a></li>

                            <c:choose>
                                <c:when test="${not empty login}" >
                                    <li><a><p class="fa fa-lock">You're logged as:</p>${login}</a>
                                </c:when>
                                <c:otherwise>
                                    <li> <a href="/login.html"> <p class="fa fa-lock">Login</p></a></li>
                                </c:otherwise>
                            </c:choose>

                            <c:if test="${not empty login}" >
                                <li> <a href="/logout.html"> <p class="fa fa-lock">Log Out</p></a></li>
                            </c:if>

                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-middle-->

    <div class="header-bottom"><!--header-bottom-->
        <div class="container">
            <div class="row">
                <div class="col-sm-9">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="mainmenu pull-left">
                        <ul class="nav navbar-nav collapse navbar-collapse">
                            <li><a href="<c:url value="/index.html" />" class="active">Home</a></li>
                            <li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                <ul role="menu" class="sub-menu">
                                    <li><a href="<c:url value="/shop.html" />">Products</a></li>
                                    <li><a href="<c:url value="/product-details.html" />">Product Details</a></li>
                                    <li><a href="<c:url value="/checkout.html" />">Checkout</a></li>
                                    <li><a href="<c:url value="/cart.html" />">Cart</a></li>
                                    <li><a href="<c:url value="/login.html" />">Login</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a href="#">Blog<i class="fa fa-angle-down"></i></a>
                                <ul role="menu" class="sub-menu">
                                    <li><a href="<c:url value="/blog.html" />">Blog List</a></li>
                                    <li><a href="<c:url value="/blog-single.html" />">Blog Single</a></li>
                                </ul>
                            </li>
                            <li><a href="<c:url value="/404.html" />">404</a></li>
                            <li><a href="<c:url value="/contact-us.html" />">Contact</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="search_box pull-right">
                        <input type="text" placeholder="Search"/>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-bottom-->
</header><!--/header-->