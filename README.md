# project--2687350
 Java Web

Dependencias Maven requeridas y operativas.

![image](https://github.com/margarzon/project--2687350/assets/125483628/03bdbf4d-78e7-459d-b42e-abf763204db5)

Paquetes y sub-paquetes requeridos (MVC)

![image](https://github.com/margarzon/project--2687350/assets/125483628/8c1ba76c-6892-40f1-9185-36cf34f3e01e)

![image](https://github.com/margarzon/project--2687350/assets/125483628/5c14ee4b-cf3e-47ac-9abb-934e8e8d83f5)

ConnectionPool funcional.

![image](https://github.com/margarzon/project--2687350/assets/125483628/70d162cd-a98a-4372-9c1e-d3058955b3f8)

Interfaz Repository.java

![image](https://github.com/margarzon/project--2687350/assets/125483628/9923b036-8e7b-4759-8e54-5494acc23ab3)

Clase que implementa la interfaz Respository.

![image](https://github.com/margarzon/project--2687350/assets/125483628/feced0dc-718d-44c0-8c15-44c132f16f2a)

Vista (webapp) corregida y funcional (login y registro). Subcarpetas requeridas.

![image](https://github.com/margarzon/project--2687350/assets/125483628/4a5a0e40-baf3-41b2-a8d3-6dc82441a794)

![image](https://github.com/margarzon/project--2687350/assets/125483628/c7ed9c96-30fe-4438-9fd6-43ba0743e951)

Script de creación de la base de datos y la tabla usuarios.

create database myapp;
use myapp;
 
create table users_tbl(
user_id int primary key auto_increment,
user_firstname varchar(40) not null,
user_lastname varchar (40) not null,
user_email varchar (60) not null,
user_password varbinary(255)
);

insert into myapp.users_tbl(user_firstname,user_lastname,user_email,user_password) values (upper('Maria del Mar'),upper('Garzon Fonseca'),lower ('mardgarzon1111111@soy.sena.edu.co'), aes_encrypt('Mar.1603_sena', '$2a$12$ns5FfQFRrcta46nUxFWQAeXOaEVsZBFrvj/KXUlH5YxdJxufWu6NK'));

select*,
cast(aes_decrypt(user_password,'$2a$12$ns5FfQFRrcta46nUxFWQAeXOaEVsZBFrvj/KXUlH5YxdJxufWu6NK') as char(50)) end_data from users_tbl where user_id=1;

select*from users_tbl;

drop database myapp
