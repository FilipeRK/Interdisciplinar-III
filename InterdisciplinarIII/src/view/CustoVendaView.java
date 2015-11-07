package view;

import dao.CustoVendaDao;
import dao.EnergiaEletricaDao;
import dao.FuncionarioDao;
import dao.MadeiraDao;
import dao.MaquinaDao;
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
import model.CustoVenda;
import model.EnergiaEletrica;
import model.Funcionario;
import model.Madeira;
import model.Maquina;


public class CustoVendaView extends javax.swing.JFrame {


    private int editando;
    
    public CustoVendaView() {
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
        jCBMaquina = new javax.swing.JComboBox();
        jLData3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCustoVenda = new javax.swing.JTable();
        jTFCustoAdicional = new javax.swing.JTextField();
        jFTFDataVenda = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
            jFTFDataVenda = new javax.swing.JFormattedTextField(mask);
        }
        catch (ParseException e){
        }
        jLData2 = new javax.swing.JLabel();
        jLData4 = new javax.swing.JLabel();
        jCBEnergia = new javax.swing.JComboBox();
        jCBFuncionario = new javax.swing.JComboBox();
        jLData5 = new javax.swing.JLabel();
        jCBMadeira = new javax.swing.JComboBox();
        jLData6 = new javax.swing.JLabel();
        jTFPerda = new javax.swing.JTextField();
        jLData1 = new javax.swing.JLabel();
        jLData7 = new javax.swing.JLabel();
        jTFCustoFinal = new javax.swing.JTextField();
        jTFMargemLucro = new javax.swing.JTextField();
        jLData8 = new javax.swing.JLabel();
        jTFValorFinal = new javax.swing.JTextField();
        jLData9 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLData11 = new javax.swing.JLabel();
        jLData12 = new javax.swing.JLabel();
        jTFCustoEnergia = new javax.swing.JTextField();
        jTFHoras = new javax.swing.JTextField();
        jLData10 = new javax.swing.JLabel();
        jLData13 = new javax.swing.JLabel();
        jLData14 = new javax.swing.JLabel();
        jTFCustoMaquina = new javax.swing.JTextField();
        jTFCustoMadeira = new javax.swing.JTextField();
        jTFCustoFuncionario = new javax.swing.JTextField();
        jTFMadeira = new javax.swing.JTextField();
        jLData15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Custo de Venda");

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

        jLData.setText("Custo Adicional");

