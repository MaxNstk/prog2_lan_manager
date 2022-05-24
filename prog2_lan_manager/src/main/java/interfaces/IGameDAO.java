/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Game;

/**
 *
 * @author João Eduardo
 */
public interface IGameDAO {
    
    public void createGame(Game game);
    public Game retrieveGame(int id);
    public List<Game> getGames();
    
}
