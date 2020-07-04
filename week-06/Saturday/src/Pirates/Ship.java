package Pirates;

import java.util.ArrayList;

public class Ship {

       ArrayList <Pirate> crewList = new ArrayList <>();
       Pirate capitain;


    public void fillShip(){
        this.capitain = new Pirate();

        int numOfPirates = 1 + (int)(Math.random()* 20);

        for (int i = 0; i < numOfPirates; i++) {
             crewList.add(new Pirate());
        }


    }

    
}
