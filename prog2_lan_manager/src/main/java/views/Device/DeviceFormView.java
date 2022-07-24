
package views.Device;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class DeviceFormView extends views.View {
   
    /**
     * Creates new form DeviceFormView
     */
    public DeviceFormView() {
        initComponents();
        ajustScreenCenter();
        disabledInputs();
    }
    
    @Override
    public void setTitleScreen() {
        setTitle("Manutenção de Dispositivos");
    }
    
    private void disabledInputs() {
        rbComputer.setSelected(true);
        tfModel.setEnabled(false);
        tfModel.setBackground(new Color(217, 217, 217));
    }
    
    public String getName(){
        return this.tfName.getText();
    }
    
    public String getSpecs(){
        if (this.rbComputer.isSelected())
            return this.tfSpecs.getText();
        else
            return null;
    }
    
    public String getModel(){
        if (this.rbConsole.isSelected())
            return this.tfModel.getText();
        else
            return null;
    }
    
   public void showMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void addCreateDeviceAction(ActionListener action){
        this.btCreateDevice.addActionListener(action);
    }
    
    public void addComputerSelectionAction(ActionListener action){
        this.rbComputer.addActionListener(action);
    }
    
    public void addConsoleSelectionAction(ActionListener action){
        this.rbConsole.addActionListener(action);
    }
    
    public void clearFields() {
        tfName.setText("");
        tfSpecs.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTypeDevice = new javax.swing.ButtonGroup();
        btCreateCustomer1 = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
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

        btCreateDevice.setText("Cadastrar");
        btCreateDevice.setName("btCreateDevice"); // NOI18N

        lbModel.setText("Modelo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbComputer)
                        .addGap(18, 18, 18)
                        .addComponent(rbConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSpecs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSpecs, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btCreateDevice)
                                .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbName1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(btCreateDevice)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbComputerActionPerformed
        tfModel.setEnabled(false);
        tfModel.setText("");
        tfModel.setBackground(new Color(217, 217, 217));      
        tfSpecs.setEnabled(true);
        tfSpecs.setBackground(Color.white);
    }//GEN-LAST:event_rbComputerActionPerformed

    private void rbConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsoleActionPerformed
        tfModel.setEnabled(true);
        tfModel.setBackground(Color.white);       
        tfSpecs.setText("");
        tfSpecs.setEnabled(false);
        tfSpecs.setBackground(new Color(217, 217, 217));
    }//GEN-LAST:event_rbConsoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTypeDevice;
    private javax.swing.JButton btCreateCustomer1;
    private javax.swing.JButton btCreateDevice;
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
