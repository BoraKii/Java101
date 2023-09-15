package ciftSayiToplam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, count = 0, sum = 0;
        double avg;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        avg = sum / count;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + avg);
    }
}
