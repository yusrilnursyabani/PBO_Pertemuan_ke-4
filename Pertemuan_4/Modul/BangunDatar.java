/*  Nama File   : BangunDatar.java
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data bangun datar
    Tanggal     : 14 - Maret - 2025
*/

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

    // Konstruktor tanpa parameter
    public BangunDatar() {
    }
    
    // Konstruktor dengan parameter
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }

    
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void tampilBangunDatar() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}
