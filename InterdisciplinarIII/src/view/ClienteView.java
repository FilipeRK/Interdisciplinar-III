package view;

import dao.CidadeDao;
import dao.ClienteDao;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
import model.Cliente;


public class ClienteView extends javax.swing.JFrame {


    private int editando;
    
    public ClienteView() {
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
        jCB1 = new javax.swing.JComboBox();
        jLData3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCliente = new javax.swing.JTable();
        jTFNome = new javax.swing.JTextField();
        jLData1 = new javax.swing.JLabel();
        jFTFDataNascimento = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
            jFTFDataNascimento = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jLData2 = new javax.swing.JLabel();
        jLData4 = new javax.swing.JLabel();
        jFTFTelefone = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("(##)####-####");
            jFTFTelefone = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jFTFCPF = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("###.###.###-##");
            jFTFCPF = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jTFEndereco = new javax.swing.JTextField();
        jLData5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Cliente");

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

        jLData.setText("Nome");

        jCB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCB1ItemStateChanged(evt);
            }
        });
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

        jLData3.setText("Cidade");

        jTCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Data de Nascimento", "Telefone", "Endereço", "Cód. Cidade", "Cidade"
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
        jTCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTCliente.setAutoscrolls(false);
        jTCliente.setFocusable(false);
        jTCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTCliente.getTableHeader().setResizingAllowed(false);
        jTCliente.getTableHeader().setReorderingAllowed(false);
        jTCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCliente);
        if (jTCliente.getColumnModel().getColumnCount() > 0) {
            jTCliente.getColumnModel().getColumn(1).setMinWidth(150);
            jTCliente.getColumnModel().getColumn(2).setMinWidth(100);
            jTCliente.getColumnModel().getColumn(3).setMinWidth(100);
            jTCliente.getColumnModel().getColumn(4).setMinWidth(100);
            jTCliente.getColumnModel().getColumn(5).setMinWidth(150);
            jTCliente.getColumnModel().getColumn(6).setMinWidth(100);
            jTCliente.getColumnModel().getColumn(7).setMinWidth(150);
        }

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jLData1.setText("CPF");

        jFTFDataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFDataNascimentoFocusLost(evt);
            }
        });
        jFTFDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFDataNascimentoActionPerformed(evt);
            }
        });

        jLData2.setText("Data de Nascimento");

        jLData4.setText("Telefone");

        jFTFTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFTelefoneFocusLost(evt);
            }
        });
        jFTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFTelefoneActionPerformed(evt);
            }
        });

        jFTFCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFCPFFocusLost(evt);
            }
        });
        jFTFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFCPFActionPerformed(evt);
            }
        });

        jTFEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEnderecoActionPerformed(evt);
            }
        });

        jLData5.setText("Endereço");

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
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLData1)
                                .addGap(86, 86, 86))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFTFCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLData2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFTFDataNascimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLData4)
                            .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData3)
                                    .addComponent(jCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLData)
                                            .addComponent(jLData1))
                                        .addGap(26, 26, 26))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLData4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLData2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLData3)
                    .addComponent(jLData5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
        for (Cidade a : ciDao.findAll()) { 
            String id = ""+a.getCodcidade();
            String nome = a.getNome();
            jCB1.addItem(new Item(id,nome));    
        } 
        jTCliente.setEnabled(false);
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jTFNome.setText("");
        jFTFCPF.setText("");
        jFTFDataNascimento.setText("");
        jFTFTelefone.setText("");
        jTFEndereco.setText("");
        jTFNome.requestFocus();
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed

        jCB1.removeAllItems();
        for (Cidade a : ciDao.findAll()) { 
            String id = ""+a.getCodcidade();
            String nome = a.getNome();
            jCB1.addItem(new Item(id,nome));    
        } 
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jTCliente.setEnabled(false);
        
        String codigo = ""+jTCliente.getValueAt(jTCliente.getSelectedRow(),0);
        String nome = ""+jTCliente.getValueAt(jTCliente.getSelectedRow(),1);
        String cpf = ""+jTCliente.getValueAt(jTCliente.getSelectedRow(),2);
        String datanasc = ""+jTCliente.getValueAt(jTCliente.getSelectedRow(),3);
        String telefone = ""+jTCliente.getValueAt(jTCliente.getSelectedRow(),4);
        String endereco = ""+jTCliente.getValueAt(jTCliente.getSelectedRow(),5);
        
        jTFCodigo.setText(codigo);
        jTFNome.setText(nome);
        jFTFCPF.setText(cpf);
        jFTFDataNascimento.setText(datanasc);
        jFTFTelefone.setText(telefone);
        jTFEndereco.setText(endereco);
        
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");  
        SimpleDateFormat formato2 = new SimpleDateFormat("ddMMyyyy");  
        try {
            jFTFDataNascimento.setText(formato2.format(formato1.parse(datanasc)));
        } catch (ParseException ex) {
        }
       

        editando = 1;

    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
       

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String nome = jTFNome.getText();
            String cpf = jFTFCPF.getText();
            String datanasc = jFTFDataNascimento.getText();
            String telefone = jFTFTelefone.getText();
            String endereco = jTFEndereco.getText();

            cliente = new Cliente();

            if(!"  /  /    ".equals(datanasc)){
                try {
                    java.util.Date dtnasc; 
                    dtnasc = formatter.parse(datanasc);
                    //java.sql.Date d = new java.sql.Date(dt.getTime());  
                    cliente.setDatanascimento(dtnasc);
                } catch (ParseException e) {
                }
            }
            Cidade setarcodigo = new Cidade();
            Item i = (Item) jCB1.getSelectedItem(); 
            setarcodigo.setCodcidade(Integer.valueOf(i.codcidade));
            setarcodigo.setNome(i.nome);
                    
            cliente.setCidade(setarcodigo);
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setTelefone(telefone);
            cliente.setEndereco(endereco);
           
            if(editando != 1){
                dao.insert(cliente);
            }else{
                int codigo = Integer.parseInt(jTFCodigo.getText());
                cliente.setCodcliente(codigo);
                dao.update(cliente);
            }

            listar();

            jTFCodigo.setText("");
            jTFNome.setText("");
            jFTFCPF.setText("");
            jFTFDataNascimento.setText("");
            jFTFTelefone.setText("");
            jTFEndereco.setText("");
            jBNovo.setEnabled(true);
            jBGravar.setEnabled(false);
            jBCancelar.setEnabled(false);
            jTCliente.setEnabled(true);

    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed

        
        if (JOptionPane.showConfirmDialog(null, "Excluír registro selecionado?", "Excluír registro", ConfirmationCallback.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            String codigo = ""+jTCliente.getValueAt(jTCliente.getSelectedRow(),0);

            cliente = dao.findById(Integer.parseInt(codigo));
            dao.delete(cliente);

            listar();
        
            jBDeletar.setEnabled(false);
            jBEditar.setEnabled(false);
        }
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        
        jTFCodigo.setText("");
        jTFNome.setText("");
        jFTFCPF.setText("");
        jFTFDataNascimento.setText("");
        jFTFTelefone.setText("");
        jTFEndereco.setText("");
        jTCliente.setEnabled(true);
        jBNovo.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBGravar.setEnabled(false);
        jBCancelar.setEnabled(false);
        jBEditar.setEnabled(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB1ActionPerformed

    private void jTClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClienteMouseClicked

        if (jTCliente.isEnabled()){
            jBEditar.setEnabled(true);
            jBDeletar.setEnabled(true);
        }
    }//GEN-LAST:event_jTClienteMouseClicked

    private void jCB1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCB1FocusLost
       
        
    }//GEN-LAST:event_jCB1FocusLost

    private void jCB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB1ItemStateChanged

    }//GEN-LAST:event_jCB1ItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jFTFDataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFDataNascimentoFocusLost

        SimpleDateFormat formatIso = new SimpleDateFormat("dd/MM/yyyy");
        Date dataT, dataA;
        Calendar c = Calendar.getInstance();
        String datateste = jFTFDataNascimento.getText();
        String dataatual  = formatIso.format(c.getTime());

        try{
            dataT = formatIso.parse(datateste);
            dataA = formatIso.parse(dataatual);

            if(dataT.after(dataA)){
                JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                jFTFDataNascimento.requestFocus();
            }
        }catch(NumberFormatException | ParseException e){
        }
    }//GEN-LAST:event_jFTFDataNascimentoFocusLost

    private void jFTFDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFDataNascimentoActionPerformed

    private void jFTFTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFTelefoneFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFTelefoneFocusLost

    private void jFTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFTelefoneActionPerformed

    private void jFTFCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFCPFFocusLost
        validaCPF(jFTFCPF.getText());
    }//GEN-LAST:event_jFTFCPFFocusLost

    private void jFTFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFCPFActionPerformed

    private void jTFEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEnderecoActionPerformed


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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }
    
      public void abreJanelaCliente(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("Cadastro de Clientes");
        
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage()); 
        
        this.setVisible(true);
    }
      
       public class Item{  
  
        public String codcidade;   
        public String nome; 

        public Item(String id,String nome){  
            this.codcidade = id;  
            this.nome = nome; 
        }  
        
        @Override  
        public String toString(){  
          return nome;
         }  
    }  
    
    private void listar(){

        DefaultTableModel dados = (DefaultTableModel) jTCliente.getModel();
        dados.setNumRows(0);

        ((DefaultTableCellRenderer)jTCliente.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER); 
        
        for(Cliente ca : dao.findAll()){
            dados.addRow(new String[]{""+ca.getCodcliente(), ca.getNome(), ca.getCpf(), ""+ca.getDatanascimento(), ca.getTelefone(), ca.getEndereco(), ""+ca.getCidade().getCodcidade(), ca.getCidade().getNome()});
        }
    }
    private final ClienteDao dao = new ClienteDao();
    private Cliente cliente = new Cliente();
    private final CidadeDao ciDao = new CidadeDao();
    
    public boolean validaCPF(String CPFCliente){
        if(!"   .   .   -  ".equals(CPFCliente)){
            String CPF1 = CPFCliente.replace(".", "");
            String CPF = CPF1.replace("-", "");
            if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
                CPF.equals("22222222222") || CPF.equals("33333333333") ||
                CPF.equals("44444444444") || CPF.equals("55555555555") ||
                CPF.equals("66666666666") || CPF.equals("77777777777") ||
                CPF.equals("88888888888") || CPF.equals("99999999999") ||
               (CPF.length() != 11)){
                    JOptionPane.showMessageDialog(null, "CPF Inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
            }
            char dig10, dig11;
            int sm, i, r, num, peso;

            try {
                sm = 0;
                peso = 10;
                for (i=0; i<9; i++) {                      
                    num = (int)(CPF.charAt(i) - 48); 
                    sm = sm + (num * peso);
                    peso = peso - 1;
                }
                r = 11 - (sm % 11);
                if ((r == 10) || (r == 11)){
                dig10 = '0';
                }else{
                    dig10 = (char)(r + 48);
                }

                sm = 0;
                peso = 11;
                for(i=0; i<10; i++) {
                    num = (int)(CPF.charAt(i) - 48);
                    sm = sm + (num * peso);
                    peso = peso - 1;
                }
                r = 11 - (sm % 11);
                if ((r == 10) || (r == 11)){
                   dig11 = '0';
                }else{
                    dig11 = (char)(r + 48);
                }

                if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))){
                }else{
                    JOptionPane.showMessageDialog(null, "CPF Inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    

                    jFTFCPF.requestFocus();

                    jFTFCPF.setText("");
                    return false;
                }
            } catch (InputMismatchException erro) {
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JComboBox jCB1;
    private javax.swing.JFormattedTextField jFTFCPF;
    private javax.swing.JFormattedTextField jFTFDataNascimento;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLData1;
    private javax.swing.JLabel jLData2;
    private javax.swing.JLabel jLData3;
    private javax.swing.JLabel jLData4;
    private javax.swing.JLabel jLData5;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCliente;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}
