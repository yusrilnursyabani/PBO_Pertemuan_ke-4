/*  Nama File   : Pegawai.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data pegawai
    Tanggal     : 14 - Maret - 2025
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;
    
    // Formatter dengan pola dd-MM-yyyy
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        setTanggalLahir(tanggalLahir); // otomatis konversi dari String ke LocalDate
        setTmt(tmt);
        this.gajiPokok = gajiPokok;
    }
    
    // Setter dan Getter untuk NIP dan Nama
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    
    // Setter menerima String, mengonversi ke LocalDate
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = LocalDate.parse(tanggalLahir, formatter);
    }
    // Getter mengembalikan tanggal yang telah diformat ke String
    public String getTanggalLahir() {
        return tanggalLahir.format(formatter);
    }
    
    public void setTmt(String tmt) {
        this.tmt = LocalDate.parse(tmt, formatter);
    }
    public String getTmt() {
        return tmt.format(formatter);
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    // Menampilkan data dasar pegawai
    public void printDataDasar() {
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT           : " + getTmt());
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.2f", gajiPokok));
    }
    
    // Menghitung masa kerja dari TMT sampai hari ini
    public Period getMasaKerja() {
        LocalDate now = LocalDate.now();
        return Period.between(tmt, now);
    }
    
    // Mengembalikan jumlah tahun penuh masa kerja
    public int getMasaKerjaYears() {
        return getMasaKerja().getYears();
    }
}
