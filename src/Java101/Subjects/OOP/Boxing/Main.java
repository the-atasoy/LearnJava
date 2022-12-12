package Java101.Subjects.OOP.Boxing;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. division: 70-80kg\n2. division: 80-90kg\n3. division: 90-100kg");

        Random rand = new Random();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter name of first fighter: "); String f1Name = input.next();
        System.out.print("Please enter weight of first fighter: "); int f1Weight = input.nextInt();
        System.out.print("Please enter name of second fighter: "); String f2Name = input.next();
        System.out.print("Please enter weight of second fighter: "); int f2Weight = input.nextInt();

        Fighter f1 = new Fighter(f1Name, rand.nextInt(25), 100, f1Weight, rand.nextDouble(15));
        Fighter f2 = new Fighter(f2Name, rand.nextInt(25), 100, f2Weight, rand.nextDouble(15));

        if (rand.nextInt(11) > 5){ // starting priority.
            Fighter temp = f1;
            f1 = f2;
            f2 = temp;
        }

        Ring r1 = new Ring(f1, f2,70, 80, "Light Weighted");
        r1.run();
        Ring r2 = new Ring(f1, f2,80, 90, "Middle Weighted");
        r2.run();
        Ring r3 = new Ring(f1, f2,90, 100, "Heavy Weighted");
        r3.run();
    }
}
