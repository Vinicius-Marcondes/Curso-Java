import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long result = 1;
        int count = 1;
        do {
            count++;
            result *= count;
        } while (result <= number);
        System.out.println(count);
    }
}

