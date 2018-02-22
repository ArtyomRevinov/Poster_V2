package kz.epam.dao;

import kz.epam.connector.DataBaseConnector;
import kz.epam.entity.Poster;
import kz.epam.util.Converter;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artyom Revinov
 */
public class PosterDao extends DataBaseConnector   {

    private Connection connection = getConnection();


    public void add(String title, String description, String release, String producer, String honorar, InputStream inputStream, String trailer) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO poster ( title, description, `release`, producer, honorar, picture, trailer) VALUES (?,?,?,?,?,?,?) ";
        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, title);
            preparedStatement.setString(2, description);
            preparedStatement.setString(3, release);
            preparedStatement.setString(4, producer);
            preparedStatement.setString(5, honorar);
            preparedStatement.setBlob(6, inputStream);
            preparedStatement.setString(7, trailer);


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


    public List<Poster> getAll() throws SQLException {
        List<Poster> posterList = new ArrayList<>();

        Converter converter = new Converter();

        String sql = "SELECT id, title, description, `release`, producer, honorar, picture FROM poster ";

        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Poster poster = new Poster();
                poster.setId(resultSet.getInt("id"));
                poster.setTitle(resultSet.getString("title"));
                poster.setDescription(resultSet.getString("description"));
                poster.setRelease(resultSet.getString("release"));
                poster.setProducer(resultSet.getString("producer"));
                poster.setHonorar(resultSet.getString("honorar"));
                poster.setPicture(converter.convertToString(resultSet.getBytes("picture")));


                posterList.add(poster);


            }
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return posterList;

    }


    public Poster getById(int id) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, title, description, `release`, producer, honorar, picture, trailer FROM poster WHERE id = ?";

        Poster poster = new Poster();
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            poster.setId(resultSet.getInt("id"));
            poster.setTitle(resultSet.getString("title"));
            poster.setDescription(resultSet.getString("description"));
            poster.setRelease(resultSet.getString("release"));
            poster.setProducer(resultSet.getString("producer"));
            poster.setHonorar(resultSet.getString("honorar"));
            poster.setPicture(resultSet.getString("picture"));
            poster.setTrailer(resultSet.getString("trailer"));

             preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        return poster;
    }



    public void remove(int id) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM poster WHERE id=?";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

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
}

