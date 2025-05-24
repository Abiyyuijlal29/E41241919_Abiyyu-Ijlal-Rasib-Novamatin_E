package WSIBDMinggu2Ke2;

import java.util.Scanner;

public class soal1 {
    public static void main(String [] args) {
        
        String nama;
        int Barang1;
        int Barang2;
        int Barang3;
        int Barang4;
        int Barang5;
        int totalHarga;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("------------------------------------");
        System.out.println("Khasrisma Agung Plaza < KAP >");
        System.out.println("Promo Belanja Berhadiah");
        System.out.println("Khusu Pembelian 5 Barang Pertama");
        System.out.println("Dengan harga minimum RP 10000,00");
        System.out.println("------------------------------------");
        
        System.out.print("Nama Pembeli : ");
        nama = scan.nextLine();
        
        System.out.print("\nharga barang ke-1 :");
        Barang1 = scan.nextInt();
        System.out.print("\nharga barang ke-2 :");
        Barang2 = scan.nextInt();
        System.out.print("\nharga barang ke-3 :");
        Barang3 = scan.nextInt();
        System.out.print("\nharga barang ke-4 :");
        Barang4 = scan.nextInt();
        System.out.print("\nharga barang ke-5 :");
        Barang5 = scan.nextInt();
        totalHarga = Barang1+Barang2+Barang3+Barang4+Barang5;
        System.out.println("Total harga pembelian atas nama" +nama+ "adalah Rp" +totalHarga);
        
        if (Barang1>=10000&&Barang2>=10000&&Barang3>=10000&&Barang4>=10000&&Barang5>=10000){
        System.out.println("Selamat...");
        System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
        }
        
        System.out.println("--------------------------------");
        System.out.println("Terimakasih");
        System.out.println("Anda sudah berbelanja di Kharisama Agung Plaza");
        
    }
}
