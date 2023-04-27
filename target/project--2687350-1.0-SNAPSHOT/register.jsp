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
    <title>Login</title>
</head>
<meta charset="UTF-8">
<meta name="author" content="Nombre Autor">
<meta name="description" content="Esta debe ser la información que aparece en el párrafo que acompaña los resultados de una busqueda de internet">
<meta name="keywords" content="registro de usuario, formulario de registro, crear cuenta, reistro en línea">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registro de Usuario MY APP</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https:/cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link rel="stylesheet" href="./css/signin.css">

<body class="text-center">
<main class="form-signin w-100 m-auto">
    <form action="" method="post">
        <img class="mb-4" src="img/icon.png" alt="MY APP" width="100">
        <h4 class="text-secondary">MY -APP</h4>
        <h1 class="h5 mb-3 fw-normal">Ingreso</h1>

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
            <a href="index.jsp">Registrarse</a>
        </div>
        <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados MY APP © <%=displayDate()%>
        </p>

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
