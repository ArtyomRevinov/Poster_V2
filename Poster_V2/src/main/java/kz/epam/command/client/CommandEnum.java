package kz.epam.command.client;

import kz.epam.command.ActionCommand;
import kz.epam.command.impl.*;
import kz.epam.command.impl.locale.Locale;
import kz.epam.command.impl.pathtopages.*;

/**
 * @author Artyom Revinov
 */
public enum CommandEnum {
    LOGIN{
        {
            this.command = new Login();
        }
    },
    LOGOUT{
        {
            this.command = new LogoutCommand();
        }
    },
    DETAIL{
        {
            this.command = new DetailCommand();
        }
    },
    
    NEWS{
        {
            this.command = new NewsCommand();
        }
    },
    NEWS_DETAIL{
        {
            this.command = new DetailNewsCommand();
        }
    },
    REGISTER{
        {
            this.command = new RegisterCommand();
        }
    },
   
    CREATEPOSTER{
        {
            this.command = new CreatePosterCommand();
        }
    },
    CREATENEWS{
        {
            this.command = new CreateNewsCommand();
        }
    },
    ADMINCREATEPOSTER{
        {
            this.command = new AdminForm();
        }
    },
    ADMINCREATENEWS{
        {
            this.command = new AdminFormNews();
        }
    },
    LOCALE {
        {
            this.command = new Locale();
        }
    },
    NEWSCOLUMN {
        {
            this.command = new NewsColumnCommand();
        }
    },
    POSTER{
        {
            this.command = new PosterCommand();
        }
    };
    ActionCommand command;
    public ActionCommand getCurrentCommand(){
        return command;
    }
}
