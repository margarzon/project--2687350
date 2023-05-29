package model.repository;

import model.beans.Product;

import java.sql.SQLException;

public class TestProductRepositorylmpl {
    public static void main(String[] args) throws SQLException {
        Repository<Product> repository = (Repository<Product>) new TestProductRepositorylmpl();

        System.out.println("========== saveObj Insert =========="); // insert
        Product productInsert = new Product();
        productInsert.setProductName("Harina");
        productInsert.setProductValue(113212);
        productInsert.setCategoryId(1);
        repository.saveObj(productInsert);
        productInsert.setProductName("Lentejas");
        productInsert.setProductValue(12000);
        productInsert.setCategoryId(1);
        repository.saveObj(productInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj =========="); //update
        Product productUpdate = new Product();
        productUpdate.setProductId(1);
        productUpdate.setProductName("Platano");
        productUpdate.setProductValue(125456);
        productUpdate.setCategoryId(1);
        repository.saveObj(productUpdate);
        repository.listAllObj().forEach(System.out::println);

        System.out.println("========== saveObj =========="); //delete
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    } // TestProductRepositoryImpl
}
