package perfectNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, perfectNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                perfectNumber += i;
        }

        if (n == perfectNumber)
            System.out.println(perfectNumber + " Mükemmel bir sayıdır.");
        else
            System.out.println(n + " Mükemmel bir sayı değildir.");
    }
}
