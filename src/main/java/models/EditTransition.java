package models;

import entities.InfoBlank;

import javax.servlet.http.HttpServletRequest;

public class EditTransition implements Action {

    @Override
    public String perform(HttpServletRequest request) {
        GetCommands getCommand = new GetCommands();
        InfoBlank infoBlank = getCommand.getBlank(request.getParameter("blank"));
        request.setAttribute("blank", infoBlank);
        return "editblank.jsp";
    }
}
