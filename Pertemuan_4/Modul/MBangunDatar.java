/*  Nama File   : MBangunDatar.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampilkan informasi bangun datar
    Tanggal     : 14 - Maret - 2025
*/

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5.0, "Merah", "Garis Putus-putus");
        System.out.println("Informasi Persegi:");
        persegi.tampilPersegi();

        System.out.println("\n--------------------\n");

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(7.0, "Biru", "Garis Solid");
        System.out.println("Informasi Lingkaran:");
        lingkaran.tampilLingkaran();
    }
}
