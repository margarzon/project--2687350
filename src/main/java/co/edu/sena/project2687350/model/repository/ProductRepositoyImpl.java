package co.edu.sena.project2687350.model.repository;


import co.edu.sena.project2687350.model.beans.Product;
import co.edu.sena.project2687350.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoyImpl implements Repository<Product>{
private String sql=null;
    @Override
    public List<Product> listAllObj() throws SQLException {
        sql = "select p.Id_product, p.Product_name, p.Product_value, p.category_id" + " from products p  order by p.Id_product, p.Product_name, p.Product_value, p.category_id ";
        List<Product> products = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product p = createObj(rs);
                products.add(p);
            }
        }
        return products;
    }

    @Override
    public Product byIdOBj(Integer id) throws SQLException {
        sql = "select p.Id_product, p.Product_name, p.Product_value, p.category_id " + "from products p where p.Id_product=? ";
        Product product = null;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            try(ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    product = createObj(rs);
                }
            }
        }
        return product;
    }

    @Override
    public Integer saveObj(Product product) throws SQLException {
        int rowsAffected = 0;
        if(product.getId_product() != null && product.getId_product() > 0) {
            sql = "update products set  Product_name,  Product_value, category_id " + " where  Id_product =?";
        }
        else{
            sql= "insert into products (Id_produc,Product_name,Product_value, category_id)";
        }
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, product.getProduct_name());
            ps.setInt(1, product.getProduct_value());
            ps.setInt(1, product.getCategory_id());
            if(product.getId_product() != null &&product.getId_product() > 0){
                ps.setInt(2, product.getId_product());
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql= "delete from products where Id_product=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.execute();
        }
    }
    @Override
    public Product createObj(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setId_product(rs.getInt("Id_product"));
        product.setProduct_name(rs.getString("Product_name"));
        return product;
    }
}
