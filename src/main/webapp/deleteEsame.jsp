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


<form action="/HomeEsame/deleteEsame" method="post">

	<h1 class="element-margin-left">Ecco gli Esami Clinici che puoi eliminare</h1>

		
<table class="bordo rcorners" >	
	     <tr>
     <th><h4>ESAMI</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
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
			href="/HomeUser/showUsers?choice=update&id=${user.iduser}">Modifica</a>
         </td>
         <td>
             <a class="btn lg btn-primary"
			href="/HomeUser/showUsers?choice=delete&id=${user.iduser}">Elimina</a>
         </td>
		
		
     </tr>
     </c:forEach>	
     
     
</table>
		
		

<table class="bordo rcorners" >	
	
	<tr>
    <td><h2>ID Esame : </h2></td>
    <td><input type = "text" id = "idesame" name="idesame" placeholder="Inserisci l'ID dell'esame da eliminare"</td> 
    </tr>
    
    <td>
     	<p><button type = "submit" >Elimina</a>
    </td> 	
     	
</table>

 

<a class="btn lg btn-primary"
		href="/HomeEsame/showEsame?choice=indietro">Indietro</a></br> 

</form>

</body>
</html>