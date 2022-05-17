/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import interfaces.ICustomerDAO;
import java.util.ArrayList;
import java.util.List;
import models.Customer;

/**
 *
 * @author max
 */
 public class CustomerDAO implements ICustomerDAO {
     
     private List<Customer> customers = new ArrayList<>();

    @Override
    public void createCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void retrieveCustomer(String CPF) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Customer> getCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
