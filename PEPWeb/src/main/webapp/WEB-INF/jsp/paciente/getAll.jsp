<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teste</title>
</head>
<body>
<table>
  <thead>
    <tr>
      <th>Nome</th>
      <th>CPF</th>
      <th>Genero</th>
      <th>Message</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${pacienteList}" var="paciente">
      <tr>
        <td>${paciente.nome }</td>
        <td>${paciente.cpf}</td>
        <td>${paciente.genero}</td>
        <td>${message}</td>
      </tr>          
    </c:forEach>
  </tbody>
</table>
</body>
</html>