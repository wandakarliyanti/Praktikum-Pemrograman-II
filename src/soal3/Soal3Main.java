package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        String nama, nim, hapusNim, cariNim;
        int pilihan;

        Scanner input=new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa=new ArrayList<>();

        while (true){
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan=input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    System.out.print("Masukan Nama Mahasiswa: ");
                    nama=input.nextLine();
                    System.out.print("Masukan NIM Mahasiswa (harus unik): ");
                    nim=input.nextLine();
                    Mahasiswa tambahMahasiswa=new Mahasiswa(nama, nim);
                    listMahasiswa.add(tambahMahasiswa);
                    System.out.println("Mahasiswa "+nama+" ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    hapusNim=input.nextLine();
                    Mahasiswa hapusMahasiswa=null;

                    for (Mahasiswa mahasiswa : listMahasiswa) {
                        if (mahasiswa.getNim().equals(hapusNim)) {
                            hapusMahasiswa=mahasiswa;
                            break;
                        }
                    }

                    if (hapusMahasiswa!=null){
                        listMahasiswa.remove(hapusMahasiswa);
                        System.out.println("Mahasiswa dengan NIM "+hapusNim+" berhasil dihapus.");
                    }
                    else{
                        System.out.println("Mahasiswa dengan NIM "+hapusNim+" tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    cariNim=input.nextLine();

                    for (Mahasiswa mahasiswa : listMahasiswa){
                        if (mahasiswa.getNim().equals(cariNim)){
                            System.out.println("Data Mahasiswa:");
                            System.out.println("Nama: "+mahasiswa.getNama());
                            System.out.println("NIM: "+mahasiswa.getNim());
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");

                    for (Mahasiswa mahasiswa : listMahasiswa){
                        System.out.println("NIM: "+mahasiswa.getNim()+", Nama: "+mahasiswa.getNama());
                    }
                    break;

                case 0:
                    System.out.print("Terima Kasih!");
                    input.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
