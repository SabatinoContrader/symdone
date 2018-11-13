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
<link href="/css/background.css" rel="stylesheet">
<title>Inserisci Esame</title>
</head>

<div class="insertEsame">
		
		<h1>Inserisci Esame</h1>
	</div>
	<form class="esameForm" action="/HomeEsame/insert" method="post">
		<table class="insertEsame">
			<tr>
				<td><h2>Nome Esame:</h2></td>
				<td><input type="text" class="form-control" id="esame"
					name="esame" placeholder="Inserisci Nome Esame"></td>
			</tr>
			<tr>
				<td><h2>Descrizione:</h2></td>
				<td><input type="text" class="form-control" id="descrizione" name="descrizione"
					placeholder="Inserisci Descrizione Esame"></td>
			</tr>
		</table>
		
		<p><button type = "submit" >Inserisci</button></p>
		
		<a class="btn lg btn-primary"
 href="/Home/homeEsame">Indietro</a></br>
		</form>
	
</body>
</html>