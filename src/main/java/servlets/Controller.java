package servlets;

import models.Action;
import models.Menu;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Menu menu = Menu.getMenu();
        Action action = menu.getAction(req);
        req.setCharacterEncoding("UTF-8");
        String page = action.perform(req);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(page);
        requestDispatcher.forward(req, resp);
    }
}
