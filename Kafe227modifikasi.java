
import java.util.Scanner;


    public class Kafe227modifikasi{
 

    public static void Menu(String nama, boolean isMember, int jamKunjung){

        System.out.println("Selamat datang " + nama);

        if(isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        
        
        }
        if (jamKunjung <= 16  && jamKunjung >= 14)
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");

        System.out.println("==== MENU RESTU KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino  - Rp 20.000");
        System.out.println("3. Latte      - Rp 22.000");
        System.out.println("4. Teh Tarik  - Rp 12.000");
        System.out.println("5. Roti bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        String namaPengguna;
        boolean memberPengguna;
        int jamKunjung; 

        System.out.println("Masukkan nama anda: ");
        namaPengguna = sc.nextLine();

        System.out.println("Masukkan status member anda (true/false): ");
        memberPengguna = sc.nextBoolean();
        
        System.out.println("Masukkan Jam Kunjung anda (1-24): ");
        jamKunjung = sc.nextInt();

        Menu(namaPengguna, memberPengguna, jamKunjung);
            }

    }