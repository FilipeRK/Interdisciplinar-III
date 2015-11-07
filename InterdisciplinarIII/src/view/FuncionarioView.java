package view;

import dao.CustoAnualDao;
import dao.FuncionarioDao;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;


public class FuncionarioView extends javax.swing.JFrame {


    private int editando;
    
    public FuncionarioView() {
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
        jTFuncionario = new javax.swing.JTable();
        jTFNome = new javax.swing.JTextField();
        jFTFCPF = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("###.###.###-##");
            jFTFCPF = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jLData1 = new javax.swing.JLabel();
        jFTFTelefone = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("(##)####-####");
            jFTFTelefone = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jLData4 = new javax.swing.JLabel();
        jTFFuncao = new javax.swing.JTextField();
        jLData2 = new javax.swing.JLabel();
        jFTFDataAdmissao = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
            jFTFDataAdmissao = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jLData3 = new javax.swing.JLabel();
        jTFEndereco = new javax.swing.JTextField();
        jLData5 = new javax.swing.JLabel();
        jTFSalarioBase = new javax.swing.JTextField();
        jLData6 = new javax.swing.JLabel();
        jTFINSS = new javax.swing.JTextField();
        jLData7 = new javax.swing.JLabel();
        jLData8 = new javax.swing.JLabel();
        jTFInsalubridade = new javax.swing.JTextField();
        jTFQuinquenio = new javax.swing.JTextField();
        jLData9 = new javax.swing.JLabel();
        jTFSindicato = new javax.swing.JTextField();
        jLData10 = new javax.swing.JLabel();
        jTFHorasAno = new javax.swing.JTextField();
        jLData11 = new javax.swing.JLabel();
        jTFCustoMM = new javax.swing.JTextField();
        jLData13 = new javax.swing.JLabel();
        jTFCustoAno = new javax.swing.JTextField();
        jLData14 = new javax.swing.JLabel();
        jTFCustoDia = new javax.swing.JTextField();
        jLData15 = new javax.swing.JLabel();
        jTFCustoHora = new javax.swing.JTextField();
        jLData16 = new javax.swing.JLabel();
        jTFCustoModHora = new javax.swing.JTextField();
        jLData17 = new javax.swing.JLabel();
        jTFSalarioFinal = new javax.swing.JTextField();
        jLData18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Funcionário");

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
        jBGravar.setMinimumSize(new java.awt.Dimension(95, 25));
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBDeletar.setIcon(new javax.swing.ImageIcon("C:\\SCCP\\img\\deletar.png")); // NOI18N
        jBDeletar.setText("Deletar");
        jBDeletar.setMinimumSize(new java.awt.Dimension(95, 25));
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

        jTFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone", "Função", "Data de Admissão", "Endereço", "Salário Base", "INSS", "Insalubridade", "Quinquenio", "Sindicato", "Horas/Ano", "Custo Médio Mensal", "Custo/Ano", "Custo/Dia", "Custo/Hora", "Custo/MODHora", "Salário Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTFuncionario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTFuncionario.setAutoscrolls(false);
        jTFuncionario.setFocusable(false);
        jTFuncionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTFuncionario.getTableHeader().setResizingAllowed(false);
        jTFuncionario.getTableHeader().setReorderingAllowed(false);
        jTFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTFuncionario);
        if (jTFuncionario.getColumnModel().getColumnCount() > 0) {
            jTFuncionario.getColumnModel().getColumn(1).setMinWidth(200);
            jTFuncionario.getColumnModel().getColumn(2).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(3).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(4).setMinWidth(150);
            jTFuncionario.getColumnModel().getColumn(5).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(6).setMinWidth(150);
            jTFuncionario.getColumnModel().getColumn(7).setMinWidth(150);
            jTFuncionario.getColumnModel().getColumn(8).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(9).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(10).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(11).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(12).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(13).setMinWidth(150);
            jTFuncionario.getColumnModel().getColumn(14).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(15).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(16).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(17).setMinWidth(100);
            jTFuncionario.getColumnModel().getColumn(18).setMinWidth(150);
        }

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

        jLData1.setText("CPF");

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

        jLData4.setText("Telefone");

        jLData2.setText("Função");

