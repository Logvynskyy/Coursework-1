package entities;

import java.util.HashSet;

public class InfoBlank {
    private User owner;
    private String naming;
    private String description;
    private HashSet<String> keywords = new HashSet<>();

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(HashSet<String> keywords) {
        this.keywords = keywords;
    }
}
