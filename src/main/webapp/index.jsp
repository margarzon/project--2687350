<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Formulario Registro Usuario" %>
</h1>

<div class="container">
        <form class="row ">



            <div class="col-12">
                <label for="nameInput" class="form-label"><%="Nombre"%></label>
                <input type="text" class="form-control" id="nameInput" placeholder=<%="Escribe tu nombre"%>>
            </div>

            <div class="col-6">
                <label for="firstLastName" class="form-label"><%="Primer Apellido"%></label>
                <input type="text" class="form-control" id="firstLastName" placeholder=<%="Escribe tu primer apellido"%>>
            </div>

            <div class="col-6">
                <label for="sLastName" class="form-label"><%="Segundo Apellido"%></label>
                <input type="text" class="form-control" id="sLastName" placeholder=<%="Escribe tu segundo apellido"%>>
            </div>

            <div class="col-12">
                <label for="emailInput" class="form-label"><%="Correo Electronico"%></label>
                <input type="email" class="form-control" id="emailInput" placeholder=<%="Escribe tu correo electronico"%>>
            </div>

            <div class="col-12">
                <label for="passwordInput" class="form-label"><%="Contraseña"%></label>
                <input type="password" class="form-control" id="passwordInput" placeholder=<%="Escribe tu contraseña"%>>
            </div>

            <button type="submit" class="btn btn-primary"><%="Ingresar"%></button>

        </form>
</div>

</body>
</html>