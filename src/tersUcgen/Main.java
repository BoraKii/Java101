package tersUcgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = (n - i); j >= 1; j--)
                System.out.print(" ");

            for (int k = (2 * i) - 1; k >= 1; k--)
                System.out.print("*");

            System.out.println();
        }
    }
}
