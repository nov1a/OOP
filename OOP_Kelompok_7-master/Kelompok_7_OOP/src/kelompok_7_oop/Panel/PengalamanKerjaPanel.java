/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Panel;

/**
 *
 * @author Nashir
 */
public class PengalamanKerjaPanel extends javax.swing.JPanel {

    /**
     * Creates new form PengalamanKerjaPanel
     */
    public PengalamanKerjaPanel() {
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

        punyaPekerjaanButtonGroup = new javax.swing.ButtonGroup();
        berhentiKerjaButtonGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        judulAPanel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        punyaPekerjaanPositifRadioButton = new javax.swing.JRadioButton();
        punyaPekerjaanNegatifRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        berhentiKerjaNegatifRadioButton = new javax.swing.JRadioButton();
        berhentiKerjaPositifRadioButton = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        alasanBerhentiKerjaTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bidangUsahaBrhntiTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bidangUsahaComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        luarNegeriNegatifRadioButton = new javax.swing.JRadioButton();
        luarNegeriPositifRadioButton = new javax.swing.JRadioButton();
        pernahDiLuarNegeriTextField = new javax.swing.JTextField();

        judulAPanel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        judulAPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulAPanel.setText("V.G. PENGALAMAN KERJA");

        jLabel7.setText("Jumlah jam kerja keseluruhan pekerjaan:");

        punyaPekerjaanButtonGroup.add(punyaPekerjaanPositifRadioButton);
        punyaPekerjaanPositifRadioButton.setText("Ya");

        punyaPekerjaanButtonGroup.add(punyaPekerjaanNegatifRadioButton);
        punyaPekerjaanNegatifRadioButton.setText("Tidak");

        jLabel8.setText("<html>Pernah berhenti bekerja dari pekerjaan/usaha<br>selama setahun terakhir:</html>");

        berhentiKerjaButtonGroup.add(berhentiKerjaNegatifRadioButton);
        berhentiKerjaNegatifRadioButton.setText("Tidak");

        berhentiKerjaButtonGroup.add(berhentiKerjaPositifRadioButton);
        berhentiKerjaPositifRadioButton.setText("Ya");

        jLabel9.setText("Alasan utama berhenti bekerja selama setahun terakhir:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PHK", "Usaha terhenti/bangkrut", "Pendapatan kurang memuaskan", "Tidak cocok dengan lingkungan kerja", "Habis masa kerja/kontrak", "Tidak sesuai dengan keterampilan diri", "Hamil", "Mengurus rumah tangga", "Lainnya" }));
        jComboBox1.setSelectedIndex(-1);

        alasanBerhentiKerjaTextField.setEditable(false);
        alasanBerhentiKerjaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alasanBerhentiKerjaTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Bidang usaha/lapangan usaha sebelum berhenti:");

        bidangUsahaBrhntiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidangUsahaBrhntiTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setText("Bidang usaha/lapangan usaha sebelum berhenti:");

        bidangUsahaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Berusaha sendiri", "Berusaha dibantu buruh tidak tetap/tidak dibayar", "Berusaha dibantu buruh tetap/dibayar", "Buruh/karyawan/pegawai", "Pekerja bebas di pertanian", "Pekerja bebas di nonpertanian", "Pekerja keluarga/tidak dibayar" }));

        jLabel12.setText("Pernah bekerja diluar negeri lima tahun terakhir:");

        buttonGroup1.add(luarNegeriNegatifRadioButton);
        luarNegeriNegatifRadioButton.setText("Tidak");

        buttonGroup1.add(luarNegeriPositifRadioButton);
        luarNegeriPositifRadioButton.setText("Ya");

        pernahDiLuarNegeriTextField.setEditable(false);
        pernahDiLuarNegeriTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pernahDiLuarNegeriTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(punyaPekerjaanPositifRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(punyaPekerjaanNegatifRadioButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(judulAPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(luarNegeriPositifRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(luarNegeriNegatifRadioButton))
                                    .addComponent(bidangUsahaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bidangUsahaBrhntiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(berhentiKerjaPositifRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(berhentiKerjaNegatifRadioButton))
                                    .addComponent(alasanBerhentiKerjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pernahDiLuarNegeriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulAPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(punyaPekerjaanPositifRadioButton)
                    .addComponent(punyaPekerjaanNegatifRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(berhentiKerjaPositifRadioButton)
                    .addComponent(berhentiKerjaNegatifRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alasanBerhentiKerjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bidangUsahaBrhntiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bidangUsahaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luarNegeriPositifRadioButton)
                    .addComponent(luarNegeriNegatifRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pernahDiLuarNegeriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void alasanBerhentiKerjaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alasanBerhentiKerjaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alasanBerhentiKerjaTextFieldActionPerformed

    private void bidangUsahaBrhntiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidangUsahaBrhntiTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidangUsahaBrhntiTextFieldActionPerformed

    private void pernahDiLuarNegeriTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pernahDiLuarNegeriTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pernahDiLuarNegeriTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alasanBerhentiKerjaTextField;
    private javax.swing.ButtonGroup berhentiKerjaButtonGroup;
    private javax.swing.JRadioButton berhentiKerjaNegatifRadioButton;
    private javax.swing.JRadioButton berhentiKerjaPositifRadioButton;
    private javax.swing.JTextField bidangUsahaBrhntiTextField;
    private javax.swing.JComboBox<String> bidangUsahaComboBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel judulAPanel;
    private javax.swing.JRadioButton luarNegeriNegatifRadioButton;
    private javax.swing.JRadioButton luarNegeriPositifRadioButton;
    private javax.swing.JTextField pernahDiLuarNegeriTextField;
    private javax.swing.ButtonGroup punyaPekerjaanButtonGroup;
    private javax.swing.JRadioButton punyaPekerjaanNegatifRadioButton;
    private javax.swing.JRadioButton punyaPekerjaanPositifRadioButton;
    // End of variables declaration//GEN-END:variables
}
