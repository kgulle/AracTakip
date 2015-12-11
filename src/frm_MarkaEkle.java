
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.postgresql.*;

public class frm_MarkaEkle extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;

    private void lst_markaDoldur() {
        DefaultListModel DLM = new DefaultListModel();
        String sql = "select * from markalar order by marka_id";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DLM.addElement("");
            while (rs.next()) {
                DLM.addElement(rs.getString("marka_ad"));
            }
            lst_markalar.setModel(DLM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void cmb_markaDoldur() {
        try {
            String sql = "SELECT *from markalar order by marka_id";
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

    public frm_MarkaEkle() {
        initComponents();
        conn = javaconnect.ConnecrDB();
        lst_markaDoldur();
        cmb_markaDoldur();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_markalar = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        cmd_duzenle = new javax.swing.JButton();
        txt_markaAd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmd_sil = new javax.swing.JButton();
        cmd_ekle = new javax.swing.JButton();
        cmd_temizle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_markaId = new javax.swing.JTextField();
        cmb_markaAd = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_Ekle = new javax.swing.JMenu();
        jMenu_markaEkle = new javax.swing.JMenuItem();
        jMenu_modelEkle = new javax.swing.JMenuItem();
        jMenu_aracEkle = new javax.swing.JMenuItem();
        jMenu_Yardim = new javax.swing.JMenu();
        jMenu_hakkinda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marka Ekle");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Markalar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        lst_markalar.setEnabled(false);
        lst_markalar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_markalarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_markalar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İşlemler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        cmd_duzenle.setText("Düzenle");
        cmd_duzenle.setEnabled(false);
        cmd_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_duzenleActionPerformed(evt);
            }
        });

        jLabel3.setText("Marka ID : ");

        cmd_sil.setText("Sil");
        cmd_sil.setEnabled(false);
        cmd_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_silActionPerformed(evt);
            }
        });

        cmd_ekle.setText("Ekle");
        cmd_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_ekleActionPerformed(evt);
            }
        });

        cmd_temizle.setText("Temizle");
        cmd_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_temizleActionPerformed(evt);
            }
        });

        jLabel4.setText("Marka Ad :");

        txt_markaId.setEnabled(false);

        cmb_markaAd.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_markaAdPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_markaAd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(txt_markaId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cmd_temizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmd_duzenle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmd_ekle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmd_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_markaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_markaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_markaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_markaAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_ekle)
                    .addComponent(cmd_temizle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_duzenle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_sil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lst_markalarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_markalarValueChanged
    }//GEN-LAST:event_lst_markalarValueChanged

    private void cmd_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_ekleActionPerformed
        String sql = "INSERT INTO markalar (marka_ad) VALUES ('" + txt_markaAd.getText() + "')";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
        } catch (Exception e) {
        }
        cmb_markaAd.removeAllItems();
        lst_markaDoldur();
        cmb_markaDoldur();
        txt_markaId.setText(null);
        txt_markaAd.setText(null);
    }//GEN-LAST:event_cmd_ekleActionPerformed

    private void cmb_markaAdPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_markaAdPopupMenuWillBecomeInvisible
        String tmp = (String) cmb_markaAd.getSelectedItem();
        String sql = "select *from markalar where marka_ad=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            if (rs.next()) {
                txt_markaId.setText(rs.getString("marka_id"));
                txt_markaAd.setText(rs.getString("marka_ad"));
            }
        } catch (Exception e) {
        }
        cmd_duzenle.setEnabled(true);
        cmd_sil.setEnabled(true);
        cmd_ekle.setEnabled(false);
        cmb_markaAd.removeAllItems();
        cmb_markaDoldur();
        lst_markaDoldur();
    }//GEN-LAST:event_cmb_markaAdPopupMenuWillBecomeInvisible

    private void cmd_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_temizleActionPerformed
        txt_markaId.setText(null);
        txt_markaAd.setText(null);
        cmd_duzenle.setEnabled(false);
        cmd_sil.setEnabled(false);
        cmd_ekle.setEnabled(true);
    }//GEN-LAST:event_cmd_temizleActionPerformed

    private void cmd_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_duzenleActionPerformed
        String sql = "UPDATE markalar SET  marka_ad='" + txt_markaAd.getText() + "' WHERE marka_id='" + txt_markaId.getText() + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, txt_markaAd.getText() + " Olarak Düzenlendi ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        cmb_markaAd.removeAllItems();
        cmb_markaDoldur();
        lst_markaDoldur();
        txt_markaId.setText(null);
        txt_markaAd.setText(null);
        txt_markaId.setText(null);
        txt_markaAd.setText(null);
        cmd_duzenle.setEnabled(false);
        cmd_sil.setEnabled(false);
        cmd_ekle.setEnabled(false);
    }//GEN-LAST:event_cmd_duzenleActionPerformed

    private void cmd_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_silActionPerformed
        String sql = "delete from markalar where marka_id='" + txt_markaId.getText() + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, txt_markaAd.getText() + " Markası Silindi ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        cmb_markaAd.removeAllItems();
        cmb_markaDoldur();
        lst_markaDoldur();
        txt_markaId.setText(null);
        txt_markaAd.setText(null);
        cmd_duzenle.setEnabled(false);
        cmd_sil.setEnabled(false);
        cmd_ekle.setEnabled(true);
    }//GEN-LAST:event_cmd_silActionPerformed

    private void jMenu_markaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_markaEkleActionPerformed
        frm_MarkaEkle s = new frm_MarkaEkle();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu_markaEkleActionPerformed

    private void jMenu_aracEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_aracEkleActionPerformed
    }//GEN-LAST:event_jMenu_aracEkleActionPerformed

    private void jMenu_hakkindaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_hakkindaActionPerformed
    }//GEN-LAST:event_jMenu_hakkindaActionPerformed

    private void jMenu_modelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_modelEkleActionPerformed
        frm_modelEkle s = new frm_modelEkle();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu_modelEkleActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frm_MarkaEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_MarkaEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_MarkaEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_MarkaEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_MarkaEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_markaAd;
    private javax.swing.JButton cmd_duzenle;
    private javax.swing.JButton cmd_ekle;
    private javax.swing.JButton cmd_sil;
    private javax.swing.JButton cmd_temizle;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Ekle;
    private javax.swing.JMenu jMenu_Yardim;
    private javax.swing.JMenuItem jMenu_aracEkle;
    private javax.swing.JMenuItem jMenu_hakkinda;
    private javax.swing.JMenuItem jMenu_markaEkle;
    private javax.swing.JMenuItem jMenu_modelEkle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_markalar;
    private javax.swing.JTextField txt_markaAd;
    private javax.swing.JTextField txt_markaId;
    // End of variables declaration//GEN-END:variables
}
