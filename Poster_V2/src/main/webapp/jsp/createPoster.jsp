
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
                        <li  class="active"> <a href="/controller?command=poster">Фильмы</a> </li>
                        <li> <a href="/controller?command=news">Новости</a> </li>

                    </ul>


                </div>

            </div>
        </nav>

    </div>
</div>


<div class="wrapper">

    <div class="container">

        <div class="row">

            <div class="col-lg-9 ">

        <form action="/controller?command=createposter" method="post" enctype="multipart/form-data" >
            <div class="row">

                <div class="well clearfix">
                    <div class="col-lg-3 col-md-2 text-center">

            Название*: <input type="text" name="title" required><br/>
            <br/>
                        Описание*: <textarea rows="10" cols="40" type="text" name="description" required></textarea><br/>
            <br/>
            Год выпуска *4 цифры: <input type="text" name="release" required maxlength="4" pattern="[0-9]{4}"><br/>
            <br/>
            Режиссер*: <input type="text" name="producer" required><br/>
            <br/>
            Гонорар*: <input type="text" name="honorar" required pattern="^[ 0-9]+$"><br/>
            <br/>
            Картинка*:<div class="row" style="margin: 4px; display: inline-block;">
                        <div class="col-sm-2" >
                            <div class="file-form-wrap">
                                <div class="file-upload">

                                    <label><br>
                                        <input required  type="file" name="picture" size="50">
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div><br/>
            <br/>
            Ссылка на трейлер*: <input type="url" name="trailer" required><br/>


            <br/>
                        <button type="submit" class=" btn btn-lg btn-warning pull-right" name="add">Добавить</button>
                    </div>
                </div>
            </div>
        </form>



                <div class="wrapper">

                    <div class="container">

                        <div class="row">

                            <div class="col-lg-3 col-lg-push-7 ">

                                <button type="button" class=" btn btn-lg btn-warning pull-right"><a
                                        href="https://www.youtube.com/">Youtube</a></button><br/>

                            </div>
                        </div>
                    </div>










        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="../js/bootstrap.min.js"></script>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>