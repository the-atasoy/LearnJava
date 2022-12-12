package Java101.Subjects.OOP.Boxing;

import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    String division;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight, String division) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.division = division;
    }

    public void run() {

        Random rand = new Random();
        if (checkWeight()) {
            System.out.println("======= " + division + " ======");
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("========= NEW ROUND =========");
                f1.damage = rand.nextInt(25);
                f2.dodge = rand.nextInt(15);
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f2.damage = rand.nextInt(25);
                f1.dodge = rand.nextInt(15);
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("\n==============================================");
            System.out.println("Both of these boxers are not " + division + ".");
            System.out.println("==============================================\n");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Winner : " + f1.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Remaining Power \t:" + f1.health);
        System.out.println(f2.name + " Remaining Power \t:" + f2.health);
    }
}
