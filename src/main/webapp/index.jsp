<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: APRENDIZ
  Date: 25/04/2023
  Time: 2:31 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Ingreso de Usuario</title>
</head>
<meta charset="UTF-8">
<meta name="author" content="Nombre Autor">
<meta name="description" content="Esta debe ser la información que aparece en el párrafo que acompaña los resultados de una busqueda de internet">
<meta name="keywords" content="registro de usuario, formulario de registro, crear cuenta, reistro en línea">
<meta name="viewport" content="width=device-width, initial-scale=1">



<body class="text-center">
<main class="form-signin w-100 m-auto">
    <form action="" method="post">

        <%@include file="header_template.jsp"%>
        <div class="form-floating">
            <input type="text" class="form-control" id="floatingInput"
                   placeholder="Ingrese sy nombre de usuario" required autofocus
                   pattern="[A-Za-z0-9]{8, 12}">
            <label for="floatingInput">Usuario:</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword"
                   placeholder="Ingrese su contraseña" required pattern="[A-a-z0-9]{8, 12}">
            <label for="floatingPassword">Contraseña:</label>
        </div>

        <button class=" btn btn-lg btn-primary" type="submit">Ingresar</button>
        <div id="register">
            <a href="registro.jsp">Registrarse</a>
        </div>
        <%@include file="footer_template.jsp"%>

    </form>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<%!
    public String displayDate(){
        SimpleDateFormat dateFormat= new SimpleDateFormat("YYYY");
        Date date = Calendar.getInstance().getTime();
        return dateFormat.format(date);
    }
%>
</body>
</html>
