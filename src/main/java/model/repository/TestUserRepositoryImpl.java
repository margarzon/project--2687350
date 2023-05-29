package model.repository;

import model.beans.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        UserRepositorylmpl repository = new UserRepositorylmpl();
        System.out.println("========== saveObj Insert ==========");
        User userInsert = new User();
        userInsert.setUser_firstname("lalo");
        userInsert.setUser_lastname("pilo");
        userInsert.setUser_email("lalopilo@gmail.com");
        userInsert.setUser_password("adadsd12345");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("lulu");
        userInsert.setUser_lastname("milo");
        userInsert.setUser_email("lulu@gmail.com");
        userInsert.setUser_password("455245fr4f4r");
        repository.saveObj(userInsert);

        System.out.println("========== listAllOb =========");
        repository.listAllOb().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("mDXVu");
        userUpdate.setUser_lastname("iki");
        userUpdate.setUser_email("mujuiki@gmail.com");
        userUpdate.setUser_password("5646sf7s6v4e");
        repository.saveObj(userInsert);
        repository.listAllOb().forEach(System.out::println);
    }
}
