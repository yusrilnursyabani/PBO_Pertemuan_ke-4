/*  Nama File   : Tendik.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data Tendik
    Tanggal     : 14 - Maret - 2025
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Tendik extends Pegawai {
    private String bidang;
    
    public Tendik(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    public String getBidang() {
        return bidang;
    }
    
    // BUP untuk Tendik: tanggalLahir + 55 tahun, lalu tanggal diubah menjadi 1 pada bulan berikutnya
    public String getBUP() {
        LocalDate bup = LocalDate.parse(getTanggalLahir(), DateTimeFormatter.ofPattern("dd-MM-yyyy")).plusYears(55);
        bup = bup.plusMonths(1).withDayOfMonth(1);
        return bup.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
    // Tunjangan = 1% x masa kerja (tahun) x gajiPokok
    public double getTunjangan() {
        int tahunKerja = getMasaKerjaYears();
        return 0.01 * tahunKerja * getGajiPokok();
    }
    
    public void printInfo() {
        printDataDasar();
        System.out.println("Jabatan       : Tendik");
        System.out.println("Bidang        : " + bidang);
        Period masaKerja = getMasaKerja();
        System.out.println("Masa Kerja    : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("BUP           : " + getBUP());
        System.out.println("Tunjangan     : 1% x " + getMasaKerjaYears() + " x Rp " 
            + String.format("%,.2f", getGajiPokok()) + " = Rp " 
            + String.format("%,.2f", getTunjangan()));
    }
}