        jCBMaquina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBMaquinaItemStateChanged(evt);
            }
        });
        jCBMaquina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBMaquinaFocusLost(evt);
            }
        });
        jCBMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMaquinaActionPerformed(evt);
            }
        });

        jLData3.setText("Máquina");

        jTCustoVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cód. Máquina", "Máquina", "Cód. Energia", "Energia", "Cód. Funcionário", "Funcionário", "Cód. Madeira", "Madeira", "Data da Venda", "Custo Adicional", "Perda", "Custo Final", "Margem de Lucro", "Valor Final", "Horas", "Madeira Utilizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
            jTCustoVenda.getColumnModel().getColumn(16).setMinWidth(150);
        }

        jTFCustoAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCustoAdicionalActionPerformed(evt);
            }
        });

        jFTFDataVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFDataVendaFocusLost(evt);
            }
        });
        jFTFDataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFDataVendaActionPerformed(evt);
            }
        });

        jLData2.setText("Data da Venda");

        jLData4.setText("Energia");

        jCBEnergia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBEnergiaItemStateChanged(evt);
            }
        });
        jCBEnergia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBEnergiaFocusLost(evt);
            }
        });
        jCBEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEnergiaActionPerformed(evt);
            }
        });

        jCBFuncionario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBFuncionarioItemStateChanged(evt);
            }
        });
        jCBFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBFuncionarioFocusLost(evt);
            }
        });
        jCBFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFuncionarioActionPerformed(evt);
            }
        });

        jLData5.setText("Funcionário");

        jCBMadeira.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBMadeiraItemStateChanged(evt);
            }
        });
        jCBMadeira.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBMadeiraFocusLost(evt);
            }
        });
        jCBMadeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMadeiraActionPerformed(evt);
            }
        });

        jLData6.setText("Madeira");

        jTFPerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPerdaActionPerformed(evt);
            }
        });

        jLData1.setText("Perda(%)");

        jLData7.setText("Custo Final");

        jTFCustoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCustoFinalActionPerformed(evt);
            }
        });

        jTFMargemLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMargemLucroActionPerformed(evt);
            }
        });

        jLData8.setText("Margem Lucro(%)");

        jTFValorFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorFinalActionPerformed(evt);
            }
        });

        jLData9.setText("Valor Final");

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLData11.setText("Máquina");

        jLData12.setText("Energia");

        jTFCustoEnergia.setEditable(false);
        jTFCustoEnergia.setBackground(new java.awt.Color(204, 204, 204));
        jTFCustoEnergia.setFocusable(false);
        jTFCustoEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCustoEnergiaActionPerformed(evt);
            }
        });

        jTFHoras.setEditable(false);
        jTFHoras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFHorasFocusLost(evt);
            }
        });
        jTFHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFHorasActionPerformed(evt);
            }
        });

        jLData10.setText("Horas");

        jLData13.setText("Funcionário");

        jLData14.setText("Madeira");

        jTFCustoMaquina.setEditable(false);
        jTFCustoMaquina.setBackground(new java.awt.Color(204, 204, 204));
        jTFCustoMaquina.setFocusable(false);
        jTFCustoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCustoMaquinaActionPerformed(evt);
            }
        });

        jTFCustoMadeira.setEditable(false);
        jTFCustoMadeira.setBackground(new java.awt.Color(204, 204, 204));
        jTFCustoMadeira.setFocusable(false);
        jTFCustoMadeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCustoMadeiraActionPerformed(evt);
            }
        });

        jTFCustoFuncionario.setEditable(false);
        jTFCustoFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jTFCustoFuncionario.setFocusable(false);
        jTFCustoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCustoFuncionarioActionPerformed(evt);
            }
        });

        jTFMadeira.setEditable(false);
        jTFMadeira.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFMadeiraFocusLost(evt);
            }
        });
        jTFMadeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMadeiraActionPerformed(evt);
            }
        });

        jLData15.setText("Madeira");

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLData15))
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLData11)
                                .addGap(50, 50, 50))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFCustoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCustoEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLData12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLData13)
                            .addComponent(jTFCustoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLData14)
                            .addComponent(jTFCustoMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLData10))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLData10)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLData14)
                                .addGap(26, 26, 26))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLData12)
                                    .addComponent(jLData11)
                                    .addComponent(jLData13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFCustoEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCustoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCustoMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCustoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLData15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(jLData11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLData12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFCustoEnergia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFHoras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLData10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLData13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLData14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFCustoMaquina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFCustoMadeira, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFCustoFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFMadeira, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLData15, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTFDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLData2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFCustoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLData))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFPerda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLData1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLData7)
                                        .addComponent(jTFCustoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTFMargemLucro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLData8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLData9)))))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLData6)
                            .addComponent(jCBMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCodigo)
                                        .addGap(44, 44, 44)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData3)
                                    .addComponent(jCBMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData4)
                                    .addComponent(jCBEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData5)
                                    .addComponent(jCBFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCodigo)
                                    .addComponent(jLData3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLData5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLData4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLData6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2)
                .addGap(18, 18, 18)
                .addComponent(jLData2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFTFDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLData9)
                    .addComponent(jLData8)
                    .addComponent(jLData7)
                    .addComponent(jLData1)
                    .addComponent(jLData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCustoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCustoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jCBMaquina.removeAllItems();
        for (Maquina a : maDao.findAll()) { 
            String id = ""+a.getCodmaquina();
            String nome = a.getNome();
            String consumo = ""+a.getConsumo();
            String depreciacao = ""+a.getDepreciacao();
            String valormanutencao = ""+a.getValormanutencao();
            String precounitario = ""+a.getPrecounitario();
            jCBMaquina.addItem(new ItemMaquina(id,nome,consumo,depreciacao,valormanutencao,precounitario));    
        } 
        jCBEnergia.removeAllItems();
        for (EnergiaEletrica a : enDao.findAll()) { 
            String id = ""+a.getCodenergiaeletrica();
            String nome = a.getPrestadora();
            String valorhora = ""+a.getValorhora();
            jCBEnergia.addItem(new ItemEnergia(id,nome,valorhora));    
        } 
        jCBFuncionario.removeAllItems();
        for (Funcionario a : fuDao.findAll()) { 
            String id = ""+a.getCodfuncionario();
            String nome = a.getNome();
            jCBFuncionario.addItem(new ItemFuncionario(id,nome));    
        } 
        jCBMadeira.removeAllItems();
        for (Madeira a : madeiraDao.findAll()) { 
            String id = ""+a.getCodmadeira();
            String nome = a.getNome();
            jCBMadeira.addItem(new ItemMadeira(id,nome));    
        }
        jTCustoVenda.setEnabled(false);
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jTFCustoAdicional.setText("");
        jFTFDataVenda.setText("");
        jTFCustoAdicional.setText("");
        jTFPerda.setText("");
        jTFCustoFinal.setText("");
        jTFMargemLucro.setText("");
        jTFValorFinal.setText("");
        jTFHoras.setText("");
        jTFMadeira.setText("");
        jTFCustoMaquina.setText("");
        jTFCustoEnergia.setText("");
        jTFCustoFuncionario.setText("");
        jTFCustoMadeira.setText("");
        jTFHoras.setEditable(true);
        jTFMadeira.setEditable(true);
        jTFCustoAdicional.requestFocus();
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed

        jCBMaquina.removeAllItems();
        for (Maquina a : maDao.findAll()) { 
            String id = ""+a.getCodmaquina();
            String nome = a.getNome();
            String consumo = ""+a.getConsumo();
            String depreciacao = ""+a.getDepreciacao();
            String valormanutencao = ""+a.getValormanutencao();
            String precounitario = ""+a.getPrecounitario();
            jCBMaquina.addItem(new ItemMaquina(id,nome,consumo,depreciacao,valormanutencao,precounitario));    
        } 
        jCBEnergia.removeAllItems();
        for (EnergiaEletrica a : enDao.findAll()) { 
            String id = ""+a.getCodenergiaeletrica();
            String nome = a.getPrestadora();
            String valorhora = ""+a.getValorhora();
            jCBEnergia.addItem(new ItemEnergia(id,nome,valorhora));    
        } 
        jCBFuncionario.removeAllItems();
        for (Funcionario a : fuDao.findAll()) { 
            String id = ""+a.getCodfuncionario();
            String nome = a.getNome();
            jCBFuncionario.addItem(new ItemFuncionario(id,nome));    
        } 
        jCBMadeira.removeAllItems();
        for (Madeira a : madeiraDao.findAll()) { 
            String id = ""+a.getCodmadeira();
            String nome = a.getNome();
            jCBMadeira.addItem(new ItemMadeira(id,nome));    
        }
        jBCancelar.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNovo.setEnabled(false);
        jBGravar.setEnabled(true);
        jTCustoVenda.setEnabled(false);
        jTFHoras.setEditable(true);
        jTFMadeira.setEditable(true);
        
        String codigo = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),0);
        String datavenda = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),9);
        String custoadicional = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),10);
        String perda = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),11);
        String custofinal = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),12);
        String margemlucro = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),13);
        String valorfinal = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),14);
        String hora = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),15);
        String tamanhomadeira = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),14);
        
        jTFCodigo.setText(codigo);
        jFTFDataVenda.setText(datavenda);
        jTFCustoAdicional.setText(custoadicional);
        jTFPerda.setText(perda);
        jTFCustoFinal.setText(custofinal);
        jTFMargemLucro.setText(margemlucro);
        jTFValorFinal.setText(valorfinal);
        jTFHoras.setText(hora);
        jTFMadeira.setText(tamanhomadeira);
        
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");  
        SimpleDateFormat formato2 = new SimpleDateFormat("ddMMyyyy");  
        try {
            jFTFDataVenda.setText(formato2.format(formato1.parse(datavenda)));
        } catch (ParseException ex) {
        }
       

        editando = 1;

    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
       

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String nome = jTFCustoAdicional.getText();
            String datavenda = jFTFDataVenda.getText();
            String custoadicional = jTFCustoAdicional.getText();
            String perda = jTFPerda.getText();
            String custofinal = jTFCustoFinal.getText();
            String margemlucro = jTFMargemLucro.getText();
            String valorfinal = jTFValorFinal.getText();
            String horas = jTFHoras.getText();
            String tamanhomadeira = jTFMadeira.getText();
            
            custovenda = new CustoVenda();

            if(!"  /  /    ".equals(datavenda)){
                try {
                    java.util.Date dtnasc; 
                    dtnasc = formatter.parse(datavenda);
                    //java.sql.Date d = new java.sql.Date(dt.getTime());  
                    custovenda.setDatavenda(dtnasc);
                } catch (ParseException e) {
                }
            }
            Maquina scMaquina = new Maquina();
            ItemMaquina imaq = (ItemMaquina) jCBMaquina.getSelectedItem(); 
            scMaquina.setCodmaquina(Integer.valueOf(imaq.codmaquina));
            scMaquina.setNome(imaq.nome);
            
            EnergiaEletrica scEnergia = new EnergiaEletrica();
            ItemEnergia iee = (ItemEnergia) jCBEnergia.getSelectedItem(); 
            scEnergia.setCodenergiaeletrica(Integer.valueOf(iee.codenergia));
            scEnergia.setPrestadora(iee.nome);
            
            Funcionario scFuncionario = new Funcionario();
            ItemFuncionario ifu = (ItemFuncionario) jCBFuncionario.getSelectedItem(); 
            scFuncionario.setCodfuncionario(Integer.valueOf(ifu.codfuncionario));
            scFuncionario.setNome(ifu.nome);
            
            Madeira scMadeira = new Madeira();
            ItemMadeira ima = (ItemMadeira) jCBMadeira.getSelectedItem(); 
            scMadeira.setCodmadeira(Integer.valueOf(ima.codmadeira));
            scMadeira.setNome(ima.nome);
                    
            custovenda.setMaquina(scMaquina);
            custovenda.setEnergiaeletrica(scEnergia);
            custovenda.setFuncionario(scFuncionario);
            custovenda.setMadeira(scMadeira);
            custovenda.setCustoadicional(Double.valueOf(custoadicional));
            custovenda.setPerda(Integer.valueOf(perda));
            custovenda.setCustofinal(Double.valueOf(custofinal));
            custovenda.setMargemlucro(Integer.valueOf(margemlucro));
            custovenda.setValorfinal(Double.valueOf(valorfinal));
            custovenda.setHoras(Integer.valueOf(horas));
            custovenda.setTamanhomadeira(Double.valueOf(tamanhomadeira));
            
           
            if(editando != 1){
                dao.insert(custovenda);
            }else{
                int codigo = Integer.parseInt(jTFCodigo.getText());
                custovenda.setCodcustovenda(codigo);
                dao.update(custovenda);
            }

            listar();

            jTFCodigo.setText("");
            jTFCustoAdicional.setText("");
            jFTFDataVenda.setText("");
            jTFCustoAdicional.setText("");
            jTFPerda.setText("");
            jTFCustoFinal.setText("");
            jTFMargemLucro.setText("");
            jTFValorFinal.setText("");
            jTFCustoMaquina.setText("");
            jTFCustoEnergia.setText("");
            jTFCustoFuncionario.setText("");
            jTFCustoMadeira.setText("");
            jBNovo.setEnabled(true);
            jBGravar.setEnabled(false);
            jBCancelar.setEnabled(false);
            jTCustoVenda.setEnabled(true);
            jTFHoras.setEditable(false);
            jTFMadeira.setEditable(false);

    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed

        
        if (JOptionPane.showConfirmDialog(null, "Excluír registro selecionado?", "Excluír registro", ConfirmationCallback.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            String codigo = ""+jTCustoVenda.getValueAt(jTCustoVenda.getSelectedRow(),0);

            custovenda = dao.findById(Integer.parseInt(codigo));
            dao.delete(custovenda);

            listar();
        
            jBDeletar.setEnabled(false);
            jBEditar.setEnabled(false);
        }
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        
        jTFCodigo.setText("");
        jTFCustoAdicional.setText("");
        jFTFDataVenda.setText("");
        jTFCustoAdicional.setText("");
        jTFPerda.setText("");
        jTFCustoFinal.setText("");
        jTFMargemLucro.setText("");
        jTFValorFinal.setText("");
        jTFHoras.setText("");
        jTFMadeira.setText("");
        jTFCustoMaquina.setText("");
        jTFCustoEnergia.setText("");
        jTFCustoFuncionario.setText("");
        jTFCustoMadeira.setText("");
        jTCustoVenda.setEnabled(true);
        jBNovo.setEnabled(true);
        jBDeletar.setEnabled(false);
        jBGravar.setEnabled(false);
        jBCancelar.setEnabled(false);
        jBEditar.setEnabled(false);
        jTFHoras.setEditable(false);
        jTFMadeira.setEditable(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jCBMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMaquinaActionPerformed

    private void jTCustoVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCustoVendaMouseClicked

        if (jTCustoVenda.isEnabled()){
            jBEditar.setEnabled(true);
            jBDeletar.setEnabled(true);
        }
    }//GEN-LAST:event_jTCustoVendaMouseClicked

    private void jCBMaquinaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBMaquinaFocusLost
       
        
    }//GEN-LAST:event_jCBMaquinaFocusLost

    private void jCBMaquinaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBMaquinaItemStateChanged

    }//GEN-LAST:event_jCBMaquinaItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened

    private void jTFCustoAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCustoAdicionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCustoAdicionalActionPerformed

    private void jFTFDataVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFDataVendaFocusLost

        SimpleDateFormat formatIso = new SimpleDateFormat("dd/MM/yyyy");
        Date dataT, dataA;
        Calendar c = Calendar.getInstance();
        String datateste = jFTFDataVenda.getText();
        String dataatual  = formatIso.format(c.getTime());

        try{
            dataT = formatIso.parse(datateste);
            dataA = formatIso.parse(dataatual);

            if(dataT.after(dataA)){
                JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                jFTFDataVenda.requestFocus();
            }
        }catch(NumberFormatException | ParseException e){
        }
    }//GEN-LAST:event_jFTFDataVendaFocusLost

    private void jFTFDataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFDataVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFDataVendaActionPerformed

    private void jCBEnergiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBEnergiaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEnergiaItemStateChanged

    private void jCBEnergiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBEnergiaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEnergiaFocusLost

    private void jCBEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEnergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEnergiaActionPerformed

    private void jCBFuncionarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBFuncionarioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFuncionarioItemStateChanged

    private void jCBFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBFuncionarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFuncionarioFocusLost

    private void jCBFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFuncionarioActionPerformed

    private void jCBMadeiraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBMadeiraItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMadeiraItemStateChanged

    private void jCBMadeiraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBMadeiraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMadeiraFocusLost

    private void jCBMadeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMadeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMadeiraActionPerformed

    private void jTFPerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPerdaActionPerformed

    private void jTFCustoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCustoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCustoFinalActionPerformed

    private void jTFMargemLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMargemLucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMargemLucroActionPerformed

    private void jTFValorFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorFinalActionPerformed

    private void jTFHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFHorasActionPerformed

    private void jTFCustoEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCustoEnergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCustoEnergiaActionPerformed

    private void jTFCustoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCustoMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCustoMaquinaActionPerformed

    private void jTFCustoMadeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCustoMadeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCustoMadeiraActionPerformed

    private void jTFCustoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCustoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCustoFuncionarioActionPerformed

    private void jTFHorasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFHorasFocusLost

    }//GEN-LAST:event_jTFHorasFocusLost

    private void jTFMadeiraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFMadeiraFocusLost
        calcular();
    }//GEN-LAST:event_jTFMadeiraFocusLost

    private void jTFMadeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMadeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMadeiraActionPerformed


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
    
      public void abreJanelaCustoVenda(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("Cálculo de Custo de Venda");
        
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage()); 
        
        this.setVisible(true);
    }
      
       public class ItemMaquina{  
  
        public String codmaquina;   
        public String nome; 
        public String consumo;
        public String depreciacao;
        public String valormanutencao;
        public String precounitario;

        public ItemMaquina(String id,String nome, String consumo, String depreciacao, String valormanutencao, String precounitario){  
            this.codmaquina = id;  
            this.nome = nome; 
            this.consumo = consumo;
            this.depreciacao = depreciacao;
            this.valormanutencao = valormanutencao;
            this.precounitario = precounitario;
        }  
        
        @Override  
        public String toString(){  
          return nome;
         }  
    }  
       
             
       public class ItemEnergia{  
  
        public String codenergia;   
        public String nome; 
        public String valorhora;

        public ItemEnergia(String id,String nome, String valorhora){  
            this.codenergia = id;  
            this.nome = nome; 
            this.valorhora = valorhora;
        }  
        
        @Override  
        public String toString(){  
          return nome;
         }  
    }  
       
             
       public class ItemFuncionario{  
  
        public String codfuncionario;   
        public String nome; 

        public ItemFuncionario(String id,String nome){  
            this.codfuncionario = id;  
            this.nome = nome; 
        }  
        
        @Override  
        public String toString(){  
          return nome;
         }  
    }  
       
             
       public class ItemMadeira{  
  
        public String codmadeira;   
        public String nome; 

        public ItemMadeira(String id,String nome){  
            this.codmadeira = id;  
            this.nome = nome; 
        }  
        
        @Override  
        public String toString(){  
          return nome;
         }  
    }  
    
    private void listar(){

        DefaultTableModel dados = (DefaultTableModel) jTCustoVenda.getModel();
        dados.setNumRows(0);

        ((DefaultTableCellRenderer)jTCustoVenda.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER); 
        
        for(CustoVenda cv : dao.findAll()){
            dados.addRow(new String[]{""+cv.getCodcustovenda(), ""+cv.getMaquina().getCodmaquina(), cv.getMaquina().getNome(), ""+cv.getEnergiaeletrica().getCodenergiaeletrica(), cv.getEnergiaeletrica().getPrestadora(), ""+cv.getFuncionario().getCodfuncionario(), cv.getFuncionario().getNome(), ""+cv.getMadeira().getCodmadeira(), cv.getMadeira().getNome(), ""+cv.getDatavenda(), ""+cv.getCustoadicional(), ""+cv.getPerda(), ""+cv.getCustofinal(), ""+cv.getMargemlucro(), ""+cv.getValorfinal(), ""+cv.getHoras(), ""+cv.getTamanhomadeira()});
        }
    }
    private final CustoVendaDao dao = new CustoVendaDao();
    private CustoVenda custovenda = new CustoVenda();
    private final MaquinaDao maDao = new MaquinaDao();
    private final EnergiaEletricaDao enDao = new EnergiaEletricaDao();
    private final FuncionarioDao fuDao = new FuncionarioDao();
    private final MadeiraDao madeiraDao = new MadeiraDao();
    
    private void calcular(){
        
        double horas = Double.valueOf(jTFHoras.getText());
                
         //############ ENERGIA ############
        double valorhora, custoenergiahora;
        ItemEnergia iee = (ItemEnergia) jCBEnergia.getSelectedItem();
        
        valorhora = Double.valueOf(iee.valorhora);
        
        
        //############ MAQUINA ############
        double totalmaquina;
        double consumo, depreciacao, precounitario, valormanutencao, depreciacaohora;
       
        ItemMaquina imaq = (ItemMaquina) jCBMaquina.getSelectedItem(); 
        
        consumo = Double.valueOf(imaq.consumo);
        depreciacao = Integer.valueOf(imaq.depreciacao);
        precounitario = Double.valueOf(imaq.precounitario);
        valormanutencao = Double.valueOf(imaq.valormanutencao);
        
        depreciacaohora = precounitario/depreciacao;
        depreciacaohora = depreciacaohora/12;
        depreciacaohora = depreciacaohora/22;
        depreciacaohora = depreciacaohora/8; //depreciacao por hora
        
        valormanutencao = valormanutencao/22;
        valormanutencao = valormanutencao/8; //manutencao por hora
        
        totalmaquina = depreciacaohora+valormanutencao;
        totalmaquina = totalmaquina*horas;
        jTFCustoMaquina.setText(String.valueOf(format(totalmaquina)));
        
        consumo = consumo/60;
        custoenergiahora = (consumo*valorhora)*60; // energia por hora
        custoenergiahora = custoenergiahora*horas;
        jTFCustoEnergia.setText(String.valueOf(format(custoenergiahora)));
        
        

        
    }
    
    public static String format(double x) {  
        return String.format("%.2f", x);  
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JComboBox jCBEnergia;
    private javax.swing.JComboBox jCBFuncionario;
    private javax.swing.JComboBox jCBMadeira;
    private javax.swing.JComboBox jCBMaquina;
    private javax.swing.JFormattedTextField jFTFDataVenda;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLData1;
    private javax.swing.JLabel jLData10;
    private javax.swing.JLabel jLData11;
    private javax.swing.JLabel jLData12;
    private javax.swing.JLabel jLData13;
    private javax.swing.JLabel jLData14;
    private javax.swing.JLabel jLData15;
    private javax.swing.JLabel jLData2;
    private javax.swing.JLabel jLData3;
    private javax.swing.JLabel jLData4;
    private javax.swing.JLabel jLData5;
    private javax.swing.JLabel jLData6;
    private javax.swing.JLabel jLData7;
    private javax.swing.JLabel jLData8;
    private javax.swing.JLabel jLData9;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCustoVenda;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCustoAdicional;
    private javax.swing.JTextField jTFCustoEnergia;
    private javax.swing.JTextField jTFCustoFinal;
    private javax.swing.JTextField jTFCustoFuncionario;
    private javax.swing.JTextField jTFCustoMadeira;
    private javax.swing.JTextField jTFCustoMaquina;
    private javax.swing.JTextField jTFHoras;
    private javax.swing.JTextField jTFMadeira;
    private javax.swing.JTextField jTFMargemLucro;
    private javax.swing.JTextField jTFPerda;
    private javax.swing.JTextField jTFValorFinal;
    // End of variables declaration//GEN-END:variables
}
