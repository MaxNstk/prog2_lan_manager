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
public class CustomerController {

    private List<Customer> filteredCustomers;

    CustomerDAO customerDAO = new CustomerDAO();

    public List<Customer> getAll(){
        filteredCustomers = new ArrayList<>();
        return filteredCustomers = customerDAO.getCustomers();
    }

    public List<Customer> filterByName(String searchParam) {
        filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getName().contains(searchParam)) {
                filteredCustomers.add(customer);
            }
        }
        return filteredCustomers;
    }

    public List<Customer> filterByCPF(String searchParam) {
        filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getCPF().contains(searchParam)) {
                filteredCustomers.add(customer);
            }
        }
        return filteredCustomers;
    }

    public List<Customer> filterByAdress(String searchParam) {
        filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getAdress().contains(searchParam)) {
                filteredCustomers.add(customer);
            }
        }
        return filteredCustomers;
    }

    public List<Customer> sortByCreditsAmount() {
        Collections.sort(filteredCustomers, new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                if (c1.getCreditsAmount() > c2.getCreditsAmount()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return filteredCustomers;
    }
    
     public List<Customer> sortAlphabetically() {
         Collections.sort(filteredCustomers);
         return filteredCustomers;
     }

}
