import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        int numChickenLegs;
        int numPigsLegs;

        Scanner sca = new Scanner(System.in);

        System.out.println("Pelease, write number of chickens: ");
        int numChickenLegsInput = sca.nextInt();
        numChickenLegs = numChickenLegsInput * 2;

        System.out.println("Pelease, write number of pigs: ");
        int numPigsLegsInput = sca.nextInt();
        numPigsLegs = numChickenLegsInput * 4;

        System.out.println("Number of all legs is: "+(numChickenLegs + numPigsLegs));
    }


}
