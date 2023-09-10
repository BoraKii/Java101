package manavKasaProgrami;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5.00f, kg, fiyat = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Aldığınız armut (kg cinsinden): ");
        kg = input.nextFloat();

        fiyat += kg * armut;

        System.out.print("Aldığınız elma (kg cinsinden): ");
        kg = input.nextFloat();

        fiyat += kg * elma;

        System.out.print("Aldığınız domates (kg cinsinden): ");
        kg = input.nextFloat();

        fiyat += kg * domates;

        System.out.print("Aldığınız muz (kg cinsinden): ");
        kg = input.nextFloat();

        fiyat += kg * muz;

        System.out.print("Aldığınız patlıcan (kg cinsinden): ");
        kg = input.nextFloat();

        fiyat += kg * patlican;

        System.out.println("Toplam tutar: " + fiyat);
    }
}
