/*  Nama File   : Main.java
    Nama        : Moh Yusril Nur Syabani -24060123140181
    Deskripsi   : Kelas ini berfungsi untuk menampilkan informasi dosen dan tendik
    Tanggal     : 14 - Maret - 2025
*/

public class Main {
    public static void main(String[] args) {
        // Contoh data untuk Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548",      // NIP
            "78647324",        // NIDN
            "Andi", 
            "05-05-1990",      // Tanggal Lahir
            "01-01-2015",      // TMT
            5000000,           // Gaji Pokok
            "Fakultas Sains dan Matematika"
        );
        
        // Contoh data untuk Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu(
            "1234567890",      // NIP
            "98765432",        // NIDK
            "Budi",
            "10-08-1985",      // Tanggal Lahir
            "01-03-2020",      // TMT
            4000000,           // Gaji Pokok
            "Fakultas Teknik",
            "31-12-2025"       // Kontrak Berakhir
        );
        
        // Contoh data untuk Tendik
        Tendik tendik = new Tendik(
            "1122334455",      // NIP
            "Citra",
            "20-02-1975",      // Tanggal Lahir
            "15-06-2000",      // TMT
            3000000,           // Gaji Pokok
            "Akademik"
        );
        
        System.out.println("=== Informasi Dosen Tetap ===");
        dosenTetap.printInfo();
        
        System.out.println("\n=== Informasi Dosen Tamu ===");
        dosenTamu.printInfo();
        
        System.out.println("\n=== Informasi Tendik ===");
        tendik.printInfo();
    }
}
