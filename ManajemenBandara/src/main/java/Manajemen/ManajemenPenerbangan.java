/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Manajemen;

import Penerbangan.PenerbanganAbstract;
import Penerbangan.PenerbanganDomestik;
import Penerbangan.PenerbanganInternasional;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ManajemenPenerbangan {
    static ArrayList<PenerbanganAbstract> daftarPenerbangan = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean berjalan = true;

            while (berjalan) {
                System.out.println("\n=== Sistem Manajemen Penerbangan ===");
                System.out.println("1. Tambah Penerbangan Domestik");
                System.out.println("2. Tambah Penerbangan Internasional");
                System.out.println("3. Lihat Semua Penerbangan");
                System.out.println("4. Ubah Penerbangan");
                System.out.println("5. Hapus Penerbangan");
                System.out.println("6. Keluar");
                System.out.print("Pilih opsi: ");

                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1 -> tambahPenerbanganDomestik(scanner);
                    case 2 -> tambahPenerbanganInternasional(scanner);
                    case 3 -> lihatSemuaPenerbangan();
                    case 4 -> ubahPenerbangan(scanner);
                    case 5 -> hapusPenerbangan(scanner);
                    case 6 -> {
                        berjalan = false;
                        System.out.println("Sampai berjumpa lagi!");
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            }
        }
    }

    public static void tambahPenerbanganDomestik(Scanner scanner) {
        System.out.print("Masukkan Kode Penerbangan: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan Tujuan: ");
        String tujuan = scanner.nextLine();
        System.out.print("Masukkan Jadwal: ");
        String jadwal = scanner.nextLine();

        PenerbanganAbstract penerbangan = new PenerbanganDomestik(kode, tujuan, jadwal);
        daftarPenerbangan.add(penerbangan);
        System.out.println("Penerbangan domestik berhasil ditambahkan.");
    }

    public static void tambahPenerbanganInternasional(Scanner scanner) {
        System.out.print("Masukkan Kode Penerbangan: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan Tujuan: ");
        String tujuan = scanner.nextLine();
        System.out.print("Masukkan Jadwal: ");
        String jadwal = scanner.nextLine();
        System.out.print("Masukkan Syarat Visa: ");
        String syaratVisa = scanner.nextLine();

        PenerbanganAbstract penerbangan = new PenerbanganInternasional(kode, tujuan, jadwal, syaratVisa);
        daftarPenerbangan.add(penerbangan);
        System.out.println("Penerbangan internasional berhasil ditambahkan.");
    }

    public static void lihatSemuaPenerbangan() {
        if (daftarPenerbangan.isEmpty()) {
            System.out.println("Tidak ada penerbangan yang tersedia.");
        } else {
            for (PenerbanganAbstract penerbangan : daftarPenerbangan) {
                penerbangan.tampilkanInfo();
                System.out.println("----------------------");
            }
        }
    }

    public static void ubahPenerbangan(Scanner scanner) {
        System.out.print("Masukkan Kode Penerbangan yang ingin diubah: ");
        String kode = scanner.nextLine();

        for (PenerbanganAbstract penerbangan : daftarPenerbangan) {
            if (penerbangan.getKodePenerbangan().equalsIgnoreCase(kode)) {
                System.out.print("Masukkan Tujuan Baru: ");
                penerbangan.setTujuan(scanner.nextLine());
                System.out.print("Masukkan Jadwal Baru: ");
                penerbangan.setJadwal(scanner.nextLine());
                System.out.println("Penerbangan berhasil diubah.");
                return;
            }
        }
        System.out.println("Penerbangan tidak ditemukan.");
    }

    public static void hapusPenerbangan(Scanner scanner) {
        System.out.print("Masukkan Kode Penerbangan yang ingin dihapus: ");
        String kode = scanner.nextLine();

        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            PenerbanganAbstract penerbangan = daftarPenerbangan.get(i);
            if (penerbangan.getKodePenerbangan().equalsIgnoreCase(kode)) {
                daftarPenerbangan.remove(i);
                System.out.println("Penerbangan berhasil dihapus.");
                return;
            }
        }
        System.out.println("Penerbangan tidak ditemukan.");
    }
}
    