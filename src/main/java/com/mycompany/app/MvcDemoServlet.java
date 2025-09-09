package com.mycompany.app;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mvc-demo")
public class MvcDemoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String[] students = { "Alice", "Bob", "Charlie" };
        request.setAttribute("studentList", students);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/view-students.jsp");
        dispatcher.forward(request, response);
    }
}
