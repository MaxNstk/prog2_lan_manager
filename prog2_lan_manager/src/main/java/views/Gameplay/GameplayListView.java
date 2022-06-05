
package views.Gameplay;

import controllers.App;
import controllers.CustomerController;
import controllers.GameplayController;
import javax.swing.table.DefaultTableModel;
import models.Gameplay;
import views.View;


public class GameplayListView extends View {
    
    private GameplayController gameplayController;
    private DefaultTableModel dtmGameplays;
    
    
    private final String[] columnNames = {
        "Cliente", "Jogo", "Dispositivo", "Horário de término"
    };

    public GameplayListView() {
        initComponents();
        ajustScreenCenter();
        gameplayController = new GameplayController();
        this.createTableModel();
        this.listActiveGameplays();
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
        btUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        btUpdate.setText("Atualizar");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCreateGameplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btCreateGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateGameplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateGameplayActionPerformed
        App.openGamePlayFormView();
    }//GEN-LAST:event_btCreateGameplayActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        this.listActiveGameplays();
        gameplayController.updateCurrentGameplays();
    }//GEN-LAST:event_btUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateGameplay;
    private javax.swing.JButton btUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGamplayList;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setTitleScreen() {
       setTitle("Consulta de Jogatina");
    }

}
