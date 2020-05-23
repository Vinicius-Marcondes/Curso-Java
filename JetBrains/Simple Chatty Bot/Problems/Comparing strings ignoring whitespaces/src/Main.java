import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        System.out.println(string1.replaceAll("\\s+", "").equals(string2.replaceAll("\\s+", "")));
    }
}