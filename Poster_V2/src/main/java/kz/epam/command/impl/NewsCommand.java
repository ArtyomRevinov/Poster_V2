package kz.epam.command.impl;

import kz.epam.command.ActionCommand;
import kz.epam.constant.Constants;
import kz.epam.dao.NewsDao;
import kz.epam.entity.News;
import kz.epam.resource.ConfigurationManager;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artyom Revinov
 */
public class NewsCommand implements ActionCommand {

   private Logger LOGGER = Logger.getLogger(NewsCommand.class);

    @Override
    public String execute(HttpServletRequest request) {
        List<News> newsList = new ArrayList<>();

        NewsDao newsDao = new NewsDao();
        try {
            newsList = newsDao.getAll();
        } catch (SQLException e) {
            LOGGER.error(Constants.GET_ALL_NEWS_ERROR, e);
        }
        request.setAttribute("newsList", newsList);

        String pathToPage = ConfigurationManager.getProperty("path.page.news");
        return pathToPage;
    }
}
