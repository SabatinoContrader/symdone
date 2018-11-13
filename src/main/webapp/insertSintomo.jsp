<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html lang="en">
    <head>
     <meta charset="utf-8">
     <meta name="viewport"
	   content="width=device-width, initial-scale=1, shrink-to-fit=no">
       <meta name="description" content="">
       <meta name="author" content="">

     
      <title>Insert Sympthom here</title>
      
      <!-- Bootstrap core CSS -->
      <link href="/css/bootstrap.min.css" rel="stylesheet">

      <!-- Custom styles for this template -->
      <link href="/css/signin.css" rel="stylesheet">
      
      <link href="/css/background.css" rel="stylesheet">
   </head>

<body>

     <form action="/HomeSintomo/ricercaSintomo" method="Get">
		<table class="insertTable">

			<tr>
				<td><h2>Nome Sintomo:</h2></td>
				<td><input type="text"  id="nome"
					name="nome" placeholder="Inserisci Nome Sintomo"></td>
			</tr>

		</table>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Crea</button>
		<a class="btn btn-lg btn-primary btn-block" 
		href="/HomeSintomo/returnHomeSintomo">Indietro</a><br>
	</form>
	
</body>
</html>