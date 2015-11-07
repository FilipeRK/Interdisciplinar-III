package view;

import dao.CidadeDao;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cidade;


public class CidadeView extends javax.swing.JFrame {


    private int editando;
    
    public CidadeView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jBNovo = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCidade = new javax.swing.JTable();
        jTFNome = new javax.swing.JTextField();
        jTFUF = new javax.swing.JTextField();
        jLData1 = new javax.swing.JLabel();
        jLData2 = new javax.swing.JLabel();
        jTFCEP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Cidade");

        jLCodigo.setText("Código");

        jTFCodigo.setEditable(false);
        jTFCodigo.setBackground(new java.awt.Color(204, 204, 204));

        jBNovo.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\novo.png")); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBEditar.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\editar.png")); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBGravar.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\salvar.png")); // NOI18N
        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBDeletar.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\deletar.png")); // NOI18N
        jBDeletar.setText("Deletar");
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\cancelar.png")); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLData.setText("Nome");

        jTCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "UF", "CEP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCidade.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTCidade.setAutoscrolls(false);
        jTCidade.setFocusable(false);
        jTCidade.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTCidade.getTableHeader().setResizingAllowed(false);
        jTCidade.getTableHeader().setReorderingAllowed(false);
        jTCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCidadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCidade);
        if (jTCidade.getColumnModel().getColumnCount() > 0) {
            jTCidade.getColumnModel().getColumn(1).setMinWidth(250);
            jTCidade.getColumnModel().getColumn(2).setMinWidth(100);
            jTCidade.getColumnModel().getColumn(3).setMinWidth(117);
        }

        jLData1.setText("UF");

        jLData2.setText("CEP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigo)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLData)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLData1)
                            .addComponent(jTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jLData2)
                                .addGap(121, 121, 121))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLData)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLData1)
                            .addComponent(jLData2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed

        jTCidade.setEnabled(false);
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jTFNome.setText("");
        jTFUF.setText("");
        jTFCEP.setText("");
        jTFNome.requestFocus();
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed

        
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jTCidade.setEnabled(false);
        
        String codigo = ""+jTCidade.getValueAt(jTCidade.getSelectedRow(),0);
        String nome = ""+jTCidade.getValueAt(jTCidade.getSelectedRow(),1);
        String uf = ""+jTCidade.getValueAt(jTCidade.getSelectedRow(),2);
        String cep = ""+jTCidade.getValueAt(jTCidade.getSelectedRow(),3);
        
        jTFCodigo.setText(codigo);
        jTFNome.setText(nome);
        jTFUF.setText(uf);
        jTFCEP.setText(cep);

        editando = 1;
        
        
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
       
        if (!"".equals(jTFNome.getText())){

        String descricao = jTFNome.getText();
        String uf = jTFUF.getText();
        String cep = jTFCEP.getText();

           

            cidade = new Cidade();

            cidade.setNome(descricao);
            cidade.setUf(uf);
            cidade.setCep(cep);
            
            if(editando != 1){
                dao.insert(cidade);
            }else{
                int codigo = Integer.parseInt(jTFCodigo.getText());
                cidade.setCodcidade(codigo);
                dao.update(cidade);
            }

            listar();

            jTFCodigo.setText("");
            jTFNome.setText("");
            jTFUF.setText("");
            jTFCEP.setText("");
            jBNovo.setEnabled(true);
            jBGravar.setEnabled(false);
            jBCancelar.setEnabled(false);
            jTCidade.setEnabled(true);

        }else{
            JOptionPane.showMessageDialog(null, "Há campos obrigatórios em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        
        
        if (JOptionPane.showConfirmDialog(null, "Excluír registro selecionado?", "Excluír registro", ConfirmationCallback.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            String codigo = ""+jTCidade.getValueAt(jTCidade.getSelectedRow(),0);

            cidade = dao.findById(Integer.parseInt(codigo));
            dao.delete(cidade);

            listar();
        
            jBDeletar.setEnabled(false);
            jBEditar.setEnabled(false);
        }
        
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        
        jTFCodigo.setText("");
        jTFNome.setText("");
        jTFUF.setText("");
        jTFCEP.setText("");
        jTCidade.setEnabled(true);
        jBNovo.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBGravar.setEnabled(false);
        jBCancelar.setEnabled(false);
        jBEditar.setEnabled(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCidadeMouseClicked

        if (jTCidade.isEnabled()){
            jBEditar.setEnabled(true);
            jBDeletar.setEnabled(true);
        }
    }//GEN-LAST:event_jTCidadeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened


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
            java.util.logging.Logger.getLogger(CidadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CidadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CidadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CidadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeView().setVisible(true);
            }
        });
    }
    
      public void abreJanelaCidade(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("Cadastro de Cidades");
        
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage());  

        this.setVisible(true);
    }
      
      private void listar(){

        DefaultTableModel dados = (DefaultTableModel) jTCidade.getModel();
        dados.setNumRows(0);
        
        ((DefaultTableCellRenderer)jTCidade.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER); 

        for(Cidade ci : dao.findAll()){
           dados.addRow(new String[]{""+ci.getCodcidade(), ci.getNome(), ci.getUf(), ci.getCep()});
        }
    }
      
    private final CidadeDao dao = new CidadeDao();
    private Cidade cidade = new Cidade();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLData1;
    private javax.swing.JLabel jLData2;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCidade;
    private javax.swing.JTextField jTFCEP;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFUF;
    // End of variables declaration//GEN-END:variables
}
