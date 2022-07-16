/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Device;

import views.Device.DeviceFormView;


/**
 *
 * @author max
 */
public class DeviceFormController {
    
    private DeviceFormView deviceFormView;

    public DeviceFormController(DeviceFormView deviceFormView) {
        this.deviceFormView = deviceFormView;
    }
    
    public void showScreen(){
        this.deviceFormView.setVisible(true);
    }
}
