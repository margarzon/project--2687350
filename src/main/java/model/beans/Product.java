package model.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class Product {

    private int productId;
    private String productName;
    private int productValue;
    private int categoryId;

    public Product() {
        // Constructor vacío
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductValue() {
        return String.valueOf(productValue);
    }

    public void setProductValue(int productValue) {
        this.productValue = productValue;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productValue=" + productValue +
                ", categoryId=" + categoryId +
                '}';
    }

    public abstract List<Product> listAllObj() throws SQLException;

    public abstract Product byIdObj(Integer id) throws SQLException;

    public abstract Integer saveObj(Product product) throws SQLException;

    public abstract void deleteObj(Integer id) throws SQLException;

    public abstract Product createObj(ResultSet rs) throws SQLException;
}