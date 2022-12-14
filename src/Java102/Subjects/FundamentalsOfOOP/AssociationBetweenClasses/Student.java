package Java102.Subjects.FundamentalsOfOOP.AssociationBetweenClasses;

public class Student {

    String name;
    String id;
    String address;
    int score;

    public Student(String name, String id, String address, int score) {
        this.name = name;
        this.id = id;
        this.address = address;
        if (score > 100 || score < 0){
            score = 0;
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        if (score > 100 || score < 0){
            score = 0;
        }
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
