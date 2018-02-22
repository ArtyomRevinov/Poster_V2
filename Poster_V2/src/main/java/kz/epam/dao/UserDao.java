package kz.epam.dao;

import kz.epam.connector.DataBaseConnector;
import kz.epam.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Artyom Revinov
 */
public class UserDao extends DataBaseConnector  {

    public UserDao(Connection connection){

    }
    private Connection connection = getConnection();

    public UserDao() {

    }


    public void add(String userName, String userPassword, String userEmail) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO users ( username, password, email) VALUES (?,?,?) ";
        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, userPassword);
            preparedStatement.setString(3, userEmail);



            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }

    public boolean find(User user) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean isUser = false;



        try {
            preparedStatement = connection.prepareStatement("SELECT id,username,role FROM users WHERE email=? AND password=?");

            preparedStatement.setString(1, user.getEmail());//user email
            preparedStatement.setString(2, user.getPassword());//user password

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));//Take user name of database
                user.setRole(resultSet.getInt(3));//Take user role of database


                isUser = true;// Set value "this is our user"
            }
        } catch (SQLException e) {

            throw new SQLException(e);
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return isUser;
    }





}