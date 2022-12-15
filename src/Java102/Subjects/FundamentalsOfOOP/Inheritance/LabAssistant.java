package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class LabAssistant extends Assistant {

    public LabAssistant(String name, String phone, String eMail, String department, String title, String officeHours) {
        super(name, phone, eMail, department, title, officeHours);
    }

    public void enterLab(){
        System.out.println(this.getName() + " started a lab lesson.");
    }
}
