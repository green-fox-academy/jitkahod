import java.util.ArrayList;

public class ArrayListShoppingList {
    public static void main(String[] args) {

        ArrayList<String> shoppinList = new ArrayList<String>();

        shoppinList.add("Eggs");
        shoppinList.add("milk");
        shoppinList.add("fish");
        shoppinList.add("apples");
        shoppinList.add("bread");
        shoppinList.add("chicken");

        if (shoppinList.contains("milk")) {
            System.out.println("the list contains milk");
        } else {
            System.out.println("there is no milk");
        }

        if (shoppinList.contains("bananas")) {
            System.out.println("the list contains bananas");
        } else {
            System.out.println("there is no bananas");
        }
    }
}


