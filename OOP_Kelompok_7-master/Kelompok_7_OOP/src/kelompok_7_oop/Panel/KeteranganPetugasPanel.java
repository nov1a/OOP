/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Panel;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import kelompok_7_oop.Kelas.Database;
import kelompok_7_oop.Kelas.Pencacah;
import kelompok_7_oop.Kelas.Pengawas;
import kelompok_7_oop.Kelas.Ruta;

/**
 *
 * @author Nashir
 */
public class KeteranganPetugasPanel extends javax.swing.JPanel {

    /**
     * Creates new form KeteranganPetugasPanel
     */
    private Ruta ruta = null;
    private JScrollPane mainScrollPane = null;
    public KeteranganPetugasPanel(JScrollPane mainScrollPane) {
        initComponents();
        this.mainScrollPane=mainScrollPane;
    }
    public KeteranganPetugasPanel(JScrollPane mainScrollPane, Ruta ruta) {
        initComponents();
        this.mainScrollPane=mainScrollPane;
        this.ruta=ruta;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulAPanel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namaPencacahTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        noHpPencacahTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kodePencacahTextField = new javax.swing.JTextField();
        kodePengawasTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        noHpPengawasTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        namaPengawasTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nextButtonPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        judulAPanel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        judulAPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulAPanel1.setText("III. PENGENALAN PETUGAS");

        jLabel1.setText("Nama pencacah:");

        namaPencacahTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPencacahTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Nomor HP pencacah:");

        noHpPencacahTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHpPencacahTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Kode pencacah:");

        kodePencacahTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodePencacahTextFieldActionPerformed(evt);
            }
        });

        kodePengawasTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodePengawasTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Kode pengawas:");

        noHpPengawasTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHpPengawasTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Nomor HP pengawas:");

        namaPengawasTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPengawasTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Nama pengawas:");

        nextButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextButtonPanelMouseEntered(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nashir\\Desktop\\Next page_48px.png")); // NOI18N

        javax.swing.GroupLayout nextButtonPanelLayout = new javax.swing.GroupLayout(nextButtonPanel);
        nextButtonPanel.setLayout(nextButtonPanelLayout);
        nextButtonPanelLayout.setHorizontalGroup(
            nextButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        nextButtonPanelLayout.setVerticalGroup(
            nextButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulAPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kodePencacahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(noHpPencacahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(namaPencacahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(namaPengawasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(noHpPengawasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kodePengawasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(nextButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulAPanel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaPengawasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noHpPengawasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kodePengawasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaPencacahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noHpPencacahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kodePencacahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void namaPencacahTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPencacahTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPencacahTextFieldActionPerformed

    private void noHpPencacahTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHpPencacahTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noHpPencacahTextFieldActionPerformed

    private void kodePencacahTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodePencacahTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodePencacahTextFieldActionPerformed

    private void kodePengawasTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodePengawasTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodePengawasTextFieldActionPerformed

    private void noHpPengawasTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHpPengawasTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noHpPengawasTextFieldActionPerformed

    private void namaPengawasTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPengawasTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPengawasTextFieldActionPerformed

    private void nextButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonPanelMouseClicked
        // TODO add your handling code here:
        
        Pencacah pcc = new Pencacah();
        pcc.setNama(namaPencacahTextField.getText());
        pcc.setNomorHp(noHpPencacahTextField.getText());
        pcc.setKodePengawas(kodePengawasTextField.getText());
        pcc.setKode(kodePencacahTextField.getText());
        pcc.addRuta(ruta);
//        JOptionPane.showMessageDialog(this, "jalan");
        LocalDateTime ldt = LocalDateTime.now();
        pcc.setTanggal(DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH).format(ldt));
        
        Pengawas pws = new Pengawas();
        pws.setNama(namaPengawasTextField.getText());
        pws.setTanggal(DateTimeFormatter.ofPattern("dd-MM-yyyy",Locale.ENGLISH).format(ldt));
        pws.setNomorHp(noHpPengawasTextField.getText());
        pws.setKode(kodePengawasTextField.getText());
        pws.addPencacah(pcc);
        
        Database.getInstance().addPengawas(pws);
        
//        ArrayList<Pengawas> ppws = Database.getInstance().getAllPengawas();
//        for(Pengawas a: ppws){
//            ArrayList<Pencacah> temp = a.getAnakBuah();
//            String tmp = temp.get(0).getRutaByNoKodeSample("2").getAlamat().getNegaraAtauProv();
//            System.out.println(tmp);
//        }
        mainScrollPane.setViewportView(new TableAnggotaRutaPanel(mainScrollPane,ruta));
    }//GEN-LAST:event_nextButtonPanelMouseClicked

    private void nextButtonPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonPanelMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_nextButtonPanelMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel judulAPanel1;
    private javax.swing.JTextField kodePencacahTextField;
    private javax.swing.JTextField kodePengawasTextField;
    private javax.swing.JTextField namaPencacahTextField;
    private javax.swing.JTextField namaPengawasTextField;
    private javax.swing.JPanel nextButtonPanel;
    private javax.swing.JTextField noHpPencacahTextField;
    private javax.swing.JTextField noHpPengawasTextField;
    // End of variables declaration//GEN-END:variables
}