package views.Customer;

import Exceptions.EmptyFieldException;
import daos.CustomerDAO;
import javax.swing.JOptionPane;
import models.Customer;

/**
 *
 * @author max
 */
public class CustomerFormView extends javax.swing.JFrame {

    private Customer customer;

    public CustomerFormView(Customer customer) {
        initComponents();
        if (customer != null) {
            this.customer = customer;
            this.setCustomerInfo(customer);
        }
    }

    public void setCustomerInfo(Customer customer) {
        tfName.setText(customer.getName());
        tfCPF.setText(customer.getCPF());
        tfAdress.setText(customer.getAdress());
        tfBirthDate.setText(customer.getBirthDate());
    }

    public Customer getCustomerInfo() throws EmptyFieldException {
        try {
            String name = tfName.getText();
            String CPF = tfCPF.getText();
            String adress = tfAdress.getText();
            String birthDate = tfBirthDate.getText();
            return new Customer(name, CPF, adress, birthDate);
        } catch (EmptyFieldException emptyFieldException) {
            JOptionPane.showMessageDialog(null, emptyFieldException.getMessage());
            return null;
        }
    }

    public void createCustomer() {
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.createCustomer(this.getCustomerInfo());

    }

    public void updateCustomer() {
        this.customer.setName(tfName.getText());
        this.customer.setCPF(tfCPF.getText());
        this.customer.setAdress(tfAdress.getText());
        this.customer.setBirthDate(tfBirthDate.getText());
    }

    public void clearFields() {
        tfName.setText("");
        tfCPF.setText("");
        tfAdress.setText("");
        tfBirthDate.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfName = new javax.swing.JTextField();
        tfAdress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btCreateCustomer = new javax.swing.JButton();
        tfCPF = new javax.swing.JFormattedTextField();
        tfBirthDate = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfName.setName("tfName"); // NOI18N

        tfAdress.setName("tfAdress"); // NOI18N

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Data de Nascimento");
        jLabel3.setName("tfBirthDate"); // NOI18N

        jLabel4.setText("Endereço");

        btCreateCustomer.setText("Cadastrar");
        btCreateCustomer.setName("btCreateCustomer"); // NOI18N
        btCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateCustomerActionPerformed(evt);
            }
        });

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfBirthDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCreateCustomer)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName)
                    .addComponent(tfAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCPF)
                    .addComponent(tfBirthDate))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(tfBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(tfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCreateCustomer)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tfAdress.getAccessibleContext().setAccessibleName("tfEndereco");
        tfAdress.getAccessibleContext().setAccessibleDescription("tfEndereco");
        jLabel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateCustomerActionPerformed
        if (this.customer != null) {
            this.updateCustomer();
        } else {
            this.createCustomer();
        }

        this.clearFields();
    }//GEN-LAST:event_btCreateCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfAdress;
    private javax.swing.JFormattedTextField tfBirthDate;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
