package Java102.Subjects.FundamentalsOfOOP.Inheritance;

public class Security extends Officer {

    private String Document;

    public Security(String name, String phone, String eMail, String part, String shift, String document) {
        super(name, phone, eMail, part, shift);
        Document = document;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    public void watch(){
        System.out.println(this.getName() + " started to watch.");
    }
}
