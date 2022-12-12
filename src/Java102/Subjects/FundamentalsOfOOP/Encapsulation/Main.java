package Java102.Subjects.FundamentalsOfOOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 154);
        Book lordOfTheRings = new Book("Lord Of The Rings", -1023);
        lordOfTheRings.changePageNumber(-42);
        System.out.println(lordOfTheRings.showPageNumber());
    }
}
