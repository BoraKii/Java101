package taksimetreProgrami;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int km;
        double total=10,perKm=2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("KM cinsinden bir mesafe giriniz: ");
        km = input.nextInt();

        System.out.println("Taksimetre: " + total);

        total += km * perKm;
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam " + km + " km yol gittiniz.");
        System.out.println("Ödenecek tutar: " + total + " TL");
    }
}
