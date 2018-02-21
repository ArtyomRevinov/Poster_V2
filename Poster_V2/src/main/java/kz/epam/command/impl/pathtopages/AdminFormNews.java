package kz.epam.command.impl.pathtopages;

import kz.epam.command.ActionCommand;
import kz.epam.resource.ConfigurationManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Artyom Revinov
 */
public class AdminFormNews implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws IOException, ServletException, SQLException {
        return ConfigurationManager.getProperty("path.page.create.news");
    }
}
