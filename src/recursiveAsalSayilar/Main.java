package recursiveAsalSayilar;

import java.util.Scanner;

public class Main {
    static boolean isAsal(int n, int limit) {
        if (n < 2)
            return false;
        if (limit == 1)
            return true;
        if (n % limit == 0)
            return false;
        return isAsal(n, limit - 1);
    }

    public static void main(String[] args) {
        int n;
        String asal = " is prime number.";
        String notAsal = " is not prime number.";
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        if (isAsal(n, n/2))
            System.out.println(n + asal);
        else
            System.out.println(n + notAsal);
    }
}
