package ogrenciBilgiSistemi;

public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    void addBulkExamNote(int matNote, int fizikNote, int kimyaNote) {
        if (matNote >= 0 && matNote <= 100) {
            this.mat.note = matNote;
        }
        if (fizikNote >= 0 && fizikNote <= 100) {
            this.fizik.note = fizikNote;
        }
        if (kimyaNote >= 0 && kimyaNote <= 100) {
            this.kimya.note = kimyaNote;
        }
    }

    void calcAvarage() {
        this.avarage = (this.mat.note + this.fizik.note + this.kimya.note) / 3.0;
    }

    void isPass() {
        printNote();
        if (this.avarage > 55) {
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        } else {
            System.out.println("Maalesef sınıfta kaldınız.");
        }
    }

    void printNote() {
        calcAvarage();
        System.out.println("==============");
        System.out.println("Öğrenci Adı: " + this.name);
        System.out.println(this.mat.name + " Notu: " + this.mat.note);
        System.out.println(this.fizik.name + " Notu: " + this.fizik.note);
        System.out.println(this.kimya.name + " Notu: " + this.kimya.note);
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
