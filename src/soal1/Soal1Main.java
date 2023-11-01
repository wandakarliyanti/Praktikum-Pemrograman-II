package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args){
        int jumlah, i;
        int jumlahNilai=0;

        Scanner input=new Scanner(System.in);
        jumlah=input.nextInt();
        LinkedList<Dadu> listDadu=new LinkedList<>();

        for (i=0;i<jumlah;i++){
            Dadu dadu=new Dadu();
            System.out.println("Dadu ke-"+(i+1)+" bernilai "+dadu.getNilai());
            jumlahNilai+=dadu.getNilai();
            listDadu.add(dadu);
        }
        System.out.print("Total nilai dadu keseluruhan "+jumlahNilai);
    }
}
