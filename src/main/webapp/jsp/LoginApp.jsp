<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String anmelden = request.getParameter("anmelden");
String registred = request.getParameter("registred");
String canceln = request.getParameter("canceln");

if (anmelden == null)anmelden ="";
if (registred == null)registred="";
if (canceln == null)canceln ="";

if (anmelden.equals("anmelden")){
	System.out.println("Angemeldet" + "<br>");
	response.sendRedirect("");
}else if(registred.equals("registred")){
	response.sendRedirect("./AnmeldungView");
	
}else if (canceln.equals("canceln")){
	response.sendRedirect("./AnmeldungView.jsp");
	
}else{
	response.sendRedirect("./AnmeldungView.jsp");
}
%>

</body>
</html>