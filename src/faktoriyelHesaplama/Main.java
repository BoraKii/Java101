package faktoriyelHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, nF, nR, fSum = 1, rSum = 1, frSum = 1, total = 0;

        Scanner input = new Scanner(System.in);
        // Faktöriyel
        System.out.print("Faktöriyel sayısı giriniz: ");
        n = input.nextInt();

        for (int i = n; i > 1; i--) {
            fSum *= i;
        }

        System.out.println(fSum);

        // Kombinasyon
        System.out.print("1. Kombinasyon sayısını giriniz: ");
        nF = input.nextInt();
        System.out.print("2. Kombinasyon sayısını giriniz: ");
        nR = input.nextInt();

        fSum = 1;

        for (int i = 1; i <= nF; i++) {
            fSum *= i;
        }

        for (int i = 1; i <= nR; i++) {
            rSum *= i;
        }

        for (int i = 1; i <= nF - nR; i++) {
            frSum *= i;
        }

        total = fSum / (rSum * frSum);
        System.out.println("Kombinasyon sonucu: " + total);
    }
}
