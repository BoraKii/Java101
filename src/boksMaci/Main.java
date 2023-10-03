package boksMaci;

public class Main {
    public static void main(String[] args) {
        Fighter sam = new Fighter("Sam", 15, 90, 83, 20);
        Fighter yuri = new Fighter("Yuri", 14, 95, 100, 20);
        Match r = new Match(sam, yuri, 70, 100);
        r.run();
    }
}