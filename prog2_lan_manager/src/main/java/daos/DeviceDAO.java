/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import interfaces.IDeviceDAO;
import java.util.ArrayList;
import java.util.List;
import models.Device;

/**
 *
 * @author João Eduardo
 */
public class DeviceDAO implements IDeviceDAO{
    
    private static List<Device> devices = new ArrayList<>();

    @Override
    public List<Device> getDevices() {
         return devices;
    }

    @Override
    public void createDevice(Device device) {
         devices.add(device);
    }

    @Override
    public Device retrieveDevice(int id) {
        for (Device device : devices){
            if (device.getId() == id)
                return device;
        }
        return devices.get(id-1);
    }

    @Override
    public List<Device> getAvailableDevices(){
        List<Device> availableDevices = new ArrayList();
        for (Device d : this.getDevices()){
            if (d.isAvailable())
                availableDevices.add(d);
        }
        return availableDevices;
    }
    
}
