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


<form action="/HomePatologia/InsertPatologia" method="post">
			<table class="insertTable">
				
				
				<tr>
					<td><h2>Nome Patologia:</h2></td>
					<td><input type="text" id="patologia" name="patologia"
						placeholder="Inserisci il nome della patologia"></td>
				</tr>
				
				<tr>
					<td><h2>Descrizione:</h2></td>
					<td><input type="text" id="descrizione" name="descrizione"
						placeholder="Inserisci la descrizione della patologia"></td>
				</tr>
				
		</table>
		<
		    <input type="submit" value="Inserisci" name="richiesta">
		    <a class="btn lg btn-primary"
 href="/Home/homePatologia">Indietro</a></br> 
		
		</form>
</body>
</html>