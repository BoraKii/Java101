package minMax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter, count = 1, number, min = 0, max = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        counter = input.nextInt();

        System.out.print("1.sayıyı giriniz: ");
        number = input.nextInt();
        min = number;
        max = number;

        do {
            ++count;
            System.out.print(count + ".sayıyı giriniz: ");
            number = input.nextInt();

            if (number > max)
                max = number;
            else if (number < min)
                min = number;

        } while (count < counter);
        System.out.println("En büyük sayı: " + max + "\nEn küçük sayı: " + min);
    }
}
