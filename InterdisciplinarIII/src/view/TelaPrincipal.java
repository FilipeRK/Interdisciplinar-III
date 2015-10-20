package view;

import dao.AFCaixaDao;
//import dao.CidadesDao;
import dao.ClienteDao;
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
        jMCaixa = new javax.swing.JMenu();
        jMIAberturaCaixa = new javax.swing.JMenuItem();
        jMIFechamentoCaixa = new javax.swing.JMenuItem();
        jMLancar = new javax.swing.JMenu();
        jMIEntrada = new javax.swing.JMenuItem();
        jMISaida = new javax.swing.JMenuItem();
        jMIVendaPrazo = new javax.swing.JMenuItem();
        jMCadastros = new javax.swing.JMenu();
        jMICondicaoPagamento = new javax.swing.JMenuItem();
        jMITipoAlteracao = new javax.swing.JMenuItem();
        jMMovimentacao = new javax.swing.JMenu();
        jMIEntradas = new javax.swing.JMenuItem();
        jMISaidas = new javax.swing.JMenuItem();
        jMFornecedores = new javax.swing.JMenu();
        jMIFornecedoresCadastro = new javax.swing.JMenuItem();
        jMIFornecedoresRelatorio = new javax.swing.JMenuItem();
        jMOpcoes = new javax.swing.JMenu();
        jMManutencao = new javax.swing.JMenu();
        jMIBackup = new javax.swing.JMenuItem();
        jMIRestore = new javax.swing.JMenuItem();
        jMUsuario = new javax.swing.JMenu();
        jMINovoUsuario = new javax.swing.JMenuItem();
        jMIAlterarSenha = new javax.swing.JMenuItem();
        jMITrocarUsuario = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMISair = new javax.swing.JMenuItem();
        jMClientes = new javax.swing.JMenu();
        jMIClienteCadastro = new javax.swing.JMenuItem();
        jMICidadeCadastro = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMIChequeCadastro = new javax.swing.JMenuItem();
        jMIBancoCadastro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMICartaoCadastro = new javax.swing.JMenuItem();
        jMITipoCartaoCadastro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jMCaixa.setForeground(new java.awt.Color(255, 0, 0));
        jMCaixa.setText("Financeiro");
        jMCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMCaixaMouseClicked(evt);
            }
        });

        jMIAberturaCaixa.setText("Abertura de Caixa");
        jMIAberturaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAberturaCaixaActionPerformed(evt);
            }
        });
        jMCaixa.add(jMIAberturaCaixa);

        jMIFechamentoCaixa.setText("Fechamento de Caixa");
        jMIFechamentoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFechamentoCaixaActionPerformed(evt);
            }
        });
        jMCaixa.add(jMIFechamentoCaixa);

        jMLancar.setText("Lançar");

        jMIEntrada.setText("Entrada");
        jMIEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEntradaActionPerformed(evt);
            }
        });
        jMLancar.add(jMIEntrada);

        jMISaida.setText("Saída");
        jMISaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISaidaActionPerformed(evt);
            }
        });
        jMLancar.add(jMISaida);

        jMIVendaPrazo.setText("Venda à prazo");
        jMIVendaPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVendaPrazoActionPerformed(evt);
            }
        });
        jMLancar.add(jMIVendaPrazo);

        jMCaixa.add(jMLancar);

        jMCadastros.setText("Cadastros");

        jMICondicaoPagamento.setText("Condição de Pagamento");
        jMICondicaoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICondicaoPagamentoActionPerformed(evt);
            }
        });
        jMCadastros.add(jMICondicaoPagamento);

        jMITipoAlteracao.setText("Tipo de Alteração");
        jMITipoAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITipoAlteracaoActionPerformed(evt);
            }
        });
        jMCadastros.add(jMITipoAlteracao);

        jMCaixa.add(jMCadastros);

        jMMovimentacao.setText("Movimentação");

        jMIEntradas.setText("Entradas");
        jMIEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEntradasActionPerformed(evt);
            }
        });
        jMMovimentacao.add(jMIEntradas);

        jMISaidas.setText("Saídas");
        jMISaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISaidasActionPerformed(evt);
            }
        });
        jMMovimentacao.add(jMISaidas);

        jMCaixa.add(jMMovimentacao);

        jMenuPrincipal.add(jMCaixa);

        jMFornecedores.setForeground(new java.awt.Color(255, 0, 0));
        jMFornecedores.setText("Fornecedores");

        jMIFornecedoresCadastro.setText("Cadastro");
        jMIFornecedoresCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFornecedoresCadastroActionPerformed(evt);
            }
        });
        jMFornecedores.add(jMIFornecedoresCadastro);

        jMIFornecedoresRelatorio.setText("Relatório");
        jMIFornecedoresRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFornecedoresRelatorioActionPerformed(evt);
            }
        });
        jMFornecedores.add(jMIFornecedoresRelatorio);

        jMenuPrincipal.add(jMFornecedores);

        jMOpcoes.setForeground(new java.awt.Color(255, 0, 0));
        jMOpcoes.setText("Opções");

        jMManutencao.setText("Manutenção");

        jMIBackup.setText("Backup");
        jMIBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBackupActionPerformed(evt);
            }
        });
        jMManutencao.add(jMIBackup);

        jMIRestore.setText("Restore");
        jMIRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRestoreActionPerformed(evt);
            }
        });
        jMManutencao.add(jMIRestore);

        jMOpcoes.add(jMManutencao);

        jMUsuario.setText("Usuário");

        jMINovoUsuario.setText("Novo Usuário");
        jMINovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMINovoUsuarioActionPerformed(evt);
            }
        });
        jMUsuario.add(jMINovoUsuario);

        jMIAlterarSenha.setText("Alterar Senha");
        jMIAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlterarSenhaActionPerformed(evt);
            }
        });
        jMUsuario.add(jMIAlterarSenha);

        jMITrocarUsuario.setText("Trocar de Usuário");
        jMITrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITrocarUsuarioActionPerformed(evt);
            }
        });
        jMUsuario.add(jMITrocarUsuario);

        jMOpcoes.add(jMUsuario);

        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMOpcoes.add(jMISair);

        jMenuPrincipal.add(jMOpcoes);

        jMClientes.setText("Clientes");

        jMIClienteCadastro.setText("Cadastro");
        jMIClienteCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteCadastroActionPerformed(evt);
            }
        });
        jMClientes.add(jMIClienteCadastro);

        jMICidadeCadastro.setText("Cidades");
        jMICidadeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICidadeCadastroActionPerformed(evt);
            }
        });
        jMClientes.add(jMICidadeCadastro);

        jMenuPrincipal.add(jMClientes);

        jMenu1.setText("Cheques");

        jMIChequeCadastro.setText("Cadastro");
        jMenu1.add(jMIChequeCadastro);

        jMIBancoCadastro.setText("Banco");
        jMenu1.add(jMIBancoCadastro);

        jMenuPrincipal.add(jMenu1);

        jMenu2.setText("Cartão");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMICartaoCadastro.setText("Cadastro");
        jMICartaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICartaoCadastroActionPerformed(evt);
            }
        });
        jMenu2.add(jMICartaoCadastro);

        jMITipoCartaoCadastro.setText("Tipo de Cartão");
        jMITipoCartaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITipoCartaoCadastroActionPerformed(evt);
            }
        });
        jMenu2.add(jMITipoCartaoCadastro);

        jMenuPrincipal.add(jMenu2);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMISairActionPerformed

    private void jMIClienteCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteCadastroActionPerformed

