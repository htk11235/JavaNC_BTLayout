/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package baitaplayout;

/**
 *
 * @author htk11
 */
public class SimpleCalculator_HuynhTrongKhoa extends javax.swing.JFrame {

    /**
     * Creates new form SimpleCalculator_HuynhTrongKhoa
     */
    public SimpleCalculator_HuynhTrongKhoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2_16 = new javax.swing.JLabel();
        jTextField1_16 = new javax.swing.JTextField();
        jLabel3_16 = new javax.swing.JLabel();
        jTextField2_16 = new javax.swing.JTextField();
        jLabel4_16 = new javax.swing.JLabel();
        jTextField3_16 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1_16 = new javax.swing.JButton();
        jButton2_16 = new javax.swing.JButton();
        jButton3_16 = new javax.swing.JButton();
        jButton4_16 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimpleCalculator_HuynhTrongKhoa");

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2_16.setText("Số thứ nhất:");
        jLabel2_16.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        jPanel2.add(jLabel2_16, gridBagConstraints);
        jLabel2_16.getAccessibleContext().setAccessibleName("Label1_16");

        jTextField1_16.setText("5");
        jTextField1_16.setPreferredSize(new java.awt.Dimension(150, 22));
        jTextField1_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        jPanel2.add(jTextField1_16, gridBagConstraints);
        jTextField1_16.getAccessibleContext().setAccessibleName("");

        jLabel3_16.setText("Số thứ nhất:");
        jLabel3_16.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        jPanel2.add(jLabel3_16, gridBagConstraints);
        jLabel3_16.getAccessibleContext().setAccessibleName("Label2_16");

        jTextField2_16.setText("5");
        jTextField2_16.setPreferredSize(new java.awt.Dimension(150, 22));
        jTextField2_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        jPanel2.add(jTextField2_16, gridBagConstraints);

        jLabel4_16.setText("Kết quả:");
        jLabel4_16.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        jPanel2.add(jLabel4_16, gridBagConstraints);
        jLabel4_16.getAccessibleContext().setAccessibleName("Label3_16");

        jTextField3_16.setText("10");
        jTextField3_16.setPreferredSize(new java.awt.Dimension(150, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        jPanel2.add(jTextField3_16, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jButton1_16.setText("+");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        jPanel3.add(jButton1_16, gridBagConstraints);

        jButton2_16.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        jPanel3.add(jButton2_16, gridBagConstraints);

        jButton3_16.setText("*");
        jPanel3.add(jButton3_16, new java.awt.GridBagConstraints());

        jButton4_16.setText(":");
        jButton4_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        jPanel3.add(jButton4_16, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4_16ActionPerformed

    private void jTextField1_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_16ActionPerformed

    private void jTextField2_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_16ActionPerformed

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
            java.util.logging.Logger.getLogger(SimpleCalculator_HuynhTrongKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator_HuynhTrongKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator_HuynhTrongKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator_HuynhTrongKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalculator_HuynhTrongKhoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_16;
    private javax.swing.JButton jButton2_16;
    private javax.swing.JButton jButton3_16;
    private javax.swing.JButton jButton4_16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2_16;
    private javax.swing.JLabel jLabel3_16;
    private javax.swing.JLabel jLabel4_16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1_16;
    private javax.swing.JTextField jTextField2_16;
    private javax.swing.JTextField jTextField3_16;
    // End of variables declaration//GEN-END:variables
}
