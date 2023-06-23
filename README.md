# project--2687350
 Java Web

- Dependencias Maven requeridas y operativas.

![image](https://github.com/margarzon/project--2687350/assets/125483628/03bdbf4d-78e7-459d-b42e-abf763204db5)

- Paquetes y sub-paquetes requeridos (MVC)

![image](https://github.com/margarzon/project--2687350/assets/125483628/8c1ba76c-6892-40f1-9185-36cf34f3e01e)

![image](https://github.com/margarzon/project--2687350/assets/125483628/5c14ee4b-cf3e-47ac-9abb-934e8e8d83f5)

- ConnectionPool funcional.

![image](https://github.com/margarzon/project--2687350/assets/125483628/70d162cd-a98a-4372-9c1e-d3058955b3f8)

- Interfaz Repository.java

![image](https://github.com/margarzon/project--2687350/assets/125483628/9923b036-8e7b-4759-8e54-5494acc23ab3)

- Clase que implementa la interfaz Respository.

![image](https://github.com/margarzon/project--2687350/assets/125483628/feced0dc-718d-44c0-8c15-44c132f16f2a)

- Vista (webapp) corregida y funcional (login y registro). Subcarpetas requeridas.

VISTA INGRESO DE USUARIO

![image](https://github.com/margarzon/project--2687350/assets/125483628/95298811-c4f0-410f-b2f1-240bbab7faa4)

VISTA REGISTRO DE USUARIO

![image](https://github.com/margarzon/project--2687350/assets/125483628/01f87aea-4371-45c7-b2f2-144e9af3e22e)

VISTA REGISTRO DE CATEGORIA

![image](https://github.com/margarzon/project--2687350/assets/125483628/6d108dc8-b894-4cdd-a9f3-12edea81962e)

VISTA REGISTRO DE PRODUCTO

![image](https://github.com/margarzon/project--2687350/assets/125483628/a58df1df-0f06-4fbb-88c1-45c028ef5ad6)


- Script de creación de la base de datos y la tabla usuarios.

-- drop database myapp;
create database myapp;
use myapp;

create table users (
user_id int primary key auto_increment,
user_firstname varchar (40) not null,
user_lastname varchar (40) not null,
user_email varchar (60) not null,
user_password varbinary(255)
);

INSERT INTO users (user_firstname, user_lastname, user_email, user_password)VALUES (UPPER('Maria del Mar'), UPPER('Garzon Fonseca'), 'mrdlmrgarzon@gmail.com',AES_ENCRYPT('Mar.1603_sena','$2a$12$8BS0hbowXe5RMzOlBi/bZuc/LZjEmOWHSn2HKdgatVxmUAIUyOFlW'));

SELECT *, CAST(AES_DECRYPT(user_password,'$2a$12$8BS0hbowXe5RMzOlBi/bZuc/LZjEmOWHSn2HKdgatVxmUAIUyOFlW') AS CHAR(50))end_data FROM users WHERE user_id = 1;
select * from users;
select * from categories_tbl;
select * from products;

create table categories_tbl(
categoryId  int primary key auto_increment,
categoryName varchar (40) not null
);


create table Products(
productId int primary key auto_increment,
productName varchar (40) not null,
productValue varchar(30) not null,
categoryId  int,
foreign key (categoryId) references categories_tbl (categoryId)
);

