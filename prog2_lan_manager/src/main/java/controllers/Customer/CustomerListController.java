/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Customer;

import daos.CustomerDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import models.Customer;
import models.tables.CustomerTableModel;
import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;

public class CustomerListController {

    private CustomerListView customerListView;
    private CustomerDAO customerDAO;
    private CustomerTableModel customerTableModel;
    private List<Customer> filteredCustomers;

    public CustomerListController(CustomerListView customerListView) {
        this.customerListView = customerListView;
        customerDAO = new CustomerDAO();
        this.filteredCustomers = this.customerDAO.getCustomers();
        customerTableModel = new CustomerTableModel(customerDAO.getCustomers());
        addOpenCreateCustomerListener();
        addDeleteCustomerListener();
        addFilterCustomerListener();
        setTableModel();
        addEvents();
    }

    public void showScreen() {
        this.customerListView.setVisible(true);
    }

    public void addOpenCreateCustomerListener() {
        customerListView.addOpenCreateCustomer(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCustomerFormView();
            }
        });
    }

    public void addFilterCustomerListener() {
        customerListView.addFilterCustomerListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterCustomers();
                sortCustomers();
                updateData();
            }
        });
    }

    public void addDeleteCustomerListener() {
        customerListView.addDeleteCustomer(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteCustomer();
            }
        });
    }

    public void deleteCustomer() {
        if (this.customerListView.getCustomerId() != -1) {
            customerDAO.deleteCustomer(this.customerListView.getCustomerId());
            updateData();
        }
    }

    public void openCustomerFormView() {
        CustomerFormController customerFormController = new CustomerFormController(new CustomerFormView());
        customerFormController.showScreen();
    }

    private void setTableModel() {
        customerListView.setTableModel(this.customerTableModel);
    }

    public void updateData() {
        customerTableModel.fireTableDataChanged();
        customerTableModel.setCustomers(this.filteredCustomers);
    }

    public void addEvents() {
        customerListView.adicionarEventoAlteracaoTabela(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (TableModelEvent.UPDATE == e.getType()) {
                    int row = e.getFirstRow();
                    int column = e.getColumn();
                    if (row >= 0 && column >= 0) {
                        CustomerTableModel model = (CustomerTableModel) e.getSource();
                        Customer customer = customerTableModel.getCustomers().get(row);
                        customerDAO.updateCustomer(customer);
                        updateData();
                    }
                }
            }
        });
    }

    public void filterCustomers() {
        int selectedOption = this.customerListView.getSelectdFilter();
        switch (selectedOption) {
            case 0:
                this.filteredCustomers = this.customerDAO.getCustomers();
                break;
            case 1:
                this.filterByName(this.customerListView.getSearchParam());
                break;
            case 2:
                this.filterByCPF(this.customerListView.getSearchParam());
                break;
            case 3:
                this.filterByaddress(this.customerListView.getSearchParam());
                break;
        }
    }

    public void sortCustomers() {
        int selectedSortOption = this.customerListView.getSelectdSortOption();
        switch (selectedSortOption) {
            case 0:
                sortAlphabetically();
                break;
            case 1:
                sortByCreditsAmount();
                break;
        }
    }

    public void filterByName(String searchParam) {
        filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getName().contains(searchParam)) {
                this.filteredCustomers.add(customer);
            }
        }
    }

    public void filterByCPF(String searchParam) {
        filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getCPF().contains(searchParam)) {
                this.filteredCustomers.add(customer);
            }
        }
    }

    public void filterByaddress(String searchParam) {
        this.filteredCustomers = new ArrayList<>();
        for (Customer customer : customerDAO.getCustomers()) {
            if (customer.getaddress().contains(searchParam)) {
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

    public List<Customer> sortAlphabetically() {
        Collections.sort(filteredCustomers);
        return this.filteredCustomers;
    }

    public void addCredits(int creditsAmount, int customerId) {
        Customer customer = customerDAO.retrieveCustomer(customerId);
        customer.addCredits(creditsAmount);
    }
}
