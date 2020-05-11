package exercises.classes;

import java.util.HashSet;

public class EqualsHashcode {
    public static void main(String[] args) {

        Users u1 = new Users("João", "joao@email.com");
        Users u2 = new Users("João", "joao@email.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode() == u2.hashCode());

        HashSet<Users> users = new HashSet<>();

        users.add(new Users("Pedro"));
        users.add(new Users("Vinicius"));
        users.add(new Users("Ana"));
        
        System.out.println(users.contains(new Users("Vinicius")));

    }
}
