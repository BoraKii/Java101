package vucutKitleIndeksi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double boy,kg,result;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();

        result = kg / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + result);

    }
}
