/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Device;

import Exceptions.EmptyFieldException;
import daos.DeviceDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Computer;
import models.Console;
import models.Device;
import views.Device.DeviceFormView;


/**
 *
 * @author max
 */
public class DeviceFormController {
    
    private DeviceFormView deviceFormView;
    private Device deviceModel;
    private DeviceDAO deviceDAO;
    
    public DeviceFormController(DeviceFormView deviceFormView) {
        this.deviceFormView = deviceFormView;
        this.deviceDAO = new DeviceDAO();
        addActions();
    }
    
    public void showScreen(){
        this.deviceFormView.setVisible(true);
    }
    
    public void addActions() {
        deviceFormView.addCreateDeviceAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDevice();
            }
        });
    }
    
    public void createDevice() {
        try {
            validateDevice();
            String model = this.deviceFormView.getModel();
            if (model ==  null)
                deviceModel = new Computer(deviceFormView.getName(), deviceFormView.getSpecs());
            else
                deviceModel = new Console(deviceFormView.getName(), deviceFormView.getModel());
                
            
            deviceDAO.createDevice(deviceModel);
            deviceFormView.showMessage("Jogo salvo com sucesso!");
            deviceFormView.clearFields();
        } catch (EmptyFieldException e) {
            deviceFormView.showMessage(e.getMessage());
        }
    }

    public void validateDevice() throws EmptyFieldException {
        if ((deviceFormView.getName().equals(""))
            || (deviceFormView.getSpecs().equals("") && deviceFormView.getName().equals(""))      
            ){
              throw new EmptyFieldException();
        }
    }
}
