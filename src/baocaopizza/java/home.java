package baocaopizza.java;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author admin
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuEmployee = new javax.swing.JMenu();
        JMenuPizza = new javax.swing.JMenu();
        jMenuAccount = new javax.swing.JMenu();
        jMenuPayment = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 118, 221));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WelCome !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel1)
                .addContainerGap(458, Short.MAX_VALUE))
        );

        JMenuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new member.png"))); // NOI18N
        JMenuEmployee.setText("Nhân Viên");
        JMenuEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JMenuEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuEmployeeMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMenuEmployee);

        JMenuPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizza.png"))); // NOI18N
        JMenuPizza.setText("Sản Phẩm");
        JMenuPizza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JMenuPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuPizzaMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMenuPizza);

        jMenuAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list of members.png"))); // NOI18N
        jMenuAccount.setText("Thống Kê");
        jMenuAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAccountMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAccount);

        jMenuPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/payment.png"))); // NOI18N
        jMenuPayment.setText("Hóa Đơn");
        jMenuPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPaymentMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuPayment);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jMenu5.setText("Đăng xuất");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jMenuExit.setText("Thoát");
        jMenuExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        int r = JOptionPane.showConfirmDialog(null,  "Do you want to logout", "Select", JOptionPane.YES_NO_OPTION);
        if(r==0)
        {
            this.setVisible(false);
            login frm = new login();
            frm.setVisible(true);
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitMouseClicked
        // TODO add your handling code here:
        int r = JOptionPane.showConfirmDialog(null, "Do you really want to exit", "Select", JOptionPane.YES_NO_OPTION);
        if(r==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuExitMouseClicked

    private void JMenuEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuEmployeeMouseClicked
        // TODO add your handling code here:
        new Employee().setVisible(true);
        
    }//GEN-LAST:event_JMenuEmployeeMouseClicked

    private void JMenuPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuPizzaMouseClicked
        // TODO add your handling code here:
        new HeThong().setVisible(true);
    }//GEN-LAST:event_JMenuPizzaMouseClicked

    private void jMenuPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPaymentMouseClicked
        frmHoaDon frm = new frmHoaDon();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuPaymentMouseClicked

    private void jMenuAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAccountMouseClicked
        frmThongKe frm;
        try {
            frm = new frmThongKe();
            frm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuAccountMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuEmployee;
    private javax.swing.JMenu JMenuPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuAccount;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenu jMenuPayment;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}