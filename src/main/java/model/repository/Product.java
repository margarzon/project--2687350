package model.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface    Product{
    List<Product> listAllObj() throws SQLException;

    Product byIdObj(Integer id) throws SQLException;

    Integer saveObj(Product product) throws SQLException;

    void deleteObj(Integer id) throws SQLException;

    Product createObj(ResultSet rs) throws SQLException;
}
