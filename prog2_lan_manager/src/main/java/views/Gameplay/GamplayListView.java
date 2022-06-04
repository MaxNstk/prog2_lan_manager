/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package views.Gameplay;

import controllers.GameplayController;
import javax.swing.table.DefaultTableModel;
import models.Gameplay;


public class GamplayListView extends javax.swing.JFrame {
    
    private GameplayController gameplayController;
    private DefaultTableModel dtmGameplays;
    
    
    private final String[] columnNames = {
        "Cliente", "Jogo", "Dispositivo", "Horário de término"
    };

    public GamplayListView() {
        initComponents();
        gameplayController = new GameplayController();
        this.createTableModel();
    }
    
    private void createTableModel(){
        this.dtmGameplays = (DefaultTableModel) this.tbGamplayList.getModel();
        this.dtmGameplays.setColumnIdentifiers(columnNames);
        this.dtmGameplays.setRowCount(0);        
    }
    
    private void listActiveGameplays(){
        this.createTableModel();
        for (Gameplay gameplay : gameplayController.getActiveGameplays()){
            Object[] listData = {gameplay.getCustomer(), gameplay.getGame(),
            gameplay.getDevice(), gameplay.getEndDateTime()};
            this.dtmGameplays.addRow(listData);
            }           
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGamplayList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbGamplayList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbGamplayList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGamplayList;
    // End of variables declaration//GEN-END:variables

}
