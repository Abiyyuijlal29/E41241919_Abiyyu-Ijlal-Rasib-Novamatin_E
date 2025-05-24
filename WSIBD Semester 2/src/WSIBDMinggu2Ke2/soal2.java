package WSIBDMinggu2Ke2;

import java.util.Scanner;

public class soal2 {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("              CAFE CERIA            ");
        System.out.println("            ANEKA MINUMAN           ");
        System.out.println("====================================");
        System.out.println("           SPECIAL MENU :           ");
        System.out.println("  1. Soft drinks                    ");
        System.out.println("  2. Mix juice                       ");
        System.out.println("  3. Nescafe                         ");
        System.out.println("  4. Soda milk                       ");
        System.out.println("  5. Tea                              ");
        System.out.println("====================================");

        System.out.print("Masukkan nama pembeli : ");
        String nama = input.nextLine();
        System.out.print("\nSilahkan masukkan pilihan anda : ");
        int pilihan = input.nextInt();
        
        String minuman;
        switch (pilihan) {
            case 1:
                minuman = "Soft drinks";
                break;
            case 2:
                minuman = "Mix juice";
                break;
            case 3:
                minuman = "Nescafe";
                break;
            case 4:
                minuman = "Soda milk";
                break;
            case 5:
                minuman = "Tea";
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
                return;
        }

        System.out.println("Minuman yang anda pesan adalah " + minuman);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimkasih" +nama+ "telah berkunjung di cafe ceria");
    }
    
}
