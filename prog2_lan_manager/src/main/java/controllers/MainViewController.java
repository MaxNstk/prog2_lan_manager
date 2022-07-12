/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Game.GameFormView;
import views.Game.GameListView;
import views.MainView;

/**
 *
 * @author max
 */
public class MainViewController {
    
    private MainView mainView;
    
    public MainViewController(MainView mainView){
        this.mainView = mainView;
        this.addActions();
    }
    
    public static void openGameFormView(){
      CreateGameController createGameController = new CreateGameController(new GameFormView());
      createGameController.showGameFormView();
    }
    
    public static void openGameListView(){
        GameListView gameListView = new GameListView();
    }
    
    public void addActions(){
        mainView.addOpenCreateGameView(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameFormView();      
            }
        });
    }
}
