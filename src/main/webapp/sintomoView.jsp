<%@ page import="java.util.List"%>
<%@ page import="com.pCarpet.dto.SintomoDTO"%>
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

<form action="SintomiServlet" method="post">
 <table border="2">

     <tr>
       
         <th>
             ID
         </th>

         <th>
             SINTOMO
         </th>
         <th>
             DESCRIZIONE
         </th>
         

     </tr>
        <%for (Sintomo sintomo : allSympthom) { %>
     <tr>
        
         <td>
             <%= sintomo.getIdSintomo()%>
         </td>

         <td>
             <%=  sintomo.getTipoSintomo()%>
         </td>

         <td>
             <%=  sintomo.getDescrizione()%>
         </td>
         
         <td>
             <a href="SintomiServlet?richiesta=update&id=<%=  sintomo.getIdSintomo()%>">Modifica</a>
         </td>
         <td>
             <a href="SintomiServlet?richiesta=eliminaSintomo&id=<%= sintomo.getIdSintomo()%>">Elimina</a>
         </td>

     </tr>
     <% }%>
 </table>
<input type="submit" value="indietro" name="richiesta">
</form>
 <h2></h2>
 <h2></h2>
 
 <h3></h3>

 </form>
 </body>
</html><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>DIM - Syndone</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/signin.css" rel="stylesheet">
</head>

<body class="text-center">
	<form class="form-signin">
		<h1 class="h3 mb-3 font-weight-normal">
		HOME SINTOMO
		</h1>
		<a class="btn btn-lg btn-primary btn-block"
		href="/Home/homeDirectory">Visualizza Sintomi</a><br> 
		<a class="btn btn-lg btn-primary btn-block"
		href="/Home/homeDirectory?scelta=Customers">Inserisci Sintomo</a><br> 
		<a class="btn btn-lg btn-primary btn-block" 
		href=" ">Indietro</a><br>
	</form>

</body>
</html>