    public class Kafe227{


    public static void Menu(String nama, boolean isMember){

        System.out.println("Selamat datang " + nama);

        if(isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        
        }
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
    
        
        Menu("Stefan", false);
            }

    }