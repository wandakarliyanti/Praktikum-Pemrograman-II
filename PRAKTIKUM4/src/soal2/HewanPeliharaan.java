package soal2;

import java.util.Scanner;

public abstract class HewanPeliharaan {
    private String nama, ras;

    public HewanPeliharaan(String r, String n){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        n = input.nextLine();
        this.nama = n;
        System.out.print("Ras: ");
        r = input.nextLine();
        this.ras = r;
    }

    public void display(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}
