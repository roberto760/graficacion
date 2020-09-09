/*
 */
package practica1;

import java.awt.Graphics;
import operacion.Calculo;
      
/**
 *
 * @author roberto
 */
public class Ventana1 extends javax.swing.JFrame {

    private Calculo calculos;
    private Graphics lapiz;
    /**
     * Creates new form Ventana
     */
    public Ventana1() {
        initComponents();
        calculos = new Calculo();
        lapiz= jPanelPizarron.getGraphics();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPizarron = new javax.swing.JPanel();
        btnLinea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DDA");

        jPanelPizarron.setBackground(new java.awt.Color(80, 200, 148));
        jPanelPizarron.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelPizarronLayout = new javax.swing.GroupLayout(jPanelPizarron);
        jPanelPizarron.setLayout(jPanelPizarronLayout);
        jPanelPizarronLayout.setHorizontalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelPizarronLayout.setVerticalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        btnLinea.setLabel("Dibuja linea DDA");
        btnLinea.setMaximumSize(new java.awt.Dimension(73, 23));
        btnLinea.setMinimumSize(new java.awt.Dimension(73, 23));
        btnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPizarron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 263, Short.MAX_VALUE)
                        .addComponent(btnLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPizarron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed
        // TODO add your handling code here:
        for(int l=0; l<5000; l=l+1){
            lineaDDA(calculos.getRandom(500, 0),
                    calculos.getRandom(500, 0),
                    calculos.getRandom(500, 0),
                    calculos.getRandom(500, 0));
            System.out.println("l: "+l);
        }
    }//GEN-LAST:event_btnLineaActionPerformed

    
    void lineaDDA(int Xinicial, int Yinicial, int Xfinal, int Yfinal) {
        //implementar algoritmo DDA
        int DeltaX=Xinicial-Xfinal;
        int DeltaY=Yinicial-Yfinal;
        int Pasos;
        int Xincremento;
        int Yincremento;
        int x;
        int y;
        System.out.println("abs dx: "+Math.abs(DeltaX));
        System.out.println("abs dy: "+Math.abs(DeltaY));
        if (Math.abs (DeltaX) > Math.abs (DeltaY)){
            System.out.println("si");
            Pasos=Math.abs(DeltaX);
        }else{
            System.out.println("no");
            Pasos=Math.abs(DeltaY);
        }
        Xincremento= DeltaX / Pasos;
        Yincremento= DeltaY / Pasos;
        x=Xinicial;
        y=Yinicial;
        lapiz.drawOval(x,y, 1, 1); //Usar para pintar un pixel  
        //Desde k=1 hasta Pasos
        //Asignar a X la suma de X + Xincremento
        //Asignar a Y la suma de Y + Yincremento
        //Iluminar pixel en Coodenada X,Y
        //Fin de Algoritmo(DDA)
        for(int k=1; k<=Pasos; k=k+1){
            x=x+Xincremento;
            y=y+Yincremento;
            lapiz.drawOval(x,y, 1, 1);
        }
        //lapiz.drawOval(Xinicial, Yinicial, 1, 1); //Usar para pintar un pixel
        //
    }
    
   
    

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLinea;
    private javax.swing.JPanel jPanelPizarron;
    // End of variables declaration//GEN-END:variables
}