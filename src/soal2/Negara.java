package soal2;

public class Negara {
    int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
    String nama, jenisKepemimpinan, namaPemimpin;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
        this.tanggalKemerdekaan=tanggalKemerdekaan;
        this.bulanKemerdekaan=bulanKemerdekaan;
        this.tahunKemerdekaan=tahunKemerdekaan;
    }

    public String getNama(){
        return nama;
    }

    public String getJenisKepemimpinan(){
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin(){
        return namaPemimpin;
    }

    public Integer getTanggalKemerdekaan(){
        return tanggalKemerdekaan;
    }

    public Integer getBulanKemerdekaan(){
        return bulanKemerdekaan;
    }

    public Integer getTahunKemerdekaan(){
        return tahunKemerdekaan;
    }
}