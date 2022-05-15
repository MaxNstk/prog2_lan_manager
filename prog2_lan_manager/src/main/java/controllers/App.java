/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import views.CustomerCreateView;
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
        CustomerCreateView customerCreateView = new CustomerCreateView();
        customerCreateView.setVisible(true);
    }
   
}
