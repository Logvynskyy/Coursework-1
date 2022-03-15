package models;

import entities.InfoBlank;
import entities.Page;

import javax.servlet.http.HttpServletRequest;

public class DeleteBlank implements Action {

    @Override
    public String perform(HttpServletRequest request) {
        GetCommands getCommand = new GetCommands();
        InfoBlank infoBlank = getCommand.getBlank(request.getParameter("blank"));
        Page.getPage().removeBlank(infoBlank);
        return "controller?do=main";
    }
}
