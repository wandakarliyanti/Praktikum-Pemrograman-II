//Pada baris ini terjadi error karena class bernama Employee. Class seharusnya bernama Pegawai.
//public class Employee {
public class Pegawai{
    public String nama;
    //Pada baris ini terjadi error karena deklarasi variabel asal bertipe data character. Variabel asal seharusnya bertipe data String.
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //Pada baris ini terjadi error karena pada method setJabatan tidak memiliki argumen.
    //public void setJabatan() {
    public void setJabatan(String jabatan){
        //Karena penggunaan this. maka parameter method dan variabel objek memiliki nama yang sama.
        //this.jabatan = j;
        this.jabatan=jabatan;
    }
}
