<%@page import="carrellottf.web.Utils"%>
<%@page import="carrellottf.backend.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>aggiungi prodotto</title>
</head>
<body>
	<form action="add" method="post">
		<select name="prod">
		<jsp:scriptlet>
			request.setAttribute("prod", ProdottoRepository.getInstance().getProdotti());
		</jsp:scriptlet>
		<c:forEach var="p" items="${prod}">
			<option value='<c:out value="${p.id}"/>'><c:out value="${p.nome}"/></option>
		</c:forEach>		
		</select><br/>
		<input type="number" name="qty" value="1"></input><br/>
		<input type="submit" name="aggiungi"></input>		
	</form>
</body>
</html>