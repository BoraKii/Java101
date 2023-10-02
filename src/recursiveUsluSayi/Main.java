package recursiveUsluSayi;

import java.util.Scanner;

public class Main {
    static int power(int base, int n) {
        if (n == 0) return 1;
        return base * power(base, n-1);
    }

    public static void main(String[] args) {
        int base,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        n = input.nextInt();
        int power = power(base, n);
        System.out.println(power);
    }
}
