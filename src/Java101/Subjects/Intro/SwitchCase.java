package Java101.Subjects.Intro;

public class SwitchCase {
    public static void main(String[] args) {
        int n = 90;
        switch (n){
            case 10:
                System.out.println("=10");
            case 90:
                System.out.println("=90");
            case -3:
                System.out.println("=-3");
            default:
                System.out.println("non of them above");
            // 90 and above them will be executed.
        }
        two();
    }

    public static void two() {
        int n = 90;
        switch (n) {
            case 10:
                System.out.println("=10");
                break;
            case 90:
                System.out.println("=90");
            case -3:
                System.out.println("=-3");
                break;
            default:
                System.out.println("non of them above");

        // case 90 will be executed and program will stop due to break code.
        }
    }
}

