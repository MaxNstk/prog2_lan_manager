/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Exceptions.InsufficientCreditsException;
import daos.GameplayDAO;
import java.util.List;
import java.util.Map;
import models.Customer;
import models.Device;
import models.Game;
import models.Gameplay;

/**
 *
 * @author max
 */
public class GameplayController {
    
    GameplayDAO gameplayDAO = new GameplayDAO();
        
    public List<Gameplay> getActiveGameplays(){
        return gameplayDAO.getActiveGamplays();
    }
    
    public void createGampeplay(Map<String, Object> customerData) throws InsufficientCreditsException{
        Customer customer = (Customer) customerData.get("customer");
        Device device = (Device) customerData.get("customer");
        Game game = (Game) customerData.get("customer");
        int timePlaying = (int) customerData.get("playingTime");  
        gameplayDAO.createGameplay(new Gameplay(customer, game, device, timePlaying));
    } 
    
}
