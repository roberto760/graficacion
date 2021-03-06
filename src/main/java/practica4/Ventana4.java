/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.awt.Graphics;
import operacion.Calculo;

/**
 *
 * @author roberto
 */
public class Ventana4 extends javax.swing.JFrame {

    private Calculo calculos;
    private Graphics lapiz;
    /**
     * Creates new form Ventana
     */
    public Ventana4() {
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
        setTitle("circunferenciaBresenham");

        jPanelPizarron.setBackground(new java.awt.Color(111, 255, 184));

        javax.swing.GroupLayout jPanelPizarronLayout = new javax.swing.GroupLayout(jPanelPizarron);
        jPanelPizarron.setLayout(jPanelPizarronLayout);
        jPanelPizarronLayout.setHorizontalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelPizarronLayout.setVerticalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        btnLinea.setLabel("Dibuja Circunferencia");
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
                        .addGap(0, 234, Short.MAX_VALUE)
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
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed
        // TODO add your handling code here:
        for(int l=0; l<5000; l=l+1){
            circunferenciaBresenham( calculos.getRandom(500, 0),
                    calculos.getRandom(500, 0),
                    calculos.getRandom(500, 0));
            System.out.println("l: "+l);
        }
        //circunferenciaBresenham(20,30,200,150);
                
    }//GEN-LAST:event_btnLineaActionPerformed

    private void circunferenciaBresenham (int xCentro, int yCentro, int radio){   
        //Graphics lapiz= jPanelPizarron.getGraphics();
        int x = 0;
        int y = radio;
        int P = 3-(2*radio);
        int PX, PY;
        while(x<y){
            PX = x + xCentro;
            PY = y + yCentro;
            
            lapiz.drawOval((int)PX,(int)PY, 1, 1); //Usar para pintar un pixel  
            lapiz.drawOval((int)PX,(int)PY*-1, 1, 1); //Usar para pintar un pixel  
            lapiz.drawOval((int)PX*-1,(int)PY, 1, 1); //Usar para pintar un pixel  
            lapiz.drawOval((int)PX*-1,(int)PY*-1, 1, 1); //Usar para pintar un pixel  
            
            lapiz.drawOval((int)PY,(int)PX, 1, 1); //Usar para pintar un pixel  
            lapiz.drawOval((int)PY,(int)PX*-1, 1, 1); //Usar para pintar un pixel  
            lapiz.drawOval((int)PY*-1,(int)PX, 1, 1); //Usar para pintar un pixel  
            lapiz.drawOval((int)PY*-1,(int)PX*-1, 1, 1); //Usar para pintar un pixel  
            
            if(P<0){
                P = P +(4*x)+6;
            }else{
                P = P +(4*x)-(4*y)+10;
                y = y-1;
            }
            x=x+1;
        }
        //lapiz.drawOval(x,y, 1, 1); //Usar para pintar un pixel  
        //implementar el algoritmo
/*       int X=0;
       Y=radio // no se como poner la formula y que formula usar
       P=3-2r
       while X<Y
       PX=X+Xcentro; // el centro como lo definimos??
       PY=Y+Ycentro;
       lapiz.drawOval(PX,PY, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(PX,-PY, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(-PX,PY, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(-PX,PY, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(PY,PX, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(PY,-PX, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(-PY,PX, 1, 1); //Usar para pintar un pixel  
        lapiz.drawOval(-PY,PX, 1, 1); //Usar para pintar un pixel  
        if P<0 entonces // aqui en el entonces que es lo que se debe de poner?
         P=P+4X+6
        else // es en otro caso, pero no se si sea un else
         P=P+4X-4Y+10
        Y=Y-1
        Fin del si-entonces // el entonces no se a que se refiera
        X=X+1
        fin else*/
    }
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
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLinea;
    private javax.swing.JPanel jPanelPizarron;
    // End of variables declaration//GEN-END:variables
}
