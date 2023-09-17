package ebobEkokBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOne, numTwo, counter, data = 0;
        // int dataTwo = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz: ");
        numOne = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        numTwo = input.nextInt();

        counter = numOne;
        while (counter >= 1) {
            if (numOne % counter == 0 && numTwo % counter == 0) {
                data = counter;
                break;
            }
            counter--;
        }
        // dataTwo = (numOne * numTwo) / data;
        System.out.println("(" + numOne + "," + numTwo + ") EBOB: " + data);

        counter = 1;
        while (counter <= (numOne * numTwo)) {
            if (counter % numOne == 0 && counter % numTwo == 0) {
                data = counter;
                break;
            }
            counter++;
        }
        System.out.println("(" + numOne + "," + numTwo + ") EKOK: " + data);
    }
}
