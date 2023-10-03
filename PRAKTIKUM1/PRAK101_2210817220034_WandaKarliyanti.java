import java.util.Scanner;

public class PRAK101_2210817220034_WandaKarliyanti {
    public static void main(String[]args){
        String nama, tempat;
        int tanggal, bulan, tahun, tinggi;
        float berat;
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        nama= input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        tempat= input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggal= input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        bulan= input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        tahun= input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        tinggi= input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        berat= input.nextFloat();

        System.out.print("Nama Lengkap "+nama);
        System.out.print(", Lahir di "+tempat+" ");
        System.out.print("pada Tanggal "+tanggal+" ");
        switch (bulan){
            case 1:
                System.out.print("Januari ");
                break;
            case 2:
                System.out.print("Februari ");
                break;
            case 3:
                System.out.print("Maret ");
                break;
            case 4:
                System.out.print("April ");
                break;
            case 5:
                System.out.print("Mei ");
                break;
            case 6:
                System.out.print("Juni ");
                break;
            case 7:
                System.out.print("Juli ");
                break;
            case 8:
                System.out.print("Agustus ");
                break;
            case 9:
                System.out.print("September ");
                break;
            case 10:
                System.out.print("Oktober ");
                break;
            case 11:
                System.out.print("November ");
                break;
            case 12:
                System.out.print("Desember ");
                break;
        }
        System.out.println(tahun);
        System.out.print("Tinggi Badan "+tinggi+" cm ");
        System.out.print("dan Berat Badan "+berat+" kilogram");
    }
}
