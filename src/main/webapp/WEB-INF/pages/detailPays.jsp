<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="description" content="TP incluant la création d'un webservice et d'un site web associé"/>
    <meta name="keywords" content="tp, polytech, webservice"/>
    <meta name="language" content="fr-FR"/>
    <meta name="author" content="Pierre REYNAUD - Dimitri RODARIE"/>

    <title>Detail ${country.nomPays}</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="HandheldFriendly" content="true"/>
    <meta name="MobileOptimized" content="320"/>

    <!-- CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"/>

    <!-- JS -->
    <script src="<c:url value="/resources/js/jquery-1.11.3.min.js"/>" type="text/javascript"></script>

</head>
<body>
<nav class="navbar  navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#menu" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="menu">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">Accueil</a></li>
                <li><a href="/listePays">Liste Pays</a></li>
            </ul>
            <form class="navbar-form navbar-right" role="search" id="paysSearch">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Rechercher" id="champRecherche">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <h1>Détail ${country.nomPays}</h1>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <ul class="list-group">
                <li class="list-group-item">Nom : ${country.nomPays}</li>
                <li class="list-group-item">Capitale : ${country.nomCapitale}</li>
                <li class="list-group-item">Nombre d'habitants : ${country.nbHabitants}</li>
                <input type="hidden" name="countryName" value="${country.nomPays}" class="countryName">
            </ul>
        </div>
        <%--<div class="col-lg-6">
            <img src="http://maps.googleapis.com/maps/api/staticmap?maptype=hybrid&center=${country.nomPays}&size=640x400&markers=color:red%7C${capital}"/>
        </div>--%>
        <div class="col-lg-6">
            <div id="map"></div>
        </div>
    </div>
</div>
<footer class="footer">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            Pierre REYNAUD - RODARIE Dimitri - 2015
        </div>
    </nav>
</footer>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/main.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/map.js"/>" type="text/javascript"></script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDapZqU3n516PIkAwaqLIWYuppo_A2uqs8&callback=initMap&language=fr"></script>
</body>
</html>
