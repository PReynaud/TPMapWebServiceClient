<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="description" content="TP incluant la création d'un webservice et d'un site web associé" />
	<meta name="keywords" content="tp, polytech, webservice" />
	<meta name="language" content="fr-FR" />
	<meta name="author" content="Pierre REYNAUD - Dimitri RODARIE" />

	<title>TP Pays</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="HandheldFriendly" content="true"/>
	<meta name="MobileOptimized" content="320"/>

    <!-- CSS -->
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- JS -->
    <script src="resources/js/jquery-1.11.3.min.js" type="text/javascript"></script>

	<!-- Fav Icon -->
	<link rel="icon" type="image/png" href="img/Favicon.png" />
	<link rel="shortcut icon" href="img/Favicon.png" />

</head>
<body>
	<c:forEach items = "${countries}" var="country">
		<li>${country}</li>
	</c:forEach>

    <script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="resources/js/main.js" type="text/javascript"></script>
</body>
</html>