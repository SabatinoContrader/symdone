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


<form class="form-signin" action="/HomeMedico/QUALCOSA" method="post">

	<h1 class="element-margin-left">Ecco tutti i medici</h1>

		
		
		

<table class="bordo rcorners" >	
	     <tr>
     <th><h4>MEDICI</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID MEDICO
         </th>

         <th>
             NOME MEDICO
         </th>
         
         <th>
             COGNOME MEDICO
         </th>
         
         <th>
             SPECIALIZZAZIONE MEDICO
         </th>
         
         <th>
             INDIRIZZO AMBULATORIO
         </th>
         
         <th>
             INDIRIZZO MAIL
         </th>
         
         <th>
          </th>
         <th>
          </th>

     </tr>
	
        <c:forEach items="${listaMedico}" var="medico">
     	
         <td>           
            <c:out value="${medico.idMed}"></c:out>            
         </td>
		 <td>
            <c:out value="${medico.nomeMed}"></c:out>
         </td>
		  <td>           
            <c:out value="${medico.cognomeMed}"></c:out>            
         </td>
		 <td>
            <c:out value="${medico.specMed}"></c:out>
         </td>
          <td>           
            <c:out value="${medico.indMed}"></c:out>            
         </td>
		 <td>
            <c:out value="${medico.mailMed}"></c:out>
         </td>
         
		<td>
          
          <a class="btn lg btn-primary"
			href="/HomeMedico/updateForm?id=${medico.idMed}">Modifica</a>
         </td>
         <td>
             <a class="btn lg btn-primary"
			href="/HomeMedico/deleteMedico?id=${medico.idMed}">Elimina</a>
         </td>
		
		
     </tr>
     </c:forEach>	
     
     
</table>

 <a class="btn lg btn-primary" href="/HomeMedico/ShowMedico?scelta=inserisci">
 	Inserisci
 </a>

<a class="btn lg btn-primary"
		href="/HomeMedico/ShowMedico">Indietro</a></br> 

</form>

</body>
</html>