
package views.Customer;

import Exceptions.NullSelectionException;
import controllers.App;
import controllers.CustomerController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Customer;

/**
 *
 * @author max
 */
public class CustomerListView extends views.View {

    private CustomerController customerController;
    private DefaultTableModel dtmCustomers;

    private final String[] columnNames = {
        "Id", "Nome", "CPF", "Endereço", "Data de nascimento", "Créditos disponíveis"
    };

    public CustomerListView() {
        initComponents();
        ajustScreenCenter();
        customerController = new CustomerController();
        this.createTableModel();
        this.ListCustomers();
    }

    private void createTableModel() {
        this.dtmCustomers = (DefaultTableModel) this.tbCustomerList.getModel();
        this.dtmCustomers.setColumnIdentifiers(columnNames);
        this.dtmCustomers.setRowCount(0);
    }

    public void ListCustomers() {
        this.getFilteredCustomers();
        this.getSortedCustomers();
        this.createTableModel();
        for (Customer customer : customerController.getFilteredCustomers()) {
            Object[] listData = {customer.getId(), customer.getName(), customer.getCPF(),
                customer.getAdress(), customer.getBirthDate(), customer.getCreditsAmount()};
            dtmCustomers.addRow(listData);
        }
    }

    public void getSortedCustomers() {
        if (this.cbSortOptions.getSelectedIndex() == 0) {
            this.customerController.sortAlphabetically();
        } else {
            this.customerController.sortByCreditsAmount();
        }
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

    public int validateSelection(int selectedRow) throws NullSelectionException {
        if (selectedRow == -1) {
            throw new NullSelectionException("cliente");
        }
        return (Integer) this.dtmCustomers.getValueAt(this.tbCustomerList.getSelectedRow(), 0);
    }
    
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
        btAddCredits = new javax.swing.JButton();

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

        btAddCredits.setText("Adicionar Créditos");
        btAddCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCreditsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 707, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbFilterOptions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btFilterCustomer))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAddCredits)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbFilterOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btFilterCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCustomerName)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbSortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddCredits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFilterCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFilterCustomerActionPerformed
        this.ListCustomers();
    }//GEN-LAST:event_btFilterCustomerActionPerformed

    private void btUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateCustomerActionPerformed
        try {
            int customerId = validateSelection(this.tbCustomerList.getSelectedRow());
//            customerController.updateCustomer(customerId);
        } catch (NullSelectionException nullSelectionException) {
            JOptionPane.showMessageDialog(null, nullSelectionException.getMessage());
        }
    }//GEN-LAST:event_btUpdateCustomerActionPerformed

    private void btAddCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCreditsActionPerformed
        try {
            int customerId = validateSelection(this.tbCustomerList.getSelectedRow());
//            App.openAddCreditsView(customerId);
        } catch (NullSelectionException nullSelectionException) {
            JOptionPane.showMessageDialog(null, nullSelectionException.getMessage());
        }
    }//GEN-LAST:event_btAddCreditsActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCredits;
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

    @Override
    public void setTitleScreen() {
        setTitle("Consulta de Clientes");
    }
}
