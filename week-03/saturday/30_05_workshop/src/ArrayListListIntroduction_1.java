import java.util.ArrayList;

public class ArrayListListIntroduction_1 {
    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>();
        System.out.println(List.size());
        List.add("William");
        List.add("John");
        List.add("Amanda");

        System.out.println(List.size());

        if (List.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("is not empty");
        }
        System.out.println(List.get(2));

        for (String i : List) {

            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < List.size(); i++) {

            System.out.println(i + 1 + ". " + List.get(i));
        }
        List.remove(1);

        for (String i : List) {

            System.out.println(i);
        }
        System.out.println();
        for (int i = List.size() - 1; i >= 0; i--) {

            System.out.println(List.get(i));
        }
        System.out.println();
        List.removeAll(List);


        if (List.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("is not empty");
        }
    }
}
