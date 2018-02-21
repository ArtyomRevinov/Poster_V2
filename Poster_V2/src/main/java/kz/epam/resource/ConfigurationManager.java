package kz.epam.resource;

import java.util.ResourceBundle;

/**
 * @author Artyom Revinov
 */
public class ConfigurationManager {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
    private ConfigurationManager(){}
    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
