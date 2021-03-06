package kz.epam.connector;

import java.sql.Connection;
import java.sql.DriverManager;

import kz.epam.constant.Constants;
import org.apache.log4j.Logger;


/**
 * @author Artyom Revinov
 */
public class DataBaseConnector {

    private final Logger LOGGER = Logger.getLogger(DataBaseConnector.class);

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/movies_db?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }catch (Exception e) {

            LOGGER.error(Constants.DB_CONNECTION_ERROR, e);

        }
        return connection;
    }
}
