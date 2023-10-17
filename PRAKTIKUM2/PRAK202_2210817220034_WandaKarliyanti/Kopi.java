public class Kopi {
    String namaKopi, ukuran, Pembeli;
    double harga;
    public Kopi(){

    }
    void info(){
        System.out.println("Nama Kopi: "+namaKopi);
        System.out.println("Ukuran: "+ukuran);
        System.out.println("Harga: Rp. "+harga);
    }
    public void setPembeli(String Pembeli){
        this.Pembeli=Pembeli;
    }
    public String getPembeli(){
        return Pembeli;
    }
    public double getPajak(){
        return 0.11 * harga;
    }
}
