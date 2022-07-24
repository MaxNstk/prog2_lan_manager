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
    
    public void createCustomer(Customer c);
    public Customer retrieveCustomer(int id);
    public List<Customer> getCustomers();
    public void updateCustomer(Customer c);
    public void deleteCustomer(int id);
    public void addCredits(int id, int creditsAmount);

}
