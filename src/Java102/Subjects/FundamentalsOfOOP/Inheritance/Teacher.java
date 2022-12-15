package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class Teacher extends Instructor{
    private String doorNo;
    Teacher(String name, String phone, String eMail, String department, String title, String doorNo){
        super(name, phone, eMail, department, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo(){
        return this.doorNo;
    }
    public void setDoorNo(String doorNo){
        this.doorNo = doorNo;
    }

    public void senateMeeting(){
        System.out.println(this.getName() + " attended a senate meeting.");
    }

    public void doExam(){
        System.out.println(this.getName() + " started an exam.");
    }

    @Override
    public void enter(){
        System.out.println("Teacher " + this.getName() + " entered the university.");
    }

}
