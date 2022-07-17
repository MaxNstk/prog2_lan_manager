/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Game;

import Exceptions.EmptyFieldException;
import daos.CategoryDAO;
import daos.GameDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Game;
import views.Game.GameFormView;

/**
 *
 * @author max
 */
public class GameFormController {

    private GameFormView gameFormView;
    private Game gameModel;
    private GameDAO gameDAO;
    private CategoryDAO categoryDAO;

    public GameFormController(GameFormView gameFormView) {
        this.gameFormView = gameFormView;
        this.gameDAO = new GameDAO();
        this.categoryDAO = new CategoryDAO();
        this.addActions();
        fillCategoryCb();
    }

    public void addActions() {
        gameFormView.addCreateGameButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createGame();
            }
        });
    }
    
    public void fillCategoryCb(){
        this.gameFormView.addCategories(categoryDAO.getCategories());
    }

    public void exibir() {
        gameFormView.showScreen();
    }

    public void createGame() {
        try {
            gameModel = new Game(gameFormView.getName(), gameFormView.getDescription(), gameFormView.getCategory());
            validateGame();
            gameDAO.createGame(gameModel);
            gameFormView.showMessage("Jogo salvo com sucesso!. " + gameModel);
            gameFormView.clearScreen();
        } catch (EmptyFieldException e) {
            gameFormView.showMessage(e.getMessage());
        }
    }

    public void validateGame() throws EmptyFieldException {
        if ((this.gameModel.getName().equals(""))
            || (this.gameModel.getDescription().equals(""))
            || (this.gameModel.getCategory() == null)) {
                throw new EmptyFieldException();
        }
    }
    
    public void showGameFormView() {
        gameFormView.showScreen();
    }

    public GameFormView getGameFormView() {
        return this.gameFormView;
    }
}
