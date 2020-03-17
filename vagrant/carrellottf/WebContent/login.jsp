<%@page import="carrellottf.backend.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix = "carr" uri = "WEB-INF/carrello.tld" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body xmlns:jsp="http://java.sun.com/JSP/Page">
il mio tag: <carr:hello/>
<div> LOGIN : </div>
	<form action="login" method="post">
		login:<input name="login" type="text"/><br/>
		password:<input name="pass" type="password"/><br/>
		<%
		request.setAttribute("messaggio", "da richiesta");	
		session.setAttribute("messaggio", "ciao");
		%>
		<c:out value="${messaggio}"></c:out>
		
		<c:if test="${param.err!=null}">	
			<c:out value="${param.err}"/>
		</c:if>
		<input type="submit" value="login"/>
	</form>
</body>
</html>