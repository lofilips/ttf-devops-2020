<%@page import="carrellottf.web.Utils"%>
<%@page import="carrellottf.backend.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	DETTAGLI<hr/>
		<jsp:useBean id="user" class="carrellottf.backend.User" scope="session"/>
		<%
		if (user.getLogin()==null){
			response.sendRedirect("login.jsp?err='utente non autenticato'");
			return;
		}
	%>
	
	<div>dettagli dell'utente <jsp:getProperty name="user" property="name"></jsp:getProperty></div><br/>
	<a href="home.jsp">home</a><br/>
	<a href="logout">logout</a>
</body>
</html>