package kz.epam.command.impl;

import kz.epam.command.ActionCommand;
import kz.epam.constant.Constants;
import kz.epam.dao.PosterDao;
import kz.epam.entity.Poster;
import kz.epam.resource.ConfigurationManager;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artyom Revinov
 */
public class PosterCommand implements ActionCommand {

   private final Logger LOGGER = Logger.getLogger(PosterCommand.class);

    @Override
    public String execute(HttpServletRequest request) {

        List<Poster> posterList = new ArrayList<>();

        PosterDao posterDao = new PosterDao();
        try {
            posterList = posterDao.getAll();
        } catch (SQLException e) {
            LOGGER.error(Constants.GET_ALL_POSTERS_ERROR, e);
        }
        request.setAttribute("posterList", posterList);

      String pathToPage = ConfigurationManager.getProperty("path.page.poster");
        return pathToPage;
    }

}
