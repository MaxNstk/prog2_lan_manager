/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import daos.GameDAO;
import java.util.ArrayList;
import java.util.List;
import models.Game;

/**
 *
 * @author João Eduardo
 */
public class GameController {
    
    private List <Game> filteredGames;
    
    GameDAO gameDAO = new GameDAO();
    
    public void getAll(){
        this.filteredGames = new ArrayList<>();
        this.filteredGames = gameDAO.getGames();
    }
    
    public void filterByName (String searchParam){
        filteredGames = new ArrayList<>();
        for (Game game : gameDAO.getGames()){
            if (game.getName().contains(searchParam)){
                this.filteredGames.add(game);
            }
        }
    }
}
