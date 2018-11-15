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

<script>
function exportTableToExcel(tableID, filename = ''){
	var downloadLink;
	var dataType = 'application/vnd.ms-excel';
	var tableSelect = document.getElementById(tableID);
	var tableHTML = tableSelect.outerHTML.replace(/ /g, '%20');
	
	filename = filename?filename+'.xls':'excel_data.xls';
	
	downloadLink = document.createElement("a");
	
	
	document.body.appendChild(downloadLink);
	
	if(navigator.msSaveOrOpenBlob){
		var blob = new Blob(['\ufeff', tableHTML], {type: dataType 
			});
		navigator.msSaveOrOpenBlob(blob, filename);
	}else{
		downloadLink.href = 'data:' + dataType + ',' + tableHTML;
		downloadLink.download = filename;
		
		downloadLink.click();
	}
}

</script>

	<h1 class="element-margin-left">Ecco tutte le Patologie</h1>	

    <table id="first" class="bordo rcorners" >	
    
	     <tr>

         <th><h4>PATOLOGIE</h4></th><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>

<<<<<<< Updated upstream
=======
       

>>>>>>> Stashed changes
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

<br>
<button onClick="exportTableToExcel('first')" class="btn lg btn-primary">Download Excel</button>
<br>

<h3>---------------------------------------------------------------------------------------- </h3>
        
        <table id="first2" class="bordo rcorners" >
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
<button onClick="exportTableToExcel('first2')" class="btn lg btn-primary">Download Excel</button>
<br>
<br>

<h3>---------------------------------------------------------------------------------------- </h3>
        
 <table id="first3"class="bordo rcorners" >

  <tr>
         <th><h4>ERBE</h4></th><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
         <tr>
	     <tr>
        
         <th>
             ID ERBA		
         </th>

         <th>
             NOME ERBA
         </th>
         
         <th>
             DESCRIZIONE ERBA
         </th>
         
         <th>
          </th>
         <th>
          </th>

        </tr>
        
        <tr>
        
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
	
		<td>
          
     </tr>
     </c:forEach>	
	
    
    </table>
        <br>
<button onClick="exportTableToExcel('first3')" class="btn lg btn-primary">Download Excel</button>
<br> 
        
     <h3>---------------------------------------------------------------------------------------- </h3>

 <table id="first4" class="bordo rcorners" >

  <tr>
         <th><h4>ESAME</h4></th><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="userimg"></td></tr>
         <tr>
	     <tr>
        
         <th>
             ID ESAME		
         </th>

         <th>
             NOME ESAME
         </th>
         
         <th>
             DESCRIZIONE ESAME
         </th>
         
         <th>
          </th>
         <th>
          </th>

        </tr>
        
        <tr>
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
          
     </tr>
     </c:forEach>	
	
    
    </table>

<br>
<button onClick="exportTableToExcel('first4')" class="btn lg btn-primary">Download Excel</button>
<br>
<h3>---------------------------------------------------------------------------------------- </h3>
<br>
<a class="btn lg btn-primary"
		href="/HomeSearchSintomo/returnControl">Indietro</a><br> 
</body>
</html>