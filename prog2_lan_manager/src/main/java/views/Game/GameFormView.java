/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.Game;

import daos.CategoryDAO;
import daos.GameDAO;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import models.Category;
import models.Device;
import models.Game;

/**
 *
 * @author João Eduardo
 */
public class GameFormView extends javax.swing.JFrame {

    private Game game;

    public GameFormView(Game game) {
        initComponents();
        this.setValuesComboBoxCategories();
        if (game != null) {
            this.game = game;
            this.setGameInfo(game);
        }
    }

    private void setValuesComboBoxCategories() {
        CategoryDAO categoryDAO = new CategoryDAO();
        for (Category category : categoryDAO.getCategories()) {
            cbCategory.addItem(category);
        }
    }

    public void setGameInfo(Game game) {
        tfName.setText(game.getName());
        cbCategory.addItem(game.getCategory());
        taDescription.setText(game.getDescription());
    }

    public Game getGameInfo() {
        String name = tfName.getText();
        String description = taDescription.getText();
        Category category = (Category) cbCategory.getSelectedItem();
       // Device device = (Device) cbDevice.getSelectedItem();
        return new Game(name, description, category);
    }

    public void createGame() {
        GameDAO gameDAO = new GameDAO();
        gameDAO.createGame(this.getGameInfo());
    }

    public void updateGame() {
        this.game.setName(tfName.getText());
        this.game.setCategory((Category) cbCategory.getSelectedItem());
        //this.game.setDevice((Device) cbDevice.getSelectedItem());
        this.game.setDescription(taDescription.getText());
    }

    public void clearFields() {
        tfName.setText("");
        cbCategory.getItemAt(-1);
        //cbDevice.getItemAt(-1);
        taDescription.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        btCreateGameActionPerformed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Categoria:");

        jLabel4.setText("Descrição:");

        taDescription.setColumns(20);
        taDescription.setRows(5);
        jScrollPane1.setViewportView(taDescription);

        btCreateGameActionPerformed.setText("Cadastrar");
        btCreateGameActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateGameActionPerformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCreateGameActionPerformed)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addComponent(cbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfName)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btCreateGameActionPerformed)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateGameActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateGameActionPerformedActionPerformed
        if (this.game != null)
            this.updateGame();
        else
            this.createGame();

        this.clearFields();
        JOptionPane.showMessageDialog(null, "Jogo cadastrado com sucesso");
    }//GEN-LAST:event_btCreateGameActionPerformedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateGameActionPerformed;
    private javax.swing.JComboBox<Category> cbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
