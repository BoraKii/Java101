package ogrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }

    void printTeacher() {
        System.out.println("==============");
        System.out.println("Adı: " + teacher.name);
        System.out.println("Telefonu: " + teacher.mpno);
        System.out.println("Bölümü: " + teacher.branch);
    }
}
