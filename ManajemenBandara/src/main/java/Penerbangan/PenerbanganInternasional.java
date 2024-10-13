/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penerbangan;

/**
 *
 * @author LENOVO
 */
public class PenerbanganInternasional extends PenerbanganAbstract {
    private final String syaratVisa;

    public PenerbanganInternasional(String kodePenerbangan, String tujuan, String jadwal, String syaratVisa) {
        super(kodePenerbangan, tujuan, jadwal);
        this.syaratVisa = syaratVisa;
    }

    public String getSyaratVisa() {
        return syaratVisa;
    }

    @Override
    public void tambahPenerbangan() {
        System.out.println("Penerbangan internasional ditambahkan: " + getKodePenerbangan());
    }

    @Override
    public void ubahPenerbangan() {
        System.out.println("Penerbangan internasional diubah: " + getKodePenerbangan());
    }

    @Override
    public void hapusPenerbangan() {
        System.out.println("Penerbangan internasional dihapus: " + getKodePenerbangan());
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Syarat Visa: " + syaratVisa);
    }
}