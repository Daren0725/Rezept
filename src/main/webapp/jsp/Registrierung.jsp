<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" type="x-icon" href="../img/icon.png">
<title>Registrierung</title>
<link rel = "stylesheet" href = "../css/anmeldung.css">
</head>
<body>
<div class = "wrapper">
<form action="./LoginApp.jsp" method = "get" onsubmit =>
<h1>Registrierung !</h1>

	<div class = "input-box">
		<input type="text" name="surname" placeholder = "Vorname">
	</div>
	<div class = "input-box">
		<input type="text" name="name" placeholder = "Nachname">
	</div>
	<div class = "input-box">
		<input type="text" name="username" placeholder = "username">
	</div>
	<div class = "input-box">
		<input type="password" name="password" placeholder="Passwort">
	</div>
	<table>
	<tr>
		<td>Geburtsdatum </td>
		<td> <input type="date" name="geburtsdatum" placeholder = ""></td>
	</tr> 
	<div class ="column">
		<div class="select-box">
			<select>
				<option>Ernaehrungsart</option>
			</select>
	</div>
		
		<select>
				<option>Ernaehrungsart</option>
				<option>vegetarisch</option>
				<option>vegan</option>
				<option>allesfressend</option>
			 </select>
		</div>

	<tr> </tr>
	<tr> </tr>
	<tr> </tr>
	<tr>
		<td><input type="submit" name="canceln" value="canceln"></td>
		<td><input type="submit" name="registred" value="Konto erstellen"></td>
	</tr>
</table>
</form>
</div>
</body>
</html>