package asalSayilar;

public class Main {
    public static void main(String[] args) {
        byte n = 100;

        for (int i = 2; i <= n; i++) {
            boolean isAsal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isAsal = false;
                    break;
                }
            }
            if (isAsal)
                System.out.print(i + " ");
        }
    }
}
