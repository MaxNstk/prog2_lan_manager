
package views;

import controllers.App;
import java.awt.event.ActionListener;

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

    
    protected void ajustScreenCenter() {
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void addOpenGameListViewAction(ActionListener action){
        miListGame.addActionListener(action);
    }
    
    public void addOpenDeviceListViewAction(ActionListener action){
        miListDevice.addActionListener(action);
    }
    
    public void addOpenCustomerListViewAction(ActionListener action){
        miListCustomer.addActionListener(action);
    }
    
    public void addOpenGameplayViewAction(ActionListener action){
        miListGameplay.addActionListener(action);
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miListCustomer = new javax.swing.JMenuItem();
        miListDevice = new javax.swing.JMenuItem();
        miListGame = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miListGameplay = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        miListCustomer.setText("Cliente");
        jMenu1.add(miListCustomer);

        miListDevice.setText("Dispositivo");
        jMenu1.add(miListDevice);

        miListGame.setText("Jogo");
        jMenu1.add(miListGame);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agenda");

        miListGameplay.setText("Jogatina");
        jMenu2.add(miListGameplay);

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
    private javax.swing.JMenuItem miListCustomer;
    private javax.swing.JMenuItem miListDevice;
    private javax.swing.JMenuItem miListGame;
    private javax.swing.JMenuItem miListGameplay;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setTitleScreen() {
        setTitle("Lan Manager - Zukünftige Glatzköpfige Männer");
    }
}
