package models;

import entities.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashSet;

public class AddBlank implements Action {

    @Override
    public String perform(HttpServletRequest request) {
        InfoBlank infoBlank = new InfoBlank();

        User user = (User) request.getSession().getAttribute("user");
        String keywords = request.getParameter("keywords");
        String[] keywordsArr = keywords.split(", ");
        HashSet<String> keywordSet = new HashSet<>(Arrays.asList(keywordsArr));

        infoBlank.setOwner(user);
        infoBlank.setKeywords(keywordSet);
        infoBlank.setNaming(request.getParameter("naming"));
        infoBlank.setDescription(request.getParameter("description"));

        Page.getPage().addBlank(infoBlank);
        user.addForm(infoBlank);

        return "controller?do=main";
    }
}
