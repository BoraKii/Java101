package armstrongSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, basCount = 0, tempNumber, basValue, basPow, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basCount++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basCount; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number)
            System.out.println(result + " sayısı Armstrong bir sayıdır.");
        else
            System.out.println(result + " sayısı Armstrong bir sayı değildir.");

        // 2.Örnek
        System.out.print("\nBasamaklar toplamı için bir sayı giriniz: ");
        number = input.nextInt();
        tempNumber = number;
        result = 0;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }

        System.out.println(number + " sayısı basamaklar toplamı: " + result);
    }
}
