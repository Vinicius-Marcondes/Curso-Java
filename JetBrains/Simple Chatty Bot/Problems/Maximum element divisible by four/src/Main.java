import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int qrdNumbers = scanner.nextInt();
       int maxNumber = -999_999_999;
       if (qrdNumbers <= 30_000) {
           for (int i = 0; i < qrdNumbers; i++) {
               int aux = scanner.nextInt();
               if (aux > maxNumber && aux % 4 == 0) {
                   maxNumber = aux;
               }
           }
        System.out.println(maxNumber);
       } else {
           System.out.println("Invalid entry");
       }
    }
}