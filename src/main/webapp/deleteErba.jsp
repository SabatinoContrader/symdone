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


<form action="/HomeErbaC/deleteErba" method="post">

	<h1 class="element-margin-left">Lista delle erbe che puoi eliminare </h1>
	
	<table class="bordo rcorners" >	
	     <tr>
     <th><h4>ERBE</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID ERBA
         </th>

         <th>
             ERBA
         </th>
         
         <th>
         	DESCRIZIONE
          </th>
         <th>
          </th>

     </tr>
	
        <c:forEach items="${listaErba}" var="erba">
     	
         <td>           
            <c:out value="${erba.iderba}"></c:out>            
         </td>
		 <td>
            <c:out value="${erba.erba}"></c:out>
         </td>
         <td>
            <c:out value="${erba.descrizione}"></c:out>
         </td>
	
		<td>
          
          <a class="btn lg btn-primary"
			href="/HomeUser/showUsers?choice=update&id=${user.iduser}">Modifica</a>
         </td>
         <td>
             <a class="btn lg btn-primary"
			href="/HomeUser/showUsers?choice=delete&id=${user.iduser}">Elimina</a>
         </td>
		
		
     </tr>
     </c:forEach>	
   	


	  
	  <tr>
	   <td><h2>Id Erba : </h2></td>
	   <td><input type = "text" id = "iderba" name="iderba" placeholder="Inserisci id erba da eliminare"></td>
	
		
		</tr>
     
     <td>

             <p><button type = "submit" >Elimina</button></p>
         </td>
		
     
</table>


<a class="btn lg btn-primary"
		href="/Home/homeErba">Indietro</a>

</form>

</body>
</html>
