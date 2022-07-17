/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.tables;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.Customer;

/**
 *
 * @author max
 */
public class CustomerTableModel extends AbstractTableModel{
   
    private List<Customer> customers;
    
    private final String[] columnNames = {"Nome","CPF","Endereço","Data de Nascimento"};
    private final int COLUNA_NOME = 0;
    private final int COLUNA_CPF = 1;
    private final int COLUNA_ENDERECO = 2;
    private final int COLUNA_DATA_NASCIMENTO = 3;
    
    public CustomerTableModel(List<Customer> customers) {
        this.customers = customers;
    }
    
    @Override
    public int getRowCount() {
        return customers.size();
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
        Customer customer = this.customers.get(rowIndex);
        String value = null;
        switch(columnIndex){
            case COLUNA_NOME:
                value = customer.getName();
                break;
            case COLUNA_CPF:
                value = customer.getCPF();
                break;
            case COLUNA_ENDERECO:
                value = customer.getAdress();
                break;
            case COLUNA_DATA_NASCIMENTO:
                value = customer.getBirthDate();
                break;
        }
        return value;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    	Customer customer = this.customers.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_NOME:
                customer.setName((String) aValue);
                break;
            case COLUNA_CPF:
                customer.setCPF((String) aValue);
                break;
            case COLUNA_ENDERECO:
                customer.setAdress((String) aValue);
                break;
            case COLUNA_DATA_NASCIMENTO:
                customer.setBirthDate((String) aValue);
                break; 
               
        }
        fireTableDataChanged();
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void setCustomers(List<Customer> customers) {
        this.customers.clear();
        this.customers.addAll(customers);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
    
}
