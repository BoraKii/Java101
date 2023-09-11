package sinifGecmeDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte matematik, fizik, turkce, kimya, muzik;
        double avarage;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextByte();
        matematik = (matematik < 0 || matematik > 100) ? 0 : matematik;

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextByte();
        fizik = (fizik < 0 || fizik > 100) ? 0 : fizik;

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextByte();
        turkce = (turkce < 0 || turkce > 100) ? 0 : turkce;

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextByte();
        kimya = (kimya < 0 || kimya > 100) ? 0 : kimya;

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextByte();
        muzik = (muzik < 0 || muzik > 100) ? 0 : muzik;

        avarage = (matematik + fizik + turkce + kimya + muzik) / 5.0;

        if (avarage > 54)
            System.out.println("Tebrikler! Sınıfı geçtiniz. Ortalamanız: " + avarage);
        else
            System.out.println("Üzgünüm, sınıfta kaldınız. Ortalamanız: " + avarage);
    }
}
