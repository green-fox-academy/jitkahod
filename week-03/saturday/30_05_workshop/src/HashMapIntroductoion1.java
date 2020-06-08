import java.util.ArrayList;
import java.util.HashMap;

public class HashMapIntroductoion1 {

    public static void main(String[] args) {
        HashMap<Integer, Character> map = new HashMap<>();
        if (map.isEmpty()) {
            System.out.println("isEmpty");
        } else {
            System.out.println("isNotEmpty");
        }
        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');
        map.put(68, 'D');

        for (int i : map.keySet()) {
            System.out.println(i);
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println();
        System.out.println(map.get(99));
        map.remove(97);
        for (int i : map.keySet()) {
            System.out.println(i);
        }

        if (map.containsKey(100)) {
            System.out.println("contains 100");
        } else
            System.out.println("not contains 100");
        map.clear();

        for (int i : map.keySet()) {
            System.out.println(i);
        }
    }
}

