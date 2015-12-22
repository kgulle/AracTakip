import java.sql.*;
import javax.swing.*;

public class frm_AracEkle extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;
    Integer tmpMarkalId = null;
    Integer tmpModelId = null;
    Integer tmpRenkId = null;
    Integer tmpHacimId = null;
    String tmpPlaka = null;

    private void cmb_markaDoldur() {
        try {

            String sql = "SELECT * from markalar order by marka_id";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            cmb_marka.addItem("");
            while (rs.next()) {
                String marka_ad = rs.getString("marka_ad");
                cmb_marka.addItem(marka_ad);
            }
        } catch (Exception e) {
        }
    }

    private void cmb_modelDoldur() {
        DefaultListModel DLM = new DefaultListModel();
        //DLM=null;
        cmb_model.removeAllItems();
        String sql = "SELECT t1.model_ad FROM modeller As t1 join markalar AS t2 on t1.marka_id=t2.marka_id where t1.marka_id=" + tmpMarkalId + ";";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            cmb_marka.addItem("");
            while (rs.next()) {
                String model_ad = rs.getString("model_ad");
                cmb_model.addItem(model_ad);
            }
        } catch (Exception e) {
        }
    }

    private void cmb_hacimDodur() {
        try {
            String sql = "SELECT * from hacimler order by hacim_id";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            cmb_hacim.addItem("");
            while (rs.next()) {
                String hacim_ad = rs.getString("hacim_ad");
                cmb_hacim.addItem(hacim_ad);
            }
        } catch (Exception e) {
        }
    }

    private void cmb_renkDodur() {
        try {
            String sql = "SELECT * from renkler order by renk_id";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            cmb_renk.addItem("");
            while (rs.next()) {
                String renk_ad = rs.getString("renk_ad");
                cmb_renk.addItem(renk_ad);
            }
        } catch (Exception e) {
        }
    }

    private void lst_aracDoldur() {
        DefaultListModel DLM = new DefaultListModel();
        String sql = "select * from araclar order by plaka";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DLM.addElement("");
            while (rs.next()) {
                DLM.addElement(rs.getString("plaka"));
            }
            lst_araclar.setModel(DLM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public frm_AracEkle() {
        initComponents();
        conn = javaconnect.ConnecrDB();
        cmb_markaDoldur();
        lst_aracDoldur();
        cmb_hacimDodur();
        cmb_renkDodur();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_plaka = new javax.swing.JTextField();
        cmb_yakitTip = new javax.swing.JComboBox<>();
        cmb_model = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_beygir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_km = new javax.swing.JTextField();
        cmb_hacim = new javax.swing.JComboBox<>();
        cmb_renk = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_marka = new javax.swing.JComboBox<>();
        cmb_vites = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmb_yil = new javax.swing.JComboBox<>();
        txt_kiraUcret = new javax.swing.JTextField();
        cmd_ekle = new javax.swing.JButton();
        cmd_duzenle = new javax.swing.JButton();
        cmd_temizle = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmd_sil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_araclar = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Dosya = new javax.swing.JMenu();
        jMenu_Ekle = new javax.swing.JMenu();
        jMenu_markaEkle = new javax.swing.JMenuItem();
        jMenu_ModelEkle = new javax.swing.JMenuItem();
        jMenu_aracEkle = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu_hakkinda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Araç Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel6.setText("Renk");

        txt_plaka.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        cmb_yakitTip.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cmb_yakitTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benzin", "LPG", "Benzin & LPG" }));

        cmb_model.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cmb_model.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_modelPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmb_model.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmb_modelPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setText("Yıl");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel10.setText("Son KM");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("Model");

        txt_beygir.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Plaka");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Marka");

        txt_km.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        cmb_hacim.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cmb_hacim.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_hacimPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cmb_renk.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cmb_renk.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_renkPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel12.setText("Yakıt Tipi");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel5.setText("Vites");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel9.setText("Silindir Hacmi");

        cmb_marka.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cmb_marka.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_markaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cmb_vites.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cmb_vites.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manuel", "Otomatik" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel8.setText("Motor Gücü");

        cmb_yil.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cmb_yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));

        txt_kiraUcret.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        cmd_ekle.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cmd_ekle.setText("Ekle");
        cmd_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_ekleActionPerformed(evt);
            }
        });

        cmd_duzenle.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cmd_duzenle.setText("Düzenle");
        cmd_duzenle.setEnabled(false);
        cmd_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_duzenleActionPerformed(evt);
            }
        });

        cmd_temizle.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cmd_temizle.setText("Temizle");
        cmd_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_temizleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel11.setText("Günlük Kira Ücreti");

        cmd_sil.setText("Sil");
        cmd_sil.setEnabled(false);
        cmd_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd_duzenle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd_sil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd_ekle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_kiraUcret)
                            .addComponent(txt_km)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmb_vites, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_plaka)
                                .addComponent(cmb_marka, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_model, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_yil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_beygir)
                                .addComponent(cmb_renk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_yakitTip, 0, 154, Short.MAX_VALUE))
                            .addComponent(cmb_hacim, 0, 154, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(txt_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(cmb_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(cmb_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(cmb_yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmb_vites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cmb_yakitTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txt_beygir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_hacim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kiraUcret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_temizle)
                    .addComponent(cmd_duzenle)
                    .addComponent(cmd_ekle)
                    .addComponent(cmd_sil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Araçlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        lst_araclar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_araclarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_araclar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jMenu_Dosya.setText("Dosya");
        jMenuBar1.add(jMenu_Dosya);

        jMenu_Ekle.setText("Ekle");

        jMenu_markaEkle.setText("Marka Ekle");
        jMenu_markaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_markaEkleActionPerformed(evt);
            }
        });
        jMenu_Ekle.add(jMenu_markaEkle);

        jMenu_ModelEkle.setText("Model Ekle");
        jMenu_ModelEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ModelEkleActionPerformed(evt);
            }
        });
        jMenu_Ekle.add(jMenu_ModelEkle);

        jMenu_aracEkle.setText("Araç Ekle");
        jMenu_aracEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_aracEkleActionPerformed(evt);
            }
        });
        jMenu_Ekle.add(jMenu_aracEkle);

        jMenuBar1.add(jMenu_Ekle);

        jMenu2.setText("Yardım");

        jMenu_hakkinda.setText("Hakkında");
        jMenu_hakkinda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_hakkindaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_hakkinda);

        jMenuBar1.add(jMenu2);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_markaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_markaEkleActionPerformed
        frm_MarkaEkle s = new frm_MarkaEkle();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu_markaEkleActionPerformed

    private void jMenu_ModelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ModelEkleActionPerformed
        frm_ModelEkle s = new frm_ModelEkle();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu_ModelEkleActionPerformed

    private void jMenu_aracEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_aracEkleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_aracEkleActionPerformed

    private void jMenu_hakkindaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_hakkindaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_hakkindaActionPerformed

    private void cmd_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_ekleActionPerformed
        String sql = "INSERT INTO araclar( plaka, marka_id, model_id, yil, vites, yakit_tip, renk_id, beygir, hacim_id, km, kira_ucret) VALUES ( '" + txt_plaka.getText() + "'," + tmpMarkalId + "," + tmpModelId + "," + cmb_yil.getSelectedItem() + "," + cmb_vites.getSelectedIndex() + "," + cmb_yakitTip.getSelectedIndex() + "," + tmpRenkId + ",'" + txt_beygir.getText() + "'," + tmpHacimId + "," + txt_km.getText() + ",'" + txt_kiraUcret.getText() + "' )";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "kayıt eklendi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        lst_aracDoldur();
        cmd_temizleActionPerformed(evt);
    }//GEN-LAST:event_cmd_ekleActionPerformed

    private void cmb_markaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_markaPopupMenuWillBecomeInvisible
        String tmpMarka = (String) cmb_marka.getSelectedItem();
        String sql = "select *from markalar where marka_ad=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmpMarka);
            rs = pst.executeQuery();
            if (rs.next()) {
                tmpMarkalId = rs.getInt("marka_id");
            }
        } catch (Exception e) {
        }
        cmb_modelDoldur();
    }//GEN-LAST:event_cmb_markaPopupMenuWillBecomeInvisible

    private void cmb_modelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmb_modelPropertyChange

    }//GEN-LAST:event_cmb_modelPropertyChange

    private void lst_araclarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_araclarValueChanged
        String tmpArac = (String) lst_araclar.getSelectedValue();
        String sql = "select * from araclar where plaka=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmpArac);
            rs = pst.executeQuery();
            if (rs.next()) {
                txt_beygir.setText(rs.getString("beygir"));
                txt_km.setText(rs.getString("km"));
                txt_kiraUcret.setText(rs.getString("kira_ucret"));
                cmb_yakitTip.setSelectedIndex(rs.getInt("yakit_tip"));
                cmb_vites.setSelectedIndex(rs.getInt("vites"));
                tmpPlaka = rs.getString("plaka");
                txt_plaka.setText(tmpPlaka);
                tmpMarkalId = rs.getInt("marka_id");
                tmpModelId = rs.getInt("model_id");
                tmpHacimId = rs.getInt("hacim");
                tmpRenkId = rs.getInt("renk");
            }
        } catch (Exception e) {
        }
        cmd_sil.setEnabled(true);
        cmd_ekle.setEnabled(false);
        cmd_duzenle.setEnabled(true);

    }//GEN-LAST:event_lst_araclarValueChanged

    private void cmb_renkPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_renkPopupMenuWillBecomeInvisible
        String tmpRenk = (String) cmb_renk.getSelectedItem();
        String sql = "select *from renkler where renk_ad=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmpRenk);
            rs = pst.executeQuery();
            if (rs.next()) {
                tmpRenkId = rs.getInt("renk_id");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmb_renkPopupMenuWillBecomeInvisible

    private void cmb_hacimPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_hacimPopupMenuWillBecomeInvisible
        String tmpHacim = (String) cmb_hacim.getSelectedItem();
        String sql = "select *from hacimler where hacim_ad=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmpHacim);
            rs = pst.executeQuery();
            if (rs.next()) {
                tmpHacimId = rs.getInt("hacim_id");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmb_hacimPopupMenuWillBecomeInvisible


    private void cmb_modelPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_modelPopupMenuWillBecomeInvisible
        String tmpModel = (String) cmb_model.getSelectedItem();
        String sql = "select *from modeller where model_ad=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmpModel);
            rs = pst.executeQuery();
            if (rs.next()) {
                tmpModelId = rs.getInt("model_id");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmb_modelPopupMenuWillBecomeInvisible

    private void cmd_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_silActionPerformed
        String sql = "delete from araclar where plaka='" + tmpPlaka + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, tmpPlaka + " Araci Silindi ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        lst_aracDoldur();
        cmd_temizleActionPerformed(evt);
    }//GEN-LAST:event_cmd_silActionPerformed

    private void cmd_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_temizleActionPerformed

        txt_beygir.setText(null);
        txt_km.setText(null);
        txt_kiraUcret.setText(null);
        cmd_sil.setEnabled(false);
        cmd_ekle.setEnabled(true);
        cmd_duzenle.setEnabled(false);
        txt_plaka.setText(null);
        cmb_marka.setSelectedIndex(0);
        cmb_model.setSelectedIndex(0);
        cmb_yil.setSelectedIndex(0);
        cmb_vites.setSelectedIndex(0);
        cmb_yakitTip.setSelectedIndex(0);
        cmb_renk.setSelectedIndex(0);
        txt_plaka.setEnabled(true);
    }//GEN-LAST:event_cmd_temizleActionPerformed

    private void cmd_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_duzenleActionPerformed
        String sql = "UPDATE araclar SET plaka='" + txt_plaka.getText() + "', marka_id=" + tmpMarkalId + ", model_id=" + tmpModelId + ", yil=" + cmb_yil.getSelectedItem() + ", vites=" + cmb_vites.getSelectedIndex() + ", yakit_tip=" + cmb_yakitTip.getSelectedIndex() + ", renk_id=" + tmpRenkId + ", beygir='" + txt_beygir.getText() + "', hacim_id=" + tmpHacimId + ", km=" + txt_km.getText() + ", kira_ucret='" + txt_kiraUcret.getText() + "' WHERE plaka='" + lst_araclar.getSelectedValue() + "'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "kayıt Duzenlendi");
        } catch (Exception e) {
          //  JOptionPane.showMessageDialog(null, e);
        }
        lst_aracDoldur();
    }//GEN-LAST:event_cmd_duzenleActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_ModelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ModelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ModelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ModelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_AracEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_hacim;
    private javax.swing.JComboBox<String> cmb_marka;
    private javax.swing.JComboBox<String> cmb_model;
    private javax.swing.JComboBox<String> cmb_renk;
    private javax.swing.JComboBox<String> cmb_vites;
    private javax.swing.JComboBox<String> cmb_yakitTip;
    private javax.swing.JComboBox<String> cmb_yil;
    private javax.swing.JButton cmd_duzenle;
    private javax.swing.JButton cmd_ekle;
    private javax.swing.JButton cmd_sil;
    private javax.swing.JButton cmd_temizle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Dosya;
    private javax.swing.JMenu jMenu_Ekle;
    private javax.swing.JMenuItem jMenu_ModelEkle;
    private javax.swing.JMenuItem jMenu_aracEkle;
    private javax.swing.JMenuItem jMenu_hakkinda;
    private javax.swing.JMenuItem jMenu_markaEkle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_araclar;
    private javax.swing.JTextField txt_beygir;
    private javax.swing.JTextField txt_kiraUcret;
    private javax.swing.JTextField txt_km;
    private javax.swing.JTextField txt_plaka;
    // End of variables declaration//GEN-END:variables
}
