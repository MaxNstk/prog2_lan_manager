/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Device;

import views.Device.DeviceListView;

/**
 *
 * @author max
 */
public class DeviceListController {
    
    private DeviceListView deviceListView;

    public DeviceListController(DeviceListView deviceListView) {
        this.deviceListView = deviceListView;
    }
    
    public void showScreen(){
        this.deviceListView.setVisible(true);
    }
}
