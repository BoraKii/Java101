package kullaniciGirisi;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        String userName, password, select;
        boolean check = true;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("bora") && password.equals("patika")) {
            System.out.println("Başarıyla giriş yaptınız."); return;
        } else {
            System.out.print("Kullanıcı adı ya da şifre hatalı. Şifrenizi sıfırlamak ister misiniz? (e/h): ");
        }

        select = input.nextLine();

        if ((!select.equals("e")) && (!select.equals("h"))) {
            System.out.println("Hatalı bir işlem seçtiniz. İşlem sonlandırıldı."); return;
        }

        if (select.equals("e")) {
            System.out.println("Şifre sıfırlama Ekranı!");
            System.out.print("Yeni şifre giriniz: ");
            password = input.nextLine();

            while (check) {
                if (password.equals("patika") == password.equals(password)) {
                    System.out.println("Yeni şifreniz, eski şifreniz ile aynı olmamalıdır! Lütfen başka şifre giriniz.");
                    System.out.print("Yeni şifre giriniz: ");
                    password = input.nextLine();
                } else {
                    check = false;
                    System.out.println("Şifre başarıyla değiştirildi.");
                }
            }

        } else if (select.equals("h")) {
            System.out.println("İşlem başarıyla reddedildi.");
        }
    }
}
