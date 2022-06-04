/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Exceptions.InsufficientCreditsException;
import daos.GameplayDAO;
import java.util.List;
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
    
    public void createGampeplay(Gameplay gameplay) throws InsufficientCreditsException{
        
    } 
    
}
