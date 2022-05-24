/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import interfaces.IGameDAO;
import java.util.ArrayList;
import java.util.List;
import models.Game;

/**
 *
 * @author João Eduardo
 */
public class GameDAO implements IGameDAO{
    
    private static List<Game> games = new ArrayList<>();
    
    @Override
    public void createGame(Game game) {
        games.add(game);
    }

    @Override
    public Game retrieveGame(int id) {
        for(Game game : games){
            if(game.getId() == id){
                return game;
            }
        }
        return games.get(-1);
    }

    @Override
    public List<Game> getGames() {
        return games;
    }
    
}
