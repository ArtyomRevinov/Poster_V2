package kz.epam.resource;

import java.util.ResourceBundle;

/**
 * @author Artyom Revinov
 */
public class MessageManager {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
    private MessageManager(){}
    public static String getProperty(String key){
        return resourceBundle.getString(key);
    }
}
