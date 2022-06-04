/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import interfaces.IGameplayDAO;
import java.util.ArrayList;
import java.util.List;
import models.Gameplay;

/**
 *
 * @author max
 */
public class GameplayDAO implements IGameplayDAO{
    
    private static List<Gameplay> gameplays = new ArrayList();

    @Override
    public void createGame(Gameplay game) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Gameplay retrieveGameplay(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Gameplay> getGameplays() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Gameplay> getActiveGamplays() {
        List<Gameplay> activeGamplays = new ArrayList();
        for(Gameplay gameplay : gameplays){
            if (gameplay.isBeingPlayed())
               activeGamplays.add(gameplay);
        }
        return activeGamplays;
    }
    
}
