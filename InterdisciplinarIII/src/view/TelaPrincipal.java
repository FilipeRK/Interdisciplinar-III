package view;

import dao.AFCaixaDao;
//import dao.CidadesDao;
import dao.ClienteDao;
import dao.MadeiraDao;
import dao.MaquinaDao;
//import dao.FornecedoresDao;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import model.ContaPagar;

public class TelaPrincipal extends javax.swing.JFrame {
 
    JLabel horas2, data2;
    String diaSemana[] = {"Domingo", "Segunda-Feira",
                          "Terça-Feira", "Quarta-Feira",
                          "Quinta-Feira", "Sexta-Feira",
                          "Sábado"};

    String meses[] = {"Janeiro", "Fevereiro", "Março",
                      "Abril", "Maio", "Junho", "Julho",
                      "Agosto", "Setembro", "Outubro",
                      "Novembro", "Dezembro"}; 
    JPanel inferior = new JPanel();


    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMIAberturaCaixa = new javax.swing.JMenuItem();
        jMIFechamentoCaixa = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMFornecedores = new javax.swing.JMenu();
        jMIMadeira = new javax.swing.JMenuItem();
        jMIUnidadeMadeiraCadastro = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMClientes = new javax.swing.JMenu();
        jMIClienteCadastro = new javax.swing.JMenuItem();
        jMICidadeCadastro = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMIChequeCadastro = new javax.swing.JMenuItem();
        jMIBancoCadastro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMICartaoCadastro = new javax.swing.JMenuItem();
        jMITipoCartaoCadastro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jNovoUsuario = new javax.swing.JMenuItem();
        jAlterarSenha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jMenu4.setText("Custos");

