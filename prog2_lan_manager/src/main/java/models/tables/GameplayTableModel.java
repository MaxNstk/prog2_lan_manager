/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.tables;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.Gameplay;


public class GameplayTableModel extends AbstractTableModel{
   
    private List<Gameplay> gameplays;
    
    private final String[] columnNames = {"ID","Cliente", "Dispositivo","Jogo","Data de Início","Data final","Jogando"};
    private final int COLUNA_ID = 0;
    private final int COLUNA_CLIENTE = 1;
    private final int COLUNA_DISPOSITIVO = 2;
    private final int COLUNA_JOGO = 3;
    private final int COLUNA_INICIO = 4;
    private final int COLUNA_FIM = 5;
    private final int COLUNA_JOGANDO = 6;
    
    public GameplayTableModel(List<Gameplay> gameplays) {
        this.gameplays = gameplays;
    }
    
    @Override
    public int getRowCount() {
        return gameplays.size();
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
        Gameplay gameplay = this.gameplays.get(rowIndex);
        String value = null;
        switch(columnIndex){
            case COLUNA_ID:
                value = Integer.toString(gameplay.getId());
                break;
            case COLUNA_CLIENTE:
                value = gameplay.getCustomer().toString();
                break;
            case COLUNA_DISPOSITIVO:
                value = gameplay.getDevice().toString();
                break;
            case COLUNA_JOGO:
                value = gameplay.getGame().toString();
                break;
            case COLUNA_INICIO:
                value = gameplay.getStartDateTime().toString();
                break;
            case COLUNA_FIM:
                value = gameplay.getEndDateTime().toString();
                break;
            case COLUNA_JOGANDO:
                if (gameplay.isBeingPlayed())
                    value = "Sim";
                else
                    value = "Não";
                break;
        }
        return value;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {}

    public void setGameplays(List<Gameplay> gameplays) {
        this.gameplays.clear();
        this.gameplays.addAll(gameplays);
    }

    public List<Gameplay> getGameplays() {
        return gameplays;
    }
    
}
