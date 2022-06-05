
package views.Gameplay;

import Exceptions.EmptyCbException;
import Exceptions.InsufficientCreditsException;
import controllers.CustomerController;
import controllers.DeviceController;
import controllers.GameController;
import controllers.GameplayController;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import models.Customer;
import models.Device;
import models.Game;

/**
 *
 * @author max
 */
public class GameplayFormView extends views.View {
    
    private CustomerController customerController;
    private DeviceController deviceController;
    private GameController gameController;
    private GameplayController gameplayController = new GameplayController();
    
    public GameplayFormView(){
        initComponents();
        ajustScreenCenter();
        this.setUpInitialData();
    }

    private void setUpInitialData() {
        this.setUpConstrollers();
        this.fillCustomersCb();
        this.fillDeviceCb();
        this.fillGamesCb();
    }

    private void setUpConstrollers() {
        this.customerController = new CustomerController();
        this.gameController = new GameController();
        this.deviceController = new DeviceController();
    }
    
    private void fillDeviceCb() {
        this.cbDevice.removeAllItems();
        for (Device device : deviceController.getFilteredDevices()) {
            cbDevice.addItem(device);
        }
        cbDevice.setSelectedItem(null);
    }
    
    private void fillCustomersCb() {
        this.cbCustomer.removeAllItems();
        for (Customer customer : customerController.getFilteredCustomers()) {
            cbCustomer.addItem(customer);
        }
        cbCustomer.setSelectedItem(null);
    }
    
    private void fillGamesCb() {
        this.cbGame.removeAllItems();
        for (Game game : gameController.getFilteredGames()) {
            cbGame.addItem(game);
        }
        cbGame.setSelectedItem(null);
    }
    public void validateCbs() throws EmptyCbException{
        if (this.cbCustomer.getSelectedIndex() == -1)
           throw new EmptyCbException("cliente");
        else if (this.cbGame.getSelectedIndex() == -1)
           throw new EmptyCbException("jogo");
        else if (this.cbDevice.getSelectedIndex() == -1)
           throw new EmptyCbException("dispositivo");
    }   
    
    public Map<String, Object> getGameplayInfo(){
        Map<String, Object> gameplayData = new HashMap();
        gameplayData.put("customer", this.cbCustomer.getItemAt(this.cbCustomer.getSelectedIndex()));
        gameplayData.put("game", this.cbGame.getItemAt(this.cbCustomer.getSelectedIndex()));
        gameplayData.put("device", this.cbDevice.getItemAt(this.cbDevice.getSelectedIndex()));
        gameplayData.put("timePlaying", this.cbPlayingTime.getItemAt(this.cbPlayingTime.getSelectedIndex()));
        return gameplayData;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbCustomer = new javax.swing.JComboBox<>();
        cbGame = new javax.swing.JComboBox<>();
        cbDevice = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btGameplayCreate = new javax.swing.JButton();
        cbPlayingTime = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cliente");

        jLabel2.setText("Jogo");

        jLabel3.setText("Dispositivo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setText("Agendamento");

        jLabel5.setText("Quantidade de horas");

        btGameplayCreate.setText("Iniciar Jogatina!");
        btGameplayCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGameplayCreateActionPerformed(evt);
            }
        });

        cbPlayingTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(537, 537, 537))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbGame, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPlayingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbDevice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addComponent(btGameplayCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(426, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbGame, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPlayingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btGameplayCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGameplayCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGameplayCreateActionPerformed
        try {
            this.validateCbs();
            gameplayController.createGameplay(this.getGameplayInfo());
            this.setUpInitialData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btGameplayCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGameplayCreate;
    private javax.swing.JComboBox<Customer> cbCustomer;
    private javax.swing.JComboBox<Device> cbDevice;
    private javax.swing.JComboBox<Game> cbGame;
    private javax.swing.JComboBox<String> cbPlayingTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setTitleScreen() {
        setTitle("Manutenção de Jogatina");
    }
}
