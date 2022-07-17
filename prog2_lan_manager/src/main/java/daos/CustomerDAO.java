package daos;

import Connection.SQLConnection;
import interfaces.ICustomerDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Category;
import models.Customer;
import models.Customer;

/**
 *
 * @author max
 */
public class CustomerDAO implements ICustomerDAO {

    CategoryDAO categoryDAO;

    public CustomerDAO() {
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
                + "	active BOOLEAN DEFAULT TRUE\n"
                + ");\n"
                + "\n"
                + "CREATE TABLE IF NOT EXISTS CUSTOMER(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	personId INTEGER NOT NULL,\n"
                + "	creditsAmount INTEGER NOT NULL,	\n"
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
    public void createCustomer(Customer customer) {
        Connection connection = SQLConnection.connect();
        String sql = "INSERT INTO PERSON (name, CPF, address, birthDate) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, customer.getName());
            pstmt.setString(2, customer.getCPF());
            pstmt.setString(3, customer.getAdress());
            pstmt.setString(4, customer.getBirthDate());
            pstmt.execute();
            ResultSet result = pstmt.getGeneratedKeys();
            if (result.next()){
                sql = "INSERT INTO CUSTOMER (personID, creditsAmount) VALUES (?, ?)";
                PreparedStatement secondary_pstmt;
                secondary_pstmt = connection.prepareStatement(sql);
                secondary_pstmt.setInt(1, result.getInt(1));
                secondary_pstmt.setInt(2, customer.getCreditsAmount());
                secondary_pstmt.execute();
            }                    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

    @Override
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
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
//                customers.add(new Customer(id, name, description, category));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            SQLConnection.disconnect();
        }
        return customers;
    }

    @Override
    public Customer retrieveCustomer(int id) {
        Customer customer = null;
        Connection connection = SQLConnection.connect();

        String sql = "SELECT * FROM GAME WHERE ID = ?";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                int customerId = result.getInt("id");
                String name = result.getString("name");
                String description = result.getString("description");
                int categoryId = result.getInt("category_id");
                Category category = categoryDAO.retrieveCategory(categoryId);
//                customer = new Customer(customerId, name, description, category);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            SQLConnection.disconnect();
        }

        return customer;
    }

    @Override
    public void updateCustomer(Customer customer) {
        Connection connection = SQLConnection.connect();
        String sql = "UPDATE GAME SET (name, description) = (?, ?) WHERE ID = ?";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, customer.getName());
//            pstmt.setString(2, customer.getDescription());
            pstmt.setInt(3, customer.getId());
            pstmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

}
