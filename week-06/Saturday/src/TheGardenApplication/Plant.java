package TheGardenApplication;

public class Plant {

    //fields
    double waterAmount;
    String color;
    //String druh;

    //constructor
    public Plant(String color){
        this.color = color;
        waterAmount = 0;
    }

    //methods
    public void watering(int amount){
        waterAmount += amount;
    }

    public boolean needsWater(){
        return false;
    }

    public void informUs() {

        //System.out.println("The "+color +"Flower "+needsWater()+"water");
        //System.out.println("The "+color +"Flower "+needsWater()+"water");
    }
}
