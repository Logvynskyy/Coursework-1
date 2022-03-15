package models;

import entities.InfoBlank;
import entities.Page;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Search implements Action {

    @Override
    public String perform(HttpServletRequest request) {
        String search = request.getParameter("search");
        String[] searchKeywords = search.split(", ");

        HashSet<String> searchKeywordsSet = new HashSet<>(Arrays.asList(searchKeywords));

        Page page = Page.getPage();
        ArrayList<InfoBlank> infoBlanks = page.getInfoBlanks();

        ArrayList<InfoBlank> completeInfoBlanks = new ArrayList<>();

        for (InfoBlank infoBlank : infoBlanks) {
            Set<String> keywords = infoBlank.getKeywords();
            if (keywords.containsAll(searchKeywordsSet)) {
                completeInfoBlanks.add(infoBlank);
            }
        }

        request.setAttribute("searchBlanks", completeInfoBlanks);
        return "search.jsp";
    }
}
