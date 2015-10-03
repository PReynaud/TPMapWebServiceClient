<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="language" content="fr-FR"/>
  <meta name="author" content="Pierre REYNAUD - Dimitri RODARIE"/>

  <title>Liste des pays</title>

  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <meta name="HandheldFriendly" content="true"/>
  <meta name="MobileOptimized" content="320"/>

  <!-- CSS -->
  <link href="resources/css/bootstrap.min.css" rel="stylesheet"/>
  <link href="resources/css/main.css" rel="stylesheet"/>

  <!-- JS -->
  <script src="resources/js/jquery-1.11.3.min.js" type="text/javascript"></script>

  <!-- Fav Icon -->
  <link rel="icon" type="image/png" href="img/Favicon.png"/>
  <link rel="shortcut icon" href="img/Favicon.png"/>

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
        <li><a href="/">Accueil</a></li>
        <li class="active"><a href="/listePays">Liste Pays</a></li>
      </ul>
      <form class="navbar-form navbar-right" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Rechercher">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
    </div>
  </div>
</nav>
<div class="container">
  <div class="row">
    <h1>
      Liste des pays
    </h1>
  </div>
  <div class="row">
    <div class="col-lg-12">
      <table class="table table-hover">
        <thead>
        <td>
          Nom du Pays
        </td>
        <td>
          Actions
        </td>
        </thead>
        <tbody>
        <c:forEach items="${countries}" var="country">
          <tr>
            <td>${country}</td>
            <td>Consulter</td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
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
<script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
<script src="resources/js/main.js" type="text/javascript"></script>
</body>
</html>
