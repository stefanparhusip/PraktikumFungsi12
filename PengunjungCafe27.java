public class PengunjungCafe27 {
    static void daftarPengunjung(String nomorMeja,String... namaPengunjung) {
        System.out.println("Nama pemimpin meja adalah: " + nomorMeja);
        System.out.println("Daftar nama pengunjung");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Stef", "Ali", "Budi", "Citra");
        daftarPengunjung("P","Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        // Soal 1: tanpa argumen
    }
}