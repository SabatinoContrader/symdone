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


<form action="/HomePatologia/DeletePatologia" method="post">
			<table class="insertTable">
				<tr>
					<td><h2>Id Patologia:</h2></td>
					<td><input type="text" id="idpatologia" name="idpatologia"
						placeholder="Inserisci l'id della patologia da eliminare"></td>
				</tr>
				
				
		</table>
		
		
	 
		 <input type="submit" value="Elimina" name="richiesta">
    
    <a class="btn lg btn-primary"
 href="/Home/homePatologia">Indietro</a></br> 		
		</form>
</body>
</html>