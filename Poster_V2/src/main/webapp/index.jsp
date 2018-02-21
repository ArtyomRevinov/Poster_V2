<%@ page contentType="text/html;charset=windows-1251" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--<fmt:setLocale value="${locale}" scope="session"/>--%>
<fmt:bundle basename="locale">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%--<link rel="stylesheet" href="../../css/font-awesome.min.css">--%>
    <link href="https://fonts.googleapis.com/css?family=Merriweather:700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Yanone+Kaffeesatz" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Rubik" rel="stylesheet">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Киноафиша</title> <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- <Main style -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">

</head>
<body>


<div class="container">
    <div class="row">

        <nav role="navigation" class="navbar navbar-inverse">
            <div class="container">

                <div class="navbar-header header">

                    <div class="container">

                        <div class="row">

                            <div class="col-lg-12">

                                <h1><a href="index.jsp"><fmt:message key="cinemaposter"/></a></h1>

                            </div>

                        </div>

                    </div>


                    <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">

                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>

                    </button>


                </div>

                <div id="navbarCollapse" class="collapse navbar-collapse navbar-right">

                    <ul class="nav nav-pills">
                        <li><a href="jsp/login.jsp"><fmt:message key="login"/></a></li>
                        <li><a href="jsp/register.jsp"><fmt:message key="register"/></a></li>
                        <li>
                            <a href="/controller?command=locale&locale=en&redirect=true"
                               style="display: inline-block; padding-right: 2px;"><fmt:message key="en"/>
                                </a>

                            <a href="/controller?command=locale&locale=ru&redirect=true"
                               style="display: inline-block; padding-left: 2px;"><fmt:message key="ru"/>
                                </a>
                        </li>
                        <li class="active"> <a href="index.jsp"><fmt:message key="main"/></a> </li>
                        <li> <a href="/controller?command=poster"><fmt:message key="films"/></a> </li>
                        <li> <a href="/controller?command=news"><fmt:message key="news"/></a> </li>
                            <li> <a href="/controller?command=logout"><fmt:message key="exit"/></a> </li>
                    </ul>


                </div>

            </div>
        </nav>

    </div>
</div>


<div class="wrapper">

    <div class="container">

        <div class="row">

            <div class="col-lg-12">

                <h2><fmt:message key="newfilms"/></h2>
                <hr>
                <div class="row">



                    <div class="films_block col-lg-3 col-md-3 col-sm-3 col-xs-6">
                        <img  src="img/inter.png" alt="интерстеллар">
                        <div class="film_label"><fmt:message key="interstellar"/></div>
                    </div>

                    <div class="films_block col-lg-3 col-md-3 col-sm-3 col-xs-6">
                        <img src="img/matrix.png" alt="матрица">
                        <div class="film_label"><fmt:message key="matrix"/></div>
                    </div>

                    <div class="films_block col-lg-3 col-md-3 col-sm-3 col-xs-6">
                        <img src="img/cloud.png" alt="облачный атлас">
                        <div class="film_label"><fmt:message key="cloudyatlas"/></div>
                    </div>

                    <div class="films_block col-lg-3 col-md-3 col-sm-3 col-xs-6">
                        <img src="img/max.png" alt="безумный макс">
                        <div class="film_label"><fmt:message key="madmax"/> </div>
                    </div>


                </div>

                <div class="margin-8"></div>

                <h2><fmt:message key="newserials"/></h2>
                <hr>
                <div class="row">

                    <div class="films_block col-lg-3 col-md-3 col-sm-3 col-xs-6">
                        <img src="img/xfiles.png" alt="">
                        <div class="film_label"><fmt:message key="secretmaterials"/> </div>
                    </div>

                    <div class="films_block col-lg-3 col-md-3 col-sm-3 col-xs-6">
                        <img src="img/silicon.png" alt="">
                        <div class="film_label"><fmt:message key="siliconvalley"/> </div>
                    </div>

                    <div class="films_block col-lg-3 col-md-3 col-sm-3 col-xs-6">
                        <img src="img/dead.png" alt="">
                        <div class="film_label"><fmt:message key="walkingdead"/> </div>
                    </div>

                    <div class="films_block col-lg-3 col-md-3 col-sm-3 col-xs-6">
                        <img src="img/breakingbad.png" alt="">
                        <div class="film_label"><fmt:message key="badass"/>  </div>
                    </div>

                </div>

                <div class="margin-8"></div>

                <a href="#"><h3><fmt:message key="howintfilmed"/></h3></a>
                <hr>
                <p>
                    <fmt:message key="crisnollan"/>
                </p>


                <div class="margin-8"></div>

                <a href="#"><h3> <fmt:message key="tomhanks"/></h3></a>
                <hr>
                <p>
                    <fmt:message key="tombook"/>
                </p>


                <div class="margin-8 clear"></div>



            </div>


            <div class="col-lg-3 col-lg-pull-9">









            <div class="clear"></div>

        </div>
    </div>
</div>

<footer>

    <div class="container">
        <p class="text-center"> <a href="#">BY ARTYOM REVINOV</a> </p>
    </div>


</footer>




<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>


</div></body></html>
</fmt:bundle>