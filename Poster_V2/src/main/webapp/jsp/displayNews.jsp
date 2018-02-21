
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Merriweather:700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Yanone+Kaffeesatz" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Rubik" rel="stylesheet">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Киноафиша</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- <Main style -->
    <link href="../css/style.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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

                                <h1><a href="../index.jsp">КИНОАФИША</a><p>Прогулка в мире кино</p></h1>

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
                        <li> <a href="../index.jsp">Главная</a> </li>
                        <li > <a href="/controller?command=poster">Фильмы</a> </li>
                        <li class="active"> <a href="/controller?command=news">Новости</a> </li>

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

                <h1>${detailNews.newsTitle}</h1>
                <hr>
                <img  src="data:image/jpeg;base64,${detailNews.newsPicture}"/>

                <div class="well info-block text-center">

                </div>
                <div class="margin-8"></div>




                <div class="well">
                    ${detailNews.newsContent} </div>


                <div class="margin-8"></div>


                <div class="margin-8"></div>
            </div>






            <div class="clear"></div>

        </div>


        <footer>

            <div class="container">
                <p class="text-center"> <a href="https://vk.com/id92440841">BY ARTYOM REVINOV</a> </p>
            </div>

        </footer>




        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="../js/bootstrap.min.js"></script>
    </div></div></body>
</html>