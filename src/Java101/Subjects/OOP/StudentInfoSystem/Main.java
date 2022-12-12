package Java101.Subjects.OOP.StudentInfoSystem;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Leibniz", "+905332125698", "MAT");
        Teacher t2 = new Teacher("Tesla", "+905124689785", "PHY");
        Teacher t3 = new Teacher("Heisenberg", "+425236987462", "CHE");

        Course calculus = new Course("Calculus 1", "101", "MAT");
        calculus.addTeacher(t1);

        Course physics = new Course("Physics 2", "102", "PHY");
        physics.addTeacher(t2);

        Course chemistry = new Course("Chemistry 3", "201", "CHE");
        chemistry.addTeacher(t3);

        Student s1 = new Student("Barış Atasoy", "2917", "1", calculus, physics, chemistry);
        s1.addBulkExamNote(100,45,72);
        s1.printTotalInfo();

        Student s2 = new Student("Sevde Seçer", "512", "1", calculus, physics, chemistry);
        s2.addBulkExamNote(63,100,95);
        s2.printTotalInfo();
    }

}
