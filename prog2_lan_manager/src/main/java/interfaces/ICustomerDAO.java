/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Customer;

/**
 *
 * @author max
 */
public interface ICustomerDAO {
    public void createCustomer(Customer p);
    public void retrieveCustomer(String CPF);
    public List<Customer> getCustomers();
    
}
