package Java101.Subjects.Intro;

public class Methods2 {
    public static void main(String[] args) {
        int x = 1;
        increment(x);
        System.out.println(x);

    }
    public static void increment(int x){
        x += 2;
        System.out.println(x);
    }
}
