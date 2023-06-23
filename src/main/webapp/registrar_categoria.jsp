<%@ page import="java.awt.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
    <head>

        <meta name="description" content="Pagina basada en el registro de una categoria.">
        </meta>
        <meta name="keywords" content="Registro de categoria">
        </meta>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        </meta>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </meta>
    </head>
    <title>Registro de Categoria </title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
          crossorigin="anonymous">
    </link>
<body class="text-center">

        <div class="container">
            <!--login form-->
            <main class="form-signin w-100 m-auto">
                <form action="registerCategory" method="post">
                    <%@include file="header_template.jsp"%>
                    <h1 class="h5 mb-3 fw-normal">Registro Categoria</h1>
            <div class="form-floating">
                <input type="text" class="form-control" name="category_name" id="category_name" name="category_name"
                       placeholder="ingrese nombre de categoria" />
                <label for="floatingName">Nombre Categoria:</label>
            </div>
             <button class="w-100 btn btn-lg btn-primary" type="submit">Registrar</button>
            <a href="index.jsp">Inicio</a>
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