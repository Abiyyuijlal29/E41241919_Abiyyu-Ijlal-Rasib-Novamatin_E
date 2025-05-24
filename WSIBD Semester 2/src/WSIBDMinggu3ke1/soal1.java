package WSIBDMinggu3ke1;

import java.util.Scanner;

public class soal1 {
        public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        System.out.println("Bilangan genap dari " + batasAwal + " hingga " + batasAkhir + ":");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) { 
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
