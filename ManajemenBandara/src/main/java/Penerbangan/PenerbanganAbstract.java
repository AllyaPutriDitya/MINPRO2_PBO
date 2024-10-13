/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penerbangan;

/**
 *
 * @author LENOVO
 */
public abstract class PenerbanganAbstract implements PenerbanganInterface {
    private final String kodePenerbangan;
    private String tujuan;
    private String jadwal;
    private final Bandara bandara; 

    public PenerbanganAbstract(String kodePenerbangan, String tujuan, String jadwal) {
        this.kodePenerbangan = kodePenerbangan;
        this.tujuan = tujuan;
        this.jadwal = jadwal;
        this.bandara = new Bandara(kodePenerbangan, tujuan, jadwal);
    }

    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
        this.bandara.setTujuan(tujuan);
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
        this.bandara.setJadwal(jadwal);
    }

    public Bandara getBandara() {
        return bandara;
    }

    public void tampilkanInfo() {
        bandara.tampilkanInfo();
    }
}