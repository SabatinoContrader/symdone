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


<form class="form-signin" action="/HomeUser/showUsers" method="get">

	<h1 class="element-margin-left">Ecco tutte le patologie</h1>

		
		
		

<table class="bordo rcorners" >	
	     <tr>
     <th><h4>PATOLOGIE</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID PATOLOGIA
         </th>

         <th>
             NOME PATOLOGIA
         </th>
         
         <th>DESCRIZIONE PATOLOGIA
         
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
         
	<td>
          
         <a class="btn lg btn-primary"
			href="/HomePatologia/operationForm?scelta=update&idpatologia=${patologia.idpatologia}">Modifica</a>
         </td>
         <td>
         <a class="btn lg btn-primary"
			href="/HomePatologia/operationForm?scelta=delete&idpatologia=${patologia.idpatologia}">Elimina</a>
         </td>
      
		
		
     </tr>
     </c:forEach>	
     
     
</table> 

<a class="btn lg btn-primary"
		href="/HomePatologia/returnHomePatologia">Indietro</a></br> 

</form>

</body>
</html>