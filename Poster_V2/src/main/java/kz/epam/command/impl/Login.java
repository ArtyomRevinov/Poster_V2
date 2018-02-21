package kz.epam.command.impl;

import kz.epam.Connector.DataBaseConnector;
import kz.epam.command.ActionCommand;
import kz.epam.constant.Constants;
import kz.epam.dao.impl.UserDao;
import kz.epam.entity.User;
import kz.epam.resource.ConfigurationManager;
import kz.epam.resource.MessageManager;
import kz.epam.util.UserRole;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Artyom Revinov
 */
public class Login implements ActionCommand  {

   private final Logger LOGGER = Logger.getLogger(Login.class);

    DataBaseConnector dataBaseConnector = new DataBaseConnector();
    private User currentUser(HttpServletRequest request) {
        String username = request.getParameter("login");
        String password = request.getParameter("password");

        return new User(username, password);
    }

    private boolean checkLogin(User user, Connection connection) throws SQLException {

        boolean checkUser;

        UserDao userDao = new UserDao(connection);

        checkUser = userDao.find(user);

        return checkUser;

    }



    @Override
    public String execute(HttpServletRequest request) throws IOException, ServletException, SQLException {


        String page = ConfigurationManager.getProperty("path.page.login");

        Connection connection = dataBaseConnector.getConnection();

        User user = currentUser(request);


       try {
           if (checkLogin(user, connection)) {

               HttpSession session = request.getSession();

               session.setAttribute("role", UserRole.getUserRole(user.getRole()));
               session.setAttribute("username", user.getUsername());
               session.setAttribute("id", user.getId());

               page = ConfigurationManager.getProperty("path.page.index");
               request.setAttribute("user", user.getUsername());
           } else {

               request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
           }

       } catch (SQLException e){
          LOGGER.error(Constants.LOGIN_ERROR, e);
       } finally {
           if (connection != null){
               connection.close();
           }
       }
    return page;
    }
}
