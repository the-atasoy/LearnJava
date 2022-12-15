package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ahmet", "05555555555", "ahmet@ameil.com");
        // e1.getDepartment(); this code does not work because employee is a subclass.

        Instructor i1 = new Instructor("Ali Yürekli", "059959999999", "aliyurekli@eskisehir.edu.tr", "CENG", "DR.");
        i1.exit();
        i1.startLesson();

        Officer o1 = new Officer("Kemal Patates", "05211236547", "patateskemal@jmail.com", "Student Affairs", "09.00 - 17.00");
        System.out.println(o1.getShift());

        Teacher t1 = new Teacher("Mahmut Taş", "05325559988", "m@gmail.com", "EEE", "Professor","2");
        System.out.println(t1.getName());

        Assistant a1 = new Assistant("Aslı", "123", "asli@eskisehir.edu.tr", "CENG", "Assistant", "13.00- 16.00");

        /*
        Objects can be created from classes and these objects are able to use methods of their super classes.
         */

    }
}
