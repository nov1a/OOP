/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Panel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import kelompok_7_oop.Kelas.AnggotaRuta;
import kelompok_7_oop.Kelas.Ruta;

/**
 *
 * @author Nashir
 */
public class TableAnggotaRutaPanel extends javax.swing.JPanel {
    private int i = 0;
    private ArrayList<AnggotaRuta> listArt=new ArrayList<>();
    private AnggotaRuta art = null;
    private Ruta ruta;
    private JScrollPane mainScrollPane;
    /**
     * Creates new form TableRutaPanel
     */
    public TableAnggotaRutaPanel(JScrollPane mainScrollPane, Ruta ruta) {
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

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        displayTable.setBackground(new java.awt.Color(204, 204, 204));
        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Gender", "Umur", "Tingkat pendidikan", "Menikah"
            }
        ));
        displayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displayTableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayTableMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(displayTable);

        jPanel1.setBackground(new java.awt.Color(0, 18, 53));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("List Anggota Rumah Tangga");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nashir\\Desktop\\Statistics_96px.png")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 18, 53));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nashir\\Desktop\\Add User Male_48px.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(0, 372, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        KeteranganAnggotaRTPanel kPanel = new KeteranganAnggotaRTPanel();
        JLabel countDisplay = kPanel.getCountDisplay();
        String text = "ART urutuan ke-" + ++i;
        countDisplay.setText(text);
        int result = JOptionPane.showConfirmDialog(this, kPanel,"Tambah Anggota Ruta",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (result==JOptionPane.OK_OPTION){
            art = new AnggotaRuta();
            art.setNama(kPanel.getNamaTextField().getText());
            for(Enumeration<AbstractButton> buttons = kPanel.getJenisKelaminbuttonGroup().getElements();buttons.hasMoreElements();){
                AbstractButton button = buttons.nextElement();
                if(button.isSelected()){
                    art.setGender(button.getText());
                }
            }
            art.setBulanLahir(Integer.parseInt(kPanel.getBulanLahirTextField().getText()));
            art.setTahunLahir(Integer.parseInt(kPanel.getTahunLahirTextField().getText()));
            art.setHubunganDgKRT(kPanel.getHubDgKepRTComboBox().getSelectedItem().toString());
            art.setStatKawin(kPanel.getStatusKawinComboBox().getSelectedItem().toString());
            art.setStatSekolah(kPanel.getPartisipasiSekolahComboBox().getSelectedItem().toString());
            ruta.addAnggotaRuta(art);
            
            
            //tampilkan pada tabel
            DefaultTableModel dtm = (DefaultTableModel) displayTable.getModel();
            listArt = ruta.getAllArt();
            for(AnggotaRuta a: listArt){
                Object[] data = {a.getNama(),a.getGender(),a.getUmur(a.getTahunLahir()),a.getStatSekolah(),a.getStatKawin()};
                dtm.addRow(data);
            }
                    
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void displayTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableMouseEntered
        // TODO add your handling code here:
        displayTable.setBackground(new Color(0, 18, 53));
        displayTable.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_displayTableMouseEntered

    private void displayTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableMouseExited
        // TODO add your handling code here:
                displayTable.setBackground(new Color(255,255,255));
                displayTable.setForeground(new Color(0,0,0));
//                displayTable.setRo
    }//GEN-LAST:event_displayTableMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable displayTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
