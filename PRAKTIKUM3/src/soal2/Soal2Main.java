package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[]args){
        int jumlahNegara;
        int tanggalKemerdekaan=0;
        int bulanKemerdekaan=0;
        int tahunKemerdekaan=0;
        String nama, jenisKepemimpinan, namaPemimpin, namaBulan;

        Scanner input=new Scanner(System.in);
        jumlahNegara=input.nextInt();
        input.nextLine();
        LinkedList<Negara> listNegara=new LinkedList<>();
        HashMap<Integer, String> daftarBulan=new HashMap<>();
        daftarBulan.put(1, "Januari");
        daftarBulan.put(2, "Februari");
        daftarBulan.put(3, "Maret");
        daftarBulan.put(4, "April");
        daftarBulan.put(5, "Mei");
        daftarBulan.put(6, "Juni");
        daftarBulan.put(7, "Juli");
        daftarBulan.put(8, "Agustus");
        daftarBulan.put(9, "September");
        daftarBulan.put(10, "Oktober");
        daftarBulan.put(11, "November");
        daftarBulan.put(12, "Desember");

        for (int i=0;i<jumlahNegara;i++){
            nama=input.nextLine();
            jenisKepemimpinan=input.nextLine();
            namaPemimpin=input.nextLine();

            if (jenisKepemimpinan.equals("monarki")){
            }
            else {
                tanggalKemerdekaan=input.nextInt();
                bulanKemerdekaan=input.nextInt();
                tahunKemerdekaan=input.nextInt();
                input.nextLine();
            }
            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            listNegara.add(negara);
        }
        for (Negara negara : listNegara){
            tanggalKemerdekaan=negara.getTanggalKemerdekaan();
            bulanKemerdekaan=negara.getBulanKemerdekaan();
            tahunKemerdekaan=negara.getTahunKemerdekaan();
            jenisKepemimpinan=negara.getJenisKepemimpinan();
            nama=negara.getNama();
            namaPemimpin=negara.getNamaPemimpin();
            namaBulan=daftarBulan.get(bulanKemerdekaan);

            System.out.print("Negara "+nama+" mempunyai ");

            if (jenisKepemimpinan.equals("presiden")){
                System.out.print("Presiden");
            }
            else if (jenisKepemimpinan.equals("perdana menteri")){
                System.out.print("Perdana Menteri");
            }
            else{
                System.out.print("Raja");
            }

            System.out.println(" bernama "+namaPemimpin);

            if (jenisKepemimpinan.equals("monarki")){
                System.out.print("\n");
            }
            else{
                System.out.println("Deklarasi Kemerdekaan pada Tanggal "+tanggalKemerdekaan+" "+namaBulan+" "+tahunKemerdekaan+"\n");
            }
        }
    }
}
