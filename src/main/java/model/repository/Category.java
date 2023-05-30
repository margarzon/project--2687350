package model.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Category{
    List<Category> listAllObj() throws SQLException;

    Product byIdObj(Integer id) throws SQLException;

    Integer saveObj(Category category) throws SQLException;

    void deleteObj(Integer id) throws SQLException;

    Category createObj(ResultSet rs) throws SQLException;
}
