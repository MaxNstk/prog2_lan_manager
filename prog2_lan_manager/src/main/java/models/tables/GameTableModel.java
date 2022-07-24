/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.tables;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.Game;


public class GameTableModel extends AbstractTableModel{
   
    private List<Game> games;
    
    private final String[] columnNames = {"ID","Nome", "Categoria","Descrição"};
    private final int COLUNA_ID = 0;
    private final int COLUNA_NOME = 1;
    private final int COLUNA_CATEGORIA = 2;
    private final int COLUNA_DESCRICAO = 3;
    
    public GameTableModel(List<Game> games) {
        this.games = games;
    }
    
    @Override
    public int getRowCount() {
        return games.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Game game = this.games.get(rowIndex);
        String value = null;
        switch(columnIndex){
            case COLUNA_ID:
                value = Integer.toString(game.getId());
                break;
            case COLUNA_NOME:
                value = game.getName();
                break;
            case COLUNA_CATEGORIA:
                value = game.getCategory().toString();
                break;
            case COLUNA_DESCRICAO:
                value = game.getDescription();
                break;
        }
        return value;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == COLUNA_CATEGORIA || columnIndex == COLUNA_ID)
            return false;
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    	Game game = this.games.get(rowIndex);
        switch (columnIndex) {
            case COLUNA_NOME:
                game.setName((String) aValue);
                break;
            case COLUNA_DESCRICAO:
                game.setDescription((String) aValue);
                break;
        }
        fireTableDataChanged();
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void setGames(List<Game> games) {
        this.games.clear();
        this.games.addAll(games);
    }

    public List<Game> getGames() {
        return games;
    }
    
}