//        ClientesCadastro tela = new ClientesCadastro();
//        tela.abreJanelaClienteCadastro();
//        //this.setVisible(false);
        
    }//GEN-LAST:event_jMIClienteCadastroActionPerformed

    private void jMIEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEntradaActionPerformed
//        String st = telaAFDao.retornaStatusCX();
//        if("A".equals(st) && !"AF".equals(st)){
//            LancamentosCadastro tela = new LancamentosCadastro();
//            tela.tipodelancamento = 1;
//            tela.abreJanelaLancamentosCadastro();
//           // this.setVisible(false);
//        }else{
//            JOptionPane.showMessageDialog(null, "O caixa está fechado!", "Caixa fechado", JOptionPane.INFORMATION_MESSAGE);
//        }
        
    }//GEN-LAST:event_jMIEntradaActionPerformed

    private void jMITipoAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITipoAlteracaoActionPerformed
//       
//        TipoAlteracaoCadastro tela = new TipoAlteracaoCadastro();
//        tela.abreJanelaTipoAlteracaoCadastro();
//        //this.setVisible(false);
    }//GEN-LAST:event_jMITipoAlteracaoActionPerformed

    private void jMIFornecedoresCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFornecedoresCadastroActionPerformed
//        
//        FornecedoresCadastro tela = new FornecedoresCadastro();
//        tela.abreJanelaFornecedoresCadastro();
//        //this.setVisible(false);
    }//GEN-LAST:event_jMIFornecedoresCadastroActionPerformed

    private void jMISaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISaidaActionPerformed
