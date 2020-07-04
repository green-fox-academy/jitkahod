public class RecursionBunnies {
    public static void main(String[] args) {
        System.out.println(numOfEars(1));
    }

    public static int numOfEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + numOfEars(bunnies - 1);
    }
}

//We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).