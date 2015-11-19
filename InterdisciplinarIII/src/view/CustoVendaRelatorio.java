package view;

import dao.CustoVendaDao;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.CustoVenda;


public class CustoVendaRelatorio extends javax.swing.JFrame {


    private int selecao = 0;
    
    public CustoVendaRelatorio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCustoVenda = new javax.swing.JTable();
        jRBGeral = new javax.swing.JRadioButton();
        jRBSelecao = new javax.swing.JRadioButton();
        jRBData = new javax.swing.JRadioButton();
        jFTFDataInicial = new javax.swing.JFormattedTextField();
        jFTFDataFinal = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Relatório de Custo de Venda");

        jTCustoVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cód. Máquina", "Máquina", "Cód. Energia", "Energia", "Cód. Funcionário", "Funcionário", "Cód. Madeira", "Madeira", "Data da Venda", "Custo Adicional", "Perda", "Custo Final", "Margem de Lucro", "Valor Final", "Horas", "Minutos", "Madeira Utilizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCustoVenda.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTCustoVenda.setAutoscrolls(false);
        jTCustoVenda.setEnabled(false);
        jTCustoVenda.setFocusable(false);
        jTCustoVenda.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTCustoVenda.getTableHeader().setResizingAllowed(false);
        jTCustoVenda.getTableHeader().setReorderingAllowed(false);
        jTCustoVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCustoVendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCustoVenda);
        if (jTCustoVenda.getColumnModel().getColumnCount() > 0) {
            jTCustoVenda.getColumnModel().getColumn(1).setMinWidth(100);
            jTCustoVenda.getColumnModel().getColumn(2).setMinWidth(150);
            jTCustoVenda.getColumnModel().getColumn(3).setMinWidth(100);
            jTCustoVenda.getColumnModel().getColumn(4).setMinWidth(150);
            jTCustoVenda.getColumnModel().getColumn(5).setMinWidth(100);
            jTCustoVenda.getColumnModel().getColumn(6).setMinWidth(200);
            jTCustoVenda.getColumnModel().getColumn(7).setMinWidth(100);
            jTCustoVenda.getColumnModel().getColumn(8).setMinWidth(150);
            jTCustoVenda.getColumnModel().getColumn(9).setMinWidth(150);
            jTCustoVenda.getColumnModel().getColumn(10).setMinWidth(150);
            jTCustoVenda.getColumnModel().getColumn(11).setMinWidth(100);
            jTCustoVenda.getColumnModel().getColumn(12).setMinWidth(200);
            jTCustoVenda.getColumnModel().getColumn(13).setMinWidth(100);
            jTCustoVenda.getColumnModel().getColumn(14).setMinWidth(200);
            jTCustoVenda.getColumnModel().getColumn(15).setMinWidth(50);
            jTCustoVenda.getColumnModel().getColumn(16).setMinWidth(100);
            jTCustoVenda.getColumnModel().getColumn(17).setMinWidth(150);
        }

        jRBGeral.setSelected(true);
        jRBGeral.setText("Geral");
        jRBGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBGeralMouseClicked(evt);
            }
        });

        jRBSelecao.setText("Da seleção");
        jRBSelecao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBSelecaoMouseClicked(evt);
            }
        });

        jRBData.setText("Por Data");
        jRBData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBDataMouseClicked(evt);
            }
        });

        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
            jFTFDataInicial = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jFTFDataInicial.setEnabled(false);

        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
            jFTFDataFinal = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jFTFDataFinal.setEnabled(false);

        jLabel1.setText("Data Inicial");

        jLabel2.setText("Data Final");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\relatório.png")); // NOI18N
        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBGeral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBSelecao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBData))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFTFDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jFTFDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBGeral)
                            .addComponent(jRBSelecao)
                            .addComponent(jRBData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFTFDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jFTFDataInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCustoVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCustoVendaMouseClicked

    }//GEN-LAST:event_jTCustoVendaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
        if(jRBGeral.isSelected() == true){
            selecao = 1;
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(selecao == 2){
           String codigo = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),0);
           dao.cod = Integer.parseInt(codigo);
           dao.abrirRelatorioSelecao();   
        }
        if(selecao == 1){
           dao.abrirRelatorioGeral();   
        }
        if(selecao == 3){
            if(!jFTFDataInicial.getText().equals("  /  /    ") && !jFTFDataFinal.getText().equals("  /  /    ")){           
                dao.datainicial = jFTFDataInicial.getText();
                dao.datafinal = jFTFDataFinal.getText();
                try {
                    dao.abrirRelatorioData();
                } catch (ParseException ex) {
                    Logger.getLogger(CustoVendaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                 JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRBSelecaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBSelecaoMouseClicked

        jRBSelecao.setSelected(true);
        jRBGeral.setSelected(false);
        jRBData.setSelected(false);
        jFTFDataFinal.setEnabled(false);
        jFTFDataInicial.setEnabled(false);
        jTCustoVenda.setEnabled(true);
        selecao = 2;
    }//GEN-LAST:event_jRBSelecaoMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void jRBGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBGeralMouseClicked
        jRBGeral.setSelected(true);
        jRBData.setSelected(false);
        jRBSelecao.setSelected(false);
        jFTFDataFinal.setEnabled(false);
        jFTFDataInicial.setEnabled(false);
        jTCustoVenda.setEnabled(false);
        selecao = 1;
    }//GEN-LAST:event_jRBGeralMouseClicked

    private void jRBDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBDataMouseClicked
        jRBData.setSelected(true);
        jRBGeral.setSelected(false);
        jRBSelecao.setSelected(false);
        jFTFDataFinal.setEnabled(true);
        jFTFDataInicial.setEnabled(true);
        jTCustoVenda.setEnabled(false);
        selecao = 3;
    }//GEN-LAST:event_jRBDataMouseClicked


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
            java.util.logging.Logger.getLogger(CustoVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustoVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustoVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustoVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustoVendaView().setVisible(true);
            }
        });
    }
    
      public void abreJanelaCustoVendaRelatorio(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("Relatório de Custo de Venda");
        
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage()); 
        
        this.setVisible(true);
    }
      
      
    
    private void listar(){

        DefaultTableModel dados = (DefaultTableModel) jTCustoVenda.getModel();
        dados.setNumRows(0);
        jTCustoVenda.getColumnModel().getColumn( 0 ).setMaxWidth( 0 );  
        jTCustoVenda.getColumnModel().getColumn( 0 ).setMinWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 0 ).setMaxWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 0 ).setMinWidth( 0 );
        jTCustoVenda.getColumnModel().getColumn( 1 ).setMaxWidth( 0 );  
        jTCustoVenda.getColumnModel().getColumn( 1 ).setMinWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 1 ).setMaxWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 1 ).setMinWidth( 0 );
        jTCustoVenda.getColumnModel().getColumn( 3 ).setMaxWidth( 0 );  
        jTCustoVenda.getColumnModel().getColumn( 3 ).setMinWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 3 ).setMaxWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 3 ).setMinWidth( 0 );
        jTCustoVenda.getColumnModel().getColumn( 5 ).setMaxWidth( 0 );  
        jTCustoVenda.getColumnModel().getColumn( 5 ).setMinWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 5 ).setMaxWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 5 ).setMinWidth( 0 );
        jTCustoVenda.getColumnModel().getColumn( 7 ).setMaxWidth( 0 );  
        jTCustoVenda.getColumnModel().getColumn( 7 ).setMinWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 7 ).setMaxWidth( 0 );  
        jTCustoVenda.getTableHeader().getColumnModel().getColumn( 7 ).setMinWidth( 0 );
        
        

        ((DefaultTableCellRenderer)jTCustoVenda.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER); 
        
        for(CustoVenda cv : dao.findAll()){
            dados.addRow(new String[]{""+cv.getCodcustovenda(), ""+cv.getMaquina().getCodmaquina(), cv.getMaquina().getNome(), ""+cv.getEnergiaeletrica().getCodenergiaeletrica(), cv.getEnergiaeletrica().getPrestadora(), ""+cv.getFuncionario().getCodfuncionario(), cv.getFuncionario().getNome(), ""+cv.getMadeira().getCodmadeira(), cv.getMadeira().getNome(), ""+cv.getDatavenda(), ""+cv.getCustoadicional(), ""+cv.getPerda(), ""+cv.getCustofinal(), ""+cv.getMargemlucro(), ""+cv.getValorfinal(), ""+cv.getHoras(), ""+cv.getMinutos(), ""+cv.getTamanhomadeira()});
        }
    }
    private final CustoVendaDao dao = new CustoVendaDao();
    private CustoVenda custovenda = new CustoVenda();

    public static String format(double x) {  
        return String.format("%.2f", x);  
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFTFDataFinal;
    private javax.swing.JFormattedTextField jFTFDataInicial;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBData;
    private javax.swing.JRadioButton jRBGeral;
    private javax.swing.JRadioButton jRBSelecao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCustoVenda;
    // End of variables declaration//GEN-END:variables
}
