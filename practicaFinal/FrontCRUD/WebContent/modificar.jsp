<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar</title>
</head>
<body>
	<form action="Procesamiento">
			<input type="text" name="instruccion" value="MODIFICAR" readonly="readonly" style="border:none"><br>
            ID: <input type="text" name="id"><br>
            NOMBRE: <input type="text" name="nombre"><br>
            DESCRIPCION: <input type="text" name="descripcion"><br>
            
            <input type="submit" value="Modificar">
    </form>
</body>
</html>