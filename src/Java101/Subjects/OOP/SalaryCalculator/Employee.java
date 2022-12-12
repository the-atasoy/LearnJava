package Java101.Subjects.OOP.SalaryCalculator;

import java.time.Year;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary){
        double tax = 0;
        if (salary >= 2000 && salary < 5000){
            tax = salary * 10 / 100;
        } else if (salary >= 5000) {
            tax = salary * 20 / 100;
        }
        return tax;
    }

    double bonus(int workHours, double salary){
        double bonus = 0;
        this.workHours = workHours;
        if (workHours > 40){
            bonus = (workHours-40)*salary/40*(3);
        }
        return bonus;
    }

    double raiseSalary(int hireYear){
        this.hireYear = hireYear;
        int thisYear = Year.now().getValue();
        double raise = 0;
        if (thisYear - hireYear < 10){
            raise = (this.salary * 0.15);
        } else if (thisYear - hireYear > 9 && thisYear - hireYear < 20) {
            raise = (this.salary * 0.20);
        } else if (thisYear - hireYear > 19) {
            raise = (this.salary * 0.25);
        }
        return raise;
    }

    void printInfo(){
        double raise = raiseSalary(this.hireYear);
        double bonus = bonus(this.workHours, this.salary + raise);
        double tax = tax(this.salary + bonus + raise);

        System.out.println("Hiring year of " + this.name + " is " + this.hireYear + ".\n");
        System.out.println("Salary raise of " + this.name + " is " + raise + " TL.\n");
        System.out.println("Bonuses of " + this.name + " is " + bonus + " TL.\n");
        System.out.println("Tax of " + this.name + " he/she has to pay is " + tax + " TL.\n");
        System.out.println("Total salary of " + this.name + " is " + (this.salary + raise + bonus - tax) + "TL per week.\n");
    }
}
