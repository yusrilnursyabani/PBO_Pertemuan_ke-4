/*  Nama File   : Lingkaran.java
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data lingkaran
    Tanggal     : 14 - Maret - 2025
*/

public class Lingkaran extends BangunDatar {
    private double jariJari;

    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(0); 
    }

    // Konstruktor dengan parameter
    public Lingkaran(double jariJari, String warna, String border) {
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Menghitung dan menampilkan luas lingkaran
    public void getLuas() {
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
    }

    // Menghitung dan menampilkan keliling lingkaran
    public void getKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    public void tampilLingkaran() {
        tampilBangunDatar();
        System.out.println("Jari-Jari: " + jariJari);
        getLuas();
        getKeliling();
    }
}
