import java.util.Scanner;

public class HitungBalok27denganFungsi {

    static int hitungLuas(int pjg, int lbr) {
        return pjg * lbr;
    }

    static int hitungVolume(int pjg1, int lbr1, int tgi) {
        return pjg1 * lbr1 * tgi;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        int luasAlas  = hitungLuas(p, l);   // sisi atas-bawah
        int luasDepan = hitungLuas(p, t);   // sisi depan-belakang
        int luasSamping = hitungLuas(l, t); // sisi kiri-kanan
        return 2 * (luasAlas + luasDepan + luasSamping);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("=== Balok " + i + " ===");

            System.out.println("Masukkan panjang: ");
            int panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            int lebar = sc.nextInt();
            System.out.println("Masukkan tinggi: ");
            int tinggi = sc.nextInt();

            int luasPermukaan = hitungLuasPermukaanBalok(panjang, lebar, tinggi);
            int volume = hitungVolume(panjang, lebar, tinggi);

            System.out.println("Luas permukaan: " + luasPermukaan);
            System.out.println("Volume        : " + volume);
        }
    }
}