/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Connection.SQLConnection;
import interfaces.IGameDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Category;
import models.Game;

public class GameDAO implements IGameDAO {
    
    CategoryDAO categoryDAO;
    
    public GameDAO(){
        this.createTable();
        categoryDAO = new CategoryDAO();
    }

    private void createTable(){
        Connection connection = SQLConnection.connect();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS GAME (\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	name VARCHAR(30),\n"
                + "	description VARCHAR(255),\n"
                + "	game_id INTEGER NOT NULL,\n"
                + "	FOREIGN KEY (game_id) REFERENCES CATEGORY (id)\n"
                + ");";

        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            stmt.execute(sqlCreate);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

    @Override
    public void createGame(Game game) {
        Connection connection = SQLConnection.connect();
        String sql = "INSERT INTO GAME (name, description, category_id) VALUES (?, ?, ?)";
        PreparedStatement pstmt;
        
        try
        {
           pstmt = connection.prepareStatement(sql);
           pstmt.setString(1, game.getName());
           pstmt.setString(2, game.getDescription());
           pstmt.setInt(3, game.getCategory().getId());
           pstmt.execute();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally{
            SQLConnection.disconnect();
        }
    }

    @Override
    public List<Game> getGames(){
    List<Game> games = new ArrayList<>();
        Connection connection = SQLConnection.connect();

        String sql = "SELECT * FROM GAME";
        Statement stmt;

        try {
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String description = result.getString("description");
                int categoryId = result.getInt("category_id");
                Category category = categoryDAO.retrieveCategory(categoryId);
                games.add(new Game(id, name, description, category));            
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            SQLConnection.disconnect();
        }
        return games;
    }  

    @Override
    public void updateGame(Game game) {
        Connection connection = SQLConnection.connect();
        String sql = "UPDATE GAME SET (name, description) = (?, ?) WHERE ID = ?";
        PreparedStatement pstmt;
        
        try
        {
           pstmt = connection.prepareStatement(sql);
           pstmt.setString(1, game.getName());
           pstmt.setString(2, game.getDescription());
           pstmt.setInt(3, game.getId());
           pstmt.execute();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally{
            SQLConnection.disconnect();
        }
    }
    
    @Override
    public void deleteGame(int id) {
        Connection connection = SQLConnection.connect();
        String sql = "DELETE FROM GAME WHERE id = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }     
    }

}
