/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package views.Gameplay;

import controllers.App;
import controllers.GameplayController;
import javax.swing.table.DefaultTableModel;
import models.Gameplay;


public class GameplayListView extends javax.swing.JFrame {
    
    private GameplayController gameplayController;
    private DefaultTableModel dtmGameplays;
    
    
    private final String[] columnNames = {
        "Cliente", "Jogo", "Dispositivo", "Horário de término"
    };

    public GameplayListView() {
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
        btCreateGameplay = new javax.swing.JButton();

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

        btCreateGameplay.setText("Adicionar Jogatina");
        btCreateGameplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateGameplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCreateGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(btCreateGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateGameplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateGameplayActionPerformed
        App.openGamePlayFormView();
    }//GEN-LAST:event_btCreateGameplayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateGameplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGamplayList;
    // End of variables declaration//GEN-END:variables

}