package view;

import dao.CustoVendaDao;
import graficos.GraficoCustoVendaData;
import graficos.GraficoCustoVendaGeral;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.CustoVenda;

public class CustoVendaGrafico extends javax.swing.JFrame {


    private int selecao = 0;
    
    public CustoVendaGrafico() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLTitulo = new javax.swing.JLabel();
        jRBGeral = new javax.swing.JRadioButton();
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
        jLTitulo.setText("Gráfico de Custo de Venda");

        jRBGeral.setSelected(true);
        jRBGeral.setText("Geral");
        jRBGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBGeralMouseClicked(evt);
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
        jFTFDataFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFTFDataFinalFocusGained(evt);
            }
        });

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
                        .addComponent(jRBGeral)
                        .addGap(18, 18, 18)
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
                .addContainerGap(104, Short.MAX_VALUE))
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
                    .addComponent(jFTFDataFinal)
                    .addComponent(jFTFDataInicial))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(jRBGeral.isSelected() == true){
            selecao = 1;
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(selecao == 1){
           gg.abreJanelaGraficoGeral();
        }
        if(selecao == 3){
            if(!jFTFDataInicial.getText().equals("  /  /    ") && !jFTFDataFinal.getText().equals("  /  /    ")){           
                gd.datainicial = jFTFDataInicial.getText();
                gd.datafinal = jFTFDataFinal.getText();
                gd.abreJanelaGraficoData();
            }else{
                 JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void jRBGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBGeralMouseClicked
        jRBGeral.setSelected(true);
        jRBData.setSelected(false);
        jFTFDataFinal.setEnabled(false);
        jFTFDataInicial.setEnabled(false);
        selecao = 1;
    }//GEN-LAST:event_jRBGeralMouseClicked

    private void jRBDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBDataMouseClicked
        jRBData.setSelected(true);
        jRBGeral.setSelected(false);
        jFTFDataFinal.setEnabled(true);
        jFTFDataInicial.setEnabled(true);
        selecao = 3;
    }//GEN-LAST:event_jRBDataMouseClicked

    private void jFTFDataFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFDataFinalFocusGained
        if("  /  /    ".equals(jFTFDataFinal.getText())){
            Calendar Inicial = Calendar.getInstance();
            Date diaAtual = new Date();
            Inicial.setTime(diaAtual);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
            jFTFDataFinal.setText(df.format(Inicial.getTime()));
            jFTFDataFinal.selectAll();
        }
    }//GEN-LAST:event_jFTFDataFinalFocusGained


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
    
      public void abreJanelaCustoVendaGrafico(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("Gráficos de Custo de Venda");
        
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage()); 
        
        this.setVisible(true);
    }
  
    
    private final CustoVendaDao dao = new CustoVendaDao();
    private CustoVenda custovenda = new CustoVenda();
    private final GraficoCustoVendaGeral gg = new GraficoCustoVendaGeral();
    private final GraficoCustoVendaData gd = new GraficoCustoVendaData();


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
    // End of variables declaration//GEN-END:variables
}
