package myprediction;


import myprediction.questionFrame;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achintyadwivedi
 */
public class ExpertFrame extends javax.swing.JFrame {
private String colorNew="#FFCC99";
    /**
     * Creates new form ExpertFrame
     */
    public ExpertFrame() {
        initComponents();
         getContentPane().setBackground(Color.lightGray);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        visualizeButton = new javax.swing.JRadioButton();
        estimationButton = new javax.swing.JRadioButton();
        reloadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Expert User");

        visualizeButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        visualizeButton.setText("Visualization of data");
        visualizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizeButtonActionPerformed(evt);
            }
        });

        estimationButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        estimationButton.setText("Estimation of air quality");
        estimationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estimationButtonActionPerformed(evt);
            }
        });

        reloadButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        reloadButton.setText("Previous");
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estimationButton)
                    .addComponent(visualizeButton)
                    .addComponent(jLabel1)
                    .addComponent(reloadButton))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(visualizeButton)
                .addGap(18, 18, 18)
                .addComponent(estimationButton)
                .addGap(36, 36, 36)
                .addComponent(reloadButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        setVisible(false);
        questionFrame quFrame=new questionFrame();
        quFrame.setVisible(true);
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void visualizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizeButtonActionPerformed
         setVisible(false);
         ExpertVisualizationForm expertVisualizationForm=new ExpertVisualizationForm();
         expertVisualizationForm.setVisible(true);
    }//GEN-LAST:event_visualizeButtonActionPerformed

    private void estimationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estimationButtonActionPerformed
        //setVisible(false);
      /*   try{
       Desktop.getDesktop().open(new File("/Users/achintyadwivedi/NetBeansProjects/MyProject/src/myprediction/AirPoll_expert.jar"));
            
          
} catch(IOException ex) {
    System.out.println(ex.getMessage());
}*/
      /*String[] str={};
      Kmxd km=new Kmxd();*/
      setVisible(false);
        ExpertNewEstimation quFrame=new ExpertNewEstimation();
        quFrame.setVisible(true);
         
    }//GEN-LAST:event_estimationButtonActionPerformed
public void   clearCache(){
    estimationButton.setSelected(false);
    visualizeButton.setSelected(false);
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
            java.util.logging.Logger.getLogger(ExpertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpertFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton estimationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reloadButton;
    private javax.swing.JRadioButton visualizeButton;
    // End of variables declaration//GEN-END:variables
}
