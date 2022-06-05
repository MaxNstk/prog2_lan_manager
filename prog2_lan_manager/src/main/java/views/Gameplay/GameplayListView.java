
package views.Gameplay;

import controllers.App;
import controllers.GameplayController;
import javax.swing.table.DefaultTableModel;
import models.Gameplay;
import views.View;


public class GameplayListView extends View {
    
    private GameplayController gameplayController;
    private DefaultTableModel dtmGameplays;
    
    
    private final String[] columnNames = {
        "Cliente", "Jogo", "Dispositivo","Horario de Início", "Horário de término"
    };

    public GameplayListView() {
        initComponents();
        ajustScreenCenter();
        gameplayController = new GameplayController();
        this.createTableModel();
        this.listGameplays();
    }
    
    private void createTableModel(){
        this.dtmGameplays = (DefaultTableModel) this.tbGamplayList.getModel();
        this.dtmGameplays.setColumnIdentifiers(columnNames);
        this.dtmGameplays.setRowCount(0);        
    }
    
    private void listGameplays(){
        this.createTableModel();
        for (Gameplay gameplay : gameplayController.getGameplays(this.cbFilterGameplay.getSelectedIndex())){
            Object[] listData = {gameplay.getCustomer(), gameplay.getGame(),
            gameplay.getDevice(),gameplay.getFormatedStartDateTime(), gameplay.getFormatedEndDateTime()};
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
        jLabel1 = new javax.swing.JLabel();
        cbFilterGameplay = new javax.swing.JComboBox<>();

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

        btUpdate.setText("Pesquisar");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar por:");

        cbFilterGameplay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em andamento", "Todos" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFilterGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCreateGameplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFilterGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCreateGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateGameplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateGameplayActionPerformed
        App.openGamePlayFormView();
    }//GEN-LAST:event_btCreateGameplayActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        gameplayController.updateCurrentGameplays();
            this.listGameplays();
    }//GEN-LAST:event_btUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateGameplay;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<String> cbFilterGameplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGamplayList;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setTitleScreen() {
       setTitle("Consulta de Jogatina");
    }

}
