package atmProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int balance = 20000;
        byte right = 3, select;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("boradev")) {
                do {
                    System.out.println("Merhaba, " + userName + "! Kodluyoruz bankasına hoş geldiniz.");
                    System.out.println(
                            "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");

                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextByte();
                    switch (select) {
                        case 1:
                            int price;
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println(price + " TL başarıyla hesabınıza aktarılmıştır.");
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                            price = input.nextInt();
                            if (price <= balance) {
                                balance -= price;
                                System.out.println(price + " TL başarıyla hesabınızdan çekilmiştir.");
                            } else {
                                System.out.println("Yetersiz bakiye!");
                            }
                            break;
                        case 3:
                            System.out.println("Hesabınızda toplam " + balance + " TL bulunmaktadır.");
                            break;
                        case 4:
                            System.out.println("Sistemden başarıyla çıkış yapıldı! Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz bir işlem yaptınız. Lütfen tekrar deneyiniz.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                if (right != 0) {
                    System.out.println("Hatalı bir giriş yaptınız.\nKalan hakkınız: " + right);
                } else {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanızla iletişime geçiniz.");
                }
            }
        }
    }
}
