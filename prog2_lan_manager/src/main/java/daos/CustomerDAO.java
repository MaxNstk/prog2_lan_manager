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
    public Customer retrieveCustomer(int id) {
        for (Customer customer : customers){
            if (customer.getId() == id)
                return customer;
        }
        return customers.get(id-1);
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }
    
}
