/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Customer;

import Exceptions.EmptyFieldException;
import daos.CustomerDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Customer;
import views.Customer.CustomerFormView;

/**
 *
 * @author max
 */
public class CustomerFormController {
    
     private CustomerFormView customerFormView;
     private Customer customerModel;
     private CustomerDAO customerDAO;

    public CustomerFormController(CustomerFormView customerFormView) {
        this.customerFormView = customerFormView;
        this.customerDAO = new CustomerDAO();
        addActions();
    }
    
       
    public void showScreen(){
        this.customerFormView.setVisible(true);
    }
    
    public void addActions() {
        customerFormView.addCreateCustomerAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createCustomer();
            }
        });
    }
    
    public void createCustomer() {
        try {
            customerModel = new Customer(customerFormView.getName(), 
                    customerFormView.getCPF(), customerFormView.getAdress(),
                    customerFormView.getBirthDAte());
            validateCustomer();
            customerDAO.createCustomer(customerModel);
            customerFormView.showMessage("Jogo salvo com sucesso!. " + customerModel);
            customerFormView.clearFields();
        } catch (EmptyFieldException e) {
            customerFormView.showMessage(e.getMessage());
        }
    }

    public void validateCustomer() throws EmptyFieldException {
        if ((this.customerModel.getName().equals(""))
            || (this.customerModel.getCPF().equals(""))
            || (this.customerModel.getAdress().equals(""))
            || (this.customerModel.getBirthDate().equals(""))) {
                throw new EmptyFieldException();
        }
    }
    
    
}
