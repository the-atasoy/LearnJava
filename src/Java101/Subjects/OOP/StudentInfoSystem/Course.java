package Java101.Subjects.OOP.StudentInfoSystem;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(prefix)){
            this.teacher = teacher;
        }
        else{
            System.out.println("This prefix is not appropriate for this teacher.");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
    }

}
