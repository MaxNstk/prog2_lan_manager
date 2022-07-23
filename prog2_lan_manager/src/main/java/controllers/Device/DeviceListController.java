/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Device;

import controllers.Device.DeviceFormController;
import daos.DeviceDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import models.Device;
import models.tables.DeviceTableModel;
import views.Device.DeviceFormView;
import views.Device.DeviceListView;

/**
 *
 * @author max
 */
public class DeviceListController {
    
    private DeviceListView deviceListView;
    private DeviceTableModel deviceTableModel;
    private DeviceDAO deviceDAO;

    public DeviceListController(DeviceListView deviceListView) {
        this.deviceListView = deviceListView;
        deviceDAO = new DeviceDAO();
        this.deviceTableModel = new DeviceTableModel(deviceDAO.getDevices());
        addOpenCreateDeviceListener();
        setTableModel();
        addEvents();
    }  
    
    public void showScreen(){
        this.deviceListView.setVisible(true);
    }
    
    public void addOpenCreateDeviceListener() {
        deviceListView.addOpenCreateDeviceForm(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDeviceFormView();
            }
        });
    }

    public void openDeviceFormView() {
        DeviceFormController deviceFormController = new DeviceFormController(new DeviceFormView());
        deviceFormController.showScreen();
    }
    
    private void setTableModel(){
        deviceListView.setTableModel(this.deviceTableModel);
    }
    
    public void updateData(){
        deviceTableModel.fireTableDataChanged();
        deviceTableModel.setDevices(this.deviceDAO.getDevices());
    }
    
    public void addEvents(){
        deviceListView.adicionarEventoAlteracaoTabela(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e){
                if (TableModelEvent.UPDATE == e.getType()) {
                   int row = e.getFirstRow();
                   int column = e.getColumn();
                   if(row >=0 && column >=0){
                        DeviceTableModel model = (DeviceTableModel)e.getSource();
                        Device device = deviceTableModel.getDevices().get(row);
                        deviceDAO.updateDevice(device);
                        updateData();
                   }
                 }
            }
        });
    }

}

