import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qrdNumbers = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < qrdNumbers; i++) {
            int aux = scanner.nextInt();
            if (aux % 6 == 0) {
                sum += aux;
            }
        }
        System.out.println(sum);

    }
}