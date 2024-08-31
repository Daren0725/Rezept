<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" type="x-icon" href="../img/icon.png">
<title>Rezept für alle</title>
<link rel = "stylesheet" href = "../css/anmeldung.css"> 
<script type="text/javascript" src="../js/Anmeldung.js"></script>
</head>
<body>

<div class = "wrapper"> 
	<form action="../jsp/LoginApp.jsp" method = "get">
		<h1>Willkommen auf Rezept für alle</h1>
		<br>
		<h1>Login</h1>
		
		<div class = "input-box">
			<input type ="text" name="username" placeholder="username" required>
		</div>
		<div class = "input-box">
			 <input type="password" name="password" placeholder="password" required>
		</div>	
		
		
		<br>
		<br>
		<div class = remember>
			<a href=>Passwort vergessen?</a>
		</div>
		
		<input type="submit" class ="btn" name="anmeldem" value= "anmelden" >
		
		<div class= "register-link">
			<p>Noch nicht registriert ? 
		<a href = "./Registrierung.jsp"> Registrieren</a></p>
		</div>
		
		<br>
	</form>
</div>




</body>
</html>