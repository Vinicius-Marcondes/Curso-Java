import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        boolean isSymmetric;

        Function<String, Boolean> checkSymmetric = number -> {
            boolean symmetric = false;
            for (int i = 0; i < number.length() / 2; i++) {
                if (number.charAt(i) == number.charAt(number.length() - 1 - i)) {
                    symmetric = true;
                } else {
                    symmetric = false;
                    break;
                }
            }
            return symmetric;
        };
        if (num.length() > 3) {
            isSymmetric = checkSymmetric.apply(num);
        } else {
            isSymmetric = checkSymmetric.apply("0" + num);
        }
        if (isSymmetric) {
            System.out.println(1);
        } else {
            System.out.println(new Random().nextInt());
        }
    }
}