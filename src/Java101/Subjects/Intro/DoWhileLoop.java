package Java101.Subjects.Intro;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("hello " + i);
            i++;
        } while (i<=5);
        // this code works before test the condition but while loop does not work before test the condition.
    }
}
