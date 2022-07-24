/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import daos.CustomerDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Customer.AddCreditsView;

/**
 *
 * @author max
 */
public class AddCreditsController {
    
    private AddCreditsView addCreditsView;
    private int customerId;
    private CustomerDAO customerDAO;
    
    public AddCreditsController(AddCreditsView addCreditsView, int customerId){
        this.addCreditsView = addCreditsView;
        this.customerId = customerId;
        this.customerDAO = new CustomerDAO();
        addUpdateCreditsListener();
    }
    
    public void showScreen(){
        this.addCreditsView.setVisible(true);
    }
    
    public void addUpdateCreditsListener() {
        addCreditsView.addUpdateCreditsListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCredits();
            }
        });
    }
    
    public void addCredits(){
        this.customerDAO.addCredits(customerId, this.addCreditsView.getCreditsAmount());
        addCreditsView.showMessage("Créditos adicionados com sucesso");
        addCreditsView.setVisible(false);
    }
    
    
    
}
