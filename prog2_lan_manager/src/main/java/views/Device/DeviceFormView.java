
package views.Device;

import Exceptions.EmptyAttribute;
import Exceptions.EmptyFieldException;
import daos.DeviceDAO;
import javax.swing.JOptionPane;
import models.Computer;
import models.Console;
import models.Device;

/**
 *
 * @author petrix
 */
public class DeviceFormView extends views.View {
    
    private Device device;

    /**
     * Creates new form DeviceFormView
     */
    public DeviceFormView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTypeDevice = new javax.swing.ButtonGroup();
        btCreateCustomer1 = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbActive = new javax.swing.JLabel();
        cbActive = new javax.swing.JCheckBox();
        rbComputer = new javax.swing.JRadioButton();
        rbConsole = new javax.swing.JRadioButton();
        lbName1 = new javax.swing.JLabel();
        lbSpecs = new javax.swing.JLabel();
        tfSpecs = new javax.swing.JTextField();
        btCreateDevice = new javax.swing.JButton();
        tfModel = new javax.swing.JTextField();
        lbModel = new javax.swing.JLabel();

        btCreateCustomer1.setText("Cadastrar");
        btCreateCustomer1.setName("btCreateCustomer"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbName.setText("Tipo de dispositivo:");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        lbActive.setText("Ativo:");

        cbActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActiveActionPerformed(evt);
            }
        });

        bgTypeDevice.add(rbComputer);
        rbComputer.setText("Computador");
        rbComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbComputerActionPerformed(evt);
            }
        });

        bgTypeDevice.add(rbConsole);
        rbConsole.setText("Console");
        rbConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsoleActionPerformed(evt);
            }
        });

        lbName1.setText("Nome:");

        lbSpecs.setText("Específicações");

        tfSpecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSpecsActionPerformed(evt);
            }
        });

        btCreateDevice.setText("Cadastrar");
        btCreateDevice.setName("btCreateDevice"); // NOI18N
        btCreateDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateDeviceActionPerformed(evt);
            }
        });

        tfModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfModelActionPerformed(evt);
            }
        });

        lbModel.setText("Modelo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbComputer)
                        .addGap(18, 18, 18)
                        .addComponent(rbConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbActive, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbActive))
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSpecs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSpecs, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCreateDevice)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbActive)
                    .addComponent(cbActive))
                .addGap(18, 18, 18)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbComputer)
                    .addComponent(rbConsole))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSpecs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSpecs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbModel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(btCreateDevice)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void cbActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActiveActionPerformed

    private void rbComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbComputerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbComputerActionPerformed

    private void rbConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbConsoleActionPerformed

    private void tfSpecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSpecsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSpecsActionPerformed

    private void btCreateDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateDeviceActionPerformed
        setVisible(false);
        this.createDevice();
        this.clearFields();
    }//GEN-LAST:event_btCreateDeviceActionPerformed

    private void tfModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfModelActionPerformed

    public void updateDevice() {
        
    }
    
    public void createDevice() {
        try {
            DeviceDAO deviceDAO = new DeviceDAO();
            deviceDAO.createDevice(this.getDeviceInfo());
            JOptionPane.showMessageDialog(null, "Dispositivo cadastrado com sucesso.");
        } catch (EmptyAttribute EmptyAttribute) {
            JOptionPane.showMessageDialog(null, EmptyAttribute.getMessage());
        }
    }
    
    public Device getDeviceInfo() throws EmptyAttribute  {
        Device dev = rbComputer.isSelected() ? getNewComputer() : getNewConsole();
        dev.validateAttributes();
        return dev;
    }
    
    private Console getNewConsole() {
        String name = tfName.getText();
        /**
         * Alterar p pegar do checkbox
         */
        boolean active = true;
        String model = tfModel.getText();
        return new Console(name, model, active);
    }
    
    private Computer getNewComputer() {
        String name = tfName.getText();
        /**
         * Alterar p pegar do checkbox
         */
        boolean active = true;
        String specs = tfSpecs.getText();

        return new Computer(name, specs, active);
    }
    
    public void clearFields() {
        tfName.setText("");
        tfSpecs.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeviceFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeviceFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeviceFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeviceFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeviceFormView().setVisible(true);
            }
        });
    }

    @Override
    public void setTitleScreen() {
        setTitle("Manutenção de Dispositivos");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTypeDevice;
    private javax.swing.JButton btCreateCustomer1;
    private javax.swing.JButton btCreateDevice;
    private javax.swing.JCheckBox cbActive;
    private javax.swing.JLabel lbActive;
    private javax.swing.JLabel lbModel;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName1;
    private javax.swing.JLabel lbSpecs;
    private javax.swing.JRadioButton rbComputer;
    private javax.swing.JRadioButton rbConsole;
    private javax.swing.JTextField tfModel;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSpecs;
    // End of variables declaration//GEN-END:variables
}
