package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author petrix
 */
public class LoginView extends View {


    public LoginView() {
        initComponents();
        ajustScreenCenter();
        addPlaceHolderSyle(tfUser);
        addPlaceHolderSyle(tfPassword);
    }
    
    public void addLoginButtonAction(ActionListener action){
        this.btLogin.addActionListener(action);
    }
    
    public String getUsername(){
        return this.tfUser.getText();
    }
    
    public String getPassword(){
        return this.tfPassword.getText();
    } 
    
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();
        btShowPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lan Manager");

        tfUser.setText("Username");
        tfUser.setName("tfUser"); // NOI18N
        tfUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUserFocusLost(evt);
            }
        });

        btLogin.setFont(new java.awt.Font("MathJax_SansSerif", 1, 18)); // NOI18N
        btLogin.setText("Entrar");
        btLogin.setName("btLogin"); // NOI18N

        tfPassword.setText("Password");
        tfPassword.setEchoChar('\u0000');
        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPasswordFocusLost(evt);
            }
        });

        btShowPassword.setFont(new java.awt.Font("Padauk Book", 1, 12)); // NOI18N
        btShowPassword.setText("Mostrar");
        btShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfUser)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowPasswordActionPerformed
        if (!tfPassword.getText().equals("Password") && tfPassword.getText().length() > 0)
        changeTypeCharacterTfPassword();
    }//GEN-LAST:event_btShowPasswordActionPerformed

    private void tfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusLost
        if (tfPassword.getText().length() == 0) {
            addPlaceHolderSyle(tfPassword);
            tfPassword.setText("Password");
            tfPassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_tfPasswordFocusLost

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained
        if (tfPassword.getText().equals("Password")) {
            tfPassword.setText(null);
            tfPassword.requestFocus();
            tfPassword.setEchoChar('\u25cf');
            removePlaceHolderSyle(tfPassword);
        }
    }//GEN-LAST:event_tfPasswordFocusGained

    private void tfUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusLost
        if (tfUser.getText().length()  == 0) {
            addPlaceHolderSyle(tfUser);
            tfUser.setText("Username");
        }
    }//GEN-LAST:event_tfUserFocusLost

    private void tfUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusGained
        if (tfUser.getText().equals("Username")) {
            tfUser.setText(null);
            tfUser.requestFocus();
            removePlaceHolderSyle(tfUser);
        }
    }//GEN-LAST:event_tfUserFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btShowPassword;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables

    
    private void addPlaceHolderSyle(JTextField tf) {
        Font font = tf.getFont();
        font     = font.deriveFont(Font.ITALIC);
        tf.setFont(font);
        tf.setForeground(Color.gray);
    }
    
    private void removePlaceHolderSyle(JTextField tf) {
        Font font = tf.getFont();
        font      = font.deriveFont(Font.PLAIN|Font.BOLD);
        tf.setFont(font);
        tf.setForeground(Color.black);
    }
    
    private void changeTypeCharacterTfPassword() {
        if (tfPassword.getEchoChar() == '\u0000') {
            btShowPassword.setText("Mostrar");
            tfPassword.setEchoChar('\u25cf');
        } else {
            btShowPassword.setText("Ocultar");
            tfPassword.setEchoChar('\u0000');
        }
    }

    @Override
    public void setTitleScreen() {
        setTitle("Lan Manager - Zukünftige Glatzköpfige Männer");
    }
    
    
}
