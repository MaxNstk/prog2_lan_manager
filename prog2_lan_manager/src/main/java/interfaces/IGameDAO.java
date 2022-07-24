/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Game;

/**
 *
 * @author JEKrieger
 */
public interface IGameDAO {
    
    public void createGame(Game game);
    public Game retrieveGame(int id);
    public List<Game> getGames();
    public void updateGame(Game game);
    public void deleteGame(int id);
    
}