//        String st = telaAFDao.retornaStatusCX();
//        if("A".equals(st) && !"AF".equals(st)){
//            LancamentosCadastro tela = new LancamentosCadastro();
//            tela.tipodelancamento = 2;
//            tela.abreJanelaLancamentosCadastro();
//           // this.setVisible(false);
//        }else{
//            JOptionPane.showMessageDialog(null, "O caixa está fechado!", "Caixa fechado", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_jMISaidaActionPerformed

    private void jMICondicaoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICondicaoPagamentoActionPerformed
//        CondicaoPagamentoCadastro tela = new CondicaoPagamentoCadastro();
//        tela.abreJanelaCondicaoPagamentoCadastro();
        //this.setVisible(false);
    }//GEN-LAST:event_jMICondicaoPagamentoActionPerformed

    private void jMITrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITrocarUsuarioActionPerformed
//        if(JOptionPane.showConfirmDialog(null, "Deseja trocar de usuário?", "Trocar de Usuário", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
//            UsuarioLogin tela = new UsuarioLogin();
//            tela.jLTítulo.setText("SCF - Login");
//            tela.abreJanelaLogin();
//           // this.dispose();
//        }
    }//GEN-LAST:event_jMITrocarUsuarioActionPerformed

    private void jMIAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlterarSenhaActionPerformed
//        UsuarioLogin tela = new UsuarioLogin();
//        tela.jLTítulo.setText("SCF - Alterar Senha");
//        tela.jBLogin.setText("Alterar");
//        tela.setTitle("SCF - Alterar Senha");
//        tela.editSenha = 1;
//        tela.abreJanelaLogin();
    }//GEN-LAST:event_jMIAlterarSenhaActionPerformed

    private void jMINovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINovoUsuarioActionPerformed
//        UsuarioLogin tela = new UsuarioLogin();
//        tela.jLTítulo.setText("SCF - Novo Usuário");
//        tela.jBLogin.setText("Criar");
//        tela.setTitle("SCF - Novo Usuário");
//        tela.novoUser = 1;
//        tela.abreJanelaLogin();
    }//GEN-LAST:event_jMINovoUsuarioActionPerformed

    private void jMIBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBackupActionPerformed
        
        DateFormat df = new SimpleDateFormat("ddMMyyyy");    
        Calendar c = Calendar.getInstance();      
        String data  = df.format(c.getTime()); 
 
        if(JOptionPane.showConfirmDialog(null, "Deseja fazer backup do banco de dados?", "Backup", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){ 
            try{  
                Scanner s = new Scanner(Runtime.getRuntime().exec("C:\\SCF\\gbak.exe -user SYSDBA -pas masterkey C:\\SCF\\BANCO.fdb C:\\SCF\\BKP\\BANCO-"+data+".fbk").getInputStream());  
                JOptionPane.showMessageDialog(null, "Backup efetuado com sucesso! \n \n Caminho: C:\\SCF\\BKP\\BANCO-"+data+".fbk", "Backup", JOptionPane.INFORMATION_MESSAGE);
            }catch (IOException ex){  
            } 
        }  
    }//GEN-LAST:event_jMIBackupActionPerformed

    private void jMIRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRestoreActionPerformed
        JFileChooser jFC = new JFileChooser();  
        jFC.setApproveButtonText("Selecionar");  
        jFC.setCurrentDirectory(new File("C:\\SCF\\BKP"));
        jFC.setDialogTitle("Selecione a pasta que contém o Backup"); 
        jFC.setFileSelectionMode(JFileChooser.FILES_ONLY);  
        int returnVal = jFC.showOpenDialog(this); 
        if (returnVal == JFileChooser.APPROVE_OPTION)  
        {  
            String diretorio = jFC.getSelectedFile().getName();

            util.HibernateUtil.getSessionFactory().close();

            File bd = new File("C:\\SCF\\BANCO.FDB"); 
            bd.delete();
            try{
                Scanner s = new Scanner(Runtime.getRuntime().exec("C:\\SCF\\gbak.exe -user SYSDBA -pas masterkey -r C:\\SCF\\BKP\\"+diretorio+" C:\\SCF\\BANCO.FDB -rep").getInputStream());  
                JOptionPane.showMessageDialog(null, "Restauração concluída!\n\n O programa será fechado para aplicar as configurações!", "Restauração", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }  
            catch (IOException ex){  
                JOptionPane.showMessageDialog(null, "Ocorreu um erro!", "Erro", JOptionPane.ERROR_MESSAGE);
            }  
        }
    }//GEN-LAST:event_jMIRestoreActionPerformed

    private void jMIFornecedoresRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFornecedoresRelatorioActionPerformed
