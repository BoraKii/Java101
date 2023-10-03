package ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Özkan Hoca", "FZK", "0000");
        Teacher t2 = new Teacher("Hafize Hoca", "MAT", "1111");
        Teacher t3 = new Teacher("Enver Hoca", "KMY", "2222");

        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t1);
        Course mat = new Course("Matematik", "102", "MAT");
        mat.addTeacher(t2);
        Course kimya = new Course("Kimya", "103", "KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("Bora", 4, "408", mat, fizik, kimya);
        s1.addBulkExamNote(100, 90, 75);
        s1.isPass();

        Student s2 = new Student("Damla", 4, "705", mat, fizik, kimya);
        s2.addBulkExamNote(100, 100, 60);
        s2.isPass();
    }
}
