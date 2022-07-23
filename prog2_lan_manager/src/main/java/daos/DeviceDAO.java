package daos;

import Connection.SQLConnection;
import interfaces.IDeviceDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Category;
import models.Computer;
import models.Console;
import models.Device;
import models.Device;

/**
 *
 * @author max
 */
public class DeviceDAO implements IDeviceDAO {


    public DeviceDAO() {
        this.createTable();
    }

    private void createTable() {
        Connection connection = SQLConnection.connect();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS DEVICE(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	name VARCHAR(50),\n"
                + "	active BOOLEAN DEFAULT TRUE,\n"
                + "	available BOOLEAN DEFAULT TRUE\n"
                + ");\n"
                + "\n"
                + "CREATE TABLE IF NOT EXISTS CONSOLE(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	model VARCHAR(30),\n"
                + "	deviceId INTEGER NOT NULL,\n"
                + "	FOREIGN KEY (deviceId) REFERENCES DEVICE(id)\n"
                + ");\n"
                + "\n"
                + "CREATE TABLE IF NOT EXISTS COMPUTER(\n"
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	specs VARCHAR(30),\n"
                + "	deviceId INTEGER NOT NULL,\n"
                + "	FOREIGN KEY (deviceId) REFERENCES DEVICE(id)\n"
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
    public void createDevice(Device device) {
        Connection connection = SQLConnection.connect();
        String sql = "INSERT INTO DEVICE (name) VALUES (?)";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, device.getName());
            pstmt.execute();
            ResultSet result = pstmt.getGeneratedKeys();
            
            if (device instanceof Console) {
                if (result.next()) {
                    sql = "INSERT INTO CONSOLE (model, deviceId) VALUES (?, ?)";
                    PreparedStatement secondary_pstmt;
                    secondary_pstmt = connection.prepareStatement(sql);
                    secondary_pstmt.setString(1, ((Console) device).getModel());
                    secondary_pstmt.setInt(2, result.getInt(1));
                    secondary_pstmt.execute();
                }
            } else {
                if (result.next()) {
                    sql = "INSERT INTO COMPUTER (specs, deviceId) VALUES (?, ?)";
                    PreparedStatement secondary_pstmt;
                    secondary_pstmt = connection.prepareStatement(sql);
                    secondary_pstmt.setString(1, ((Computer) device).getSpecs());
                    secondary_pstmt.setInt(2, result.getInt(1));
                    secondary_pstmt.execute();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

    @Override
    public List<Device> getDevices() {
        List<Device> devices = new ArrayList<>();
        Connection connection = SQLConnection.connect();

        String sql = "SELECT d.*, cs.model, cp.specs  FROM DEVICE d  LEFT JOIN COMPUTER cp ON cp.deviceId = d.id  LEFT JOIN CONSOLE cs ON cs.deviceId = d.id ";
        Statement stmt;

        try {
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                boolean available = result.getBoolean("available");
                String specs = result.getString("specs");
                String model = result.getString("model");
                if (specs == null)
                    devices.add(new Console(id, name, model, available));
                else                
                    devices.add(new Computer(id, name, specs, available));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            SQLConnection.disconnect();
        }
        return devices;
    }
    
    @Override
    public Device retrieveDevice(int id) {
        Device device = null;
        Connection connection = SQLConnection.connect();

        String sql = "SELECT * FROM GAME WHERE ID = ?";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                int deviceId = result.getInt("id");
                String name = result.getString("name");
                String description = result.getString("description");
                int categoryId = result.getInt("category_id");
//                Category category = categoryDAO.retrieveCategory(categoryId);
//                device = new Device(deviceId, name, description, category);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            SQLConnection.disconnect();
        }

        return device;
    }

    @Override
    // todo
    public void updateDevice(Device device) {
        Connection connection = SQLConnection.connect();
        String sql = "UPDATE PERSON SET (name, CPF, address, birthDate) = (?, ?, ?, ?) WHERE ID = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, device.getName());
//            pstmt.setString(2, device.getCPF());
//            pstmt.setString(3, device.getaddress());
//            pstmt.setString(4, device.getBirthDate());
            pstmt.setInt(5, device.getId());
            pstmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            SQLConnection.disconnect();
        }
    }

    @Override
    public List<Device> getAvailableDevices() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
