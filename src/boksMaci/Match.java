package boksMaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("======== YENI ROUND BASLADI ========");
                if (firstToAttack()) {
                    this.f2.health = f1.hit(this.f2);
                    if (isWin())
                        break;
                } else {
                    this.f1.health = f2.hit(this.f1);
                    if (isWin())
                        break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor, mücadele iptal edildi.");
        }
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Maçı Kazandı!");
            return true;
        } else if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Maçı Kazandı!");
            return true;
        }
        return false;
    }

    boolean checkWeight() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    void printScore() {
        System.out.println(this.f1.name + " Kalan Can \t:" + this.f1.health);
        System.out.println(this.f2.name + " Kalan Can \t:" + this.f2.health);
    }

    boolean firstToAttack() {
        int first = (int) (Math.random() * 10);
        return first <= 5;
    }
}