//        if(JOptionPane.showConfirmDialog(null, "Gerar relatório de Fornecedores?", "Relatório", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
//            FornecedoresDao fornDao = new FornecedoresDao();
//            try {
//                fornDao.abrirRelatorio();
//            }catch(Exception e){
//            }
//        }
    }//GEN-LAST:event_jMIFornecedoresRelatorioActionPerformed

    private void jMIAberturaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAberturaCaixaActionPerformed

//        String status = telaAFDao.retornaStatusCX();
//        
//        if("F".equals(status) && !"AF".equals(status)){
//            telaAF.jLTítulo.setText("Abertura de Caixa");
//            telaAF.setTitle("Abertura de Caixa");
//            telaAF.tipo = "A";
//            telaAF.abreJanelaAFCaixa();
//        }else{
//            JOptionPane.showMessageDialog(null, "O caixa ja está ou já foi aberto!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_jMIAberturaCaixaActionPerformed

    private void jMIFechamentoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFechamentoCaixaActionPerformed
        
//        String status = telaAFDao.retornaStatusCX();
//        
//        if("A".equals(status) && !"AF".equals(status)){
//            telaAF.jLTítulo.setText("Fechamento de Caixa");
//            telaAF.setTitle("Fechamento de Caixa");
//            telaAF.tipo = "F";
//            telaAF.abreJanelaAFCaixa();
//        }else{
//            JOptionPane.showMessageDialog(null, "O caixa ja está ou ja foi fechado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_jMIFechamentoCaixaActionPerformed

    private void jMCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMCaixaMouseClicked
        
    }//GEN-LAST:event_jMCaixaMouseClicked

    private void jMICidadeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICidadeCadastroActionPerformed
//        if(JOptionPane.showConfirmDialog(null, "Gerar relatório de Clientes?", "Relatório", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
//            ClienteDao cliDao = new ClienteDao();
//            try {
//                cliDao.abrirRelatorio();
//            }catch(Exception e){
//            }
//        }
    }//GEN-LAST:event_jMICidadeCadastroActionPerformed

    private void jMIVendaPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVendaPrazoActionPerformed
//        String st = telaAFDao.retornaStatusCX();
//        if("A".equals(st) && !"AF".equals(st)){
//            ParcelasCadastro tela = new ParcelasCadastro();
//            tela.abreJanelaParcelasCadastro();
//            tela.jBNovo.requestFocus();
//            //this.dispose();
//        }else{
//            JOptionPane.showMessageDialog(null, "O caixa está fechado!", "Caixa fechado", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_jMIVendaPrazoActionPerformed

    private void jMIEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEntradasActionPerformed
        
//        MovimentacoesConsulta movcon = new MovimentacoesConsulta();
//        movcon.jLTitulo.setText("Movimentações de Entrada");
//        movcon.tipodelancamento = 1;
//        try {
//            movcon.abreJanelaMovimentacoesConsulta();
//            //this.dispose();
//        } catch (ParseException ex){
//        }
    }//GEN-LAST:event_jMIEntradasActionPerformed

    private void jMISaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISaidasActionPerformed
        
//        MovimentacoesConsulta movcon = new MovimentacoesConsulta();
//        movcon.jLTitulo.setText("Movimentações de Saída");
//        movcon.tipodelancamento = 2;
//         try {
//            movcon.abreJanelaMovimentacoesConsulta();
//            //this.dispose();
//        } catch (ParseException ex){ 
//        }
    }//GEN-LAST:event_jMISaidasActionPerformed

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
        
        this.setTitle("SCF - Sistema para Controle Financeiro");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
       // JLabel background=new JLabel(new ImageIcon("C:\\SCF\\img\\background.jpg"));
       // this.add(background);
      //  configuraBorda();
        //ImageIcon image = new ImageIcon("C:\\SCF\\img\\icone.png");
       // this.setIconImage(image.getImage()); 

        this.setVisible(true);
    }

