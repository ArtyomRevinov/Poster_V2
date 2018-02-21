package kz.epam.command.impl.locale;

import kz.epam.command.ActionCommand;
import kz.epam.constant.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Artyom Revinov
 */
public class Locale implements ActionCommand {

    private void setLocale(HttpServletRequest request){

        if (request.getParameter("locale")!= null){

            String locale = request.getParameter("locale");
            switch (locale){

                case Constants.LOCALE_ENG:
                    request.getSession().setAttribute(Constants.JSTL_FMT_LOCAL, Constants.LOCALE_ENG);
                    break;

                case Constants.LOCALE_RUS:
                    request.getSession().setAttribute(Constants.JSTL_FMT_LOCAL, Constants.LOCALE_RUS);
                break;

                default:
                    request.getSession().setAttribute(Constants.JSTL_FMT_LOCAL, Constants.LOCALE_RUS);
            }
        }
    }



    @Override
    public String execute(HttpServletRequest request) throws IOException, ServletException {
        setLocale(request);
        return null;
    }
}
