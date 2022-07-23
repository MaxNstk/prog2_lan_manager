/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.tables;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.Computer;
import models.Console;
import models.Device;

/**
 *
 * @author max
 */
public class DeviceTableModel extends AbstractTableModel{
   
    private List<Device> devices;
    
    private final String[] columnNames = {"Nome", "Tipo", "Specs/Modelo", "Disponível"};
    private final int COLUNA_NOME = 0;
    private final int COLUNA_TIPO = 1;
    private final int COLUNA_SPECS_MODEL = 2;
    private final int COLUNA_DISPONIVEL = 3;
    
    public DeviceTableModel(List<Device> devices) {
        this.devices = devices;
    }
    
    @Override
    public int getRowCount() {
        return devices.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Device device = this.devices.get(rowIndex);
        String value = null;
        switch(columnIndex){
            case COLUNA_NOME:
                value = device.getName();
                break;
            case COLUNA_TIPO:
                if (device instanceof Computer)
                  value = "Computador";
                else
                  value = "Console";
                break;              
            case COLUNA_SPECS_MODEL:
                if (device instanceof Computer)
                  value =((Computer) device).getSpecs();
                else
                  value = ((Console) device).getModel();
                break;
            case COLUNA_DISPONIVEL:
                if (device.isAvailable())
                    value = "Sim";
                else
                    value = "Não";
        }
        return value;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == COLUNA_TIPO || columnIndex == COLUNA_DISPONIVEL)
            return false;
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    	Device device = this.devices.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_NOME:
                device.setName((String) aValue);
                break;
            case COLUNA_SPECS_MODEL:
                if (device instanceof Computer)
                    ((Computer) device).setSpecs((String) aValue);
                else
                    ((Console) device).setModel((String) aValue);
                break;
        }
        fireTableDataChanged();
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void setDevices(List<Device> devices) {
        this.devices.clear();
        this.devices.addAll(devices);
    }

    public List<Device> getDevices() {
        return devices;
    }
    
}
