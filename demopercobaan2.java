
import java.util.Scanner;

public class demopercobaan2{
    //fungsi dengan parameter dan return
    public static String cekKelulusan(int nilai)
        
    {
        String kondisi;    
        if (nilai >= 70){
            kondisi = "Lulus";
            
        }else{
            kondisi = "Tidak lulus";
            
        }return kondisi;

        
        
    }
    public static int cekTotalNilai( int nilai [] ){
        int jumlah = 0;
        
        int i = 0;

        while(i < nilai.length){

            jumlah += nilai[i];
        i++;

        }
        return jumlah;
    }
    public static int hitungLulus(int[]kumpulanNilai){
        int jumlahLulus = 0;
        int i = 0;

        while(i < kumpulanNilai.length){
            if(kumpulanNilai[i] >= 70){
                jumlahLulus ++;
            }
               i++;
        }
            return jumlahLulus;
    }

     //fungsi dengan void

     public static void pilihMenu(){
        System.out.println("1. Tampilkan nilai");
        System.out.println("2. Hitung yang lulus");
        System.out.println("0. Keluar");
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]nilai = {80, 60, 95, 70, 85};
        int pilihan;

        //perulangan do-while

        do{
            pilihMenu();
            System.out.print("Masukkan menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1 :
                
                for( int i = 0; i < nilai.length;i++){
                System.out.println(nilai[i] + cekKelulusan(nilai[i]));
                }break;
                
                case 2 : 
     
                System.out.println("Mahasiswa yang lulus: " + hitungLulus(nilai));
                break;

               
                case 0 : 
                System.out.println("Keluar");
                
                    break;
                default:
                    System.out.println("Tidak ada pilihan tersebut");
                
            }
    }while(pilihan !=  0 );
                
            
        
     
    }
}
