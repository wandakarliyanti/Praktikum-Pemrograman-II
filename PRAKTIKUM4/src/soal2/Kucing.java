package soal2;

import java.util.Scanner;

public class Kucing extends HewanPeliharaan{
    private String warnaBulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        Scanner input = new Scanner(System.in);
        System.out.print("Warna Bulu: ");
        w = input.nextLine();
        this.warnaBulu = w;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.print("Memiliki warna bulu: " + this.warnaBulu);
    }
}
