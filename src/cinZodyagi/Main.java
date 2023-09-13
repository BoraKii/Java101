package cinZodyagi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short year;
        int cinZodyagi;
        String burc = null;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextShort();

        cinZodyagi = year % 12;

        switch (cinZodyagi) {
            case 1:
                burc = "Maymun";
                break;
            case 2:
                burc = "Horoz";
                break;
            case 3:
                burc = "Köpek";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                isError = true;
                break;
        }

        if (isError)
            System.out.println("Burç hesaplanamadı.");
        else
            System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
