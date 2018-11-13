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


<form action="/HomePatologia/operationForm" method="POST" id="form_register">

	<h1 class="element-margin-left">Lista delle patologie che puoi modificare </h1>
	


<table class="bordo rcorners" >	
	     <tr>
     <th><h4>PATOLOGIE</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID PATOLOGIA
         </th>

         <th>
             PATOLOGIA
         </th>
         
         <th>
         	DESCRIZIONE
          </th>
         <th>
          </th>

     </tr>
	
        <c:forEach items="${listaPatologia}" var="patologia">
     	
         <td>           
            <c:out value="${patologia.idpatologia}"></c:out>            
         </td>
		 <td>
            <c:out value="${patologia.patologia}"></c:out>
         </td>
         <td>
            <c:out value="${patologia.descrizione}"></c:out>
         </td>
	
		
     </tr>
     </c:forEach>	
     
     
</table>

     	
     	<input type="hidden" name="idpatologia" value="${patologia.idpatologia}"/>
     	<table>
     	<tr><td>
     	<button class="btn lg btn-primary" type="submit" value="update" name="scelta"> Effettua la modifica</button>
     </td><td>
      <a class="btn lg btn-primary"
			href="/HomePatologia/returnHomePatologia">Indietro</a>
         </td>

	  
	  <tr>
	
	  <td><h2>Nome Patologia : </h2>
	  <td><input type = "text" id = "patologia" name="patologia" placeholder="Inserisci nome patologia"></td>
	  
	   <td><h2>Descrizione : </h2>
	  <td><input type = "text" id = "descrizione" name="descrizione" placeholder="Inserisci descrizione"></td>
	  
	  
		
		</tr>
		
     
     
 </table>  

</form>

</body>
</html>
