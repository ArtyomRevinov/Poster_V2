package kz.epam.dao.impl;

import kz.epam.Connector.DataBaseConnector;
import kz.epam.entity.News;
import kz.epam.util.Converter;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artyom Revinov
 */
public class NewsDao extends DataBaseConnector  {

    private Connection connection = getConnection();


    public void add(String title, String content, InputStream inputStream) throws SQLException  {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO news ( news_title,news_content,news_picture) VALUES (?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, title);
            preparedStatement.setString(2, content);
            preparedStatement.setBlob(3, inputStream);

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (connection != null){
                connection.close();
            }
        }


    }

    public List<News> getAll() throws SQLException {
        List<News> newsList = new ArrayList<>();

        Converter converter = new Converter();

        String sql = "SELECT id, news_title, news_content, news_picture FROM news ";

        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                News news = new News();
                news.setId(resultSet.getInt("id"));
                news.setNewsTitle(resultSet.getString("news_title"));
                news.setNewsContent(resultSet.getString("news_content"));
                news.setNewsPicture(converter.convertToString(resultSet.getBytes("news_picture")));


                newsList.add(news);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return newsList;
    }


    public News getById(int id) throws SQLException {
        Converter converter = new Converter();
        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, news_title, news_content,news_picture FROM news WHERE id = ?";

        News news = new News();
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            news.setId(resultSet.getInt("id"));
            news.setNewsTitle(resultSet.getString("news_title"));
            news.setNewsContent(resultSet.getString("news_content"));
            news.setNewsPicture(converter.convertToString(resultSet.getBytes("news_picture")));


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

        return news;
    }




}
