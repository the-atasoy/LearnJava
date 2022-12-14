package Java102.Subjects.FundamentalsOfOOP.AssociationBetweenClasses;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Barış Atasoy", "215", "Zafer Mah.", 88);
        Student st2 = new Student("Sevde Seçer", "182", "Lanet olası KYK", 95);
        Student st3 = new Student("Bahtiyar Kocayürek", "999", "Belediye Evleri", 9999);
        st3.setScore(56);

        Instructor i1 = new Instructor("Mahmut", "Çeçen", "CENG");
        Instructor i2 = new Instructor("Kayra", "Kayar", "Statistics");

        // Course has an Instructor(Composition, aggregation).
        Course math = new Course("Introduction to Calculus", "MAT101", i1);
        Course phy = new Course("Introduction to Physics", "FIZ101", i2);

        Student[] stu = {st1, st2, st3};

        System.out.println(math.calcAve(stu));
        System.out.println(math.getInstructor().getName());
    }
}
