package view;

import dao.CartaoDao;
import dao.TipoCartaoDao;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cartao;
import model.TipoCartao;


public class CartaoView extends javax.swing.JFrame {


    private int editando;
    
    public CartaoView() {
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
        jFTFDataCadastro = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
            jFTFDataCadastro = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jFTFDataCredito = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
            jFTFDataCadastro = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jLData1 = new javax.swing.JLabel();
        jFTFValorVenda = new javax.swing.JFormattedTextField();
        jLData2 = new javax.swing.JLabel();
        jCB1 = new javax.swing.JComboBox();
        jLData3 = new javax.swing.JLabel();
        jTFTarifa = new javax.swing.JTextField();
        jLCodigo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCartao = new javax.swing.JTable();
        jFTFValorFinal = new javax.swing.JFormattedTextField();
        jLData4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Cartão");

        jLCodigo.setText("Código");

        jTFCodigo.setEditable(false);
        jTFCodigo.setBackground(new java.awt.Color(204, 204, 204));

        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBDeletar.setText("Deletar");
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLData.setText("Data de Cadastro");

        jFTFDataCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFDataCadastroFocusLost(evt);
            }
        });

        jFTFDataCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFDataCreditoFocusLost(evt);
            }
        });

        jLData1.setText("Data de Crédito");

        jFTFValorVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFValorVendaFocusLost(evt);
            }
        });

        jLData2.setText("Valor de Venda");

        jCB1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCB1FocusLost(evt);
            }
        });
        jCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB1ActionPerformed(evt);
            }
        });

        jLData3.setText("Tipo de Cartão");

        jTFTarifa.setEditable(false);
        jTFTarifa.setBackground(new java.awt.Color(204, 204, 204));

        jLCodigo1.setText("Tarifa");

        jTCartao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Data Cadastro", "Data Crédito", "Valor Vendal", "Valor Final", "Cód. Tipo Cartão", "Tipo Cartão", "Tarifa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCartao.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTCartao.setAutoscrolls(false);
        jTCartao.setFocusable(false);
        jTCartao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTCartao.getTableHeader().setResizingAllowed(false);
        jTCartao.getTableHeader().setReorderingAllowed(false);
        jTCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCartaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCartao);

        jFTFValorFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFTFValorFinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFValorFinalFocusLost(evt);
            }
        });

        jLData4.setText("Valor Final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCodigo)
                                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFTFDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFTFDataCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFTFValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData3)
                                    .addComponent(jCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCodigo1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData4)
                                    .addComponent(jFTFValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLData1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFDataCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLData2)
                            .addComponent(jLData3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFTFValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo1)
                    .addComponent(jLData4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed

        jCB1.removeAllItems();
        for (TipoCartao a : tcDao.findAll()) { 
            String id = ""+a.getCodtipocartao();
            String nome = a.getNome();
            double tarifa = a.getTarifamensal();
            jCB1.addItem(new Item(id,nome,tarifa));    
            jTFTarifa.setText(String.valueOf(tarifa));
        } 
        jTCartao.setEnabled(false);
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jFTFDataCredito.setText("");
        jFTFDataCadastro.setText("");
        jFTFValorVenda.setText("");
        jFTFDataCadastro.requestFocus();
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed

        jCB1.removeAllItems();
        for (TipoCartao a : tcDao.findAll()) { 
            String id = ""+a.getCodtipocartao();
            String nome = a.getNome();
            double tarifa = a.getTarifamensal();
            jCB1.addItem(new Item(id,nome, tarifa));    
        } 
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jTCartao.setEnabled(false);
        
        String codigo = ""+jTCartao.getValueAt(jTCartao.getSelectedRow(),0);
        String datacad = ""+jTCartao.getValueAt(jTCartao.getSelectedRow(),1);
        String datacred = ""+jTCartao.getValueAt(jTCartao.getSelectedRow(),2);
        String valorvenda = ""+jTCartao.getValueAt(jTCartao.getSelectedRow(),3);
        
        jTFCodigo.setText(codigo);
        jFTFDataCadastro.setText(datacad);
        jFTFDataCredito.setText(datacred);
        jFTFValorVenda.setText(valorvenda);
        
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");  
        SimpleDateFormat formato2 = new SimpleDateFormat("ddMMyyyy");  
        try {
            jFTFDataCadastro.setText(formato2.format(formato1.parse(datacad)));
            jFTFDataCredito.setText(formato2.format(formato1.parse(datacred)));
        } catch (ParseException ex) {
        }
       

        editando = 1;

    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
       

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String datacad = jFTFDataCadastro.getText();
            String datacred = jFTFDataCredito.getText();
            String valor = jFTFValorVenda.getText().replace(",", ".");
            double valorvenda = Double.valueOf(valor);

            cartao = new Cartao();

            if(!"  /  /    ".equals(datacad)){
                try {
                    java.util.Date dtcad, dtcred; 
                    dtcad = formatter.parse(datacad);
                    dtcred = formatter.parse(datacred);
                    //java.sql.Date d = new java.sql.Date(dt.getTime());  
                    cartao.setDatacad(dtcad);
                    cartao.setDacatred(dtcred);
                } catch (ParseException e) {
                }
            }
            TipoCartao setarcodigo = new TipoCartao();
            Item i = (Item) jCB1.getSelectedItem(); 
            setarcodigo.setCodtipocartao(Integer.valueOf(i.codtipocartao));
            setarcodigo.setNome(i.nometipocartao);
                    
            cartao.setTipocartao(setarcodigo);
          //  cartao.setDacatred(datacred);
            cartao.setValorvenda(valorvenda);
           
            if(editando != 1){
                dao.insert(cartao);
            }else{
                int codigo = Integer.parseInt(jTFCodigo.getText());
                cartao.setCodcartao(codigo);
                dao.update(cartao);
            }

            listar();

            jTFCodigo.setText("");
            jFTFDataCadastro.setText("");
            jFTFDataCredito.setText("");
            jFTFValorVenda.setText("");
            jFTFValorFinal.setText("");
            jBNovo.setEnabled(true);
            jBGravar.setEnabled(false);
            jBCancelar.setEnabled(false);
            jTCartao.setEnabled(true);

    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed

        
        if (JOptionPane.showConfirmDialog(null, "Excluír registro selecionado?", "Excluír registro", ConfirmationCallback.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            String codigo = ""+jTCartao.getValueAt(jTCartao.getSelectedRow(),0);

            cartao = dao.findById(Integer.parseInt(codigo));
            dao.delete(cartao);

            listar();
        
            jBDeletar.setEnabled(false);
            jBEditar.setEnabled(false);
        }
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        
        jTFCodigo.setText("");
        jFTFDataCadastro.setText("");
        jFTFDataCredito.setText("");
        jFTFValorVenda.setText("");
        jTFTarifa.setText("");
        jTCartao.setEnabled(true);
        jBNovo.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBGravar.setEnabled(false);
        jBCancelar.setEnabled(false);
        jBEditar.setEnabled(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jFTFDataCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFDataCadastroFocusLost

        SimpleDateFormat formatIso = new SimpleDateFormat("dd/MM/yyyy");
        Date dataT, dataA;
        Calendar c = Calendar.getInstance();
        String datateste = jFTFDataCadastro.getText();
        String dataatual  = formatIso.format(c.getTime());

        try{
            dataT = formatIso.parse(datateste);
            dataA = formatIso.parse(dataatual);

            if(dataT.after(dataA)){
                JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                jFTFDataCadastro.requestFocus();
            }
        }catch(NumberFormatException | ParseException e){
        }
    }//GEN-LAST:event_jFTFDataCadastroFocusLost

    private void jFTFDataCreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFDataCreditoFocusLost
        SimpleDateFormat formatIso = new SimpleDateFormat("dd/MM/yyyy");
        Date dataT, dataA;
        Calendar c = Calendar.getInstance();
        String datateste = jFTFDataCredito.getText();
        String dataatual  = formatIso.format(c.getTime());

        try{
            dataT = formatIso.parse(datateste);
            dataA = formatIso.parse(dataatual);

            if(dataT.after(dataA)){
                JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                jFTFDataCredito.requestFocus();
            }
        }catch(NumberFormatException | ParseException e){
        }
    }//GEN-LAST:event_jFTFDataCreditoFocusLost

    private void jFTFValorVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFValorVendaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFValorVendaFocusLost

    private void jCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB1ActionPerformed

    private void jTCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCartaoMouseClicked

        if (jTCartao.isEnabled()){
            jBEditar.setEnabled(true);
            jBDeletar.setEnabled(true);
        }
    }//GEN-LAST:event_jTCartaoMouseClicked

    private void jFTFValorFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFValorFinalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFValorFinalFocusLost

    private void jCB1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCB1FocusLost
       
        
    }//GEN-LAST:event_jCB1FocusLost

    private void jFTFValorFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFValorFinalFocusGained
       double calc1, calc2, total; 
        
        calc1 = Double.parseDouble(jFTFValorVenda.getText());
        calc2 = Double.parseDouble(jTFTarifa.getText());
        
        total = calc1 - calc2;
        
        jFTFValorFinal.setText(String.valueOf(total));
    }//GEN-LAST:event_jFTFValorFinalFocusGained


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
            java.util.logging.Logger.getLogger(CartaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartaoView().setVisible(true);
            }
        });
    }
    
      public void abreJanelaCartao(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        //ImageIcon image = new ImageIcon("C:\\SCF\\img\\icone.png");
       // this.setIconImage(image.getImage()); 
        
        this.setVisible(true);
    }
      
       public class Item{  
  
        public String codtipocartao;   
        public String nometipocartao; 
        public double tarifa;

        public Item(String id,String nome, double tarifa){  
            this.codtipocartao = id;  
            this.nometipocartao = nome; 
            this.tarifa = tarifa;
        }  
        
        @Override  
        public String toString(){  
          return nometipocartao;
         }  
        
        public String toStringTarifa(){  
          return String.valueOf(tarifa);
         } 
    }  
    
    private void listar(){

        DefaultTableModel dados = (DefaultTableModel) jTCartao.getModel();
        dados.setNumRows(0);

        ((DefaultTableCellRenderer)jTCartao.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER); 
        
        for(Cartao ca : dao.findAll()){
            dados.addRow(new String[]{""+ca.getCodcartao(), ""+ca.getDatacad(),""+ca.getDacatred(), ""+ca.getValorvenda(), ""+ca.getValorfinal(), ""+ca.getTipocartao().getCodtipocartao(), ""+ca.getTipocartao().getNome(), ""+ca.getTipocartao().getTarifamensal()});
        }
    }
    private final CartaoDao dao = new CartaoDao();
    private Cartao cartao = new Cartao();
    private final TipoCartaoDao tcDao = new TipoCartaoDao();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JComboBox jCB1;
    private javax.swing.JFormattedTextField jFTFDataCadastro;
    private javax.swing.JFormattedTextField jFTFDataCredito;
    private javax.swing.JFormattedTextField jFTFValorFinal;
    private javax.swing.JFormattedTextField jFTFValorVenda;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLData1;
    private javax.swing.JLabel jLData2;
    private javax.swing.JLabel jLData3;
    private javax.swing.JLabel jLData4;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCartao;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFTarifa;
    // End of variables declaration//GEN-END:variables
}
