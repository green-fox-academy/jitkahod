import java.sql.SQLOutput;
import java.util.HashMap;

public class HashMapShoppingList2 {
    public static void main(String[] args) {

        HashMap<String, Double> products = new HashMap<String, Double>();
        products.put("Milk", 1.07);
        products.put("Rice", 1.59);
        products.put("Eggs", 3.14);
        products.put("Cheese", 12.60);
        products.put("Chicken Breasts", 9.40);
        products.put("Apples", 2.31);
        products.put("Tomato", 2.58);
        products.put("Potato", 1.75);
        products.put("Onion", 1.10);

        HashMap<String, Integer> shoppingListB = new HashMap<String, Integer>();

        shoppingListB.put("Milk", 3);
        shoppingListB.put("Rice", 2);
        shoppingListB.put("Eggs", 2);
        shoppingListB.put("Cheese", 1);
        shoppingListB.put("Chicken Breasts", 4);
        shoppingListB.put("Apples", 1);
        shoppingListB.put("Tomato", 2);
        shoppingListB.put("Potato", 1);

        HashMap<String, Integer> shoppingListA = new HashMap<String, Integer>();

        shoppingListA.put("Rice", 1);
        shoppingListA.put("Eggs", 5);
        shoppingListA.put("Chicken Breasts", 2);
        shoppingListA.put("Apples", 1);
        shoppingListA.put("Tomato", 10);

        //How much does Bob pay
        Double sumB = 0d;

        for (String key : shoppingListB.keySet()) {
            sumB += shoppingListB.get(key) * products.get(key);
        }
        //How much does Alice pay
        Double sumA = 0d;
        for (String key : shoppingListA.keySet()) {
            sumA += shoppingListA.get(key) * products.get(key);
        }
        //Who buys more Rice?
        Integer RiceB = 0;
        if (shoppingListB.containsKey("Rice")) {
            for (String key : shoppingListB.keySet()) {
                RiceB += shoppingListB.get(key);
            }
        }
        Integer RiceA = 0;
        if (shoppingListA.containsKey("Rice")) {
            for (String key : shoppingListA.keySet()) {
                RiceA += shoppingListA.get(key);
            }
        }
        Integer PotatoB = 0;
        if (shoppingListB.containsKey("Potato")) {
            for (String key : shoppingListB.keySet()) {
                PotatoB += shoppingListB.get(key);
            }
        }
        Integer PotatoA = 0;
        if (shoppingListA.containsKey("Potato")) {
            for (String key : shoppingListA.keySet()) {
                PotatoA += shoppingListA.get(key);
            }
        }
        //Print sum
        System.out.println("Bob pays: " + sumB);
        System.out.println("Alice pays: " + sumA);
        //Print who buys more rice
        if (RiceB > RiceA) {
            System.out.println("Bob buys more Rice");
        } else {
            System.out.println("Alice buys more Rice");
        }
        //Print who buys more potao
        if (PotatoB > PotatoA) {
            System.out.println("Bob buys more Potato");
        } else {
            System.out.println("Alice buys more Potato");
        }
        //How much different product does Bob buy
        Integer countProductB = 0;
        for (String key : shoppingListB.keySet()) {
            countProductB += +1;
        }
        //How much different product does Alice buy
        Integer countProductA = 0;
        for (String key : shoppingListA.keySet()) {
            countProductA += +1;
        }
        if (countProductB > countProductA) {
            System.out.println("Bob buys more products than Alice, he buys: " + countProductB + " and Alice: " + countProductA);
        } else {
            System.out.println("Alice buys more products than Bob, she buys: " + countProductA + " and Bob: " + countProductB);
        }
        //How much pieces does Bob pays
        Integer countAmountB = 0;
        for (String key : shoppingListB.keySet()) {
            countAmountB += shoppingListB.get(key);
        }
        //How much pieces does Alice pays
        Integer countAmountA = 0;
        for (String key : shoppingListA.keySet()) {
            countAmountA += shoppingListA.get(key);
        }

        if (countAmountB > countAmountA) {
            System.out.println("Bob buys more pieces. He buys: " + countAmountB + " and Alice buys: " + countAmountA);
        } else {
            System.out.println("Alice buys more pieces. She buys: " + countAmountA + " and Bob buys: " + countAmountB);

        }
    }
}















/*
    Represent the following products with their prices
        Product 	Amount
        Milk 	1.07
        Rice 	1.59
        Eggs 	3.14
        Cheese 	12.60
        Chicken Breasts 	9.40
        Apples 	2.31
        Tomato 	2.58
        Potato 	1.75
        Onion 	1.10

        Represent Bob's shopping list
        Product 	Amount
        Milk 	3
        Rice 	2
        Eggs 	2
        Cheese 	1
        Chicken Breasts 	4
        Apples 	1
        Tomato 	2
        Potato 	1

        Represent Alice's shopping list
        Product 	Amount
        Rice 	1
        Eggs 	5
        Chicken Breasts 	2
        Apples 	1
        Tomato 	10

        Create an application which solves the following problems.
        How much does Bob pay?
        How much does Alice pay?
        Who buys more Rice?
        Who buys more Potato?
        Who buys more different products?
        Who buys more products? (piece)
*/