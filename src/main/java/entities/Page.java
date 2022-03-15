package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Page {

    private static Page page = new Page();
    private Page() {}

    public static Page getPage() {
        if (page ==null) {
            page = new Page();
        }
        return page;
    }

    private Map<String, User> users = new HashMap<>();
    private ArrayList<InfoBlank> infoBlanks = new ArrayList<>();

    public void addBlank(InfoBlank infoBlank) {
        infoBlanks.add(infoBlank);
    }

    public void removeBlank(InfoBlank infoBlank) {
        infoBlanks.remove(infoBlank);
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public ArrayList<InfoBlank> getInfoBlanks() {
        return infoBlanks;
    }

    public void setInfoBlanks(ArrayList<InfoBlank> infoBlanks) {
        this.infoBlanks = infoBlanks;
    }
}
