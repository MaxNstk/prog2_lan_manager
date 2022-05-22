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
     
     private static List<Customer> customers = new ArrayList<>();

    @Override
    public void createCustomer(Customer customer) {
        customers.add(customer);
    }

    
    @Override
    public void retrieveCustomer(String CPF) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }
    
}
