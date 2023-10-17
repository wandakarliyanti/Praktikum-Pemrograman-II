public class Soal1Main {
    public static void main(String[]args){
    Buah buah1=new Buah("Apel", 0.4, 7000.0, 40.0, 700000.00, 5600.00, 694400.00);
    Buah buah2=new Buah("mangga", 0.2, 3500.0, 15.0, 262500.00, 840.00, 261660.00);
    Buah buah3=new Buah("alpukat", 0.25, 10000.00,12.0, 480000.00, 2400.00, 477600.00);

    System.out.println("Nama Buah: "+buah1.buah);
    System.out.println("Berat: "+buah1.berat);
    System.out.println("Harga: "+buah1.harga);
    System.out.println("Jumlah Beli: "+buah1.jumlahbeli);
    System.out.println("Harga Sebelum Diskon: Rp"+buah1.hargasebelum);
    System.out.println("Total Diskon: Rp"+buah1.totaldiskon);
    System.out.println("Harga Setelah Diskon: Rp"+buah1.hargasetelah+"\n");

    System.out.println("Nama Buah: "+buah2.buah);
    System.out.println("Berat: "+buah2.berat);
    System.out.println("Harga: "+buah2.harga);
    System.out.println("Jumlah Beli: "+buah2.jumlahbeli);
    System.out.println("Harga Sebelum Diskon: Rp"+buah2.hargasebelum);
    System.out.println("Total Diskon: Rp"+buah2.totaldiskon);
    System.out.println("Harga Setelah Diskon: Rp"+buah2.hargasetelah+"\n");

    System.out.println("Nama Buah: "+buah3.buah);
    System.out.println("Berat: "+buah3.berat);
    System.out.println("Harga: "+buah3.harga);
    System.out.println("Jumlah Beli: "+buah3.jumlahbeli);
    System.out.println("Harga Sebelum Diskon: Rp"+buah3.hargasebelum);
    System.out.println("Total Diskon: Rp"+buah3.totaldiskon);
    System.out.print("Harga Setelah Diskon: Rp"+buah3.hargasetelah);
    }
}
