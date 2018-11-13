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
</head>
<body>


<form class="form-signin" action="/HomeUser/showUsers" method="post">

	<h1 class="element-margin-left">Ecco tutti gli utenti</h1>

		
		
		

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
			href="/HomeErbaC/operationForm?scelta=update&id=${erba.iderba}">Modifica</a>
         </td>
         <td>
             <a class="btn lg btn-primary"
			href="/HomeErbaC/operationForm?scelta=delete&id=${erba.iderba}">Elimina</a>
         </td>
		
		
     </tr>
     </c:forEach>	
     
     
</table>



<a class="btn lg btn-primary"
		href="/Home/homeErba">Indietro</a></br> 

</form>

</body>
</html>