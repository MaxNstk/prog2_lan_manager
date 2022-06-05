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

    public void getAll() {
        this.filteredCustomers = new ArrayList<>();
        this.filteredCustomers = customerDAO.getCustomers();
    }

    public void filterByName(String searchParam) {
        filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getName().contains(searchParam)) {
                this.filteredCustomers.add(customer);
            }
        }
    }

    public Customer retrieveCostumer(int id) {
        return customerDAO.retrieveCustomer(id);
    }

    public void addCredits(int creditsAmount, int customerId) {
        Customer customer = customerDAO.retrieveCustomer(customerId);
        customer.addCredits(creditsAmount);
    }

    public void filterByCPF(String searchParam) {
        filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getCPF().contains(searchParam)) {
                this.filteredCustomers.add(customer);
            }
        }
    }

    public void filterByAdress(String searchParam) {
        this.filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getAdress().contains(searchParam)) {
                this.filteredCustomers.add(customer);
            }
        }
    }

    public List<Customer> sortByCreditsAmount() {
        Collections.sort(filteredCustomers, new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                if (c1.getCreditsAmount() < c2.getCreditsAmount()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return this.filteredCustomers;
    }

    public void updateCustomer(int id) {
            App.openCustomerUpdateView(customerDAO.retrieveCustomer(id));
    }

    public List<Customer> sortAlphabetically() {
        Collections.sort(filteredCustomers);
        return this.filteredCustomers;
    }

    public List<Customer> getFilteredCustomers() {
        if (this.filteredCustomers == null) {
            this.getAll();
        }
        return this.filteredCustomers;
    }

}
