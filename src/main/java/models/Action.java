package models;

import javax.servlet.http.HttpServletRequest;

public interface Action {
    String perform(HttpServletRequest request);
}
