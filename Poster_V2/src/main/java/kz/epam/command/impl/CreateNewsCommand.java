package kz.epam.command.impl;

import kz.epam.command.ActionCommand;
import kz.epam.constant.Constants;
import kz.epam.dao.NewsDao;
import kz.epam.resource.ConfigurationManager;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * @author Artyom Revinov
 */@MultipartConfig(maxFileSize = 1699999999)
public class CreateNewsCommand  implements ActionCommand{

     private final Logger LOGGER = Logger.getLogger(CreateNewsCommand.class);

    NewsDao newsDao = new NewsDao();

    @Override
    public String execute(HttpServletRequest request) throws IOException, ServletException {
        String title = request.getParameter("newstitle");
        String content = request.getParameter("content");
        Part filepart = request.getPart("picture");

        InputStream inputStream = null;

        if (filepart != null){
            inputStream = filepart.getInputStream();
        }


            try {

                newsDao.add(title,content,inputStream);


            } catch (SQLException e) {
                LOGGER.error(Constants.NEWS_CREATION_ERROR, e);

            }




        return ConfigurationManager.getProperty("path.page.create.news");
    }
}