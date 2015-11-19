package graficos;

import dao.CustoVendaDao;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import model.CustoVenda;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoCustoVendaGeral extends javax.swing.JFrame {

    public GraficoCustoVendaGeral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraficoCustoVendaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficoCustoVendaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficoCustoVendaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficoCustoVendaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficoCustoVendaGeral().setVisible(true);
            }
        });
    }
    
    private CategoryDataset createDataset() { 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        for(CustoVenda cv : dao.findAll()){
            
            double aa = Double.valueOf(dao.retornaSaldoCustoDia(cv.getDatavenda().toString()));
            double bb = Double.valueOf(dao.retornaSaldoFinalDia(cv.getDatavenda().toString()));
            double cc = bb-aa;
            dataset.addValue(aa,"Custos",""+formatter.format(cv.getDatavenda())); 
            dataset.addValue(bb,"Custos + Lucro",""+formatter.format(cv.getDatavenda())); 
            dataset.addValue(cc,"Lucro",""+formatter.format(cv.getDatavenda())); 
 
        }
        return dataset; 
    }
    
    public void criaGrafico() {
        CategoryDataset cds = createDataset();
        String titulo = "Custos e Lucros no Geral";
        String eixoy = "Valores";
        String txt_legenda = "Legenda:";
        boolean legenda = true;
        boolean tooltips = true;
        boolean urls = true;
        JFreeChart graf = ChartFactory.createBarChart3D(titulo, txt_legenda, eixoy, cds, PlotOrientation.VERTICAL, legenda, tooltips, urls);
        ChartPanel myChartPanel = new ChartPanel(graf, true);
        myChartPanel.setSize(jPanel1.getWidth(),jPanel1.getHeight());
        myChartPanel.setVisible(true); 
        jPanel1.removeAll();
        jPanel1.add(myChartPanel); 
        jPanel1.revalidate();
        jPanel1.repaint(); 
    }
    
    public void abreJanelaGraficoGeral(){

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setTitle("Gráfico dos Custos e Lucros no Geral");
        
        ImageIcon image = new ImageIcon("C:\\SCCP\\img\\icone.png");
        this.setIconImage(image.getImage()); 
        criaGrafico();
        this.setVisible(true);
    }
    
    CustoVendaDao dao = new CustoVendaDao();
    CustoVenda aa = new CustoVenda();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
