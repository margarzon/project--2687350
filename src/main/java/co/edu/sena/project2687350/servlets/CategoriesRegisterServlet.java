package co.edu.sena.project2687350.servlets;

import co.edu.sena.project2687350.model.beans.Category;
import co.edu.sena.project2687350.model.repository.CategoryRepositoryImpl;
import co.edu.sena.project2687350.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("registerCategory")
public class CategoriesRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  collect all form data
        String category_name = request.getParameter("category_name");



        //  fill it up in a User Bean
        Category category = new Category();
        category.setCategory_name(category_name);

        // call repository layer and save the user object to DB
        Repository<Category> repository = new CategoryRepositoryImpl();
        int rows = 0;
        try {
            repository.saveObj(category);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        if(rows==0){
            System.out.println("Ocurrio un error");
        }else{
            System.out.println("Registro exitoso");
        }

    }
    }

