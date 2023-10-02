package gelismisHesapMakinesi;

import java.util.Scanner;

public class Main {
    static void plus() {
        int number, i = 1, result = 0;

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print(i++ + ". Sayı: ");
            number = input.nextInt();
            if (number == 0)
                break;
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        int number, counter, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times() {
        int number, i = 1, result = 1;

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print(i++ + ". Sayı: ");
            number = input.nextInt();
            result *= number;
            if (number == 1 || result == 0)
                break;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        int number, counter, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayı gireceksiniz: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            number = input.nextInt();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz!");
                continue;
            }
            if (i == 1) {
                result += number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        int base, n, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        int number, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mode() {
        int number, mod, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        System.out.print("Mod giriniz: ");
        mod = input.nextInt();
        result = number % mod;
        System.out.println("Sonuç: " + result);
    }

    static void rectangle() {
        int longEdge, shortEdge;
        Scanner input = new Scanner(System.in);
        System.out.print("Uzun kenar değerini giriniz: ");
        longEdge = input.nextInt();
        System.out.print("Kısa kenar değerini giriniz: ");
        shortEdge = input.nextInt();
        System.out.println("Dikdörtgen Alanı: " + (longEdge * shortEdge) +
                "\nDikdörtgen Çevresi: " + (2 * (longEdge + shortEdge)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz:");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                case 2:
                    minus();
                case 3:
                    times();
                case 4:
                    divided();
                case 5:
                    power();
                case 6:
                    factorial();
                case 7:
                    mode();
                case 8:
                    rectangle();
                case 0:
                    System.out.println("Hesap makinesinden başarıyla çıkış yapıldı.");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, lütfen tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
