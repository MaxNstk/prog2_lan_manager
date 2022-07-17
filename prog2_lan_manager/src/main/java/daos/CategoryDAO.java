package daos;

import Connection.SQLConnection;
import interfaces.ICategoryDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Category;

public class CategoryDAO implements ICategoryDAO {
    
    public CategoryDAO(){
        this.createTable();
    }
    
    private void createTable() {
        Connection connection = SQLConnection.connect();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS CATEGORY \n"
                + "(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	creditsValue INTEGER NOT NULL,\n"
                + "	name VARCHAR(50)\n"
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
    public void createCategory(Category category) {
        Connection connection = SQLConnection.connect();
        String sql = "INSERT INTO CATEGORY (name, creditsValue) VALUES (?, ?)";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, category.getName());
            pstmt.setInt(2, category.getCreditsValue());

            pstmt.execute();
            final ResultSet result = pstmt.getGeneratedKeys();
            if (result.next()) {
                int id = result.getInt(1);
                category.setId(id);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

     @Override
     public Category retrieveCategory(int id) {
        Category category = null;
        Connection connection = SQLConnection.connect();

        String sql = "SELECT * FROM CATEGORY WHERE ID = ?";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                int categoryId = result.getInt("id");
                String name = result.getString("name");
                int creditsValue = result.getInt("creditsValue");
                category = new Category(id, name, creditsValue);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            SQLConnection.disconnect();
        }

        return category;
    }

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        Connection connection = SQLConnection.connect();

        String sql = "SELECT * FROM CATEGORY";
        Statement stmt;

        try {
            stmt = connection.createStatement();
            ResultSet query = stmt.executeQuery(sql);

            while (query.next()) {
                int id = query.getInt("id");
                String name = query.getString("name");
                int creditsValue = query.getInt("creditsValue");
                categories.add(new Category(id, name, creditsValue));           
            }           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            SQLConnection.disconnect();
        }
        return categories;
    }


}
