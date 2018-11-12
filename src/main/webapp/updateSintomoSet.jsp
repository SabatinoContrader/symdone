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


<form class="form-signin" action="/HomeSintomoSet/sintomosetUpdate" method="post">

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
	
		 <!-- <td>
          
        <a class="btn lg btn-primary"
			href="/HomeSintomoSet/showUsers?choice=update&id=${user.iduser}">Modifica</a>
         </td>
         <td>
             <a class="btn lg btn-primary"
			href="/HomeSintomoSet/DeleteForm">Elimina</a>
         </td>
		-->
		
     </tr>
     </c:forEach>	
     
     
</table>

<!-- <a class="btn lg btn-primary" href="/HomeUser/showUsers?choice=insert">
 	Inserisci
 </a>
-->
 <!--<a class="btn lg btn-primary"
		href="/HomeUser/showUsers?choice=indietro">Indietro</a></br> -->
<table class="insertTable">
				
				<tr>
					<td><h2>Id Primo Sintomo :</h2></td>
					<td><input type="text" id="idprimosintomo" name="idprimosintomo"
						placeholder="Inserisci l'id primo sintomo"></td>
				</tr>
				<tr>
					<td><h2>Id Secondo Sintomo :</h2></td>
					<td><input type="text" id="idsecondosintomo" name="idsecondosintomo"
						placeholder="Inserisci l'id secondo sintomo"></td>
				</tr>
				<tr>
					<td><h2>Id Terzo Sintomo :</h2></td>
					<td><input type="text" id="idterzosintomo" name="idterzosintomo"
						placeholder="Inserisci l'id terzo sintomo"></td>
				</tr>
				</table>
				<input hidden name="idsintomoset" value="${idsintomoset}">
		<input type="submit" value="Modifica">
		<a class="btn lg btn-primary"
		href="/HomeSintomoSet/sintomosetUpdate">Indietro</a></br> 
</form>

</body>
</html>