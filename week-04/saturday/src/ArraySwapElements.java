public class ArraySwapElements {

    public static void main(String[] args) {

        String[] orders = {"first", "second", "third"};

        String c = orders[0];
        orders[0] = orders[2];
        orders[2] = c;
        System.out.println(java.util.Arrays.toString(orders));
    }
}
// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`