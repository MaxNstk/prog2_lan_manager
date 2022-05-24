/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Customer;
import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;
import views.MainView;

/**
 *
 * @author max
 */
public class App {
    
    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.setVisible(true);
    }
    
    public static void openCustomerCreateView(){
        CustomerFormView customerCreateView = new CustomerFormView(null);
        customerCreateView.setVisible(true);
    }
    
    public static void openCustomerUpdateView(Customer customer){
        CustomerFormView customerCreateView = new CustomerFormView(customer);
        customerCreateView.setVisible(true);
    }
    
    public static void openCustomerListView(){
        CustomerListView customerListView = new CustomerListView();
        customerListView.setVisible(true);
    }
   
}
