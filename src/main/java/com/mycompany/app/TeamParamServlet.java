package com.mycompany.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/team-params")
public class TeamParamServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // web.xmlからコンテキストパラメータを取得
        ServletContext context = getServletContext();
        String maxCartSize = context.getInitParameter("max-shopping-cart-size");
        String teamName = context.getInitParameter("project-team-name");

        out.println("<html><body>");
        out.println("<h1>Team Parameters</h1>");
        out.println("<p>Max Shopping Cart Size: " + maxCartSize + "</p>");
        out.println("<p>Project Team Name: " + teamName + "</p>");
        out.println("</body></html>");
    }
}
