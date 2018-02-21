package kz.epam.command.impl.pathtopages;

import kz.epam.command.ActionCommand;
import kz.epam.dao.impl.NewsDao;
import kz.epam.entity.News;
import kz.epam.resource.ConfigurationManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artyom Revinov
 */
public class NewsColumnCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws IOException, ServletException, SQLException{
        List<News> newsList = new ArrayList<>();

        NewsDao newsDao = new NewsDao();
        try {
            newsList = newsDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        request.setAttribute("newsList", newsList);


        return ConfigurationManager.getProperty("path.page.index");

    }
}
