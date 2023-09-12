package burcBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte day, month;
        String horoscope = null;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay (rakamla): ");
        month = input.nextByte();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextByte();

        if (month == 1 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 21)
                horoscope = "Oğlak";
            else
                horoscope = "Kova";
        } else if (month == 2 && (day >= 1 && day <= 29)) {
            if (day >= 1 && day <= 19)
                horoscope = "Kova";
            else
                horoscope = "Balık";
        } else if (month == 3 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 20)
                horoscope = "Balık";
            else
                horoscope = "Koç";
        } else if (month == 4 && (day >= 1 && day <= 30)) {
            if (day >= 1 && day <= 21)
                horoscope = "Koç";
            else
                horoscope = "Boğa";
        } else if (month == 5 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 21)
                horoscope = "Boğa";
            else
                horoscope = "İkizler";
        } else if (month == 6 && (day >= 1 && day <= 30)) {
            if (day >= 1 && day <= 22)
                horoscope = "İkizler";
            else
                horoscope = "Yengeç";
        } else if (month == 7 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 22)
                horoscope = "Yengeç";
            else
                horoscope = "Aslan";
        } else if (month == 8 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 22)
                horoscope = "Aslan";
            else
                horoscope = "Başak";
        } else if (month == 9 && (day >= 1 && day <= 30)) {
            if (day >= 1 && day <= 22)
                horoscope = "Başak";
            else
                horoscope = "Terazi";
        } else if (month == 10 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 22)
                horoscope = "Terazi";
            else
                horoscope = "Akrep";
        } else if (month == 11 && (day >= 1 && day <= 30)) {
            if (day >= 1 && day <= 21)
                horoscope = "Akrep";
            else
                horoscope = "Yay";
        } else if (month == 12 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 21)
                horoscope = "Yay";
            else
                horoscope = "Oğlak";
        } else {
            isError = true;
            System.out.println("Geçersiz bir tarih girdiniz.");
        }

        if (isError == false)
            System.out.println("Burcunuz: " + horoscope);
    }
}
