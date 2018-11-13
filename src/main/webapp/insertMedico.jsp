<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pCarpet.dto.UserDTO"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>   
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.1/jquery-ui.min.js"></script>   
    <!-- jquery validazioni //-->   
<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery.validate/1.7/jquery.validate.js"></script>   
<script type="text/javascript" src="/validate/validation_user.js">
</script>  
 <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
  <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js" type="text/javascript"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/css/pcarpet.css">
</head>
<body>
 <h2>Inserisci i dati del nuovo medico</h2>
 
 <br>
 
     <form action="/HomeMedico/insertMedico" method="get">
     
     	
        <table class="border rcorners">
        <tr><th><h4>Inserimento Medico</h4></th><td class="userimg"></td><td></td><td></td></tr>
        <tr>
     	<th>Nome:</th> <td><input type = "text" id = "nome" name ="nome" placeholder = "inserisci nome"></td></tr>
     	
     	<tr><th>Cognome:</th> <td> <input type = "text" id = "cognome" name ="cognome" placeholder = "inserisci il cognome"></td></tr>
     	
     	<tr><th>Specializzazione:</th> <td> <input type = "text" id = "specializzazione" name ="specializzazione" placeholder = "inserisci la specializzazione"></td></tr>
     	
     	<tr><th>Indirizzo Ambulatorio:</th> <td> <input type = "text" id = "indirizzo" name ="indirizzo" placeholder = "inserisci l'indirizzo dell'ambulatorio"></td></tr>
     	
     	<tr><th>Mail:</th> <td> <input type = "text" id = "mail" name ="mail" placeholder = "inserisci mail"></td></tr>
		</table>
			
		<button class="btn lg btn-primary" type="submit"  value="inserisci" name="scelta">Inserisci</button>
		
		<a class="btn lg btn-primary" 
		href="/HomeMedico/indietroMedico">Indietro</a></br>
     
     </form>
     
</body>
</html>