import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntroduction2 {

    public static void main(String[] args) {

        ArrayList<String> list_A = new ArrayList<>();

        list_A.add("Apple");
        list_A.add("Avocado");
        list_A.add("Blueberries");
        list_A.add("Durian");
        list_A.add("Lychee");


        ArrayList<String> list_B = new ArrayList<>();
        list_B.add("Apple");
        list_B.add("Avocado");
        list_B.add("Blueberries");
        list_B.add("Durian");
        list_B.add("Lychee");

        if (list_A.contains("Durian")) {
            System.out.println("contains Durian");
        } else {
            System.out.println("not contains Durian");
        }
        list_B.remove("Durian");

        list_A.add(4, "Kiwifruit");

        if (list_A.size() > list_B.size()) {
            System.out.println("list_A is bigger");
        } else {
            System.out.println("list_B is bigger");
        }

        //Add Passion Fruit and Pomelo to List B in a single statement
        list_B.addAll(Arrays.asList("Passion Fruit", "Pomelo"));

        for (String s : list_B)
            System.out.println(s);

        System.out.println();

        for (String s : list_A)
            System.out.println(s);

        System.out.println(list_A.indexOf("Avocado"));
        System.out.println(list_B.indexOf("Durian"));

        System.out.println(list_A.get(2));

    }
}

