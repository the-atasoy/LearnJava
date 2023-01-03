package Java101.Exercises;

import java.util.*;

public class Empty {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Inner.powerof2();
    }
    private static class Inner{
        static Scanner input = new Scanner(System.in);
        static int num = input.nextInt();
        private static void powerof2(){
            if(num < 1 && num > Math.pow(2, 8)){
                num = input.nextInt();
            }
            while(true){
                if (num % 2 == 0){
                    if (num == 2){
                        System.out.println(num + " is power of 2");
                        break;
                    }
                    else{
                        num /= 2;
                    }
                }
                else{
                    System.out.println(num + " is not a power of 2");
                    break;
                }
            }
        }
    }
}



