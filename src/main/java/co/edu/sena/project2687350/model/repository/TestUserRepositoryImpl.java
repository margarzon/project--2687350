package co.edu.sena.project2687350.model.repository;

import co.edu.sena.project2687350.model.beans.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl{
    public static void main(String[]args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("=================saveObj Insert=======================");
        User userInsert = new User();
        userInsert.setUser_firstname("Mar");
        userInsert.setUser_lastname("Garzon");
        userInsert.setUser_email("mrdlmrgarzon@gmail.com");
        userInsert.setUser_password("mrdllkfs.123");
        repository.saveObj(userInsert);

        userInsert.setUser_firstname("Laura");
        userInsert.setUser_lastname("Andrade");
        userInsert.setUser_email("lau.andr@soy.sena.edu.co");
        userInsert.setUser_password("6546df._sdfs");
        repository.saveObj(userInsert);

        userInsert.setUser_firstname("Andres");
        userInsert.setUser_lastname("Jimenez");
        userInsert.setUser_email("amdres.jm@hotmail.es");
        userInsert.setUser_password("545dfdf");
        repository.saveObj(userInsert);

        System.out.println("=============listAllObj=============");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("=========byIdObj===========");
        System.out.println(repository.byIdOBj(1));
        System.out.println();

        System.out.println("===============saveObj==================");
        User userUpdate = new User();


        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================deleteObj============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}