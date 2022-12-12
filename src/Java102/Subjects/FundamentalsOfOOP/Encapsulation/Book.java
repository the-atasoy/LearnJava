package Java102.Subjects.FundamentalsOfOOP.Encapsulation;

public class Book {

    private String name;
    private int pageNumber;

    public Book(String name, int pageNumber){
        this.name = name;
        if (pageNumber < 0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }

    public void changePageNumber(int pageNumber){
        if (pageNumber < 0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }

    public int showPageNumber(){
        return this.pageNumber;
    }

    public void changeName(String name){
        this.name = name;
    }

    public String showName(){
        return this.name;
    }
}
