/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.Customer;

import controllers.App;
import controllers.CustomerController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Customer;

/**
 *
 * @author max
 */
public class CustomerListView extends javax.swing.JFrame {

    private CustomerController customerController;
    private DefaultTableModel dtmCustomers;

    private final String[] columnNames = {
        "Id", "Nome", "CPF", "Endereço", "Data de nascimento", "Créditos disponíveis"
    };

    public CustomerListView() {
        initComponents();
        customerController = new CustomerController();
        this.createTableModel();      
    }
    
    private void createTableModel(){
        this.dtmCustomers = (DefaultTableModel) this.tbCustomerList.getModel();
        this.dtmCustomers.setColumnIdentifiers(columnNames);
        this.dtmCustomers.setRowCount(0);        
    }

    public void ListCustomers() {
        this.createTableModel();
        for (Customer customer : customerController.getFilteredCustomers()){
            Object [] listData = {customer.getId(), customer.getName(), customer.getCPF(),
            customer.getAdress(), customer.getBirthDate(), customer.getCreditsAmount()};
            dtmCustomers.addRow(listData);
        }            
    }

    public void getSortedCustomers() {
        if (this.cbSortOptions.getSelectedIndex() == 0)
            this.customerController.sortAlphabetically();
        else
            this.customerController.sortByCreditsAmount();
    }

    public void getFilteredCustomers() {
        switch (this.cbFilterOptions.getSelectedIndex()) {
            case 0:
                this.customerController.getAll();
                break;
            case 1:
                this.customerController.filterByName(this.tfCustomerName.getText());
                break;
            case 2:
                this.customerController.filterByCPF(this.tfCustomerName.getText());
                break;
            case 3:
                this.customerController.filterByAdress(this.tfCustomerName.getText());
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbFilterOptions = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btCreateCustomer = new javax.swing.JButton();
        btFilterCustomer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbSortOptions = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCustomerList = new javax.swing.JTable();
        btUpdateCustomer = new javax.swing.JButton();
        tfCustomerName = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Filtrar por:");

        cbFilterOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome", "CPF", "Endereço" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Clientes");

        btCreateCustomer.setText("Cadastrar");
        btCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateCustomerActionPerformed(evt);
            }
        });

        btFilterCustomer.setText("Pesquisar");
        btFilterCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFilterCustomerActionPerformed(evt);
            }
        });

        jLabel2.setText("Ordenar por:");

        cbSortOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordem alfabética", "Quantidade de créditos" }));

        tbCustomerList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbCustomerList);

        btUpdateCustomer.setText("Editar");
        btUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(11, 11, 11))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbSortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbFilterOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfCustomerName)
                                                .addGap(18, 18, 18)
                                                .addComponent(btFilterCustomer)))))))
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbFilterOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btFilterCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCustomerName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbSortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btUpdateCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateCustomerActionPerformed
        App.openCustomerCreateView();
    }//GEN-LAST:event_btCreateCustomerActionPerformed

    private void btFilterCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFilterCustomerActionPerformed
        this.getFilteredCustomers();
        this.getSortedCustomers();
        this.ListCustomers();
    }//GEN-LAST:event_btFilterCustomerActionPerformed

    private void btUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateCustomerActionPerformed
        int customerId = (Integer) this.dtmCustomers.getValueAt(this.tbCustomerList.getSelectedRow(), 0);
        customerController.updateCustomer(customerId);
    }//GEN-LAST:event_btUpdateCustomerActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateCustomer;
    private javax.swing.JButton btFilterCustomer;
    private javax.swing.JButton btUpdateCustomer;
    private javax.swing.JComboBox<String> cbFilterOptions;
    private javax.swing.JComboBox<String> cbSortOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbCustomerList;
    private javax.swing.JTextField tfCustomerName;
    // End of variables declaration//GEN-END:variables
}