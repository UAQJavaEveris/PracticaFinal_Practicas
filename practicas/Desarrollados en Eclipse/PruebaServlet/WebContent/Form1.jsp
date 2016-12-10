<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>FORM.JSP</p>
        
        <p>NOMBRE: <c:out value="${nombre1}"/> PAIS: <c:out value="${pais1}"/></p>
        <p>NOMBRE: <c:out value="${nombre2}"/> PAIS: <c:out value="${pais2}"/></p>
        <p>NOMBRE: <c:out value="${nombre3}"/> PAIS: <c:out value="${pais3}"/></p>
</body>
</html>