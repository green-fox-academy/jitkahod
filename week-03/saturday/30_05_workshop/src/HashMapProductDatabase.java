import java.util.HashMap;

public class HashMapProductDatabase {

    public static void main(String[] args) {

        HashMap<String, Integer> base = new HashMap<String, Integer>();

        base.put("Eggs", 200);
        base.put("Milk", 200);
        base.put("Fish", 400);
        base.put("Apples", 150);
        base.put("Bread", 50);
        base.put("Chicken", 550);

        System.out.println(base.get("Fish"));

        String mostExpensiveItem = "";
        Integer mostExpensivePrice = 0;
        String lessExpensiveItem = "";
        Integer lessExpensivePrice;
        Integer sum = 0;
        Integer average = 0;
        Integer priceBelow = 0;
        boolean found = false;

        for (String key : base.keySet()) {


            if (base.get(key) > mostExpensivePrice) {
                mostExpensiveItem = key;
                mostExpensivePrice = base.get(key);
            }

            sum += base.get(key);

            if (base.get(key) < 300) {
                priceBelow++;
            }

            if (base.get(key) == 125) {
                found = true;
            }

        }
        average = sum / base.size();
        System.out.println("The averager is: " + average);

        if (!found) {
            System.out.println("No, there is nothing for 125");
        } else {
            System.out.println("Yes, there is smthg 4 125");
        }

        lessExpensivePrice = sum;
        for (String key : base.keySet()) {
            if (base.get(key) < lessExpensivePrice) {
                lessExpensiveItem = key;
                lessExpensivePrice = base.get(key);
            }

        }
        System.out.println("The most expensive item is: " + mostExpensiveItem);
        System.out.println("The cheapest item is: " + lessExpensiveItem);
    }
}