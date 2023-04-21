<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Formulario Registro Usuario" %>
</h1>

<div class="container">
    <header></header>
    <nav></nav>
    <section>
        <form class="row ">



            <div class="col-12">
                <label for="nameInput" class="form-label"><%="Nombre"%></label>
                <input type="text" class="form-control" id="nameInput" name="name" placeholder="Escribe tu nombre"
                       required autofocus
                       pattern=[A-Za-z]{2,40}>
            </div>

            <div class="col-6">
                <label for="firstLastName" class="form-label"><%="Primer Apellido"%></label>
                <input type="text" class="form-control" id="firstLastName" placeholder="Escribe tu primer apellido"
                required pattern=[A-Za-z]{2,40}>
            </div>

            <div class="col-6">
                <label for="sLastName" class="form-label"><%="Segundo Apellido"%></label>
                <input type="text" class="form-control" id="sLastName" placeholder="Escribe tu segundo apellido"
                required pattern=[A-Za-z]{2,40}>
            </div>

            <div class="col-12">
                <label for="emailInput" class="form-label"><%="Correo Electronico"%></label>
                <input type="email" class="form-control" id="emailInput" placeholder="Escribe tu correo electronico"
                required pattern="{,60}">

            </div>

            <div class="col-12">
                <label for="passwordInput" class="form-label"><%="Contraseña"%></label>
                <input type="password" class="form-control" id="passwordInput" placeholder="Escribe tu contraseña"
                required pattern="">
            </div>

            <div class="col-6">
                <button type="submit" class="btn btn-primary"><%="Ingresar"%></button>
            </div>
            <div class="col-6">
                <button type="submit" class="btn btn-secondary"><%="Enviar"%></button>
            </div>

        </form>
    </section>
</div>

</body>
</html>
