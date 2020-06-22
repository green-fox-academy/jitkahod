package PetrolStation;

public class Staiton {
    float gasAmountS;

    public void refill(Car c) {

        gasAmountS -= c.capacityC;
        c.gasAmountC += c.capacityC;

    }
}
