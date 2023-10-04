package employeeClass;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        printEmployeeInfo();
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int nowYear = 2021 - this.hireYear;
        if (nowYear < 10) {
            return this.salary * 0.05;
        } else if (nowYear > 9 && nowYear < 20) {
            return this.salary * 0.10;
        } else if (nowYear > 19) {
            return this.salary * 0.15;
        }
        return 0;
    }

    void printEmployeeInfo() {
        System.out.println("=================");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam maaş: " + (this.salary + bonus() + raiseSalary() - tax()));
    }
}
