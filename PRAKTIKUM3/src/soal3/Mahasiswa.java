package soal3;

public class Mahasiswa {
    String nama, nim;

    public Mahasiswa(String nama, String nim){
        this.nama=nama;
        this.nim=nim;
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }
}