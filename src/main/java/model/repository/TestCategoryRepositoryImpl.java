package model.repository;

import model.beans.Category;

import java.sql.SQLException;

public class TestCategoryRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        CategoryRepositoryImpl repository = new CategoryRepositoryImpl();


        System.out.println("========== saveObj Insert ==========");
        Category categoryInsert = new Category();
        categoryInsert.setCategory_name("Jabones");
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name("Carnes");
        repository.saveObj(categoryInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        Category categoryUpdate = new Category();
        categoryUpdate.setCategory_id(2);
        categoryUpdate.setCategory_name("Pan");
        repository.saveObj(categoryUpdate);
        repository.listAllObj().forEach(System.out::println);

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