//    private void configuraBorda(){
//           
//        Border border = BorderFactory.createLoweredBevelBorder();
//
//        horas2 = new JLabel("", JLabel.CENTER);
//        horas2.setPreferredSize(new Dimension(120, 20));
//        horas2.setBorder(border);
//
//        data2 = new JLabel("", JLabel.CENTER);
//        data2.setPreferredSize(new Dimension(300, 20));
//        data2.setBorder(border);
//
//        Font font = new Font("Arial", Font.BOLD,12);
//
//        JLabel desenv = new JLabel("Desenvolvido por Filipe Renan Kohls e Rafael Radünz", JLabel.CENTER);
//        desenv.setPreferredSize(new Dimension(340,20));
//        desenv.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
//        desenv.setBorder(border);
//
//        JLabel setrem = new JLabel("SETREM - Bacharelado em Sistemas de Informação - 4º Semestre", JLabel.CENTER);
//        setrem.setPreferredSize(new Dimension(450,20));
//        setrem.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
//        setrem.setBorder(border);
//        
//        JLabel valorCaixa = new JLabel("Caixa: R$"+telaAFDao.retornaSaldoDiaPFechar2(), JLabel.CENTER);
//        valorCaixa.setPreferredSize(new Dimension(140,20));
//        valorCaixa.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
//        valorCaixa.setBorder(border);
//
//        inferior.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 0));
//
//        data2.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
//        horas2.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
//               
//        inferior.add(valorCaixa);
//        inferior.add(desenv);
//        inferior.add(setrem);
//        inferior.add(data2);
//        inferior.add(horas2);       
//    
//        ActionListener tarefa = new ActionListener(){
//          @Override
//          public void actionPerformed(ActionEvent e){
//            horasData();
//          }
//        };
//    
//        javax.swing.Timer timer = new javax.swing.Timer(1000, tarefa);
//        timer.start();
//
//        this.add(inferior, BorderLayout.SOUTH);
//    }
//    
//    private void atualizaBorda(){
//        
//        inferior.removeAll();
//        configuraBorda();
//    }

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
    private javax.swing.JMenu jMCadastros;
    private javax.swing.JMenu jMCaixa;
    private javax.swing.JMenu jMClientes;
    private javax.swing.JMenu jMFornecedores;
    private javax.swing.JMenuItem jMIAberturaCaixa;
    private javax.swing.JMenuItem jMIAlterarSenha;
    private javax.swing.JMenuItem jMIBackup;
    private javax.swing.JMenuItem jMIBancoCadastro;
    private javax.swing.JMenuItem jMICartaoCadastro;
    private javax.swing.JMenuItem jMIChequeCadastro;
    private javax.swing.JMenuItem jMICidadeCadastro;
    private javax.swing.JMenuItem jMIClienteCadastro;
    private javax.swing.JMenuItem jMICondicaoPagamento;
    private javax.swing.JMenuItem jMIEntrada;
    private javax.swing.JMenuItem jMIEntradas;
    private javax.swing.JMenuItem jMIFechamentoCaixa;
    private javax.swing.JMenuItem jMIFornecedoresCadastro;
    private javax.swing.JMenuItem jMIFornecedoresRelatorio;
    private javax.swing.JMenuItem jMINovoUsuario;
    private javax.swing.JMenuItem jMIRestore;
    private javax.swing.JMenuItem jMISaida;
    private javax.swing.JMenuItem jMISaidas;
    private javax.swing.JMenuItem jMITipoAlteracao;
    private javax.swing.JMenuItem jMITipoCartaoCadastro;
    private javax.swing.JMenuItem jMITrocarUsuario;
    private javax.swing.JMenuItem jMIVendaPrazo;
    private javax.swing.JMenu jMLancar;
    private javax.swing.JMenu jMManutencao;
    private javax.swing.JMenu jMMovimentacao;
    private javax.swing.JMenu jMOpcoes;
    private javax.swing.JMenu jMUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
