/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Customer;

import daos.CustomerDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import models.Customer;
import models.tables.CustomerTableModel;
import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;

public class CustomerListController {

    private CustomerListView customerListView;
    private CustomerDAO customerDAO;
    private CustomerTableModel customerTableModel;

    public CustomerListController(CustomerListView customerListView) {
        this.customerListView = customerListView;
        customerDAO = new CustomerDAO();
        customerTableModel = new CustomerTableModel(customerDAO.getCustomers());
        addOpenCreateCustomerListener();
        setTableModel();
        addEvents();
    }

    public void showScreen() {
        this.customerListView.setVisible(true);
    }

    public void addOpenCreateCustomerListener() {
        customerListView.addOpenCreateCustomer(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCustomerFormView();
            }
        });

    }

    public void openCustomerFormView() {
        CustomerFormController customerFormController = new CustomerFormController(new CustomerFormView());
        customerFormController.showScreen();
    }
    
    private void setTableModel(){
        customerListView.setTableModel(this.customerTableModel);
    }
    
    public void updateData(){
        customerTableModel.fireTableDataChanged();
        customerTableModel.setCustomers(this.customerDAO.getCustomers());
    }
    
    public void addEvents(){
        customerListView.adicionarEventoAlteracaoTabela(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e){
                if (TableModelEvent.UPDATE == e.getType()) {
                   int row = e.getFirstRow();
                   int column = e.getColumn();
                   if(row >=0 && column >=0){
                        CustomerTableModel model = (CustomerTableModel)e.getSource();
                        Customer customer = customerTableModel.getCustomers().get(row);
                        customerDAO.updateCustomer(customer);
                        updateData();
                   }
                 }
            }
        });
    }

}
