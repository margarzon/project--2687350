
<%@ page import="java.awt.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8"></meta>

    <meta name="description" content="Pagina basada en el registro de un usuario.">
    </meta>
    <!--keywords-->
    <meta name="keywords" content="Registro de usuario, Crear cuenta, Registro exitoso, Error de registro">
    </meta>
    <!--minium responsive viewport-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    </meta>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </meta>
</head>
<!--TITLE-->
<title>Registro de Usuario </title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
          crossorigin="anonymous">

    </link>
<body class="text-center">
    <div class="container">
    <!--login form-->
         <main class="form-signin w-100 m-auto">
            <form action="registerUser" method="post">
                <%@include file="header_template.jsp"%>
                <h1 class="h5 mb-3 fw-normal">Registro</h1>
                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingName" name="user_firstname" placeholder="ingrese su Nombre" required_autofocus_pattern="[A-Za-z ]{3,50}">
                        </input>
                    <label for="floatingName">Nombre:</label>
                    </div>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingApellido" name="user_lastname" placeholder="ingrese su Apellido" required_pattern="[[A-Za-z ]{3,50}">
                    </input>
                    <label for="floatingApellido">Apellido:</label>
                </div>
                <div class="form-floating">
                    <input type="email" class="form-control" id="floatingEmail" name="user_email" placeholder="ingrese su Correo" required_pattern="{60}">
                    </input>
                    <label for="floatingEmail">Correo Electronico:</label>
                </div>
                <div class="form-floating">
                    <input type="password" class="form-control" id="floatingPassword" name="user_password" placeholder="ingrese su Contraseña" required_pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$">
                    </input>
                    <label for="floatingPassword">Contraseña:</label>
                </div>
                <button class="w-100 btn btn-lg btn-primary" type="submit">Registrar</button>
                    <div id="register">
                        <div id="registerC">
                            <a href="registrar_categoria.jsp">Registrar Categoria</a>
                        </div>
                        <div id="registerP">
                            <a href="registrar_producto.jsp">Registrar Producto</a>
                        </div>
                        <a href="index.jsp">Inicio</a>
                    </div>
                <%@include file="footer_template.jsp"%>
            </form>
        </main>
    </div>


<%!
public String displayDate() {
SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
Date date = Calendar.getInstance().getTime();
return dateFormat.format(date);
}
%>

</body>
</html>
