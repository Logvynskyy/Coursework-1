package models;

import entities.InfoBlank;
import entities.Page;
import entities.User;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class MainPage implements Action {

    @Override
    public String perform(HttpServletRequest request) {
        Page page = Page.getPage();
        User user = (User) request.getSession().getAttribute("user");

        if (user != null) {
            ArrayList<InfoBlank> infoBlanks = page.getInfoBlanks();
            request.setAttribute("blanks", infoBlanks);
        }

        return "index.jsp";
    }
}
