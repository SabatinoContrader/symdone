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


<form action="/HomeEsame/updateEsame" method="post">

	<h1 class="element-margin-left">Lista degli Esami Clinici che puoi modificare </h1>
	


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
     	
     
     

	  
	  <tr>
	   <td><h2>Id esame : </h2>
	   <td><input type = "text" id = "idesame" name="idesame" placeholder="Inserisci id esame da modificare"></td>
	
	  <td><h2>Nome esame : </h2>
	  <td><input type = "text" id = "esame" name="esame" placeholder="Inserisci nome esame"></td>
	  
	   <td><h2>Descrizione : </h2>
	  <td><input type = "text" id = "descrizione" name="descrizione" placeholder="Inserisci descrizione"></td>
	  
	  
		
		</tr>
		

		
		 <td>

             <p><button type = "submit" >Modifica</button></p>
         </td>
     
     
 </table>  

<a class="btn lg btn-primary"
		href="/Home/homeEsame">Indietro</a></br> 

</form>

</body>
</html>