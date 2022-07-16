/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Gameplay;

import views.Gameplay.GameplayListView;

/**
 *
 * @author max
 */
public class GameplayListController {
    
    private GameplayListView gameplayListView;

    public GameplayListController(GameplayListView gameplayListView) {
        this.gameplayListView = gameplayListView;
    }
    
    public void showScreen(){
        this.gameplayListView.setVisible(true);
    }
    
}
