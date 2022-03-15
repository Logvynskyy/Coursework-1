package models;

import entities.Page;
import entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class Register implements Action {
    @Override
    public String perform(HttpServletRequest request) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setPassword(password);

        Page page = Page.getPage();
        Map<String, User> users = page.getUsers();
        boolean added = false;

        if (!users.containsKey(name)) {
            users.put(name, user);
            page.setUsers(users);
            added = true;
        }

        if (added) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
        } else {
            request.setAttribute("notAdd", "Даний користувач вже існує");
        }

        return (added) ? "controller?do=main" : "register.jsp";
    }
}
