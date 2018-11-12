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


<form action="/HomePatologia/UpdatePatologia" method="post">

	<h1 class="element-margin-left">Lista delle patologie che puoi modificare </h1>
	


<table class="bordo rcorners" >	
	     <tr>
     <th><h4>PATOLOGIE</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID PATOLOGIA
         </th>

         <th>
             PATOLOGIA
         </th>
         
         <th>
         	DESCRIZIONE
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
	   <td><h2>Id Patologia : </h2>
	   <td><input type = "text" id = "idpatologia" name="idpatologia" placeholder="Inserisci id patologia da modificare"></td>
	
	  <td><h2>Nome Patologia : </h2>
	  <td><input type = "text" id = "patologia" name="patologia" placeholder="Inserisci nome patologia"></td>
	  
	   <td><h2>Descrizione : </h2>
	  <td><input type = "text" id = "descrizione" name="descrizione" placeholder="Inserisci descrizione"></td>
	  
	  
		
		</tr>
		

		
		 <td>

             <p><button type = "submit" >Modifica</button></p>
         </td>
     
     
 </table>  

<a class="btn lg btn-primary"
		href="/Home/homePatologia">Indietro</a></br> 

</form>

</body>
</html>
