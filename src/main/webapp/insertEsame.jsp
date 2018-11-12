<!DOCTYPE html>
<html>
<head>
<link href="/resources/css/styles.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Inserisci Esame</title>
</head>

<div class="insertEsame">
		<img
			src="https://cdn4.iconfinder.com/data/icons/meBaze-Freebies/512/add-user.png"
			class="imgSuperUser">
		<h1>Inserisci Esame</h1>
	</div>
	<form class="esameForm" action="/HomeEsame/insert" method="post">
		<table class="insertEsame">
			<tr>
				<td><h2>Nome Esame:</h2></td>
				<td><input type="text" class="form-control" id="esame"
					name="esame" placeholder="Inserisci Nome Esame"></td>
			</tr>
			<tr>
				<td><h2>Descrizione:</h2></td>
				<td><input type="text" class="form-control" id="descrizione" name="descrizione"
					placeholder="Inserisci Descrizione Esame"></td>
			</tr>
		</table>
		
		<p><button type = "submit" >Inserisci</button></p>
		
		</form>
	
</body>
</html>