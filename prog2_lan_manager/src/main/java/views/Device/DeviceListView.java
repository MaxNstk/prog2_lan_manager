
package views.Device;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;

import models.tables.DeviceTableModel;

public class DeviceListView extends views.View {  
    
        public DeviceListView() {
        initComponents();
        ajustScreenCenter();
    }
    
    public void addOpenCreateDeviceForm(ActionListener action){
        btCreateDevice.addActionListener(action);
    }
    
   public void setTableModel(DeviceTableModel deviceTableModel){
        tbDevice.setModel(deviceTableModel);
    }
    
    public void adicionarEventoAlteracaoTabela(TableModelListener l){
        tbDevice.getModel().addTableModelListener(l);
    }
    
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDevice = new javax.swing.JLabel();
        btCreateDevice = new javax.swing.JButton();
        btFilterDevice = new javax.swing.JButton();
        tbDeviceList = new javax.swing.JScrollPane();
        tbDevice = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbDevice.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbDevice.setText("Dispositivos");

        btCreateDevice.setText("Cadastrar");

        btFilterDevice.setText("Pesquisar");

        tbDevice.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDeviceList.setViewportView(tbDevice);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbDeviceList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCreateDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(461, 461, 461)
                                .addComponent(btFilterDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCreateDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFilterDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tbDeviceList, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setTitleScreen() {
        setTitle("Consulta de Dispositivos");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateDevice;
    private javax.swing.JButton btFilterDevice;
    private javax.swing.JLabel lbDevice;
    private javax.swing.JTable tbDevice;
    private javax.swing.JScrollPane tbDeviceList;
    // End of variables declaration//GEN-END:variables
}
