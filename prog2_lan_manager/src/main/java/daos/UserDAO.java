package daos;

import Connection.SQLConnection;
import Exceptions.InvalidLoginException;
import interfaces.IUserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.User;

/**
 *
 * @author max
 */
public class UserDAO implements IUserDAO {

    CategoryDAO categoryDAO;

    public UserDAO() {
        this.createTable();
        categoryDAO = new CategoryDAO();
    }

    private void createTable() {
        Connection connection = SQLConnection.connect();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS PERSON(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	name VARCHAR(50),\n"
                + "	CPF VARCHAR(14),\n"
                + "	address VARCHAR(150),\n"
                + "	birthDate VARCHAR(20),\n"
                + "	active BOOLEAN DEFAULT TRUE,\n"
                + ");\n"
                + "\n"
                + "CREATE TABLE IF NOT EXISTS USER(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	personId INTEGER NOT NULL,\n"
                + "	login VARCHAR(20),\n"
                + "	password VARCHAR(100),\n"
                + "	FOREIGN KEY (personId) REFERENCES PERSON(id)\n"
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
    public void createUser(User user) {
        Connection connection = SQLConnection.connect();
        String sql = "INSERT INTO PERSON (name, CPF, address, birthDate) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getCPF());
            pstmt.setString(3, user.getaddress());
            pstmt.setString(4, user.getBirthDate());
            pstmt.execute();
            ResultSet result = pstmt.getGeneratedKeys();
            if (result.next()) {
                sql = "INSERT INTO USER (personID, login, password) VALUES (?, ?, ?)";
                PreparedStatement secondary_pstmt;
                secondary_pstmt = connection.prepareStatement(sql);
                secondary_pstmt.setInt(1, result.getInt(1));
                secondary_pstmt.setString(2, user.getLogin());
                secondary_pstmt.setString(3, user.getPassword());
              
                secondary_pstmt.execute();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

    @Override
    public void updateUser(User user) {
        Connection connection = SQLConnection.connect();
        String sql = "UPDATE PERSON SET (name, CPF, address, birthDate) = (?, ?, ?, ?) WHERE ID = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getCPF());
            pstmt.setString(3, user.getaddress());
            pstmt.setString(4, user.getBirthDate());
            pstmt.setInt(5, user.getId());
            pstmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

    @Override
    public void validateUser(String username, String password) throws InvalidLoginException{
        Connection connection = SQLConnection.connect();
        String sql = "SELECT r.* FROM USER r WHERE r.login = ? AND r.password = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet result = pstmt.executeQuery();
            if (!result.next())
               throw new InvalidLoginException();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
        
    }

}
