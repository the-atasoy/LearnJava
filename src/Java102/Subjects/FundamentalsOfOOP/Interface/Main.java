package Java102.Subjects.FundamentalsOfOOP.Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter card number: ");
        String cardNumber = input.next();

        System.out.print("Enter expiry date: ");
        String expiryDate = input.next();

        System.out.print("Enter cvc: ");
        String cvc = input.next();

        System.out.print("1: Bank A\n2: Bank B\n3: Bank C\nSelect Bank: ");
        int bankSelect = input.nextInt();

        switch (bankSelect){
            case 1:
                Bank_A posA = new Bank_A("Bank A", "123456789", "025879");
                posA.connect("172.0.0.1");
                posA.payment(amount, cardNumber, expiryDate, cvc);
                break;
            case 2:
                Bank_B posB = new Bank_B("Bank A", "123456789", "025879");
                posB.connect("172.0.0.1");
                posB.payment(amount, cardNumber, expiryDate, cvc);
                break;
            case 3:
                break;
            default:
                System.out.println("Select a valid bank.");
        }
    }
}
