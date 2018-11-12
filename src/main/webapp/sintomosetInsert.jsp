<%@ page import="java.util.List"%>
<%@ page import="com.pCarpet.dto.UserDTO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<!-- Javascript -->
<script src="/css/googleApiManagerDriver.js"></script>
<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/css/pcarpet.css">
</head>
<body>


<form action = "/HomeSintomoSet/insertSintomoSet" method="post">
<table class="insertTable">
				<tr>
					<td><h2>Id Sintomo Set:</h2></td>
					<td><input type="text" id="idsintomoset" name="idsintomoset"
						placeholder="Inserisci l'id sintomo set"></td>
				</tr>
				<tr>
					<td><h2>Id Primo Sintomo :</h2></td>
					<td><input type="text" id="idprimosintomo" name="idprimosintomo"
						placeholder="Inserisci l'id primo sintomo"></td>
				</tr>
				<tr>
					<td><h2>Id Secondo Sintomo :</h2></td>
					<td><input type="text" id="idsecondosintomo" name="idsecondosintomo"
						placeholder="Inserisci l'id secondo sintomo"></td>
				</tr>
				<tr>
					<td><h2>Id Terzo Sintomo :</h2></td>
					<td><input type="text" id="idterzosintomo" name="idterzosintomo"
						placeholder="Inserisci l'id terzo sintomo"></td>
				</tr>
				</table>
			<input type="submit" value="Inserisci" name="richiesta">
		<a class="btn lg btn-primary"
		href="/Home/homeSintomoSet">Indietro</a></br> 
</form>

</body>
</html>