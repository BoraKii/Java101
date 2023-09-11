package hesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\n");
        System.out.print("Bir işlem sayısı giriniz: ");
        select = input.nextInt();

        if ((select <= 0) || (select > 4)) {
            System.out.println("Geçersiz bir işlem girdiniz. Program sonlandırıldı.");
            return;
        }

        System.out.print("Birinci sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Bölme: " + (num1 / num2));
                break;
        }
    }
}
