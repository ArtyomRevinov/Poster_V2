package kz.epam.command.impl;

import kz.epam.command.ActionCommand;
import kz.epam.constant.Constants;
import kz.epam.dao.impl.UserDao;
import kz.epam.resource.ConfigurationManager;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * @author Artyom Revinov
 */
public class RegisterCommand implements ActionCommand {
    
    private final Logger LOGGER = Logger.getLogger(RegisterCommand.class);
    
    @Override
    public String execute(HttpServletRequest request) {

        UserDao userDao = new UserDao();
        String username = request.getParameter("name");
        String email = request.getParameter("newpwd");
        String password = request.getParameter("newemail");

            try{
                userDao.add(username, email, password);
            } catch (SQLException e){
                LOGGER.error(Constants.REGISTER_ERROR, e);
            }


        return ConfigurationManager.getProperty("path.page.index");
    }
}
