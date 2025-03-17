/*  Nama File   : DosenTetap.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data dosen tetap
    Tanggal     : 14 - Maret - 2025
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class DosenTetap extends Pegawai {
    private String nidn;
    private String fakultas;
    
    public DosenTetap(String nip, String nidn, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidn = nidn;
        this.fakultas = fakultas;
    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    public String getNidn() {
        return nidn;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public String getFakultas() {
        return fakultas;
    }
    
    // Menghitung BUP: tanggalLahir + 65 tahun, kemudian dikonversi sehingga tanggalnya menjadi 1 pada bulan berikutnya
    public String getBUP() {
        LocalDate bup = LocalDate.parse(getTanggalLahir(), DateTimeFormatter.ofPattern("dd-MM-yyyy")).plusYears(65);
        bup = bup.plusMonths(1).withDayOfMonth(1);
        return bup.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
    // Tunjangan = 2% x masa kerja (tahun) x gajiPokok
    public double getTunjangan() {
        int tahunKerja = getMasaKerjaYears();
        return 0.02 * tahunKerja * getGajiPokok();
    }
    
    public void printInfo() {
        printDataDasar();
        System.out.println("NIDN          : " + nidn);
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + fakultas);
        Period masaKerja = getMasaKerja();
        System.out.println("Masa Kerja    : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("BUP           : " + getBUP());
        System.out.println("Tunjangan     : 2% x " + getMasaKerjaYears() + " x Rp " 
            + String.format("%,.2f", getGajiPokok()) + " = Rp " 
            + String.format("%,.2f", getTunjangan()));
    }
}
