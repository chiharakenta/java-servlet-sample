package com.mycompany.app.mvctwo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/mvc-demo-two")
public class MvcDemoServletTwo extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. データの取得
        List<Student> students = StudentDataUtil.getStudents();

        // 2. データをリクエストスコープに保存
        request.setAttribute("studentList", students);

        // 3. JSP ページにフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view-students-two.jsp");
        dispatcher.forward(request, response);
    }
}
