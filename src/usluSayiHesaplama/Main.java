package usluSayiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b, n, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısı giriniz: ");
        b = input.nextInt();
        System.out.print("Üs sayısı giriniz: ");
        n = input.nextInt();

        for (int i = n; i > 0; i--) {
            total *= b;
        }

        System.out.println(total);
    }
}
