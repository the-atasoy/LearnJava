package Java102.Subjects.FundamentalsOfOOP.AssociationBetweenClasses;

public class Course {

    private String name;
    private String code;

    private Instructor instructor;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    Course(String name, String code, Instructor instructor){
        this.name = name;
        this.code = code;
        this.instructor = instructor;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Course uses students, so course class is dependent to Student class.
    public double calcAve(Student[] students){

        double ave = 0;

        for (int i = 0; i < students.length; i++){
            ave += students[i].getScore();
        }

        return ave / students.length;
    }



}