        jFTFDataAdmissao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFDataAdmissaoFocusLost(evt);
            }
        });
        jFTFDataAdmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFDataAdmissaoActionPerformed(evt);
            }
        });

        jLData3.setText("Data de Admissão");

        jTFEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEnderecoActionPerformed(evt);
            }
        });

        jLData5.setText("Endereço");

        jTFSalarioBase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFSalarioBaseFocusGained(evt);
            }
        });

        jLData6.setText("Salário Base");

        jTFINSS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFINSSFocusGained(evt);
            }
        });

        jLData7.setText("INSS");

        jLData8.setText("Insalubridade");

        jTFInsalubridade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFInsalubridadeFocusGained(evt);
            }
        });
        jTFInsalubridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFInsalubridadeActionPerformed(evt);
            }
        });

        jTFQuinquenio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFQuinquenioFocusGained(evt);
            }
        });

        jLData9.setText("Quinquênio");

        jTFSindicato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFSindicatoFocusGained(evt);
            }
        });

        jLData10.setText("Sindicato");

        jLData11.setText("Horas Ano");

        jTFCustoMM.setEditable(false);
        jTFCustoMM.setBackground(new java.awt.Color(204, 204, 204));

        jLData13.setText("Custo Médio Mensal");

        jTFCustoAno.setEditable(false);
        jTFCustoAno.setBackground(new java.awt.Color(204, 204, 204));

        jLData14.setText("Custo/Ano");

        jTFCustoDia.setEditable(false);
        jTFCustoDia.setBackground(new java.awt.Color(204, 204, 204));

        jLData15.setText("Custo/Dia");

        jTFCustoHora.setEditable(false);
        jTFCustoHora.setBackground(new java.awt.Color(204, 204, 204));

        jLData16.setText("Custo/Hora");

        jTFCustoModHora.setEditable(false);
        jTFCustoModHora.setBackground(new java.awt.Color(204, 204, 204));

        jLData17.setText("Custo/MODHora");

        jTFSalarioFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFSalarioFinalFocusGained(evt);
            }
        });

        jLData18.setText("Salário Final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCodigo)
                                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLData1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jFTFCPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData4)
                                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLData3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLData5)
                                        .addGap(150, 150, 150))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFTFDataAdmissao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLData6)
                                        .addGap(43, 43, 43)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLData7)
                                        .addGap(0, 84, Short.MAX_VALUE))
                                    .addComponent(jTFINSS, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFInsalubridade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFQuinquenio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData11)
                                    .addComponent(jTFHorasAno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFCustoMM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData13, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFCustoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFCustoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData16)
                                    .addComponent(jTFCustoHora)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLData15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFCustoModHora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLData17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFSalarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLData18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLData)
                            .addComponent(jLData1)
                            .addComponent(jLData4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTFDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLData2)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLData3)
                            .addComponent(jLData5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLData9)
                            .addComponent(jLData10)
                            .addComponent(jLData11)
                            .addComponent(jLData8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFHorasAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFINSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFInsalubridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFQuinquenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLData6)
                        .addComponent(jLData7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFCustoMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFCustoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFCustoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFCustoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFCustoModHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFSalarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLData16)
                            .addComponent(jLData13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLData14)
                                .addComponent(jLData15))
                            .addComponent(jLData17)
                            .addComponent(jLData18))
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed

        jTFuncionario.setEnabled(false);
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        
        limpar();
        jTFSalarioBase.setText("0,0");
        jTFINSS.setText("0,0");
        jTFInsalubridade.setText("0,0");
        jTFQuinquenio.setText("0,0");
        jTFSindicato.setText("0,0");
        jTFNome.requestFocus();
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed

        
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jTFuncionario.setEnabled(false);
        
        String codigo = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),0);
        String nome = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),1);
        String cpf = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),2);
        String telefone = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),3);
        String funcao = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),4);
        String dataadm = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),5);
        String endereco = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),6);
        String salariobase = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),7);
        String inss = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),8);
        String insalubridade = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),9);
        String quinquenio = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),10);
        String sindicato = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),11);
        String horasano = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),12);
        String customm = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),13);
        String custoano = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),14);
        String custodia = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),15);
        String custohora = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),16);
        String customodhora = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),17);
        String salariofinal = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),18);
        
        jTFCodigo.setText(codigo);
        jTFNome.setText(nome);
        jFTFCPF.setText(cpf);
        jFTFTelefone.setText(telefone);
        jTFFuncao.setText(funcao);
       // jFTFDataAdmissao.setText(dataadm);
        jTFEndereco.setText(endereco);
        jTFSalarioBase.setText(salariobase);
        jTFINSS.setText(inss);
        jTFInsalubridade.setText(insalubridade);
        jTFQuinquenio.setText(quinquenio);
        jTFSindicato.setText(sindicato);
        jTFHorasAno.setText(horasano);
        jTFCustoMM.setText(customm);
        jTFCustoAno.setText(custoano);
        jTFCustoDia.setText(custodia);
        jTFCustoHora.setText(custohora);
        jTFCustoModHora.setText(customodhora);
        jTFSalarioFinal.setText(salariofinal);
        
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");  
        SimpleDateFormat formato2 = new SimpleDateFormat("ddMMyyyy");  
        try {
            jFTFDataAdmissao.setText(formato2.format(formato1.parse(dataadm)));
        } catch (ParseException ex) {
        }

        editando = 1;
        
        
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        if (!"".equals(jTFNome.getText())){

            
        String nome = jTFNome.getText();
        String cpf = jFTFCPF.getText();
        String telefone = jFTFTelefone.getText();
        String funcao = jTFFuncao.getText();
        String dataadm = jFTFDataAdmissao.getText();
        String endereco = jTFEndereco.getText();
        double salariobase = Double.parseDouble(jTFSalarioBase.getText().replace(",", "."));
        double inss = Double.parseDouble(jTFINSS.getText().replace(",", "."));
        double insalubridade = Double.parseDouble(jTFInsalubridade.getText().replace(",", "."));
        double quinquenio = Double.parseDouble(jTFQuinquenio.getText().replace(",", "."));
        double sindicato = Double.parseDouble(jTFSindicato.getText().replace(",", "."));
        String horasano = jTFHorasAno.getText();
        double customm = Double.parseDouble(jTFCustoMM.getText().replace(",", "."));
        double custoano = Double.parseDouble(jTFCustoAno.getText().replace(",", "."));
        double custodia = Double.parseDouble(jTFCustoDia.getText().replace(",", "."));
        double custohora = Double.parseDouble(jTFCustoHora.getText().replace(",", "."));
        double customodhora = Double.parseDouble(jTFCustoModHora.getText().replace(",", "."));
        double salariofinal = Double.parseDouble(jTFSalarioFinal.getText().replace(",", "."));

           

            funcionario = new Funcionario();

            funcionario.setNome(nome);
            funcionario.setCpf(cpf);
            funcionario.setTelefone(telefone);
            funcionario.setFuncao(funcao);
            if(!"  /  /    ".equals(dataadm)){
                try {
                    java.util.Date dtnasc; 
                    dtnasc = formatter.parse(dataadm);
                    //java.sql.Date d = new java.sql.Date(dt.getTime());  
                    funcionario.setDataadmissao(dtnasc);
                } catch (ParseException e) {
                }
            }
            funcionario.setEndereco(endereco);
            funcionario.setSalariobase(salariobase);
            funcionario.setInss(inss);
            funcionario.setInsalubridade(insalubridade);
            funcionario.setQuinquenio(quinquenio);
            funcionario.setSindicato(sindicato);
            funcionario.setHorasano(Integer.valueOf(horasano));
            funcionario.setCustomediomensal(customm);
            funcionario.setCustototalano(custoano);
            funcionario.setCustodia(custodia);
            funcionario.setCustohora(custohora);
            funcionario.setCustomodhora(customodhora);
            funcionario.setSalariofinal(salariofinal);
            
            if(editando != 1){
                dao.insert(funcionario);
            }else{
                int codigo = Integer.parseInt(jTFCodigo.getText());
                funcionario.setCodfuncionario(codigo);
                dao.update(funcionario);
            }

            listar();

            jTFCodigo.setText("");
            limpar();
            jBNovo.setEnabled(true);
            jBGravar.setEnabled(false);
            jBCancelar.setEnabled(false);
            jTFuncionario.setEnabled(true);

        }else{
            JOptionPane.showMessageDialog(null, "Há campos obrigatórios em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        
        
        if (JOptionPane.showConfirmDialog(null, "Excluír registro selecionado?", "Excluír registro", ConfirmationCallback.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            String codigo = ""+jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(),0);

            funcionario = dao.findById(Integer.parseInt(codigo));
            dao.delete(funcionario);

            listar();
        
            jBDeletar.setEnabled(false);
            jBEditar.setEnabled(false);
        }
        
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        
        jTFCodigo.setText("");
        limpar();
        jTFSalarioBase.setText("");
        jTFINSS.setText("");
        jTFInsalubridade.setText("");
        jTFQuinquenio.setText("");
        jTFSindicato.setText("");
        jTFuncionario.setEnabled(true);
        jBNovo.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBGravar.setEnabled(false);
        jBCancelar.setEnabled(false);
        jBEditar.setEnabled(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFuncionarioMouseClicked

        if (jTFuncionario.isEnabled()){
            jBEditar.setEnabled(true);
            jBDeletar.setEnabled(true);
        }
    }//GEN-LAST:event_jTFuncionarioMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened

    private void jFTFCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFCPFFocusLost
        validaCPF(jFTFCPF.getText());
    }//GEN-LAST:event_jFTFCPFFocusLost

    private void jFTFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFCPFActionPerformed

    private void jFTFTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFTelefoneFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFTelefoneFocusLost

    private void jFTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFTelefoneActionPerformed

    private void jFTFDataAdmissaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFDataAdmissaoFocusLost

        SimpleDateFormat formatIso = new SimpleDateFormat("dd/MM/yyyy");
        Date dataT, dataA;
        Calendar c = Calendar.getInstance();
        String datateste = jFTFDataAdmissao.getText();
        String dataatual  = formatIso.format(c.getTime());

        try{
            dataT = formatIso.parse(datateste);
            dataA = formatIso.parse(dataatual);

            if(dataT.after(dataA)){
                JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                jFTFDataAdmissao.requestFocus();
            }
        }catch(NumberFormatException | ParseException e){
        }
    }//GEN-LAST:event_jFTFDataAdmissaoFocusLost

    private void jFTFDataAdmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFDataAdmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFDataAdmissaoActionPerformed

    private void jTFEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEnderecoActionPerformed

    private void jTFSalarioFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFSalarioFinalFocusGained
        calculaSalario();
    }//GEN-LAST:event_jTFSalarioFinalFocusGained

    private void jTFInsalubridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFInsalubridadeActionPerformed
        
    }//GEN-LAST:event_jTFInsalubridadeActionPerformed

    private void jTFSalarioBaseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFSalarioBaseFocusGained
        jTFSalarioBase.selectAll();
    }//GEN-LAST:event_jTFSalarioBaseFocusGained

    private void jTFINSSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFINSSFocusGained
        jTFINSS.selectAll();
    }//GEN-LAST:event_jTFINSSFocusGained

    private void jTFQuinquenioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFQuinquenioFocusGained
        jTFQuinquenio.selectAll();
    }//GEN-LAST:event_jTFQuinquenioFocusGained

    private void jTFSindicatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFSindicatoFocusGained
        jTFSindicato.selectAll();
    }//GEN-LAST:event_jTFSindicatoFocusGained

    private void jTFInsalubridadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFInsalubridadeFocusGained
        jTFInsalubridade.selectAll();
    }//GEN-LAST:event_jTFInsalubridadeFocusGained


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
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }
    
      public void abreJanelaFuncionario(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("Cadastro de Funcionários");
        
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage()); 

        this.setVisible(true);
    }
      
      private void listar(){

        DefaultTableModel dados = (DefaultTableModel) jTFuncionario.getModel();
        dados.setNumRows(0);
        
        ((DefaultTableCellRenderer)jTFuncionario.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER); 

        for(Funcionario fu : dao.findAll()){
           dados.addRow(new String[]{""+fu.getCodfuncionario(), fu.getNome(), ""+fu.getCpf(), ""+fu.getTelefone(), fu.getFuncao(), ""+fu.getDataadmissao(), fu.getEndereco(), ""+format(fu.getSalariobase()), ""+format(fu.getInss()), ""+format(fu.getInsalubridade()), ""+format(fu.getQuinquenio()), ""+format(fu.getSindicato()), ""+fu.getHorasano(), ""+format(fu.getCustomediomensal()), ""+format(fu.getCustototalano()), ""+format(fu.getCustodia()), ""+format(fu.getCustohora()), ""+format(fu.getCustomodhora()), ""+format(fu.getSalariofinal())});
        }
    }

    
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

    
    public void limpar(){
        jTFNome.setText("");
        jFTFCPF.setText("");
        jFTFTelefone.setText("");
        jTFFuncao.setText("");
        jFTFDataAdmissao.setText("");
        jTFEndereco.setText("");
        jTFHorasAno.setText("");
        jTFCustoMM.setText("");
        jTFCustoAno.setText("");
        jTFCustoDia.setText("");
        jTFCustoHora.setText("");
        jTFCustoModHora.setText("");
        jTFSalarioFinal.setText("");
    }
    public static String format(double x) {  
        return String.format("%.2f", x);  
    }  
    
    public void calculaSalario(){
         NumberFormat formatter = new DecimalFormat("#,###.00");
      
        double  customm, custototalano, custodia, custohora, customodhora, salariobase, salariofinal, inss, quinquenio, sindicato, insalubridade;
        
        salariobase = Double.parseDouble(jTFSalarioBase.getText().replace(",", "."));
        inss = Double.parseDouble(jTFINSS.getText().replace(",", "."));
        quinquenio = Double.parseDouble(jTFQuinquenio.getText().replace(",", "."));
        sindicato = Double.parseDouble(jTFSindicato.getText().replace(",", "."));
        insalubridade = Double.parseDouble(jTFInsalubridade.getText().replace(",", "."));
              
        salariofinal = (salariobase+insalubridade+quinquenio)-(inss+sindicato);    
        customm = (((((salariobase+insalubridade)*0.08)+salariofinal)*13.33)-(insalubridade*1.33))/12;
        custototalano = customm*12;
        customodhora = custototalano/Double.valueOf(jTFHorasAno.getText());
        double custototaldia = Double.parseDouble(caDao.retornaTotalCustoDia().replace(",", "."));
        custodia = (customodhora+custototaldia)*8.5;
        custohora = custodia/8.5;
        
        jTFCustoMM.setText(String.valueOf(format(customm)));
        jTFCustoAno.setText(String.valueOf(format(custototalano)));
        jTFCustoModHora.setText(String.valueOf(format(customodhora)));
        jTFCustoDia.setText(String.valueOf(format(custodia)));
        jTFCustoHora.setText(String.valueOf(format(custohora)));
        jTFSalarioFinal.setText(String.valueOf(format(salariofinal)));
        
    }
          
    private final FuncionarioDao dao = new FuncionarioDao();
    private Funcionario funcionario = new Funcionario();
    private CustoAnualDao caDao = new CustoAnualDao();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JFormattedTextField jFTFCPF;
    private javax.swing.JFormattedTextField jFTFDataAdmissao;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLData1;
    private javax.swing.JLabel jLData10;
    private javax.swing.JLabel jLData11;
    private javax.swing.JLabel jLData13;
    private javax.swing.JLabel jLData14;
    private javax.swing.JLabel jLData15;
    private javax.swing.JLabel jLData16;
    private javax.swing.JLabel jLData17;
    private javax.swing.JLabel jLData18;
    private javax.swing.JLabel jLData2;
    private javax.swing.JLabel jLData3;
    private javax.swing.JLabel jLData4;
    private javax.swing.JLabel jLData5;
    private javax.swing.JLabel jLData6;
    private javax.swing.JLabel jLData7;
    private javax.swing.JLabel jLData8;
    private javax.swing.JLabel jLData9;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCustoAno;
    private javax.swing.JTextField jTFCustoDia;
    private javax.swing.JTextField jTFCustoHora;
    private javax.swing.JTextField jTFCustoMM;
    private javax.swing.JTextField jTFCustoModHora;
    private javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFFuncao;
    private javax.swing.JTextField jTFHorasAno;
    private javax.swing.JTextField jTFINSS;
    private javax.swing.JTextField jTFInsalubridade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFQuinquenio;
    private javax.swing.JTextField jTFSalarioBase;
    private javax.swing.JTextField jTFSalarioFinal;
    private javax.swing.JTextField jTFSindicato;
    private javax.swing.JTable jTFuncionario;
    // End of variables declaration//GEN-END:variables
}
