package co.edu.sena.project2687350.servlets;

import co.edu.sena.project2687350.model.beans.User;
import co.edu.sena.project2687350.model.repository.Repository;
import co.edu.sena.project2687350.model.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("registerUser")

public class UsersRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  collect all form data
        String user_firstname = request.getParameter("user_firstname");
        String user_lastname = request.getParameter("user_lastname");
        String user_email = request.getParameter("user_email");
        String user_password = request.getParameter("user_password");


        //  fill it up in a User Bean
        User user = new User();
        user.setUser_firstname(user_firstname);
        user.setUser_lastname(user_lastname);
        user.setUser_email(user_email);
        user.setUser_password(user_password);

        // call repository layer and save the user object to DB
        Repository<User> repository = new UserRepositoryImpl();
        int rows = 0;
        try {
            repository.saveObj(user);
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
