/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Kelas;

/**
 *
 * @author USER-PC
 */
public class WaktuBekerja {

    /**
     * @return the jamKerja
     */
    public JamKerja getJamKerja() {
        return jamKerja;
    }

    /**
     * @param jamKerja the jamKerja to set
     */
    public void setJamKerja(JamKerja jamKerja) {
        this.jamKerja = jamKerja;
    }

    /**
     * @return the tambahJamKerja
     */
    public String getTambahJamKerja() {
        return tambahJamKerja;
    }

    /**
     * @param tambahJamKerja the tambahJamKerja to set
     */
    public void setTambahJamKerja(String tambahJamKerja) {
        this.tambahJamKerja = tambahJamKerja;
    }

    /**
     * @return the siapTambahJamKerja
     */
    public String getSiapTambahJamKerja() {
        return siapTambahJamKerja;
    }

    /**
     * @param siapTambahJamKerja the siapTambahJamKerja to set
     */
    public void setSiapTambahJamKerja(String siapTambahJamKerja) {
        this.siapTambahJamKerja = siapTambahJamKerja;
    }

    /**
     * @return the penurunanEkonomi
     */
    public String getPenurunanEkonomi() {
        return penurunanEkonomi;
    }

    /**
     * @param penurunanEkonomi the penurunanEkonomi to set
     */
    public void setPenurunanEkonomi(String penurunanEkonomi) {
        this.penurunanEkonomi = penurunanEkonomi;
    }
    
    private JamKerja jamKerja;
    private String tambahJamKerja;
    private String siapTambahJamKerja;
    private String penurunanEkonomi;
    
}
