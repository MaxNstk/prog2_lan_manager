/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import controllers.Gameplay.GameplayListController;
import controllers.Customer.CustomerListController;
import controllers.Device.DeviceListController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;
import views.Device.DeviceListView;
import views.Game.GameFormView;
import views.Game.GameListView;
import views.Gameplay.GameplayListView;
import views.MainView;

/**
 *
 * @author max
 */
public class MainViewController {
    
    private MainView mainView;
    
    public MainViewController(MainView mainView){
        this.mainView = mainView;
        this.addActions();
    }
     
    public void openGameListView(){
        GameListView gameListView = new GameListView();
        gameListView.showScreen();
    }
    
    public void addGameListViewListener(){
                mainView.addOpenGameListViewAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameListView();      
            }
        });
    }  
    
    public void openCustomerListView(){
        CustomerListController customerListController = new CustomerListController(new CustomerListView());
        customerListController.showScreen();
    }
    
    public void addCustomerListViewListener(){
                mainView.addOpenCustomerListViewAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCustomerListView();      
            }
        });
    }
    
    public void openDeviceListView(){
        DeviceListController deviceListController = new DeviceListController(new DeviceListView());
        deviceListController.showScreen();
    }
    
    public void addDeviceListViewListener(){
                mainView.addOpenDeviceListViewAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDeviceListView();      
            }
        });
    }
    
    public void openGameplayListView(){
        GameplayListController gameplayListController = new GameplayListController(new GameplayListView());
        gameplayListController.showScreen();
    }
    
    public void addGameplayListViewListener(){
                mainView.addOpenDeviceListViewAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameplayListView();      
            }
        });
    }
 
    public void showScreen(){
        this.mainView.setVisible(true);
    }
    
    public void addActions(){
        addGameListViewListener();
        addCustomerListViewListener();
        addDeviceListViewListener();
        addGameplayListViewListener();
    }
}
