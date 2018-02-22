package kz.epam.command.impl;

import kz.epam.command.ActionCommand;
import kz.epam.dao.PosterDao;
import kz.epam.entity.Poster;
import kz.epam.resource.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * @author Artyom Revinov
 */
public class DetailCommand implements ActionCommand {

    public String execute(HttpServletRequest request)  {

        Poster poster = new Poster();

        PosterDao posterDao = new PosterDao();

        int id = Integer.valueOf(request.getParameter("id"));

        try {
           poster = posterDao.getById(id);
        } catch (SQLException e){
            e.printStackTrace();
        }

        request.setAttribute("detail", poster);

        return ConfigurationManager.getProperty("path.page.display");
    }


}
