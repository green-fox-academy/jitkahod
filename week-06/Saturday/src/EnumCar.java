import java.util.ArrayList;
import java.util.Random;

public class EnumCar {

    public enum CarTypeEnum {
        SKODA, FOLCWAGN, HUNTDE, MERSEDESS, LAADA, BAVORAK
    }

    public enum ColorTypeEnum {
        RED, GREEN, BLUE
    }

    CarTypeEnum type;
    ColorTypeEnum color;

    //konstructor
    public EnumCar(CarTypeEnum type, ColorTypeEnum color) {
        this.color = color;
        this.type = type;
    }

    public static void main(String[] args) {
        ArrayList<EnumCar> parking = new ArrayList<>();

        Random rnd = new Random();

        for (int i = 0; i < 256; i++) {
            EnumCar vehicle = new EnumCar(CarTypeEnum.values()[rnd.nextInt(6)], ColorTypeEnum.values()[rnd.nextInt(3)]);  //enum ma metodu values, ktera enum prevede na array a ja muzu vybiriat. Bound je sest protoze 0 je u random funkce vcetneek.
            parking.add(vehicle);
        }
        //soucet typu
        int[] countType = new int[6];
        for (EnumCar veh : parking) {
            if (veh.type == CarTypeEnum.SKODA) {
                countType[0] += 1;
            }
            if (veh.type == CarTypeEnum.FOLCWAGN) {
                countType[1] += 1;
            }
            if (veh.type == CarTypeEnum.HUNTDE) {
                countType[2] += 1;
            }
            if (veh.type == CarTypeEnum.MERSEDESS) {
                countType[3] += 1;
            }
            if (veh.type == CarTypeEnum.LAADA) {
                countType[4] += 1;
            }
            if (veh.type == CarTypeEnum.BAVORAK) {
                countType[5] += 1;
            }
        }
        int t;
        for (t = 0; t < countType.length; t++) {
            System.out.println("soucet typu " + countType[t]);
        }
        // soucet coloru
        int[] countColor = new int[3];
        for (EnumCar veh : parking) {
            if (veh.color == ColorTypeEnum.RED) {
                countColor[0] += 1;
            }
            if (veh.color == ColorTypeEnum.GREEN) {
                countColor[1] += 1;
            }
            if (veh.color == ColorTypeEnum.BLUE) {
                countColor[2] += 1;
            }
        }
        int c;
        for (c = 0; c < countColor.length; c++) {
            System.out.println("soucet coloru " + countColor[c]);
        }
    }
}

 /*
int met(int par1, int par2, int par3) {  //konstruktor
  return par1;         //vraceni hodnot
}

met(12, 5, f())        //volani metody a jedna funkce


    Create a Car class with 2 enum properties
        enum of car types
        The types of these cars or vehicles is up to you
        enum of colors
    Create 256 Vehicles randomly and put them into a List
    Count and Print the number of same vehicles for each type
    Count and Print the number of same vehicles for each color
    Print the most frequently occurring vehicle

          */