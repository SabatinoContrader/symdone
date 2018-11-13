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

<link href="/css/background.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="/css/pcarpet.css">
</head>
<body>


<form class="form-signin" action="/HomeUser/showUsers" method="GET">

	<h1 class="element-margin-left">Ecco tutti i Sintomi</h1>

		
		
		

<table class="bordo rcorners" >	
	     <tr>
     <th><h4>SINTOMI</h4></th><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID SINTOMO
         </th>

         <th>
             NOME SINTOMO
         </th>
         
         <th>
          </th>
         <th>
          </th>

     </tr>
	
        <c:forEach items="${listaSintomo}" var="sintomo">
     	
         <td>           
            <c:out value="${sintomo.idsintomo}"></c:out>            
         </td>
		 <td>
            <c:out value="${sintomo.nomeSintomo}"></c:out>
         </td>
	
		<td>
          
          <a class="btn lg btn-primary"
			href="/HomeSintomo/operationForm?scelta=update&id=${sintomo.idsintomo}">Modifica</a>
         </td>
         <td>
             <a class="btn lg btn-primary"
			href="/HomeSintomo/operationForm?scelta=delete&id=${sintomo.idsintomo}">Elimina</a>
         </td>		
     </tr>
     </c:forEach>	
     
     
</table>

 <a class="btn lg btn-primary" href="/HomeUser/showUsers?choice=insert">
 	Inserisci
 </a>

<a class="btn lg btn-primary"
		href="/HomeSintomo/returnHomeSintomo">Indietro</a></br> 

</form>

</body>
</html>