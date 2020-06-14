import java.util.ArrayList;
import java.util.HashMap;

public class HashMapProductdatabase2 {
    public static void main(String[] args) {

        HashMap<String, Integer> base = new HashMap<String, Integer>();

        base.put("Eggs", 200);
        base.put("Milk", 200);
        base.put("Fish", 400);
        base.put("Apples", 150);
        base.put("Bread", 50);
        base.put("Chicken", 550);

        ArrayList<String> cheap = new ArrayList<>();

        for (String key : base.keySet()) {
            if (base.get(key) < 201) {
                cheap.add(key);
            }
        }
        HashMap<String, Integer> expensive = new HashMap<>();
        for (String key : base.keySet()) {
            if (base.get(key) > 150) {
                expensive.put(key, base.get(key));
            }
        }
        System.out.println("Less than 201? cost: " + cheap);

        System.out.println("More than 150? cost: " + expensive);

        for (String key : expensive.keySet())
            System.out.println(key + " " + expensive.get(key));
    }

}


//We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
//
//    Create a map with the following key-value pairs.
//    Product name (key) 	Price (value)
//    Eggs 	200
//    Milk 	200
//    Fish 	400
//    Apples 	150
//    Bread 	50
//    Chicken 	550
//
//    Create an application which solves the following problems.
//        Which products cost less than 201? (just the name)
//        Which products cost more than 150? (name + price)