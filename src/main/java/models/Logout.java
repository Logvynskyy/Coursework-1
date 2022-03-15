package models;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Logout implements Action {
    @Override
    public String perform(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "controller?do=main";
    }
}
