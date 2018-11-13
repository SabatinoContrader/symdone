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


<form class="form-signin" action="/HomeUser/showUsers" method="get">

	<h1 class="element-margin-left">Ecco tutti gli utenti</h1>

		
		
		

<table class="bordo rcorners" >	
	     <tr>
     <th><h4>SINTOMISET</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID SINTOMO SET
         </th>

         <th>
             ID PRIMO SINTOMO
         </th>
         
         <th>
             ID SECONDO SINTOMO
         </th>
         
         <th>
             ID TERZO SINTOMO
         </th>
         
         <th>
          </th>
         <th>
          </th>

     </tr>
	
        <c:forEach items="${listaSintomoSet}" var="sintomoset">
     	
         <td>           
            <c:out value="${sintomoset.idsintomoset}"></c:out>            
         </td>
		 <td>
            <c:out value="${sintomoset.idprimosintomo}"></c:out>
         </td>
         	 <td>
            <c:out value="${sintomoset.idsecondosintomo}"></c:out>
         </td>
         	 <td>
            <c:out value="${sintomoset.idterzosintomo}"></c:out>
         </td>
	
	<td>
          
          <a class="btn lg btn-primary"
			href="/HomeSintomoSet/operationForm?scelta=update&idsintomoset=${sintomoset.idsintomoset}">Modifica</a>
         </td>
         <td>
             <a class="btn lg btn-primary"
			href="/HomeSintomoSet/operationForm?scelta=delete&idsintomoset=${sintomoset.idsintomoset}">Elimina</a>
         </td>
		
     </tr>
     </c:forEach>	
     
     
</table>

 <!-- <a class="btn lg btn-primary" href="/HomeUser/showUsers?choice=insert">
 	Inserisci
 </a>
-->
<a class="btn lg btn-primary"
		href="/Home/homeSintomoSet">Indietro</a></br> 

</form>

</body>
</html>