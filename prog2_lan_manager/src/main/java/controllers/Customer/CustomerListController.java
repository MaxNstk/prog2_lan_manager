/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Customer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;

public class CustomerListController {

    private CustomerListView customerListView;

    public CustomerListController(CustomerListView customerListView) {
        this.customerListView = customerListView;
        addOpenCreateCustomerListener();
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

}
