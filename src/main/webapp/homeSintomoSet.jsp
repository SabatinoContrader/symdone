<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SINTOMOSET</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/signin.css" rel="stylesheet">
</head>

<body class="text-center">
	<form class="form-signin">
		<h1 class="h3 mb-3 font-weight-normal">
		HOME SINTOMO SET
		</h1>
		<a class="btn btn-lg btn-primary btn-block"
		href="/HomeSintomoSet/ShowSintomoSet">Visualizza Sintomi Set</a><br> 
		<a class="btn btn-lg btn-primary btn-block"
		href="/HomeSintomoSet/InsertForm">Inserisci Sintomo Set</a><br>
		<a class="btn btn-lg btn-primary btn-block"
		href="/HomeSintomoSet/UpdateForm">Modifica Sintomo Set</a><br>
		<a class="btn btn-lg btn-primary btn-block"
		href="/HomeSintomoSet/DeleteForm">Elimina Sintomo Set</a><br>
		<a class="btn btn-lg btn-primary btn-block"
		href="/Home/homeDoctor">Indietro</a><br>
	</form>

</body>
</html>