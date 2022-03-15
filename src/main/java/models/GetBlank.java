package models;

import entities.InfoBlank;

import javax.servlet.http.HttpServletRequest;

public class GetBlank implements Action {

    @Override
    public String perform(HttpServletRequest request) {
        GetCommands getCommand = new GetCommands();
        InfoBlank infoBlank = getCommand.getBlank(request.getParameter("naming"));
        request.setAttribute("blank", infoBlank);
        return "infoblank.jsp";
    }
}
