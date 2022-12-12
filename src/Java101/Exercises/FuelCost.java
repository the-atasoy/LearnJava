package Java101.Exercises;

import java.util.Scanner;

public class FuelCost
{
    // get information of fuel consumption per 100 km as liter, distance as km and fuel price
    // for one liter as € from user and calculate the cost of travelling.
    public static void main(String[] args)
    {
        Scanner inf = new Scanner(System.in);
        System.out.println("Please enter your car's fuel consumption per 100 km as liter: ");
        double cons = inf.nextDouble();
        System.out.println("Please enter how many km you will travel: ");
        double distance = inf.nextDouble();
        System.out.println("Please enter price of fuel for one liter right now: ");
        double fuel = inf.nextDouble();
        double cost = (cons/100)*fuel*distance;
        System.out.println("This travel's cost is " + cost + " €.");
    }
}