        jMIAberturaCaixa.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\abertura_caixa.png")); // NOI18N
        jMIAberturaCaixa.setText("Abertura de Caixa");
        jMIAberturaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAberturaCaixaActionPerformed(evt);
            }
        });
        jMenu4.add(jMIAberturaCaixa);

        jMIFechamentoCaixa.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\fechamento_caixa.png")); // NOI18N
        jMIFechamentoCaixa.setText("Fechamento de Caixa");
        jMIFechamentoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFechamentoCaixaActionPerformed(evt);
            }
        });
        jMenu4.add(jMIFechamentoCaixa);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\custo_venda.png")); // NOI18N
        jMenuItem3.setText("Custo de Venda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\contas_pagar.png")); // NOI18N
        jMenu5.setText("Contas a Pagar");

        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\add.png")); // NOI18N
        jMenuItem7.setText("Cadastro");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\tipo_conta.png")); // NOI18N
        jMenuItem8.setText("Tipos de Conta");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenu4.add(jMenu5);

        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\custo_anual.png")); // NOI18N
        jMenuItem5.setText("Custos Anuais");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\funcionário.png")); // NOI18N
        jMenuItem6.setText("Funcionários");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuPrincipal.add(jMenu4);

        jMenu3.setText("Máquinas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\maquina.png")); // NOI18N
        jMenuItem1.setText("Cadastro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\energia_eletrica.png")); // NOI18N
        jMenuItem2.setText("Energia Elétrica");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\relatorio.jpg")); // NOI18N
        jMenuItem9.setText("Relatório");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuPrincipal.add(jMenu3);

        jMFornecedores.setText("Madeiras");

        jMIMadeira.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\madeira.png")); // NOI18N
        jMIMadeira.setText("Cadastro");
        jMIMadeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMadeiraActionPerformed(evt);
            }
        });
        jMFornecedores.add(jMIMadeira);

        jMIUnidadeMadeiraCadastro.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\metroquadrado.png")); // NOI18N
        jMIUnidadeMadeiraCadastro.setText("Unidade Madeira");
        jMIUnidadeMadeiraCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIUnidadeMadeiraCadastroActionPerformed(evt);
            }
        });
        jMFornecedores.add(jMIUnidadeMadeiraCadastro);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\relatorio.jpg")); // NOI18N
        jMenuItem4.setText("Relatório");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMFornecedores.add(jMenuItem4);

        jMenuPrincipal.add(jMFornecedores);

        jMClientes.setText("Clientes");

        jMIClienteCadastro.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\cliente.png")); // NOI18N
        jMIClienteCadastro.setText("Cadastro");
        jMIClienteCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteCadastroActionPerformed(evt);
            }
        });
        jMClientes.add(jMIClienteCadastro);

        jMICidadeCadastro.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\cidade.png")); // NOI18N
        jMICidadeCadastro.setText("Cidades");
        jMICidadeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICidadeCadastroActionPerformed(evt);
            }
        });
        jMClientes.add(jMICidadeCadastro);

        jMenuPrincipal.add(jMClientes);

        jMenu1.setText("Cheques");

        jMIChequeCadastro.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\cheque.png")); // NOI18N
        jMIChequeCadastro.setText("Cadastro");
        jMIChequeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIChequeCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jMIChequeCadastro);

        jMIBancoCadastro.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\banco.png")); // NOI18N
        jMIBancoCadastro.setText("Banco");
        jMIBancoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBancoCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jMIBancoCadastro);

        jMenuPrincipal.add(jMenu1);

        jMenu2.setText("Cartão");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMICartaoCadastro.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\cartão.png")); // NOI18N
        jMICartaoCadastro.setText("Cadastro");
        jMICartaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICartaoCadastroActionPerformed(evt);
            }
        });
        jMenu2.add(jMICartaoCadastro);

        jMITipoCartaoCadastro.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\tipo_cartao.png")); // NOI18N
        jMITipoCartaoCadastro.setText("Tipo de Cartão");
        jMITipoCartaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITipoCartaoCadastroActionPerformed(evt);
            }
        });
        jMenu2.add(jMITipoCartaoCadastro);

        jMenuPrincipal.add(jMenu2);

        jMenu6.setText("Usuário");

        jNovoUsuario.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\usuário.png")); // NOI18N
        jNovoUsuario.setText("Novo Usuário");
        jNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNovoUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(jNovoUsuario);

        jAlterarSenha.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\senha.png")); // NOI18N
        jAlterarSenha.setText("Alterar Senha");
        jAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarSenhaActionPerformed(evt);
            }
        });
        jMenu6.add(jAlterarSenha);

        jMenuPrincipal.add(jMenu6);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIClienteCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteCadastroActionPerformed

       ClienteView tela = new ClienteView();
       tela.abreJanelaCliente(); 
        
    }//GEN-LAST:event_jMIClienteCadastroActionPerformed

    private void jMIMadeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMadeiraActionPerformed
        
        MadeiraView aa = new MadeiraView();
        aa.abreJanelaMadeira();
    }//GEN-LAST:event_jMIMadeiraActionPerformed

    private void jMIUnidadeMadeiraCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIUnidadeMadeiraCadastroActionPerformed
        
        UnidadeMadeiraView aa = new UnidadeMadeiraView();
        aa.abreJanelaUnidadeMadeira();
    }//GEN-LAST:event_jMIUnidadeMadeiraCadastroActionPerformed

    private void jMIAberturaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAberturaCaixaActionPerformed

        String status = telaAFDao.retornaStatusCX();
        
        if("F".equals(status) && !"AF".equals(status)){
            telaAF.jLTítulo.setText("Abertura de Caixa");
            telaAF.setTitle("Abertura de Caixa");
            telaAF.tipo = "A";
            telaAF.abreJanelaAFCaixa();
        }else{
            JOptionPane.showMessageDialog(null, "O caixa ja está ou já foi aberto!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMIAberturaCaixaActionPerformed

    private void jMIFechamentoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFechamentoCaixaActionPerformed
        
        String status = telaAFDao.retornaStatusCX();
        
        if("A".equals(status) && !"AF".equals(status)){
            telaAF.jLTítulo.setText("Fechamento de Caixa");
            telaAF.setTitle("Fechamento de Caixa");
            telaAF.tipo = "F";
            telaAF.abreJanelaAFCaixa();
        }else{
            JOptionPane.showMessageDialog(null, "O caixa ja está ou ja foi fechado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMIFechamentoCaixaActionPerformed

    private void jMICidadeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICidadeCadastroActionPerformed
        CidadeView aa = new CidadeView();
        aa.abreJanelaCidade();
    }//GEN-LAST:event_jMICidadeCadastroActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
//        atualizaBorda();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMICartaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICartaoCadastroActionPerformed
        
        CartaoView aa = new CartaoView();
        aa.abreJanelaCartao();
    }//GEN-LAST:event_jMICartaoCadastroActionPerformed

    private void jMITipoCartaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITipoCartaoCadastroActionPerformed
        TipoCartaoView aaa = new TipoCartaoView();
        aaa.abreJanelaTipoCartao();
    }//GEN-LAST:event_jMITipoCartaoCadastroActionPerformed

    private void jMIBancoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBancoCadastroActionPerformed
        BancoView aa = new BancoView();
        aa.abreJanelaBanco();
    }//GEN-LAST:event_jMIBancoCadastroActionPerformed

    private void jMIChequeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIChequeCadastroActionPerformed
        ChequeView c = new ChequeView();
        c.abreJanelaCheque();
    }//GEN-LAST:event_jMIChequeCadastroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MaquinaView aa = new MaquinaView();
        aa.abreJanelaMaquina();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EnergiaEletricaView aa = new EnergiaEletricaView();
        aa.abreJanelaEnergiaEletrica();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CustoAnualView aa = new CustoAnualView();
        aa.abreJanelaCustoAnual();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       FuncionarioView aa = new FuncionarioView();
       aa.abreJanelaFuncionario();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       ContaPagarView aa = new ContaPagarView();
       aa.abreJanelaContaPagar();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        TipoContaView aa = new TipoContaView();
        aa.abreJanelaTipoContaPagar();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CustoVendaView aa = new CustoVendaView();
        aa.abreJanelaCustoVenda();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Gerar relatório das Madeiras?", "Relatório", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            MadeiraDao maDao = new MadeiraDao();
            try {
                maDao.abrirRelatorio();
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Gerar relatório de Máquinas?", "Relatório", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            MaquinaDao mqDao = new MaquinaDao();
            try {
                mqDao.abrirRelatorio();
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNovoUsuarioActionPerformed
        UsuarioLogin tela = new UsuarioLogin();
        tela.jLTítulo.setText("SCCP - Novo Usuário");
        tela.jBLogin.setText("Criar");
        tela.setTitle("SCCP - Novo Usuário");
        tela.novoUser = 1;
        tela.abreJanelaUsuario();
    }//GEN-LAST:event_jNovoUsuarioActionPerformed

    private void jAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarSenhaActionPerformed
        UsuarioLogin tela = new UsuarioLogin();
        tela.jLTítulo.setText("SCCP - Alterar Senha");
        tela.jBLogin.setText("Alterar");
        tela.setTitle("SCCP - Alterar Senha");
        tela.editSenha = 1;
        tela.abreJanelaUsuario();
    }//GEN-LAST:event_jAlterarSenhaActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {            
