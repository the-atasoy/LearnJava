package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class Assistant extends Instructor{
    private String officeHours;

    public Assistant(String name, String phone, String eMail, String department, String title, String officeHours) {
        super(name, phone, eMail, department, title);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void doQuiz(){
        System.out.println(this.getName() + " started a quiz.");
    }

    @Override
    public void startLesson(String courseHours){

    }
}
