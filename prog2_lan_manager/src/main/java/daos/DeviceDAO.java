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
    
}
