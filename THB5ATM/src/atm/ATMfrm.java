/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import dto.ATM;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ATMfrm extends javax.swing.JFrame {

    /**
     * Creates new form ATM
     */
   ATM atm;  
         
            
    public ATMfrm() {
        initComponents();
        atm=new dto.ATM();
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

        pnlTren = new javax.swing.JPanel();
        lbatm = new javax.swing.JLabel();
        pnlDuoi = new javax.swing.JPanel();
        btnDoiMatKhau = new javax.swing.JButton();
        btnKiemTraSoDu = new javax.swing.JButton();
        btnRuttien = new javax.swing.JButton();
        btnNoptien = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0};
        layout.rowHeights = new int[] {0, 5, 0};
        getContentPane().setLayout(layout);

        pnlTren.setBackground(new java.awt.Color(0, 0, 255));
        pnlTren.setLayout(new java.awt.GridBagLayout());

        lbatm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbatm.setForeground(new java.awt.Color(255, 255, 255));
        lbatm.setText("ATM");
        pnlTren.add(lbatm, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(pnlTren, gridBagConstraints);

        pnlDuoi.setBackground(new java.awt.Color(255, 255, 255));
        pnlDuoi.setLayout(new java.awt.GridBagLayout());

        btnDoiMatKhau.setText("Đổi Mật Khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlDuoi.add(btnDoiMatKhau, gridBagConstraints);

        btnKiemTraSoDu.setText("Kiểm Tra số dư");
        btnKiemTraSoDu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiemTraSoDuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlDuoi.add(btnKiemTraSoDu, gridBagConstraints);

        btnRuttien.setText("Rút tiền");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlDuoi.add(btnRuttien, gridBagConstraints);

        btnNoptien.setText("Nộp tiền");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlDuoi.add(btnNoptien, gridBagConstraints);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlDuoi.add(btnThoat, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(pnlDuoi, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKiemTraSoDuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiemTraSoDuActionPerformed
       double soTien = 100000;
        JDialog dlgSodu = new JDialog(this,"Vấn tin tài khoản",true);
        
        JPanel formSodu = new formSodu(String.valueOf(soTien));
       // JPanel formSodu = new formSodu();
      
        dlgSodu.setContentPane(formSodu);
        dlgSodu.setMinimumSize(formSodu.getPreferredSize());
        dlgSodu.setVisible(true);
    }//GEN-LAST:event_btnKiemTraSoDuActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:
        JDialog dlgDoiMK = new JDialog(this,"Đổi mật khẩu",true);
        JPanel formDoiMatKhau = new formDoiMatKhau();
       dlgDoiMK.setContentPane(formDoiMatKhau);
        dlgDoiMK.setMinimumSize(dlgDoiMK.getPreferredSize());
        dlgDoiMK.setVisible(true);
      
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(ATMfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnKiemTraSoDu;
    private javax.swing.JButton btnNoptien;
    private javax.swing.JButton btnRuttien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lbatm;
    private javax.swing.JPanel pnlDuoi;
    private javax.swing.JPanel pnlTren;
    // End of variables declaration//GEN-END:variables
}