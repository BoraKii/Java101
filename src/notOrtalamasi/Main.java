import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        byte matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextByte();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextByte();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextByte();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextByte();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextByte();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextByte();

        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik) / 6.0;

        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = ortalama >= 60 ? "Sınıf Geçme Durumu: Geçtiniz" : "Sınıf Geçme Durumu: Kaldınız";
        System.out.println(sonuc);
    }
}
