<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro Usuario</title>
</head>
<body>
<h1><%= "Formulario Registro Usuario" %>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
</h1>

<div class="container">
    <header></header>
    <nav></nav>
    <section>
        <form class="row ">



            <div class="col-6">
                <label for="firstName" class="form-label"><%="Primer Nombre"%></label>
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Escribe tu primer nombre"
                       required autofocus
                       pattern=[A-Za-z]{2,40}>
            </div>
            <br>

            <div class="col-6">
                <label for="secondName" class="form-label"><%="Segundo Nombre"%></label>
                <input type="text" class="form-control" id="secondName" name="secondName" placeholder="Escribe tu segundo nombre"
                       required autofocus
                       pattern=[A-Za-z]{2,40}>
            </div>
            <br>

            <div class="col-6">
                <label for="firstLastName" class="form-label"><%="Primer Apellido"%></label>
                <input type="text" class="form-control" id="firstLastName" placeholder="Escribe tu primer apellido"
                required pattern=[A-Za-z]{2,40}>
            </div>
            <br>

            <div class="col-6">
                <label for="sLastName" class="form-label"><%="Segundo Apellido"%></label>
                <input type="text" class="form-control" id="sLastName" placeholder="Escribe tu segundo apellido"
                required pattern=[A-Za-z]{2,40}>
            </div>
            <br>

            <div class="col-12">
                <label for="emailInput" class="form-label"><%="Correo Electronico"%></label>
                <input type="email" class="form-control" id="emailInput" placeholder="Escribe tu correo electronico"
                required pattern="{,60}">

            </div>
            <br>

            <div class="col-12">
                <label for="passwordInput" class="form-label"><%="Contraseña"%></label>
                <input type="password" class="form-control" id="passwordInput" placeholder="Escribe tu contraseña"
                required pattern="">
            </div>
            <br>

            <div class="col-6">
                <button type="submit" class="btn btn-primary"><%="Ingresar"%></button>
            </div>
            <br>
            <div class="col-6">
                <button type="submit" class="btn btn-secondary"><%="Enviar"%></button>
            </div>
            <br>

        </form>
    </section>
</div>

</body>
</html>
