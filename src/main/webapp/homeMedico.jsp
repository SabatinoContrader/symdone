<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>DIM - Syndone</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/signin.css" rel="stylesheet">

<link href="/css/background.css" rel="stylesheet">
</head>

<body class="text-center">
	<form class="form-signin">
		<h1 class="h3 mb-3 font-weight-normal">
		HOME MEDICO
		</h1>
		<a class="btn btn-lg btn-primary btn-block"
		href="/HomeMedico/ShowMedico?scelta=visualizza">Visualizza Medico</a><br> 
		
		<a class="btn btn-lg btn-primary btn-block"
		href="/HomeMedico/ShowMedico?scelta=inserisci">Inserisci Medico</a><br> 
		
		<a class="btn btn-lg btn-primary btn-block"
		href="/HomeMedico/ShowMedico?scelta=update">Modifica Medico</a><br> 
		
		<a class="btn btn-lg btn-primary btn-block"
		href="/HomeMedico/ShowMedico?scelta=delete">Elimina Medico</a><br> 
		
		<a class="btn btn-lg btn-primary btn-block" 
		href="/HomeMedico/ShowMedico?scelta=indietroMain">Indietro</a><br>
		
	</form>

</body>
</html>