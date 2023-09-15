package tekSayilarinToplami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();

            if (number % 2 == 0)
                sum += number;

        } while (number % 2 != 1);

        System.out.println("Çift ve 4'ün katları olan sayıların toplamı: " + sum);

    }
}
