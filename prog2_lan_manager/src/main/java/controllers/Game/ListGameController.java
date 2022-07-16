/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Game;

import controllers.CreateGameController;
import controllers.MainViewController;
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
public class ListGameController {
    
    private GameListView gameListView;
    private GameTableModel gameTableModel;
    private GameDAO gameDAO;

    public ListGameController(GameListView gameListView, GameTableModel gameTableModel) {
        this.gameListView = gameListView;
        this.gameTableModel = gameTableModel;
        this.gameDAO = new GameDAO();
        
        setTableModel();
        addOpenCreateGameViewButton();
        adicionarEventos();    
    }
    private void setTableModel(){
        gameListView.setTableModel(this.gameTableModel);
    }
    
    public void showScreen(){
        gameListView.showScreen();
    }
    
    public void atualizarDados(){
        gameTableModel.fireTableDataChanged();
        gameTableModel.setGames(this.gameDAO.getGames());
    }
    
    public void addOpenCreateGameViewButton(){
        gameListView.addOpenCreateGameViewButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameFormView();               
            }
        });
    }
    
    public void openGameFormView(){
      CreateGameController createGameController = new CreateGameController(new GameFormView());
      createGameController.showGameFormView();
    }
   
    
    public void adicionarEventos(){
        gameListView.adicionarEventoAlteracaoTabela(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e){
                if (TableModelEvent.UPDATE == e.getType()) {
                   int row = e.getFirstRow();
                   int column = e.getColumn();
                   if(row >=0 && column >=0){
                        GameTableModel model = (GameTableModel)e.getSource();
                        String CPF = (String)model.getValueAt(row, 0);
                        Game game = gameTableModel.getGames().get(row);
                        // todo DAO
                        //PacienteDAO.atualizarPaciente(paciente);
                        atualizarDados();
                   }
                 }
            }
        });
    }
    
}
