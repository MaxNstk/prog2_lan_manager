/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Customer;

import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;


public class CustomerListController {
    
    private CustomerListView customerListView;

    public CustomerListController(CustomerListView customerListView) {
        this.customerListView = customerListView;
    }
    
    public void showScreen(){
        this.customerListView.setVisible(true);
    }
    
    public void openCustomerFormView(){
    CustomerFormController customerFormController = new CustomerFormController(new CustomerFormView(null));
    customerFormController.showScreen();
}
    
}
