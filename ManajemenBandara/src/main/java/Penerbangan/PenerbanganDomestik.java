/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penerbangan;

/**
 *
 * @author LENOVO
 */
public class PenerbanganDomestik extends PenerbanganAbstract {
    
    public PenerbanganDomestik(String kodePenerbangan, String tujuan, String jadwal) {
        super(kodePenerbangan, tujuan, jadwal);
    }

    @Override
    public void tambahPenerbangan() {
        System.out.println("Penerbangan domestik ditambahkan: " + getKodePenerbangan());
    }

    @Override
    public void ubahPenerbangan() {
        System.out.println("Penerbangan domestik diubah: " + getKodePenerbangan());
    }

    @Override
    public void hapusPenerbangan() {
        System.out.println("Penerbangan domestik dihapus: " + getKodePenerbangan());
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
    }   
}
