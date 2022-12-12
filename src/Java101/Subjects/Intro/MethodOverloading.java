package Java101.Subjects.Intro;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,7));
        sayHi();
        sayHi(" Sevdeeee");

    }
    public static int sum (int x, int y){
        return x + y;
    }
    public static int sum (int x, int y, int z){
        return x + y + z;
    }


    public static void sayHi (){
        System.out.println("hi");
    }
    public static void sayHi (String name){
        System.out.println("hi" + name);
    }
}
