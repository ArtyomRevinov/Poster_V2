package kz.epam.command.impl;

import kz.epam.command.ActionCommand;
import kz.epam.constant.Constants;
import kz.epam.dao.PosterDao;
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
 */
@MultipartConfig(maxFileSize = 1699999999)
public class CreatePosterCommand implements ActionCommand {

    private final Logger LOGGER = Logger.getLogger(CreateNewsCommand.class);

    PosterDao posterDao = new PosterDao();

    @Override
    public String execute(HttpServletRequest request) throws IOException, ServletException {

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String release = request.getParameter("release");
        String producer = request.getParameter("producer");
        String honorar = request.getParameter("honorar");
        Part filepart = request.getPart("picture");
        String trailer = request.getParameter("trailer");

        InputStream inputStream = null;

        if (filepart != null){
            inputStream = filepart.getInputStream();
        }

        boolean submitButtonPressed = request.getParameter("add") != null;
        if (submitButtonPressed) {


            try {



                posterDao.add(title,description,release,producer, honorar, inputStream, trailer);


            } catch (SQLException e) {
                LOGGER.error(Constants.POSTER_CREATION_ERROR, e);
            }
        }



        return ConfigurationManager.getProperty("path.page.create.poster");
    }
}

