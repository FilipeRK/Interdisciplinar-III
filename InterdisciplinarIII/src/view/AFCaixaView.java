package view;

import dao.AFCaixaDao;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.AFCaixa;

public class AFCaixaView extends javax.swing.JFrame {

    public String tipo; //1 para abertura e 2 para fechamento
    
    public AFCaixaView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTítulo = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();
        jBOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLTítulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTítulo.setText("Título");

        jLSenha.setText("Valor");

        jTFValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFValorKeyTyped(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBOK.setText("OK");
        jBOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFValor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBOK, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jBCancelar)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTítulo)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSenha))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBOK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOKActionPerformed

        if("A".equals(tipo)){
            if (JOptionPane.showConfirmDialog(null, "Abrir o caixa com R$ "+jTFValor.getText()+"?", "Abrir Caixa", ConfirmationCallback.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                gravar();
            }
        }else{
            if (JOptionPane.showConfirmDialog(null, "Fechar o caixa com R$ "+jTFValor.getText()+"?", "Fechar Caixa", ConfirmationCallback.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                gravar();
            }
        }

    }//GEN-LAST:event_jBOKActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFValorKeyTyped
        
        if ( evt.getKeyChar()== KeyEvent.VK_ENTER ) {
            jBOKActionPerformed(null);
        }
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTFValorKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AFCaixaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AFCaixaView().setVisible(true);
            }
        });
    }
    
    public void abreJanelaAFCaixa(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("Abrir/Fechar o Caixa");
        
        //ImageIcon image = new ImageIcon("C:\\SCF\\img\\icone.png");
       // this.setIconImage(image.getImage()); 
        
        this.setVisible(true);
    }

    private void gravar(){
                
        
        if (!"".equals(jTFValor.getText())){
            
            String valor = jTFValor.getText().replace(",", ".");

            AFCaixa afcaixa = new AFCaixa();

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");    
            Calendar c = Calendar.getInstance();      
            String teste2  = df.format(c.getTime()); 

            try{
             java.util.Date dt; 
             dt = df.parse(teste2);
             java.sql.Date d = new java.sql.Date(dt.getTime()); 
             afcaixa.setData(String.valueOf(d));
            }catch(ParseException e){      
            }
            
            afcaixa.setValor(valor);
            afcaixa.setTipo(tipo);
           
            dao.insert(afcaixa);

            jTFValor.setText("");

            if("F".equals(tipo)){
                JOptionPane.showMessageDialog(null, "O saldo do dia foi: R$"+dao.retornaSaldoDia(), "Saldo do dia", JOptionPane.INFORMATION_MESSAGE);
            }

            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Há campos obrigatórios em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private final AFCaixaDao dao = new AFCaixaDao();
   // private AFCaixaView afcaixa = new AFCaixaView();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    public javax.swing.JButton jBOK;
    private javax.swing.JLabel jLSenha;
    public javax.swing.JLabel jLTítulo;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
