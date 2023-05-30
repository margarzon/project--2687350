package model.repository;


import model.beans.Product;
import util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl extends Product {
    private String sql = null;

    @Override
    public List<Product> listAllObj() throws SQLException {
        sql = "SELECT p.productId, p.productName, p.productValue, p.categoryId, c.category_name " +
                "FROM Products p " +
                "LEFT JOIN categories_tbl c ON p.categoryId = c.categoryId " +
                "ORDER BY p.productId";
        List<Product> products = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product product = createObj(rs);
                products.add(product);
            }
        }
        return products;
    }

    @Override
    public Product byIdObj(Integer id) throws SQLException {
        sql = "SELECT p.productId, p.productName, p.productValue, p.categoryId, c.category_name " +
                "FROM Products p " +
                "LEFT JOIN categories_tbl c ON p.categoryId = c.categoryId " +
                "WHERE p.productId = ?";
        Product product = null;

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    product = createObj(rs);
                }
            }
        }
        return product;
    }

    @Override
    public Integer saveObj(Product product) throws SQLException {
        int rowsAffected = 0;

        if (product.getProductId() != null && product.getProductId() > 0) {
            sql = "UPDATE Products SET productName = ?, productValue = ?, categoryId = ? WHERE productId = ?";
        } else {
            sql = "INSERT INTO Products (productName, productValue, categoryId) VALUES (?, ?, ?)";
        }

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, product.getProductName());
            ps.setString(2, product.getProductValue());
            ps.setInt(3, product.getCategoryId());

            if (product.getProductId() != null && product.getProductId() > 0) {
                ps.setInt(4, product.getProductId());
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "DELETE FROM Products WHERE productId = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public Product createObj(ResultSet rs) throws SQLException {
        Product product = new Product() {
            @Override
            public List<Product> listAllObj() throws SQLException {
                return null;
            }

            @Override
            public Product byIdObj(Integer id) throws SQLException {
                return null;
            }

            @Override
            public Integer saveObj(Product product) throws SQLException {
                return null;
            }

            @Override
            public void deleteObj(Integer id) throws SQLException {

            }

            @Override
            public Product createObj(ResultSet rs) throws SQLException {
                return null;
            }
        };
        product.setProductId(rs.getInt("productId"));
        product.setProductName(rs.getString("productName"));
        product.setProductValue(Integer.parseInt(rs.getString("productValue")));
        product.setCategoryId(rs.getInt("categoryId"));
        return product;
    }
}
