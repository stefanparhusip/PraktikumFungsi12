
import java.util.Scanner;

    

    public class Kafe327modifikasi{

    public static  double hitungDiskon(int total, String kodePromo, boolean isMember, int jamKunjung){

        double persen = 0;
        if(kodePromo.equals("DISKON50")){
            persen = 50;
            
        }else if(kodePromo.equals("DISKON30")){
            persen = 30;
        }else{
            System.out.println("Kode Promo tidak valid");
        }
        if (isMember){
            persen = persen + 10;
        }
         if (jamKunjung <= 16  && jamKunjung >= 14)
            persen = persen + 20;

        double nominalDiskon = total * (persen / 100);
        return nominalDiskon;
    }
 
    public static int hitungTotalHarga27(int pilihanMenu, int banyakItem){
        int[]hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

           
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        return hargaTotal;
    }

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

        System.out.println("\nMasukkan nomor yang ingin anda pesan: ");
        int pilihanMenu1 = sc.nextInt();
         System.out.println("Masukkan jumlah item yang ingin anda pesan: ");
        int banyakItem1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga27(pilihanMenu1, banyakItem1);
        double diskon = hitungDiskon(totalHarga, kodePromo, memberPengguna, jamKunjung);
        double totalBayar = totalHarga - diskon;

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
        System.out.println("Besar diskon                  : Rp" + diskon);
        System.out.println("Total bayar                   : Rp" + totalBayar);
            }
    }