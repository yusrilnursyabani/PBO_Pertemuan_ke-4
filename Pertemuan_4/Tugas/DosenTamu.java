/*  Nama File   : DosenTamu.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampung data-data dosen tamu
    Tanggal     : 14 - Maret - 2025
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class DosenTamu extends Pegawai {
    private String nidk;
    private String fakultas;
    private LocalDate kontrakBerakhir;
    
    // kontrakBerakhir diterima sebagai String dan dikonversi otomatis
    public DosenTamu(String nip, String nidk, String nama, String tanggalLahir, String tmt, double gajiPokok,
                     String fakultas, String kontrakBerakhir) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidk = nidk;
        this.fakultas = fakultas;
        setKontrakBerakhir(kontrakBerakhir);
    }
    
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }
    public String getNidk() {
        return nidk;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public String getFakultas() {
        return fakultas;
    }
    
    // Setter untuk kontrakBerakhir (otomatis konversi String ke LocalDate)
    public void setKontrakBerakhir(String kontrakBerakhir) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.kontrakBerakhir = LocalDate.parse(kontrakBerakhir, formatter);
    }
    // Getter mengembalikan tanggal dalam format string
    public String getKontrakBerakhir() {
        return kontrakBerakhir.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
    // Tunjangan = 2.5% x gajiPokok
    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }
    
    // Menghitung sisa kontrak (dalam bulan) dari hari ini sampai kontrakBerakhir
    public long getSisaKontrak() {
        LocalDate now = LocalDate.now();
        return ChronoUnit.MONTHS.between(now, kontrakBerakhir);
    }
    
    public void printInfo() {
        printDataDasar();
        System.out.println("NIDK           : " + nidk);
        System.out.println("Jabatan        : Dosen Tamu");
        System.out.println("Fakultas       : " + fakultas);
        Period masaKerja = getMasaKerja();
        System.out.println("Masa Kerja     : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Kontrak Berakhir: " + getKontrakBerakhir() + " (sisa " + getSisaKontrak() + " bulan)");
        System.out.println("Tunjangan      : 2.5% x Rp " + String.format("%,.2f", getGajiPokok())
            + " = Rp " + String.format("%,.2f", getTunjangan()));
    }
}
