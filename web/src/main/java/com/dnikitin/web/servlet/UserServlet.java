package com.dnikitin.web.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.util.function.Supplier;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp) {
        Supplier<String> users = () -> "Dmitry";
    }

}
