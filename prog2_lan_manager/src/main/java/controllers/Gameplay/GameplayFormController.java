/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Gameplay;

import views.Gameplay.GameplayFormView;

/**
 *
 * @author max
 */
public class GameplayFormController {
    
    private GameplayFormView gameplayFormView;

    public GameplayFormController(GameplayFormView gameplayFormView) {
        this.gameplayFormView = gameplayFormView;
    }

    public void showScreen(){
        this.gameplayFormView.setVisible(true);
}
    
}
