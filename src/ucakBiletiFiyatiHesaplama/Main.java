package ucakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte age, type;
        double km, costPerKm = 0.1, total;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextByte();

        System.out.print("Yolculuk tipini giriniz (1 => tek yön , 2 => gidiş dönüş): ");
        type = input.nextByte();

        total = km * costPerKm;

        if (age < 12)
            total *= 0.5;
        else if (age >= 12 && age <= 24)
            total *= 0.9;
        else if (age > 65)
            total *= 0.7;

        switch (type) {
            case 1:
                break;
            case 2:
                total *= 0.8;
                total *= 2;
                break;
            default:
                isError = true;
        }

        if (!(km >= 0) || !(age >= 0))
            isError = true;

        if (isError)
            System.out.println("Hatalı bir veri girdiniz !");
        else
            System.out.println("Toplam tutar: " + total + " TL");
    }
}
