package dikUcgendeHipotenus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a + b*b));
        System.out.println("Hipotenüs: " + c);
    }
}
