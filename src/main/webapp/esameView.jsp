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


<form class="form-signin" action="/HomeUser/showUsers" method="post">

	<h1 class="element-margin-left">Ecco tutti gli Esami clinici</h1>

		
		
		

<table class="bordo rcorners" >	
	     <tr>
     <th><h4>ESAMI CLINICI</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID ESAME
         </th>

         <th>
             ESAME
         </th>
         
         <th>
         	DESCRIZIONE
          </th>
         <th>
          </th>

     </tr>
	
        <c:forEach items="${listaEsame}" var="esame">
     	
         <td>           
            <c:out value="${esame.idesame}"></c:out>            
         </td>
		 <td>
            <c:out value="${esame.esame}"></c:out>
         </td>
         <td>
            <c:out value="${esame.descrizione}"></c:out>
         </td>
	
		<td>
          
          <a class="btn lg btn-primary"
			href="/HomeEsame/operationForm?scelta=update&idesame=${esame.idesame}">Modifica</a>
         </td>
         <td>
              <a class="btn lg btn-primary"
			href="/HomeEsame/operationForm?scelta=delete&idesame=${esame.idesame}">Elimina</a>
         </td>
		
		
     </tr>
     </c:forEach>	
     
     
</table>

 <a class="btn lg btn-primary" href="/HomeEsame/insertForm">
 	Inserisci
 </a>

		<a class="btn lg btn-primary"
 		href="/Home/homeEsame">Indietro</a></br> 

</form>

</body>
</html>