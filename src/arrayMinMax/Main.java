package arrayMinMax;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int list[] = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = list[0];
        int max = list[0];

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int number = input.nextInt();
        Arrays.sort(list);

        for (int i : list) {
            if (i < number) {
                min = i;
                continue;
            }
            if (i > number) {
                max = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min + "\nGirilen sayıdan büyük en yakın sayı : " + max);
    }
}
