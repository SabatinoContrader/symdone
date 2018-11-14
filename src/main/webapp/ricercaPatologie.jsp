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


<form class="form-signin" action="/HomeSearchSintomo/operationSearchForm" method="GET">

	<h1 class="element-margin-left">Ecco tutti i Sintomi !!!!</h1>

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
         
         
	     </tr>
         </c:forEach>	
    </table>
   <table class="insertTable">
   <tr>
    <td><h2>Inserisci ID del Sintomo </h2></td>
          <td><input type="text" id="idRicerca" name="idRicerca" placeholder = "inserisci ID"><td>
    </tr>
   </table>
   <button class="btn btn-lg btn-primary btn-block" value="searchPatologia" type="submit" name="scelta">Cerca</button>
   
   <a class="btn lg btn-primary"
		href="/HomeSearchSintomo/operationSearchForm?scelta=result">View Patologie</a></br>
		<a class="btn lg btn-primary"
		href="/HomeSintomo/returnHomeSintomo">Indietro</a></br>
   </form>

</body>
</html>