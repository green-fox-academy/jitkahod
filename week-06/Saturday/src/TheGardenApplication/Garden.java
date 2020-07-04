package TheGardenApplication;

import java.util.ArrayList;

public class Garden {
    //fields
    private ArrayList<Plant> plants;


    //constructors
    public Garden() {                                   //list plants
        plants = new ArrayList<>();
    }

    //methods
    public void addPlant(Plant p) {
        plants.add(p);
    }


    public void watering(int amount) {     //amount = konve
        System.out.println("Watering with " + amount);
        for (Plant e : plants) {
            if (e.needsWater())
                e.watering(amount / sumOfPlantsNeedsWatering());      //rozdelit amount podle poctu potrebnych plantu, ktere potrebuji zalit
        }
    }

    public int sumOfPlantsNeedsWatering() {              //suma plants, ktere potrebuji vodu
        int sum = 0;
        for (Plant e : plants) {
            if (e.needsWater())
                sum += 1;
        }
        return sum;
    }

    public void showStatus() {
        for (Plant e : plants) {
            e.informUs();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Garden g = new Garden();
        //Do Garden zalozime 2 kytky a 2 stromy
        g.addPlant(new Flower("yellow"));
        g.addPlant(new Flower("blue"));
        g.addPlant(new Tree("purple"));
        g.addPlant(new Tree("orange"));

        g.showStatus();

        g.watering(40);
        g.showStatus();
        g.watering(70);
        g.showStatus();
    }
}
