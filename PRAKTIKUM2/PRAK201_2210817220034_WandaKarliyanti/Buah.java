public class Buah {
    String buah;
    double berat, harga, jumlahbeli, hargasebelum, totaldiskon, hargasetelah;
    public Buah(String buah, double berat, double harga, double jumlahbeli, double hargasebelum, double totaldiskon, double hargasetelah){
        this.buah=buah;
        this.berat=berat;
        this.harga=harga;
        this.jumlahbeli=jumlahbeli;
        this.hargasebelum=hargasebelum;
        this.totaldiskon=totaldiskon;
        this.hargasetelah=hargasetelah;
    }
    void bayar(){
        berat = 4 / jumlahbeli;
        totaldiskon = 0.02 * (4 * harga) * Math.floor(berat);
    }
}
