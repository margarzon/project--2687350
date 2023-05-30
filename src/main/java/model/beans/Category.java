package model.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class Category {
    private int categoryId;
    private String categoryName;

    public Category() {
        // Constructor vacío
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public void setCategory_name(String pan) {
    }

    public void setCategory_id(int i) {
    }

    public abstract List<Category> listAllObj() throws SQLException;

    public abstract Category byIdObj(Integer id) throws SQLException;

    public abstract Integer saveObj(Category category) throws SQLException;

    public abstract void deleteObj(Integer id) throws SQLException;

    public abstract Category createObj(ResultSet rs) throws SQLException;
}