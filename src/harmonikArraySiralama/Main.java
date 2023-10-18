package harmonikArraySiralama;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double sum = 0.0;

        for (int i : list) {
            sum += i;
        }

        double avarage = sum / list.length;
        System.out.println("Dizi ortalaması: " + avarage);
    }
}
