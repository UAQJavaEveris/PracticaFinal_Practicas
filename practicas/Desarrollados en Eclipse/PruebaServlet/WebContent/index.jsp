<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Envio de datos a travez de JSP</h1>
	
	<form action="PaseDeInformacion">
            Nombre1: <input type="text" name="nombre1">
            Pais1: <input type="text" name="pais1"><br>
            
            Nombre2: <input type="text" name="nombre2">
            Pais2: <input type="text" name="pais2"><br>
            
            Nombre3: <input type="text" name="nombre3">
            Pais3: <input type="text" name="pais3"><br><br>
            
            <input type="submit" value="Enviar Datos">
        </form>
</body>
</html>