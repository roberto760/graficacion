/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.awt.Graphics;
import operacion.Calculo;

/**
 *
 * @author roberto
 */
public class Ventana3 extends javax.swing.JFrame {

    private Calculo calculos;
    private Graphics lapiz;
    /**
     * Creates new form Ventana
     */
    public Ventana3() {
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
        setTitle("circunferencia");

        jPanelPizarron.setBackground(new java.awt.Color(79, 229, 254));

        javax.swing.GroupLayout jPanelPizarronLayout = new javax.swing.GroupLayout(jPanelPizarron);
        jPanelPizarron.setLayout(jPanelPizarronLayout);
        jPanelPizarronLayout.setHorizontalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelPizarronLayout.setVerticalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        btnLinea.setLabel("dibuja circunferencia");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 237, Short.MAX_VALUE)
                        .addComponent(btnLinea)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLinea)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed
        // TODO add your handling code here
        for(int l=0; l<5000; l=l+1){
            circunferencia( calculos.getRandom(500, 0),
                    calculos.getRandom(500, 0),
                    calculos.getRandom(500, 0),
                    calculos.getRandom(500, 0));
            System.out.println("l: "+l);
        }
    }//GEN-LAST:event_btnLineaActionPerformed

    private void circunferencia (int Xinicial, int Yinicial, int Xfinal, int Yfinal){   
      //  Graphics lapiz= jPanelPizarron.getGraphics();
        //implementar algoritmo DDA
        area = Π · r2 //esto es para sacar el radio cuando conocemos el area
        int X=0;
        int Y= //aqui va el radio pero no supe que poner creo que es area*3.1416*radio al cuadrado
        while X<Y // le puse el while porque dice que es mientras
        PX=X+Xcentro;// tengo duda porque es centro??
        PY=Y+Ycentro;
        lapiz.drawOval(PX,PY, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(PX,-PY, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(-PX,PY, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(-PX,PY, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(PY,PX, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(PY,PX, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(PY,-PX, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(-PY,PX, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(-PY,PX, 1, 1); //Usar para pintar un pixel  
        
        Y=Math.sqrt(radio*radio-X*X) //el Math.sqrt lo puse porque vi que con ese se pone para la raiz cuadrada
        fin Mientras // creo que aqui se acaba el while        
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
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLinea;
    private javax.swing.JPanel jPanelPizarron;
    // End of variables declaration//GEN-END:variables
}
