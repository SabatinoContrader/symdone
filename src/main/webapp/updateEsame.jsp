<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pCarpet.dto.AssetDTO"%>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>   
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.1/jquery-ui.min.js"></script>   
<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery.validate/1.7/jquery.validate.js"></script>   
<script type="text/javascript" src="/validate/validation_asset.js"></script>

<meta charset="ISO-8859-1">
<title>Modifica Esame Clinico</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/css/pcarpet.css">
<link href="/css/background.css" rel="stylesheet">
</head>
<body>

<h2>Inserisci i dati dell' Esame Clinico</h2>
 
 </br>
 
<form action="/HomeEsame/operationForm" method="POST" id="form_register">
        
<table class="border rcorners">	

	<tr>
        
         <th>
             Id ESAME
         </th>

         <th>
             ESAME
         </th>
         
          <th>
             DESCRIZIONE
         </th>

	</tr>
	<tr>
	
        <td>
            <input type="text" value="${esame.idesame}" disabled class="labcor">
         </td>

		<td>
             <input type="text" value="${esame.esame}" name="esame" class="labcor">
         </td>
         
         <td>
             <input type="text" value="${esame.descrizione}" name="descrizione" class="labcor">
         </td>
         
     </tr>
   
     
</table>

</br>
		
</br>

<input type="hidden" name="idesame" value="${esame.idesame}"/>
<table>
<tr><td>
<button class="btn lg btn-primary" type="submit" value="update" name="scelta">Effettua la Modifica</button>
</td><td>
<a class="btn lg btn-primary"
 		href="/Home/homeEsame">Indietro</a></br>
</td>
</tr>
</table>
</form>

</body>
</html>