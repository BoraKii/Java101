package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, tempOne = 0, tempTwo = 1, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısı: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(tempOne);
            total = tempOne + tempTwo;
            tempOne = tempTwo;
            tempTwo = total;
        }
    }
}
