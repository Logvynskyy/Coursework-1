package models;

import entities.InfoBlank;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashSet;

public class EditBlank implements Action {

    @Override
    public String perform(HttpServletRequest request) {
        GetCommands get = new GetCommands();

        String newHeader = request.getParameter("newNaming");
        String newDescription = request.getParameter("newDescription");
        String newKeywords = request.getParameter("newKeywords");
        String[] keywordsArr = newKeywords.split(", ");
        HashSet<String> newKeys = new HashSet<>(Arrays.asList(keywordsArr));

        InfoBlank infoBlank = get.getBlank(request.getParameter("blank"));

        infoBlank.setNaming(newHeader);
        infoBlank.setKeywords(newKeys);
        infoBlank.setDescription(newDescription);

        request.setAttribute("blank", infoBlank);

        return "infoblank.jsp";
    }
}
