package views.Game;

import Exceptions.NullSelectionException;
import controllers.App;
import controllers.GameController;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import models.Game;
import models.tables.GameTableModel;

/**
 *
 * @author João Eduardo
 */
public class GameListView extends views.View {
    
    public GameListView() {
        initComponents();
    }

    public void setTableModel(GameTableModel gameTableModel){
        tbGameList.setModel(gameTableModel);
    }
    
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void showScreen(){
        setVisible(true);
    }
    
    public void addOpenCreateGameViewButton(ActionListener acao){
        btCreateGame.addActionListener(acao);
    }
    
    public String getCPFLinhaSelecionada(){
        if(tbGameList.getSelectedRow() == -1){
            System.out.println("Nenhuma Linha selecionada");
            return null;
        }
            
        //Retorna o CPF - Primeira coluna da linha selecionada
        return tbGameList.getModel().getValueAt(tbGameList.getSelectedRow(), 0).toString();
    }
    
    public void adicionarEventoAlteracaoTabela(TableModelListener l){
        tbGameList.getModel().addTableModelListener(l);
    }
    
 
//
//    private GameController gameController;
//    private DefaultTableModel dtmGames;
//
//    private final String[] columnNames = {
//        "Id", "Nome", "Categoria", "Descrição"
//    };
//
//
//    private void createTableModel() {
//        this.dtmGames = (DefaultTableModel) this.tbGameList.getModel();
//        this.dtmGames.setColumnIdentifiers(columnNames);
//        this.dtmGames.setRowCount(0);
//    }
//
//    public void ListGames() {
//        this.getFilteredGames();
//        this.createTableModel();
//        for (Game game : gameController.getFilteredGames()) {
//            Object[] listData = {game.getId(), game.getName(), game.getCategory().getName(), game.getDescription()};
//            dtmGames.addRow(listData);
//        }
//    }
//
//    public void getFilteredGames() {
//        switch (this.cbFilterOptions.getSelectedIndex()) {
//            case 0:
//                this.gameController.getAll();
//                break;
//            case 1:
//                this.gameController.filterByName(this.tfGameName.getText());
//                break;
//            case 2:
//                this.gameController.filterByCategory(this.tfGameName.getText());
//                break;
//        }
//    }
//
//    public int validateSelection(Object object) throws NullSelectionException {
//        if ((Integer) object == -1) {
//            throw new NullSelectionException("Erro: Objeto não selecionado.");
//        }
//        return (Integer) this.dtmGames.getValueAt(this.tbGameList.getSelectedRow(), 0);
//    }

//    /**
//     * Centraliza a tela de visualização
//     */
//    private void ajustScreenCenter() {
//        setLocationRelativeTo(null);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btUpdateGame = new javax.swing.JButton();
        tfGameName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbFilterOptions = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btCreateGame = new javax.swing.JButton();
        btFilterGame = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGameList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btUpdateGame.setText("Editar");

        jLabel1.setText("Filtrar por:");

        cbFilterOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome", "Categoria" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Jogos");

        btCreateGame.setText("Cadastrar");

        btFilterGame.setText("Pesquisar");

        tbGameList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbGameList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btCreateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btUpdateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbFilterOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfGameName)
                                        .addGap(18, 18, 18)
                                        .addComponent(btFilterGame)))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFilterOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCreateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btFilterGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfGameName))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btUpdateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateGame;
    private javax.swing.JButton btFilterGame;
    private javax.swing.JButton btUpdateGame;
    private javax.swing.JComboBox<String> cbFilterOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGameList;
    private javax.swing.JTextField tfGameName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setTitleScreen() {
        setTitle("Consulta de Jogos");
    }
}
