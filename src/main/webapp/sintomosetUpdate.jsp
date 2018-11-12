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


<form action = "/HomeSintomoSet/updateSintomoSet" method="post">
<table class="deleteTable">
				<tr>
					<td><h2>Id Sintomo Set:</h2></td>
					<td><input type="text" id="idsintomoset" name="idsintomoset"
						placeholder="Inserisci l'id sintomo set da modificare"></td>
				</tr>
			
			
				</table>
			<input type="submit" value="Modifica" name="richiesta">
		<a class="btn lg btn-primary"
		href="/Home/homeSintomoSet">Indietro</a></br> 
</form>

</body>
</html>