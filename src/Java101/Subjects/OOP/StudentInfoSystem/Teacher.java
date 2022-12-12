package Java101.Subjects.OOP.StudentInfoSystem;

public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String phone, String branch){
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }

    void print(){
        System.out.println("Name : " + this.name + ", phone number: " + this.phone + ", branch: " + this.branch + ".");
    }

    }
