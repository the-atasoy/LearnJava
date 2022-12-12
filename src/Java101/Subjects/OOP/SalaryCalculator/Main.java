package Java101.Subjects.OOP.SalaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter name of employee: "); String name = scan.nextLine();
        System.out.print("Please enter salary of employee per week: "); int salary = scan.nextInt();
        System.out.print("Please enter work hours of employee per week: "); int workHour = scan.nextInt();
        System.out.print("Please enter hire year of employee: "); int hireYear = scan.nextInt();
        System.out.println("\n================================================\n");

        Employee emp = new Employee(name, salary, workHour, hireYear);

        emp.printInfo();
    }
}
