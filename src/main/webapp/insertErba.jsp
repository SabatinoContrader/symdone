<!DOCTYPE html>
<html>
<head>
<link href="/resources/css/styles.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Inserisci Erba</title>
</head>

<div class="insertErba">
		<img
			src="https://cdn4.iconfinder.com/data/icons/meBaze-Freebies/512/add-user.png"
			class="imgSuperUser">
		<h1>Inserisci Erba</h1>
	</div>
	<form class="erbaForm" action="/HomeErbaC/insertErba" method="post">
		<table class="insertErba">
			<tr>
				<td><h2>Nome Erba:</h2></td>
				<td><input type="text" class="form-control" id="erba"
					name="erba" placeholder="Inserisci Nome Erba"></td>
			</tr>
			<tr>
				<td><h2>Descrizione:</h2></td>
				<td><input type="text" class="form-control" id="descrizione" name="descrizione"
					placeholder="Inserisci Descrizione Erba"></td>
			</tr>
		</table>
		
		<p><button type = "submit" >Inserisci</button></p>
		
		<a class="btn lg btn-primary"
		href="/Home/homeErba">Indietro</a></br>
		
		</form>
	
</body>
</html>