//                UsuarioLogin login = new UsuarioLogin();
//                login.abreJanelaLogin();
                TelaPrincipal tela = new TelaPrincipal();
                tela.abreJanelaTelaPrincipal();
            }
        });
    }
    
    public void abreJanelaTelaPrincipal(){  
        

        this.setTitle("Sistema de Cálculo de Custo de Produção");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\SCCP\\img\\background.jpg"));
        this.add(background);
        configuraBorda();
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage()); 

        this.setVisible(true);
    }

    private void configuraBorda(){
           
        Border border = BorderFactory.createLoweredBevelBorder();

        horas2 = new JLabel("", JLabel.CENTER);
        horas2.setPreferredSize(new Dimension(120, 20));
        horas2.setBorder(border);

        data2 = new JLabel("", JLabel.CENTER);
        data2.setPreferredSize(new Dimension(300, 20));
        data2.setBorder(border);

        Font font = new Font("Arial", Font.BOLD,12);

        JLabel desenv = new JLabel("Desenvolvido por Filipe Renan Kohls e Rafael Radünz", JLabel.CENTER);
        desenv.setPreferredSize(new Dimension(340,20));
        desenv.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
        desenv.setBorder(border);

        JLabel setrem = new JLabel("SETREM - Bacharelado em Sistemas de Informação - 6º Semestre", JLabel.CENTER);
        setrem.setPreferredSize(new Dimension(450,20));
        setrem.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
        setrem.setBorder(border);

        inferior.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 0));

        data2.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
        horas2.setFont(font.deriveFont(font.getStyle() | Font.BOLD));

        inferior.add(desenv);
        inferior.add(setrem);
        inferior.add(data2);
        inferior.add(horas2);       
    
        ActionListener tarefa = new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
            horasData();
          }
        };
    
        javax.swing.Timer timer = new javax.swing.Timer(1000, tarefa);
        timer.start();

        this.add(inferior, BorderLayout.SOUTH);
    }
    
    private void atualizaBorda(){
        
        inferior.removeAll();
        configuraBorda();
    }

    private void horasData(){
        Calendar agora = Calendar.getInstance();
        int ho = agora.get(Calendar.HOUR_OF_DAY);
        int mi = agora.get(Calendar.MINUTE);
        int se = agora.get(Calendar.SECOND);

        int ds = agora.get(Calendar.DAY_OF_WEEK);
        int dia = agora.get(Calendar.DAY_OF_MONTH);
        int mes = agora.get(Calendar.MONTH);
        int ano = agora.get(Calendar.YEAR);
        DecimalFormat df = new DecimalFormat("00");

        horas2.setText(df.format(ho % 24) + ":" + df.format(mi) + ":" + df.format(se) + "");
        data2.setText(diaSemana[ds - 1] + ", " + df.format(dia) + " de " + meses[mes] + " de " + ano + "");
  }

    AFCaixaDao telaAFDao = new AFCaixaDao();
    AFCaixaView telaAF = new AFCaixaView();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAlterarSenha;
    private javax.swing.JMenu jMClientes;
    private javax.swing.JMenu jMFornecedores;
    private javax.swing.JMenuItem jMIAberturaCaixa;
    private javax.swing.JMenuItem jMIBancoCadastro;
    private javax.swing.JMenuItem jMICartaoCadastro;
    private javax.swing.JMenuItem jMIChequeCadastro;
    private javax.swing.JMenuItem jMICidadeCadastro;
    private javax.swing.JMenuItem jMIClienteCadastro;
    private javax.swing.JMenuItem jMIFechamentoCaixa;
    private javax.swing.JMenuItem jMIMadeira;
    private javax.swing.JMenuItem jMITipoCartaoCadastro;
    private javax.swing.JMenuItem jMIUnidadeMadeiraCadastro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenuItem jNovoUsuario;
    // End of variables declaration//GEN-END:variables
}
