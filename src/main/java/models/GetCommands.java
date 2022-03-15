package models;

import entities.InfoBlank;
import entities.Page;
import entities.User;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GetCommands {

    public InfoBlank getBlank(String header) {
        ArrayList<InfoBlank> infoBlanks = Page.getPage().getInfoBlanks();
        ArrayList<String> namings = infoBlanks.stream()
                .map(InfoBlank::getNaming)
                .collect(Collectors.toCollection(ArrayList::new));
        int index = namings.indexOf(header);
        return infoBlanks.get(index);
    }

    public User getUser(String name) {
        return Page.getPage().getUsers().get(name);
    }

}
