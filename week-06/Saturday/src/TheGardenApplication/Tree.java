package TheGardenApplication;

public class Tree extends Plant {
    //fields
    String tree;

    //constructors
    public Tree(String color) {
        super(color);
    }
    //methods
    public void watering(int amount) {
        waterAmount += 0.4 * amount;
    }

    @Override
    public boolean needsWater() {
        return waterAmount<10;
    }
    public void informUs() {
        String s;
        if (needsWater())
            s = "needs";
        else
            s = "doesn't need";
        System.out.println("The " + color + " Tree " + s + " water");

        //System.out.println("The " + color + " Tree " + (needsWater() ? "needs": "doesnt need") + " water");
    }
}
