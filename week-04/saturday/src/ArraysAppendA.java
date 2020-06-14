public class ArraysAppendA {
    public static void main(String[] args) {

        String[] animals = {"koal", "pand", "zebr"};
        for (int i = 0; i < animals.length; i++) {
            animals[i] += "a";
        }


        //System.out.println("hodnota1: " + h1 + " hodnota2: " + h2);
        //hodnota1: 12 hodnota2: 34
        //System.out.printf("hodnota1: %d; hodnota2: %d PI je: %f", h1, h2, 3.14);



        System.out.print(java.util.Arrays.toString(animals));
    }
}
// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end