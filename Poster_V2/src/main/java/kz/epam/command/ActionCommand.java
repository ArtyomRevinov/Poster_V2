package kz.epam.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Artyom Revinov
 */
public interface ActionCommand {
    String execute(HttpServletRequest request) throws IOException, ServletException, SQLException;
}
