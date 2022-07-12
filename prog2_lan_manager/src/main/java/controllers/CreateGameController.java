/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import daos.GameDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Game;
import views.Game.GameFormView;

/**
 *
 * @author max
 */
public class CreateGameController {
    
    private GameFormView gameFormView;
    private Game gameModel;
    private GameDAO gameDAO;

    public CreateGameController(GameFormView gameFormView) {
        this.gameFormView = gameFormView;
        this.gameDAO = new GameDAO();
        this.addActions();
    }
    
    public void addActions(){
        gameFormView.addCreateGameButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createGame();      
            }
        });
    }
    
    public void exibir(){
        gameFormView.showScreen();
    }
    
    public void createGame(){
        gameModel = new Game(gameFormView.getName(), gameFormView.getDescription(), gameFormView.getCategory());
        if(validateGame()){
            gameDAO.createGame(gameModel);
            gameFormView.showMessage("Jogo salvo com sucesso!. " + gameModel);
            gameFormView.clearScreen();      
        }
        else {
            gameFormView.showMessage("Preencha todos os campos!");
        }
    }
    
    public boolean validateGame(){
        if (this.gameModel.getName().equals(""))
            return false;
        if (this.gameModel.getDescription().equals(""))
            return false;
        if (this.gameModel.getCategory() == null)
            return false;
        return true;
    }
    
    public void showGameFormView(){
        gameFormView.showScreen();
    }

    public GameFormView getGameFormView() {
        return this.gameFormView;
    }    
}
