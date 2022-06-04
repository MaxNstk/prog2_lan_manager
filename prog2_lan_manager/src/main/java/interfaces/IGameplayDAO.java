/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Gameplay;

/**
 *
 * @author max
 */
public interface IGameplayDAO {
    
    public void createGameplay(Gameplay gameplay);
    public Gameplay retrieveGameplay(int id);
    public List<Gameplay> getGameplays();
    public List<Gameplay> getActiveGamplays();
}
