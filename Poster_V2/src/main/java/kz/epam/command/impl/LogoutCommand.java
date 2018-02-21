package kz.epam.command.impl;

import kz.epam.command.ActionCommand;
import kz.epam.resource.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Artyom Revinov
 */
public class LogoutCommand implements ActionCommand{


    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.index");
        request.getSession().invalidate();
        return page;
    }
}

