public class ArrayReverse {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};

        //int[] numbers2 = new int[5];

        //int n = 0;

        /*for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
            System.out.println(numbers[i]);
        }
        System.out.println();*/

        /*for (int i = 4; i >= 0; i--, n++) {
            numbers2[n] = numbers[i];
            //n++;
            System.out.println(numbers2[n]);
*/
        /*for (int i = 0; i < numbers.length; i++) {
            numbers2[numbers.length - i - 1] = numbers[i];
            System.out.println(numbers2[n]);
        }*/
        int cislo;

        for (int i = 0; i < numbers.length / 2; i++) {
            //numbers[numbers.length - i - 1] = numbers[i];

            cislo = numbers[numbers.length - i - 1];

            numbers[numbers.length - i - 1] = numbers[i];
            numbers[i] = cislo;

            System.out.println(java.util.Arrays.toString(numbers));
        }


    }
}

