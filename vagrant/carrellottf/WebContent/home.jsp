<%@page import="carrellottf.web.Utils"%>
<%@page import="carrellottf.backend.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "carr" uri = "WEB-INF/carrello.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	<jsp:useBean id="user" class="carrellottf.backend.User" scope="session"/>
	<carr:welcome utenteDaSalutare="${user}" n="5">
		<br/>messaggio <c:out value="${i}"/><hr/>
	</carr:welcome><hr/>
	<c:if test="${user.getLogin()==null}">
		<c:redirect url="login.jsp?err='utente non autenticato'"></c:redirect> 
	</c:if>
	home
	<hr />
	<div>
		Benvenuto <jsp:getProperty name="user" property="name"/> !
	</div>
	<br />
	<a href="carrello.jsp">vai al carrello</a>
	<br />
	<a href="dettagli.jsp">dettagli</a>
	<br />
	<a href="logout">logout</a>
</body>
</html>