package daireninAlaniCevresi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double veri,alan,pi=3.14;
        short a;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        veri = input.nextDouble();

        veri = veri > 360 ? veri % 360 : veri;

        System.out.print("Merkez açı ölçüsünü giriniz: ");
        a = input.nextShort();

        alan = (pi * (veri * veri) * a) / 360;
        System.out.println("Daire diliminin alanı: " + alan);
    }
}
