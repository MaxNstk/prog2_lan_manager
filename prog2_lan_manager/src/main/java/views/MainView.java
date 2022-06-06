
package views;

import controllers.App;

/**
 *
 * @author max
 */
public class MainView extends View {

    public MainView() {
        initComponents();
        this.ajustScreenCenter();
        setTitleScreen();
    }

    /**
     * Define para que o componente seja apresentado em tela cheia
     */
    protected void ajustScreenCenter() {
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miCreateCustomer = new javax.swing.JMenuItem();
        miCreateDevice = new javax.swing.JMenuItem();
        miGameCreate = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miJogatina = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        miCreateCustomer.setText("Cliente");
        miCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCreateCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(miCreateCustomer);

        miCreateDevice.setText("Dispositivo");
        miCreateDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCreateDeviceActionPerformed(evt);
            }
        });
        jMenu1.add(miCreateDevice);

        miGameCreate.setText("Jogo");
        miGameCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGameCreateActionPerformed(evt);
            }
        });
        jMenu1.add(miGameCreate);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agenda");

        miJogatina.setText("Jogatina");
        miJogatina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miJogatinaActionPerformed(evt);
            }
        });
        jMenu2.add(miJogatina);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miGameCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGameCreateActionPerformed
        App.openGameListView();
    }//GEN-LAST:event_miGameCreateActionPerformed

    private void miJogatinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miJogatinaActionPerformed
        App.openGameplayListView();
    }//GEN-LAST:event_miJogatinaActionPerformed

    private void miCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCreateCustomerActionPerformed
        App.openCustomerListView();
    }//GEN-LAST:event_miCreateCustomerActionPerformed

    private void miCreateDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCreateDeviceActionPerformed
        App.openDeviceListView();
    }//GEN-LAST:event_miCreateDeviceActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCreateCustomer;
    private javax.swing.JMenuItem miCreateDevice;
    private javax.swing.JMenuItem miGameCreate;
    private javax.swing.JMenuItem miJogatina;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setTitleScreen() {
        setTitle("Lan Manager - Zukünftige Glatzköpfige Männer");
    }
}
