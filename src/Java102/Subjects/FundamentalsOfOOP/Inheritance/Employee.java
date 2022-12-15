package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class Employee {

    private String name;
    private String phone;
    private String eMail;

    public Employee(String name, String phone, String eMail){
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEMail(){
        return this.eMail;
    }

    public void setEMail(String eMail){
        this.eMail = eMail;
    }

    public void enter(){
        System.out.println(this.name + " entered the university.");
    }

    public void exit(){
        System.out.println(this.name + " left university.");
    }

    public void cafeteria(){
        System.out.println(this.name + " entered the cafeteria.");
    }
}
