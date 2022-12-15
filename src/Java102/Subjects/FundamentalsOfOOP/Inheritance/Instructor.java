package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class Instructor extends Employee{
    private String department;
    private String title;

    // if a super class extends a subclass, it has to create constructor method like below.
    Instructor(String name, String phone, String eMail, String department, String title){
        super(name, phone, eMail);
        this.department = department;
        this.title = title;
    }

    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(){
        this.department = department;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(){
        this.title = title;
    }

    public void startLesson(){
        System.out.println(this.getName() + " started a lesson.");
    }
}
