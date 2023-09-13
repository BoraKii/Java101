package artikYilHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = input.nextShort();

        if (!(year % 100 == 0)) {
            if (year % 4 == 0)
                System.out.println(year + " artık bir yıldır.");
            else
                System.out.println(year + " artık bir yıl değildir.");
        } else {
            if (year % 400 == 0)
                System.out.println(year + " artık bir yıldır.");
            else
                System.out.println(year + " artık bir yıl değildir.");
        }
    }
}
