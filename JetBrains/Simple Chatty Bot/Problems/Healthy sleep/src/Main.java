import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int recommended = scanner.nextInt();
        int doNotSleepOver = scanner.nextInt();
        if (doNotSleepOver >= recommended) {
            int slept = scanner.nextInt();
            if (slept > doNotSleepOver) {
                System.out.println("Excess");
            } else if (slept < recommended) {
                System.out.println("Deficiency");
            } else {
                System.out.println("Normal");
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
}