<%@page import="carrellottf.web.Utils"%>
<%@page import="carrellottf.backend.*"%>
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
	carrello dell'utente <jsp:getProperty name="user" property="name"></jsp:getProperty><br/>
	<c:if test="${user.getLogin()==null}">
		<c:redirect url="login.jsp?err='utente non autenticato'"></c:redirect> 
	</c:if>
	<jsp:useBean id="carrello" class="carrellottf.backend.Carrello" scope="session"/>
 	
 	<carr:carrello carrello="${carrello}" addUrl="add.jsp">
 		<carr:prodotto  removeUrl="remove"/>
 	</carr:carrello>
 	
		
	<a href="home.jsp">home</a><br/>
	<a href="logout">logout</a>
</body>
</html>