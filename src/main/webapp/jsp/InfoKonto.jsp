<%@page import="de.hwg_lu.bwi.bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Persönliche Informationen</title>
<link rel = "stylesheet" href = "../css/InfoKonto.css">
</head>
<body>
<jsp:useBean id="lb" class="de.hwg_lu.bwi.bean.LoginBean" scope = "session"/>
<form action="./Appl.jsp" method = "get">

<div class = "wrapper">
<p>Username:
	<jsp:getProperty property="Username" name="rb"/>
	<br>
	Vorname:
	<jsp:getProperty property="Vorname" name="rb"/>
	Nachname:
	<jsp:getProperty property="Nachname" name="rb"/>
	Geburtstag:
	<jsp:getProperty property="Geburtstag" name="rb"/>
	Email:
	<jsp:getProperty property="Email" name="rb"/>
	Ernaehrungsart:
	<jsp:getProperty property="Ernaerungsart" name="rb"/>
	<br>
	<br>
	<input type="submit" name="änderung" value="Angabe ändern"/>
	</div>
</form>
</body>
</html>