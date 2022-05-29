/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.Game;

import controllers.GameController;
import javax.swing.table.DefaultTableModel;
import models.Game;

/**
 *
 * @author João Eduardo
 */
public class GameListView extends javax.swing.JPanel {

    private GameController gameController;
    private DefaultTableModel dtmGames;

    private final String[] columnNames = {
        "Id", "Nome", "Dispositivo", "Categoria", "Descrição"
    };

    public GameListView() {
        initComponents();
        gameController = new GameController();
        this.createTableModel();
    }

    private void createTableModel() {
        this.dtmGames = (DefaultTableModel) this.tbGameList.getModel();
        this.dtmGames.setColumnIdentifiers(columnNames);
        this.dtmGames.setRowCount(0);
    }

    public void ListGames() {
        this.createTableModel();
        for (Game game : gameController.getFilteredGames()) {
            Object[] listData = {game.getId(), game.getName(), game.getDevice(), game.getCategory(), game.getDescription()};
            dtmGames.addRow(listData);
        }
    }

    public void getFilteredGames() {
        switch (this.cbFilterOptions.getSelectedIndex()) {
            case 0:
                this.gameController.getAll();
                break;
            case 1:
                this.gameController.filterByName(this.tfGameName.getName());
                break;
            case 2:
                this.gameController.filterByDevice(null);
                break;
            case 3:
                this.gameController.filterByCategory(null);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfGameName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbFilterOptions = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btCreateGame = new javax.swing.JButton();
        btFilterGame = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbSortOptions = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGameList = new javax.swing.JTable();
        btUpdateGame = new javax.swing.JButton();

        jLabel1.setText("Filtrar por:");

        cbFilterOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome", "Dispositivo", "Categoria" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Jogos");

        btCreateGame.setText("Cadastrar");
        btCreateGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateGameActionPerformed(evt);
            }
        });

        btFilterGame.setText("Pesquisar");
        btFilterGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFilterGameActionPerformed(evt);
            }
        });

        jLabel2.setText("Ordenar por:");

        cbSortOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordem alfabética", "Quantidade de créditos" }));

        tbGameList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbGameList);

        btUpdateGame.setText("Editar");
        btUpdateGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btUpdateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbSortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbFilterOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfGameName)
                                        .addGap(18, 18, 18)
                                        .addComponent(btFilterGame)))))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCreateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCreateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbFilterOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btFilterGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfGameName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbSortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btUpdateGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateGameActionPerformed
        // App.openGameCreateView();
    }//GEN-LAST:event_btCreateGameActionPerformed

    private void btFilterGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFilterGameActionPerformed
        this.getFilteredGames();
        this.ListGames();
    }//GEN-LAST:event_btFilterGameActionPerformed

    private void btUpdateGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateGameActionPerformed
        int gameId = (Integer) this.dtmGames.getValueAt(this.tbGameList.getSelectedRow(), 0);
        //gameController.updateGame(gameId);
    }//GEN-LAST:event_btUpdateGameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateGame;
    private javax.swing.JButton btFilterGame;
    private javax.swing.JButton btUpdateGame;
    private javax.swing.JComboBox<String> cbFilterOptions;
    private javax.swing.JComboBox<String> cbSortOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGameList;
    private javax.swing.JTextField tfGameName;
    // End of variables declaration//GEN-END:variables
}
