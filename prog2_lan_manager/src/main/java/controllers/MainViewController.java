/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import controllers.Gameplay.GameplayListController;
import controllers.Customer.CustomerListController;
import controllers.Device.DeviceListController;
import controllers.Game.GameListController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Customer.CustomerListView;
import views.Device.DeviceListView;
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
        GameListController gameListController = new GameListController(new GameListView());
        gameListController.showScreen();
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
                mainView.addOpenGameplayViewAction(new ActionListener() {
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
