/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Connection.SQLConnection;
import interfaces.IGameDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Game;

public class GameDAO implements IGameDAO {

    private static List<Game> games = new ArrayList<>();

    private void createTable() {
        Connection connection = SQLConnection.connect();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS CATEGORY \n"
                + "(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	creditsValue INTEGER NOT NULL,\n"
                + "	name VARCHAR(50)\n"
                + ");\n"
                + "\n"
                + "CREATE TABLE IF NOT EXISTS GAME (\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	name VARCHAR(30),\n"
                + "	description VARCHAR(255),\n"
                + "	category_id INTEGER NOT NULL,\n"
                + "	FOREIGN KEY (category_id) REFERENCES CATEGORY (id)\n"
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
    public Game retrieveGame(int id) {
        for (Game game : games) {
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

    @Override
    public List<Game> getGames() {
        return games;
    }

    @Override
    public boolean deleteGame(Game game) {
        for (Game g : games) {
            if (g.getId() == game.getId()) {
                games.remove(g);
                return true;
            }
        }
        return false;
    }

    @Override
    public Game retrieveGame(Game game) {
        for (Game g : games) {
            if (g.getId() == game.getId()) {
                return game;
            }
        }
        return null;
    }

}
