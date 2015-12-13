import java.sql.*;
import javax.swing.*;

public class frm_modelEkle extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;
    Integer tmpMarkalId = null;
    String tmpModelAd = null;

    private void cmb_markaDoldur() {
        try {
            String sql = "SELECT * from markalar order by marka_id";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            cmb_markaAd.addItem("Marka Seç");
            while (rs.next()) {
                String marka_ad = rs.getString("marka_ad");
                cmb_markaAd.addItem(marka_ad);
            }
        } catch (Exception e) {
        }
    }

    private void lst_modelDoldur() {
        DefaultListModel DLM = new DefaultListModel();
        String sql = "SELECT t1.model_ad FROM modeller As t1 join markalar AS t2 on t1.marka_id=t2.marka_id where t1.marka_id=" + tmpMarkalId + ";";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DLM.addElement("");
            while (rs.next()) {
                DLM.addElement(rs.getString("model_ad"));
            }
            lst_model.setModel(DLM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
        cmd_modelEkle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_modelAd = new javax.swing.JTextField();
        cmb_markaAd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmd_modelSil = new javax.swing.JButton();
        cmd_duzenle = new javax.swing.JButton();
        cmd_temizle = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_model = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_Ekle = new javax.swing.JMenu();
        jMenu_markaEkle = new javax.swing.JMenuItem();
        jMenu_modelEkle = new javax.swing.JMenuItem();
        jMenu_aracEkle = new javax.swing.JMenuItem();
        jMenu_Yardim = new javax.swing.JMenu();
        jMenu_hakkinda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modeller", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));

        cmd_modelEkle.setText("Ekle");
        cmd_modelEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_modelEkleActionPerformed(evt);
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

        cmd_modelSil.setText("Sil");
        cmd_modelSil.setEnabled(false);
        cmd_modelSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_modelSilActionPerformed(evt);
            }
        });

        cmd_duzenle.setText("Düzenle");
        cmd_duzenle.setEnabled(false);
        cmd_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_duzenleActionPerformed(evt);
            }
        });

        cmd_temizle.setText("Temizle");
        cmd_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_temizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_modelAd)
                            .addComponent(cmb_markaAd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_temizle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmd_duzenle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd_modelSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd_modelEkle)))
                .addGap(12, 12, 12))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_modelEkle)
                    .addComponent(cmd_modelSil)
                    .addComponent(cmd_duzenle)
                    .addComponent(cmd_temizle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marka - Model", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        lst_model.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lst_model.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_modelValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_model);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
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
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void cmd_modelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_modelEkleActionPerformed
        String sql = "INSERT INTO modeller( model_ad, marka_id) VALUES ( '" + txt_modelAd.getText() + "'," + tmpMarkalId + " )";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "kayıt eklendi");
        } catch (Exception e) {
        }
        lst_modelDoldur();
    }//GEN-LAST:event_cmd_modelEkleActionPerformed

    private void cmb_markaAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_markaAdActionPerformed
    }//GEN-LAST:event_cmb_markaAdActionPerformed

    private void cmb_markaAdPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_markaAdPopupMenuWillBecomeInvisible
        String tmpModel = (String) cmb_markaAd.getSelectedItem();
        String sql = "select *from markalar where marka_ad=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmpModel);
            rs = pst.executeQuery();
            if (rs.next()) {
                tmpMarkalId = rs.getInt("marka_id");
            }
        } catch (Exception e) {
        }
        lst_modelDoldur();
        cmd_modelSil.setEnabled(false);
    }//GEN-LAST:event_cmb_markaAdPopupMenuWillBecomeInvisible

    private void lst_modelValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_modelValueChanged
        tmpModelAd = lst_model.getSelectedValue();
        txt_modelAd.setText(tmpModelAd);
        cmd_modelEkle.setEnabled(false);
        cmd_modelSil.setEnabled(true);
        cmd_duzenle.setEnabled(true);
    }//GEN-LAST:event_lst_modelValueChanged

    private void cmd_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_duzenleActionPerformed
        String sql = "UPDATE modeller SET model_ad='" + txt_modelAd.getText() + "', marka_id='" + tmpMarkalId + "' WHERE model_ad='" + tmpModelAd + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, txt_modelAd.getText() + " Olarak Düzenlendi ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        lst_modelDoldur();
    }//GEN-LAST:event_cmd_duzenleActionPerformed

    private void cmd_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_temizleActionPerformed
        txt_modelAd.setText("");
        cmd_modelEkle.setEnabled(true);
        cmd_modelSil.setEnabled(false);
        cmd_duzenle.setEnabled(false);
    }//GEN-LAST:event_cmd_temizleActionPerformed

    private void cmd_modelSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_modelSilActionPerformed
        String sql = "delete from modeller where model_ad='" + tmpModelAd + "' and marka_id='" + tmpMarkalId + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, tmpModelAd + " Modeli Silindi ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        lst_modelDoldur();
        txt_modelAd.setText("");
        cmd_modelEkle.setEnabled(true);
        cmd_modelSil.setEnabled(false);
        cmd_duzenle.setEnabled(false);
     //   cmb_markaAd.setSelectedIndex(0);
        lst_model.removeAll();
    }//GEN-LAST:event_cmd_modelSilActionPerformed

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
            java.util.logging.Logger.getLogger(frm_modelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_modelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_modelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_modelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_modelEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_markaAd;
    private javax.swing.JButton cmd_duzenle;
    private javax.swing.JButton cmd_modelEkle;
    private javax.swing.JButton cmd_modelSil;
    private javax.swing.JButton cmd_temizle;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_model;
    private javax.swing.JTextField txt_modelAd;
    // End of variables declaration//GEN-END:variables
}
