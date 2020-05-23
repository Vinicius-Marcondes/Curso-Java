import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 1;
        int count = 0;
        while (true) {
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}