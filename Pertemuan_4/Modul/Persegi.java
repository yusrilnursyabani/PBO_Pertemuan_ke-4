/*  Nama File   : Persegi.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data persegi
    Tanggal     : 14 - Maret - 2025
*/

public class Persegi extends BangunDatar {
    private double sisi;

    // Konstruktor tanpa parameter
    public Persegi() {
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Menghitung dan menampilkan luas persegi
    public void getLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    // Menghitung dan menampilkan keliling persegi
    public void getKeliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }

    // Menghitung dan menampilkan diagonal persegi
    public void getDiagonal() {
        double diagonal = sisi * Math.sqrt(2);
        System.out.println("Diagonal Persegi: " + diagonal);
    }

    public void tampilPersegi() {
        tampilBangunDatar();
        System.out.println("Sisi: " + sisi);
        getLuas();
        getKeliling();
        getDiagonal();
    }
}


/*
Soal:
1. Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut? Mengapa?
2. Jika atribut dalam class BangunDatar diubah menjadi protected, apakah konstruktor dapat direalisasikan seperti yang diberikan? Mengapa?
Jawaban:
1. Kode di atas tidak dapat direalisasikan karena atribut jmlSisi, warna, dan border berasal dari kelas induk BangunDatar, yang dalam kode sebelumnya dideklarasikan sebagai private. Dalam OOP, atribut dengan modifier private hanya dapat diakses di dalam kelas yang sama dan tidak bisa diakses langsung oleh kelas anaknya (Persegi).
2. Jika atribut dalam class BangunDatar diubah menjadi protected, maka konstruktor dapat direalisasikan seperti yang diberikan. Karena atribut yang diubah menjadi protected dapat diakses oleh kelas anaknya (Persegi).



*/