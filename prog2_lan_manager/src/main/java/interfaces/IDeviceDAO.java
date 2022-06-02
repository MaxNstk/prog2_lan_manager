/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Device;

/**
 *
 * @author João Eduardo
 */
public interface IDeviceDAO {
    
    public List<Device> getDevices(); 
    public void createDevice(Device p);
    public Device retrieveDevice(int id);
    public List<Device> getAvailableDevices();
}
