public class RecursionPower {

    public static void main(String[] args) {
        System.out.println(powerN(3, 2));
    }

    public static int powerN(int cislo, int mocnina) {
        if (mocnina == 0) {
            return 1;
        }
        return cislo * powerN(cislo, mocnina - 1);
    }
}
//Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).