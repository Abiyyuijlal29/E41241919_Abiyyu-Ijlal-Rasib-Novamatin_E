package WSIBDMinggu3ke2;

import java.util.Random;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = scanner.nextInt();

        int[] arrayAcak = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            arrayAcak[i] = random.nextInt(100); 
        }

        System.out.print("Array acak: ");
        for (int angka : arrayAcak) {
            System.out.print(angka + " ");
        }
    }
}
