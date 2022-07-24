/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Game;

import daos.GameDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import models.Game;
import models.tables.GameTableModel;
import views.Game.GameFormView;
import views.Game.GameListView;

/**
 *
 * @author max
 */
public class GameListController {
    
    private GameListView gameListView;
    private GameTableModel gameTableModel;
    private GameDAO gameDAO;

    public GameListController(GameListView gameListView) {
        this.gameListView = gameListView;
        this.gameDAO = new GameDAO();
        this.gameTableModel = new GameTableModel(this.gameDAO.getGames());
        setTableModel();
        addOpenCreateGameViewButton();
        addDeleteGameListener();
        addEvents();    
    }
    private void setTableModel(){
        gameListView.setTableModel(this.gameTableModel);
    }
    
    public void showScreen(){
        gameListView.showScreen();
    }
    
    public void addDeleteGameListener() {
        gameListView.addDeleteGame(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteGame();
            }
        });
    }
        
    public void deleteGame(){
        if (this.gameListView.getGameId() != -1){
            gameDAO.deleteGame(this.gameListView.getGameId());
            updateData();
        }
        
    }
    
    public void updateData(){
        gameTableModel.fireTableDataChanged();
        gameTableModel.setGames(this.gameDAO.getGames());
    }
    
    public void addOpenCreateGameViewButton(){
        gameListView.addOpenGameCreateViewButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameFormView();               
            }
        });
    }
    
    public void openGameFormView(){
      GameFormController createGameController = new GameFormController(new GameFormView());
      createGameController.showGameFormView();
    }
       
    public void addEvents(){
        gameListView.adicionarEventoAlteracaoTabela(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e){
                if (TableModelEvent.UPDATE == e.getType()) {
                   int row = e.getFirstRow();
                   int column = e.getColumn();
                   if(row >=0 && column >=0){
                        GameTableModel model = (GameTableModel)e.getSource();
                        Game game = gameTableModel.getGames().get(row);
                        gameDAO.updateGame(game);
                        updateData();
                   }
                 }
            }
        });
    }
    
}
