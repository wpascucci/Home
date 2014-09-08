<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Pacientes</title>
</head>
<body>
	<form method="post" action="<c:url value='/AddPaciente'/>">
		Nome: <input type="text" name="paciente.nome"/>
		CPF: <input type="text" name="paciente.cpf"/>
		Genero: <input type="text" name="paciente.genero"/>
		Codigo do Registro: <input type="text" name="paciente.codigoRegistro"/>
		Tipo Sanguineo: <input type="text" name="paciente.tipoSanguineo"/>
		<input type="submit" value="Save"/>
	</form>
</body>
</html>