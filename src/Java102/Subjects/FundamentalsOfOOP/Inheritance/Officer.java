package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class Officer extends Employee{

    private String part;
    private String shift;

    Officer(String name, String phone, String eMail, String part, String shift){
        super(name, phone, eMail);
        this.part = part;
        this.shift = shift;
    }

    public String getPart() {
        return this.part;
    }
    public void setPart(String part) {
        this.part = part;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public void work(){
        System.out.println(this.getName() + " started to work.");
    }
}
