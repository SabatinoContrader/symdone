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

	<h1 class="element-margin-left">Ecco tutte le Patologie</h1>	

    <table class="bordo rcorners" >	
    
	     <tr>
         <th><h4>SINTOMI</h4></th><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
         <tr>
	     <tr>
        
         <th>
             ID PATOLOGIA
         </th>

         <th>
             NOME PATOLOGIA
         </th>
         
         <th>
             DESCRIZIONE PATOLOGIA
         </th>
         
         <th>
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
          
       </tr>
       </c:forEach>	
     
     
</table>

<h3>-------------------------------------------- </h3>
        
        <table class="bordo rcorners" >
	     <tr>
     <th><h4>TABELLA MEDICI</h4></th><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
     <tr>
	<tr>
        
         <th>
             ID MEDICI
         </th>

         <th>
             NOME MEDICO
         </th>
         
         <th>
             COGNOME MEDICO
         </th>
         
         <th>
             IND. MEDICO
         </th>
         
         <th>
             SPEC. MEDICO
         </th>
         
         <th>
             MAIL MEDICO
         </th>
         
         <th>
          </th>
         <th>
          </th>

        </tr>
	
        <c:forEach items="${listaMedici}" var="medico">
     	
         <td>           
            <c:out value="${medico.idmedico}"></c:out>            
         </td>
		 <td>
            <c:out value="${medico.nome}"></c:out>
         </td>
         <td>
            <c:out value="${medico.cognome}"></c:out>
         </td>
         <td>
            <c:out value="${medico.indirizzo}"></c:out>
         </td>
         <td>
            <c:out value="${medico.specializzazione}"></c:out>
         </td>
         <td>
            <c:out value="${medico.mail}"></c:out>
         </td>
         
	     </tr>
         </c:forEach>	
    </table>

<br>

<h3>-------------------------------------------- </h3>
        
        <table class="bordo rcorners" >
	     <tr>
     <th><h4>TABELLA ERBE</h4></th><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
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
       
         
	     </tr>
         </c:forEach>	
    </table>


<a class="btn lg btn-primary"
		href="/HomeSearchSintomo/returnControl">Indietro</a></br> 

</form>

</body>
</html>