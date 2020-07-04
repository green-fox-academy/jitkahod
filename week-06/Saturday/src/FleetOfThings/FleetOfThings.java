package FleetOfThings;
public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing thing = new Thing("Get milk");
        fleet.add(thing);
        thing = new Thing("Remove the obstacles");
        fleet.add(thing);
        thing = new Thing("Stand up");
        fleet.add(thing);
        thing.complete();
        thing = new Thing("Eat lunch");
        fleet.add(thing);
        thing.complete();

        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those

        // - In the main method create a fleet
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up      vek = h.getAge();
        // 4. [x] Eat lunch

        System.out.println(fleet);
        //System.out.println(faktorial(3));
    }
}
/*
int faktorial(int n) {
    if (n>1)
return n*faktorial(n-1);
    else
        return 1;
}             */