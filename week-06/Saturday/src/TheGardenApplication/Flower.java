package TheGardenApplication;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Flower extends Plant {

    //String flower;

    //constructors
    public Flower(String color) {
        super(color);
        //druh = "Ruze"
    }

    //methods
    public void watering(int amount) {                            //amount = konve => vypocet waterAmount = mnozstvi vody po odectu toho, co rostliny neabsorbuji(neboli vynasobeni koeficientem absorbce)
        //(waterAmount < 5);
        waterAmount += 0.75 * amount;  //3*amount/4
    }

    public boolean needsWater() {                                 //needsWater = vraci ano je potreba zalit; ne neni treba zalit rostlinu
        return waterAmount < 5;
    }

    public void informUs() {
        String s;
        if (needsWater())
            s = "needs";
        else
            s = "doesn't need";
        System.out.println("The " + color + " Flower " + s + " water");

        //System.out.println("The " + color + " Flower " + (needsWater() ? "needs": "doesnt need") + " water");
    }

}
