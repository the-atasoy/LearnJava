package Java101.Subjects.OOP.StudentInfoSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String no;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String no, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.no = no;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }

    void addBulkExamNote (int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void printTotalInfo(){
        System.out.println("Name: " + this.name + "\nClass: " + this.classes + "\nStudent no: " + this.no + "\n");
        System.out.println("You got " + this.c1.name + " lesson from " + this.c1.teacher.name);
        System.out.println("You got " + this.c2.name + " lesson from " + this.c2.teacher.name);
        System.out.println("You got " + this.c3.name + " lesson from " + this.c3.teacher.name + "\n");
        isPass();
        System.out.println("==================================================\n");
    }
    void isPass(){
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;

        printNote();

        if (average >= 55){
            System.out.println("You finished this year successfully.");
        }
        else{
            System.out.println("You could not finish this year successfully.");
        }
    }
    void printNote (){
        System.out.println(c1.name + " Note: " + c1.note);
        System.out.println(c2.name + " Note: " + c2.note);
        System.out.println(c3.name + " Note: " + c3.note);
        System.out.println("Your average is " + average);
    }
}
