package kz.epam.command.impl;

import kz.epam.command.ActionCommand;
import kz.epam.dao.NewsDao;
import kz.epam.entity.News;
import kz.epam.resource.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * @author Artyom Revinov
 */
public class DetailNewsCommand implements ActionCommand {


    public String execute(HttpServletRequest request)  {

        News news = new News();

        NewsDao newsDao = new NewsDao();

        int id = Integer.valueOf(request.getParameter("id"));

        try {
            news = newsDao.getById(id);
        } catch (SQLException e){
            e.printStackTrace();
        }

        request.setAttribute("detailNews", news);

        return ConfigurationManager.getProperty("path.page.display_news");
    }


}

