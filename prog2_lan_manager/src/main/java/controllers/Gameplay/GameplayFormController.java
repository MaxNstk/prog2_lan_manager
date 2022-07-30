/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Gameplay;

import daos.CustomerDAO;
import daos.DeviceDAO;
import daos.GameDAO;
import daos.GameplayDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Gameplay;
import views.Gameplay.GameplayFormView;

/**
 *
 * @author max
 */

public class GameplayFormController {
    
    private GameplayFormView gameplayFormView;
    private GameplayDAO gameplayDAO;
    private DeviceDAO deviceDAO;
    private GameDAO gameDAO;
    private CustomerDAO customerDAO;
    private Gameplay gameplayModel;

    public GameplayFormController(GameplayFormView gameplayFormView) {
        this.gameplayFormView = gameplayFormView;
        gameplayDAO = new GameplayDAO();
        gameDAO = new GameDAO();
        customerDAO = new CustomerDAO();
        deviceDAO = new DeviceDAO();
        fillCbs();
    }

    public void showScreen(){
        this.gameplayFormView.setVisible(true);
    }
    
    public void addOpenCreateCustomerListener() {
        gameplayFormView.addCreateGameplay(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createGameplay();
            }
        });
    }
    
    public void createGameplay(){
    gameplayModel = new Gameplay(gameplayFormView.getCustomer(), gameplayFormView.getGame(),
            gameplayFormView.getDevice(), gameplayFormView.getTimePlaiyng());    
    gameplayDAO.createGameplay(gameplayModel);
    }
    
    public void fillCbs(){
        fillCustomerCb();
        fillDeviceCb();
        fillGameCb();
    }
   
    public void fillDeviceCb(){
        this.gameplayFormView.addDevices(deviceDAO.getDevices());
    }  
    
    public void fillCustomerCb(){
        this.gameplayFormView.addCustomers(customerDAO.getCustomers());
    }
    
    public void fillGameCb(){
        this.gameplayFormView.addGames(gameDAO.getGames());
    }
    
    
}
