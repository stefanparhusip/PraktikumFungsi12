
public class demopercobaan {

    // tanpa parameter
    static void menu() {
        System.out.println("Harga teh = 10.000");
        System.out.println("Harga kopi = 15.000");
    }

    // dengan parameter
    static void salam(String nama) {
        System.out.println("halo " + nama);

    
    }

    // dengan kembalian
    static int hitung(int hargaTeh, int hargaKopi, int jumlah) {
        int totalTeh = hargaTeh * jumlah;
        int totalKopi = hargaKopi * jumlah;

        System.out.println("Harga teh adalah " + totalTeh);
        System.out.println("Harga kopi adalah " + totalKopi);

        return totalTeh + totalKopi;
    }

    // fungsi panggil fungsi
    static int diskon(int total) {
        return total * 10 / 100;
    }

    // varargs
    static int jumlah(int... harga) {
        int total = 0;

        for (int h : harga) {
            total += h;
        }

        return total;
    }

    // main
    static void main(String[] args) {
        menu();
        salam("Stefan");

        int total = hitung(5000, 12000, 2);

        int hasilDiskon = diskon(total);

        int bayar = jumlah(total, -hasilDiskon);

        System.out.println("Total belanja = " + total);
        System.out.println("Diskon = " + hasilDiskon);
        System.out.println("Total setelah diskon = " + bayar);
    }
}
