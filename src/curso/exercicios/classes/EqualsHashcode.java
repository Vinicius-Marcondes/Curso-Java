package curso.exercicios.classes;

public class Equals {
    public static void main(String[] args) {

        Users u1 = new Users("João", "joao@email.com");
        Users u2 = new Users("João", "joao@email.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode() == u2.hashCode());
    }
}
