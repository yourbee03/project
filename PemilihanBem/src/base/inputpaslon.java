/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author AMELIA MENSON
 */
public class inputpaslon extends javax.swing.JFrame {

    /**
     * Creates new form MenuPemilihan
     */
    public inputpaslon() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nimk = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_namak = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_jurusank = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_visi = new javax.swing.JTextField();
        txt_misi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ketua");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 30, 40, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 60, 20, 20));

        txt_nimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nimkActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nimk, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 30, 20));
        getContentPane().add(txt_namak, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jurusan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 60, 20));
        getContentPane().add(txt_jurusank, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Foto");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 40, 20));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("visi");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("misi");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 30, 20));
        getContentPane().add(txt_visi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 100, 40));
        getContentPane().add(txt_misi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 110, 40));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("kirim data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 90, 20));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard edit.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nimkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nimkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nim = txt_nimk.getText().toString().trim();
        String nama_mhs = txt_namak.getText().toString().trim();
        String nama_jurusan = txt_jurusank.getText().toString().trim();
        String visi = txt_visi.getText().toString().trim();
        String misi = txt_misi.getText().toString().trim();
        
        if (nim.isEmpty() || nama_mhs.isEmpty() || nama_jurusan.isEmpty() || visi.isEmpty() || misi.isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        }else{
            try{
                Connection c = koneksi.getKoneksi();
                String sql = "INSERT INTO kandidat(nim,nama_mhs,nama_jurusan,visi,misi) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, nim);
                p.setString(2, nama_mhs);
                p.setString(3, nama_jurusan);
                p.setString(4, visi);
                p.setString(5, misi);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Kandidat Berhasil Ditambahkan");
            }catch(SQLException e){
                System.out.println("Error");
            }finally{
                this.dispose();
                Home h = new Home();
                h.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose(); //close the form
                Home h = new Home();
                h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(inputpaslon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputpaslon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputpaslon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputpaslon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputpaslon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField txt_jurusank;
    private javax.swing.JTextField txt_misi;
    private javax.swing.JTextField txt_namak;
    private javax.swing.JTextField txt_nimk;
    private javax.swing.JTextField txt_visi;
    // End of variables declaration//GEN-END:variables
}
