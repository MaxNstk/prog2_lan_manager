
package controllers;

import daos.DeviceDAO;
import java.util.ArrayList;
import java.util.List;
import models.Device;

/**
 *
 * @author João Eduardo
 */
public class DeviceController {
    
    private List<Device> filteredDevices;

    DeviceDAO deviceDAO = new DeviceDAO();

    public void getAll() {
        this.filteredDevices = new ArrayList<>();
        this.filteredDevices = deviceDAO.getAvailableDevices();
    }
    
    public List<Device> getFilteredDevices(){
        if (this.filteredDevices == null)
            this.getAll();
        return this.filteredDevices;            
    }
    
    public void updateDevice(int id) {
        App.openDeviceUpdateView(deviceDAO.retrieveDevice(id));
    }
    
    public List<Device> getFilteredCustomers() {
        if (this.filteredDevices == null) {
            this.getAll();
        }
        return this.filteredDevices;
    }
}
