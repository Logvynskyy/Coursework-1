package models;

import entities.Page;
import entities.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class Login implements Action {
    @Override
    public String perform(HttpServletRequest request) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Page page = Page.getPage();
        Map<String, User> users = page.getUsers();
        User user = users.get(name);
        String resultPage = (user != null && user.getPassword().equals(password)) ? "controller?do=main" : "login.jsp";

        if (user == null) {
            request.setAttribute("notExists", "Користувача з таким ім'ям не існує");
        } else if (user.getPassword().equals(password)){
            request.getSession().setAttribute("user", user);
        } else {
            request.setAttribute("notExists", "Неправильний пароль");
        }

        return resultPage;
    }
}

