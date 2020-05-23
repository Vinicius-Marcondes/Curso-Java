import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        int segment = scanner.nextInt();
        if (segment <= size1 * size2 && ((segment % size1 == 0) || (segment % size2 == 0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}