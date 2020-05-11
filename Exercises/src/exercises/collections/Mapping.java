package exercises.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Ricardo");
        users.put(1, "Vinicius");
        users.put(2, "Ana");
        users.put(3, "Rebeca");

        System.out.println(users.size());
        System.out.println(users.keySet());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(3));
        System.out.println(users.containsValue("Vinicius"));

        System.out.println(users.get(3));

        for(int key : users.keySet()){
            System.out.println(key);
        }
        for(String value : users.values()){
            System.out.println(value);
        }
        for(Map.Entry<Integer, String> user : users.entrySet()){
            System.out.println(user);
        }
    }
}
