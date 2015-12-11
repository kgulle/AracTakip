
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import org.postgresql.*;

public class frm_modelEkle extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;
    Integer tmpModelId = null;

    private void cmb_markaDoldur() {
        try {
            String sql = "SELECT * from markalar order by marka_id";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            cmb_markaAd.addItem("");
            while (rs.next()) {
                String marka_ad = rs.getString("marka_ad");
                cmb_markaAd.addItem(marka_ad);
            }
        } catch (Exception e) {
        }
    }

    public frm_modelEkle() {
        initComponents();
        conn = javaconnect.ConnecrDB();
        cmb_markaDoldur();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmd_ekle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_modelAd = new javax.swing.JTextField();
        cmb_markaAd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_Ekle = new javax.swing.JMenu();
        jMenu_markaEkle = new javax.swing.JMenuItem();
        jMenu_modelEkle = new javax.swing.JMenuItem();
        jMenu_aracEkle = new javax.swing.JMenuItem();
        jMenu_Yardim = new javax.swing.JMenu();
        jMenu_hakkinda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modeller"));

        cmd_ekle.setText("Ekle");
        cmd_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_ekleActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Marka Adı :");

        txt_modelAd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cmb_markaAd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_markaAd.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_markaAdPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmb_markaAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_markaAdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Model Adı :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmd_ekle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_modelAd)
                            .addComponent(cmb_markaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_modelAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_markaAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmd_ekle)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jMenu1.setText("Dosya");
        jMenuBar1.add(jMenu1);

        jMenu_Ekle.setText("Ekle");

        jMenu_markaEkle.setText("Marka Ekle");
        jMenu_markaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_markaEkleActionPerformed(evt);
            }
        });
        jMenu_Ekle.add(jMenu_markaEkle);

        jMenu_modelEkle.setText("Model Ekle");
        jMenu_modelEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_modelEkleActionPerformed(evt);
            }
        });
        jMenu_Ekle.add(jMenu_modelEkle);

        jMenu_aracEkle.setText("Araç Ekle");
        jMenu_aracEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_aracEkleActionPerformed(evt);
            }
        });
        jMenu_Ekle.add(jMenu_aracEkle);

        jMenuBar1.add(jMenu_Ekle);

        jMenu_Yardim.setText("Yardım");

        jMenu_hakkinda.setText("Hakkında");
        jMenu_hakkinda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_hakkindaActionPerformed(evt);
            }
        });
        jMenu_Yardim.add(jMenu_hakkinda);

        jMenuBar1.add(jMenu_Yardim);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_markaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_markaEkleActionPerformed
        frm_MarkaEkle s = new frm_MarkaEkle();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu_markaEkleActionPerformed

    private void jMenu_modelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_modelEkleActionPerformed
        frm_modelEkle s = new frm_modelEkle();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu_modelEkleActionPerformed

    private void jMenu_aracEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_aracEkleActionPerformed

    }//GEN-LAST:event_jMenu_aracEkleActionPerformed

    private void jMenu_hakkindaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_hakkindaActionPerformed

    }//GEN-LAST:event_jMenu_hakkindaActionPerformed

    private void cmd_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_ekleActionPerformed
        String sql = "INSERT INTO modeller( model_ad, marka_id) VALUES ( '" + txt_modelAd.getText() + "'," + tmpModelId + " )";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "kayıt eklendi");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

//        String value = (String) cmb_markaAd.getSelectedItem();
        //    JOptionPane.showMessageDialog(null, value);

    }//GEN-LAST:event_cmd_ekleActionPerformed

    private void cmb_markaAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_markaAdActionPerformed
        String markaAd = (String) cmb_markaAd.getSelectedItem();

        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_markaAdActionPerformed

    private void cmb_markaAdPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_markaAdPopupMenuWillBecomeInvisible
        String tmpModel = (String) cmb_markaAd.getSelectedItem();
        String sql = "select *from markalar where marka_ad=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmpModel);
            rs = pst.executeQuery();
            if (rs.next()) {
                tmpModelId = rs.getInt("marka_id");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmb_markaAdPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(frm_modelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_modelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_modelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_modelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_modelEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_markaAd;
    private javax.swing.JButton cmd_ekle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Ekle;
    private javax.swing.JMenu jMenu_Yardim;
    private javax.swing.JMenuItem jMenu_aracEkle;
    private javax.swing.JMenuItem jMenu_hakkinda;
    private javax.swing.JMenuItem jMenu_markaEkle;
    private javax.swing.JMenuItem jMenu_modelEkle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_modelAd;
    // End of variables declaration//GEN-END:variables
}
