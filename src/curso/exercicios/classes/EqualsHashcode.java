package curso.exercicios.classes;

public class EqualsHashcode {
    public static void main(String[] args) {

        Usuarios u1 = new Usuarios("João", "joao@email.com");
        Usuarios u2 = new Usuarios("João", "joao@email.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode() == u2.hashCode());
    }
}
