package kz.epam.command.factory;

import kz.epam.command.ActionCommand;
import kz.epam.command.client.CommandEnum;
import kz.epam.command.impl.EmptyCommand;
import kz.epam.resource.MessageManager;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Artyom Revinov
 */
public class ActionFactory {

    public ActionCommand defineCommand(HttpServletRequest request){

        ActionCommand current = new EmptyCommand();
        String action = request.getParameter("command");

        if (action == null || action.isEmpty()){
            return current;
        }

        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());

            current = currentEnum.getCurrentCommand();
        }catch (IllegalArgumentException e){

            request.setAttribute("wrongAction", action + MessageManager.getProperty("message.wrongaction"));
        }

        return current;
    }
}
