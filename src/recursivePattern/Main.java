package recursivePattern;

import java.util.Scanner;

public class Main {
    static void pattern(int number, int temp, boolean control) {
        if (number > 0 && !control) {
            System.out.println(number);
            pattern(number - 5, temp, control);
        } else if (number <= 0) {
            System.out.println(number);
            pattern(number + 5, temp, !control);
        } else if (number <= temp) {
            System.out.println(number);
            pattern(number + 5, temp, control);
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        pattern(number, number, false);
    }
}