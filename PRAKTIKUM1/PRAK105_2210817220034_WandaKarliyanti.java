import java.util.Scanner;

public class PRAK105_2210817220034_WandaKarliyanti {
    public static void main(String[]args){
        final double PI=3.14, V;
        float r, t;
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        r=input.nextFloat();
        System.out.print("Masukkan tinggi: ");
        t=input.nextFloat();

        V=PI*r*r*t;
        String volume=String.format("%.3f", V);

        System.out.print("Volume tabung dengan jari-jari "+r+" cm ");
        System.out.print("dan tinggi "+t+" cm ");
        System.out.print("adalah "+volume+" m^3");
    }
}
