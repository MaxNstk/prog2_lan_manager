/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Gameplay;

import daos.GameplayDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.tables.GameplayTableModel;
import views.Gameplay.GameplayFormView;
import views.Gameplay.GameplayListView;


public class GameplayListController {
    
    private GameplayListView gameplayListView;
    private GameplayTableModel gameplayTableModel;
    private GameplayDAO gameplayDAO;

    public GameplayListController(GameplayListView gameplayListView) {
        this.gameplayListView = gameplayListView;
        this.gameplayDAO = new GameplayDAO();
        this.gameplayTableModel = new GameplayTableModel(this.gameplayDAO.getGameplays());
        setTableModel();
        addOpenCreateGameplayViewButton();
    }
    
    private void setTableModel(){
        gameplayListView.setTableModel(this.gameplayTableModel);
    }
    
    public void showScreen(){
        gameplayListView.setVisible(true);
    }
    
    public void addOpenCreateGameplayViewButton(){
        gameplayListView.addCreateGameplayListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameplayFormView();               
            }
        });
    }
    
    public void openGameplayFormView(){
      GameplayFormController createGameplayController = new GameplayFormController(new GameplayFormView());
      createGameplayController.showScreen();
    }
    
}
