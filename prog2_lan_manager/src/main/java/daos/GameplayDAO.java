/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Connection.SQLConnection;
import interfaces.IGameplayDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import models.Category;
import models.Gameplay;

public class GameplayDAO implements IGameplayDAO {

    CategoryDAO categoryDAO;

    public GameplayDAO() {
        this.createTable();
        categoryDAO = new CategoryDAO();
    }

    private void createTable() {
        Connection connection = SQLConnection.connect();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS GAMEPLAY(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	customerId INTEGER NOT NULL,\n"
                + "	deviceId INTEGER NOT NULL,\n"
                + "	gameId INTEGER NOT NULL,\n"
                + "	startDateTime DATETIME,\n"
                + "	endDateTime DATETIME,\n"
                + "	playingNow BOOLEAN,\n"
                + "	FOREIGN KEY (customerId) REFERENCES CUSTOMER(id),	\n"
                + "	FOREIGN KEY (deviceId) REFERENCES DEVICE(id),	\n"
                + "	FOREIGN KEY (gameId) REFERENCES GAME(id)\n"
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
    public void createGameplay(Gameplay gameplay) {
        Connection connection = SQLConnection.connect();
        String sql = "INSERT INTO GAMEPLAY (customerId, deviceId, gameId, startDateTime, endDateTime, playingNow) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, gameplay.getCustomer().getId());
            pstmt.setInt(1, gameplay.getDevice().getId());
            pstmt.setInt(1, gameplay.getGame().getId());
//            pstmt.setTimestamp(1, LocalDateTime.now());
            
            
            pstmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

    @Override
    public List<Gameplay> getGameplays() {
        List<Gameplay> games = new ArrayList<>();
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
//                games.add(new Gameplay(id, name, description, category));
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
    public Gameplay retrieveGameplay(int id) {
        Gameplay game = null;
        Connection connection = SQLConnection.connect();

        String sql = "SELECT * FROM GAME WHERE ID = ?";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                int gameId = result.getInt("id");
                String name = result.getString("name");
                String description = result.getString("description");
                int categoryId = result.getInt("category_id");
                Category category = categoryDAO.retrieveCategory(categoryId);
//                game = new Gameplay(gameId, name, description, category);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            SQLConnection.disconnect();
        }

        return game;
    }

    public void updateGameplay(Gameplay game) {
//        Connection connection = SQLConnection.connect();
//        String sql = "UPDATE GAME SET (name, description) = (?, ?) WHERE ID = ?";
//        PreparedStatement pstmt;
//
//        try {
//            pstmt = connection.prepareStatement(sql);
//            pstmt.setString(1, game.getName());
//            pstmt.setString(2, game.getDescription());
//            pstmt.setInt(3, game.getId());
//            pstmt.execute();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            SQLConnection.disconnect();
//        }
//    }

//    @Override
//    public void deleteGameplay(int id) {
//        Connection connection = SQLConnection.connect();
//        String sql = "DELETE FROM GAME WHERE id = ?";
//        PreparedStatement pstmt;
//        try {
//            pstmt = connection.prepareStatement(sql);
//            pstmt.setInt(1, id);
//            pstmt.execute();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            SQLConnection.disconnect();
//        }
    }

    @Override
    public List<Gameplay> getActiveGamplays() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
