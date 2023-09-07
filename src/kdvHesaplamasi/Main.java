package kdvHesaplamasi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat, kdvTutari, kdvFiyati, kdvOrani;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat giriniz: ");
        fiyat = input.nextDouble();

        if (fiyat < 0) {
            System.out.println("Geçersiz bir fiyat girdiniz. İşlem sonlandı."); return;
        }

        if (fiyat >= 0 && fiyat <= 1000){
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        kdvTutari = fiyat * kdvOrani;
        kdvFiyati = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvFiyati);
    }
}
