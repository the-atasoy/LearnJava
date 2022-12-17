package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class Main {
    public static void main(String[] args) {

        //Employee e1 = new Employee("Ahmet", "05555555555", "ahmet@ameil.com");  *abstract*
        // e1.getDepartment(); this code does not work because employee is a subclass.

        //Instructor i1 = new Instructor("Ali Yürekli", "059959999999", "aliyurekli@eskisehir.edu.tr", "CENG", "DR.");
        //i1.exit();            "Instructor" class is abstract now, you cannot create an object from "Instructor" class.
        //i1.startLesson();

        //Officer o1 = new Officer("Kemal Patates", "05211236547", "patateskemal@jmail.com", "Student Affairs", "09.00 - 17.00");
        //System.out.println(o1.getShift());      "Officer" class is abstract now, you cannot create an object from "Officer" class.

        Teacher t1 = new Teacher("Mahmut Taş", "05325559988", "m@gmail.com", "EEE", "Professor","2");
        System.out.println(t1.getName());
        t1.startLesson("09.00");

        Assistant a1 = new Assistant("Aslı", "123", "asli@eskisehir.edu.tr", "CENG", "Assistant", "13.00- 16.00");

        /*
        Objects can be created from classes and these objects are able to use methods of their super classes.
         */

        /*
        ------------------------------------------------------
         */

        // Method overriding
        // Method "enter" is in "Employee" class but this "enter" method was overrided in "Instructor" class,
        // so it was used from "Instructor" class instead of "Employee" class.
        //i1.enter();

        t1.enter(); // this code checks "Teacher" class before and if there is no "enter" method, it checks "Instructor" class.
                    // If there is no "enter" method in "Instructor" class, it checks "Employee" class.



        /*
        -----------------------------------------------------
         */

        // Polymorphism
        Employee t2 = new Teacher("Betül Atasoy", "05128978989", "betul@gmail.com", "AI", "Proffessor", "101");
        t2.enter(); // this code works from "Teacher" class because "enter" method exists in "Employee" class and it overrided.
        // t2.getDepartment(); this code does not work because "getDepartment" method does not exist in Employee class.
        t2.exit(); // this code works from "Employee" class because it was not overrided in "Teacher" class.


        Employee[] loginUsers = {a1, t2, t1};
        System.out.println("\n");
        Employee.entrants(loginUsers);

    }
}
