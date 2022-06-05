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
    public void createGameplay(Gameplay gameplay) {
        gameplays.add(gameplay);
    }

    @Override
    public List<Gameplay> getGameplays() {
        return gameplays;
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
