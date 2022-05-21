/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import daos.CustomerDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import models.Customer;

/**
 *
 * @author max
 */
public class CustomerController  {
    
    CustomerDAO customerDAO = new CustomerDAO();
    List<Customer> filteredCustomers = new ArrayList<>();
    
    public CustomerController(){
        this.filteredCustomers = this.customerDAO.getCustomers();
    }
    
    public List<Customer> filterByName(String searchParam){ 
        for (Customer customer : customerDAO.getCustomers()){
            if (customer.getName().contains(searchParam)){
                filteredCustomers.add(customer);
            }
        }
        return filteredCustomers;
    }
    
   public List<Customer> sortByCreditsAmount(){
       Collections.sort(filteredCustomers, new Comparator<Customer>(){
           @Override
           public int compare(Customer c1, Customer c2){
               if (c1.getCreditsAmount() > c2.getCreditsAmount())
                   return 1;
               else
                   return -1;
           }
       });
       return filteredCustomers;
   }
}
