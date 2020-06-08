import sun.misc.BASE64Decoder;

public class FuncDoubling {
    public static void main(String[] args) {

        int baseNum = 123;
        //doubling(baseNum);
        // b = 1 + 2 * (baseNum / 2);
        // a = doubling(b);
        System.out.println(doubling(baseNum));

    }

    public static int doubling(int a) {

        return a * 2;

    }

}

// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`