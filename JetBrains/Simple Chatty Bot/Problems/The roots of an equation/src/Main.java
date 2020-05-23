import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x = 1;
        int count = 0;
        while (x < 1000 && count < 3) {
            if (a * (x * x * x) + b * (x * x) + c * x + d == 0) {
                System.out.println(x);
                count++;
            }
            x++;
        }
    }
}



