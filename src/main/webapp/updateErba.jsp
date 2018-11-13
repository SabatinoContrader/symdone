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
<link href="/css/background.css" rel="stylesheet">
</head>
<body>


<form action="/HomeErbaC/operationForm" method="POST">

	<h1 class="element-margin-left">Lista delle erbe che puoi modificare </h1>
	


<table class="bordo rcorners" >	
	     <tr>
     <th><h4>ERBE</h4></th><td></td><td></td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
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
       </tr>
          
          
         <tr>
          <td>
            <input type="text" value="${erba.iderba}" disabled class="labcor">
         </td>

		<td>
             <input type="text" value="${erba.erba}" name="erba" class="labcor">
         </td>
         
         <td>
             <input type="text" value="${erba.descrizione}" name="descrizione" class="labcor">
         </td>

     </tr>

  </table>

    </br>
		
    </br>


     <input type="hidden" name="id" value="${erba.iderba}"/>     	
     <table>
     <tr><td>
	  <button class="btn lg btn-primary" type="submit" value="update" name="scelta">Effettua la Modifica</button>
	  </td><td>
      <a class="btn lg btn-primary" 
		href="/Home/homeErba">Indietro</a></br>
      </td>
	  </tr>
      </table>  
      </form>
      </body>
      </html>
