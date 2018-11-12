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
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/css/pcarpet.css">
</head>
<body>

<h2>Inserisci i dati del Sintomo</h2>
 
 </br>
 
<form action="/HomeSintomo/operationForm" method="POST" id="form_register">
        
<table class="border rcorners">	

	<tr>
        
         <th>
             Id SINTOMO
         </th>

         <th>
             NOME SINTOMO
         </th>

	</tr>
	<tr>
	
        <td>
            <input type="text" value="${sintomo.idsintomo}" disabled class="labcor">
         </td>

		<td>
             <input type="text" value="${sintomo.nomeSintomo}" name="nome" class="labcor">
         </td>
         
     </tr>
   
     
</table>

</br>
		
</br>

<input type="hidden" name="id" value="${sintomo.idsintomo}"/>
<table>
<tr><td>
<button class="btn lg btn-primary" type="submit" value="update" name="scelta">Effettua la Modifica</button>
</td><td>
<a class="btn lg btn-primary" 
		href="/HomeSintomo/returnHomeSintomo">Indietro</a></br>
</td>
</tr>
</table>
</form>

</body>
</html>