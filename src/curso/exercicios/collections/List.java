package curso.exercicios.collections;

import curso.exercicios.classes.Usuarios;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("Vinicius");
        list.add(u1);
        list.add(new User("Ana"));
        list.add(new User("João"));
        list.add(new User("Bia"));
        list.add(new User("Manu"));
        list.add(new User("Pedro"));

        System.out.println(list.get(3).toString());

        System.out.println(list.remove(1) + " and I have been removed");
        System.out.println(list.remove(new User("Manu")));
        System.out.println("Exist? " + list.contains(new User("Bia")));

        for(User u : list){
            System.out.println(u.name);
        }
    }
}
