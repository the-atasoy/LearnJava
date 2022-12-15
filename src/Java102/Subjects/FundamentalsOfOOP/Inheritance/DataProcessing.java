package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class DataProcessing extends Officer {

    private String duty;

    public DataProcessing(String name, String phone, String eMail, String part, String shift, String duty) {
        super(name, phone, eMail, part, shift);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void networkSetup(){
        System.out.println(this.getName() + " established a network.");
    }
}
