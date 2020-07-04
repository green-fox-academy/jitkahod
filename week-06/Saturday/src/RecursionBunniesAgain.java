
public class RecursionBunniesAgain {
    public static void main(String[] args) {
        System.out.println(numOfEars(1));
    }

    public static int numOfEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 != 0) {
            return 2 + numOfEars(bunnies - 1);
        } else {
            return 3 + numOfEars(bunnies - 1);

        //return 3 - bunnies % 2 + numOfEars(bunnies - 1);


        }
    }
}
//We have bunnies standing in a line, numbered 1, 2, ... The odd (lichy)bunnies (1, 3, ..) have the normal 2 ears. The even (sudy) bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).