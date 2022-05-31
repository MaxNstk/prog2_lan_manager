/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        this.filteredDevices = deviceDAO.getDevices();
    }
}
