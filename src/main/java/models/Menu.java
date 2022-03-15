package models;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class Menu {

    private static Menu menu = new Menu();

    private Menu() {}

    public static Menu getMenu() {
        if (menu ==null) {
            menu = new Menu();
        }
        return menu;
    }

    private final Map<String, Action> actions = new HashMap<>();
    {
        actions.put("register", new Register());
        actions.put("login", new Login());
        actions.put("logout", new Logout());
        actions.put("main", new MainPage());
        actions.put("create", new AddBlank());
        actions.put("edit", new EditBlank());
        actions.put("search", new Search());
        actions.put("delete", new DeleteBlank());
        actions.put("blank", new GetBlank());
        actions.put("editBlank", new EditTransition());
    }

    public Action getAction(HttpServletRequest request) {
        String action = request.getParameter("do");
        return actions.get(action);
    }
}
