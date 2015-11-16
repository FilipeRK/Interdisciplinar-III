package view;

import dao.UsuarioDao;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioLogin extends javax.swing.JFrame {

    public UsuarioLogin() {
        initComponents();
    }
    
    public int editSenha, novoUser, editando;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTítulo = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jTFSenha = new javax.swing.JPasswordField();
        jBCancelar = new javax.swing.JButton();
        jBLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLTítulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTítulo.setText("Login");

        jLUsuario.setText("Usuário");

        jLSenha.setText("Senha");

        jTFUsuario.setText("Admin");

        jTFSenha.setText("Admin");
        jTFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFSenhaKeyPressed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\cancelar.png")); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBLogin.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\ok.png")); // NOI18N
        jBLogin.setText("Login");
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSenha)
                    .addComponent(jLUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jBCancelar))
                    .addComponent(jTFSenha))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTítulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        
        String login = jTFUsuario.getText(); 
        String senha = jTFSenha.getText(); 
        int i = senha.length();
        
            if(novoUser != 1 && editSenha != 1){
                
                try{
                    String senhaHash = hashSenha(senha);
                    try {
                        dao.findUser(login,senhaHash);
                    } catch (IOException ex) {
                        Logger.getLogger(UsuarioLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(dao.logado == true){
                        TelaPrincipal tela = new TelaPrincipal();
                        tela.abreJanelaTelaPrincipal();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuário/Senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NoSuchAlgorithmException | UnsupportedEncodingException | HeadlessException e){
                }
                
            }else{
            if(i >= 6){
                try{
                    String senhaHash = hashSenha(senha);
                    usuario = new Usuario();
                    usuario.setUsuario(login);
                    usuario.setSenha(senhaHash);
                    if(editSenha != 1){
                        dao.insert(usuario);
                    }else{
                        dao.usuarioPLog = login;
                        int cod = dao.retornaCodUser();
                        usuario.setCodusuario(cod);
                        dao.update(usuario);
                    }
                    if(editSenha != 1){
                        JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!", "Criar Usuário", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Alterar senha", JOptionPane.INFORMATION_MESSAGE);        
                        this.dispose();
                    }
                }catch(NoSuchAlgorithmException | UnsupportedEncodingException | HeadlessException e){    
                }
                }else{
             JOptionPane.showMessageDialog(null, "A senha deve ter no mínimo 6 caracteres!!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            }
        
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
       if(editSenha != 1 && novoUser != 1){
            System.exit(0);
       }else{
           this.dispose();
       }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFSenhaKeyPressed
        if ( evt.getKeyChar()== KeyEvent.VK_ENTER ) {
            jBLoginActionPerformed(null);
        }
    }//GEN-LAST:event_jTFSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(UsuarioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UsuarioLogin().setVisible(true);
            }
        });
    }
    
    public void abreJanelaUsuario(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("SCCP - Login");
        
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage()); 
        
        this.setVisible(true);
    }
    
    public String hashSenha(String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        byte messageDigest[] = algorithm.digest(pass.getBytes("UTF-8")); 
        
        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
          hexString.append(String.format("%02X", 0xFF & b));
        }
        String senha = hexString.toString();

        return senha;
    }
    private final UsuarioDao dao = new UsuarioDao();
    private Usuario usuario = new Usuario();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    public javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLSenha;
    public javax.swing.JLabel jLTítulo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JTextField jTFSenha;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
