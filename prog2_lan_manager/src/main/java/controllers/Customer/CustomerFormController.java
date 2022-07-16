/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Customer;

import views.Customer.CustomerFormView;

/**
 *
 * @author max
 */
public class CustomerFormController {
    
     private CustomerFormView customerFormView;

    public CustomerFormController(CustomerFormView customerFormView) {
        this.customerFormView = customerFormView;
    }
    
    public void showScreen(){
        this.customerFormView.setVisible(true);
    }
    
}
