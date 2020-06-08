public class ArraySort {

    public static void main(String[] args) {

        String[] test = {"jeden", "dva", "tri"};

        String s = java.util.Arrays.toString(test);
        System.out.println(s);
        System.out.println("\n");

        java.util.Arrays.sort(test);
        System.out.println(java.util.Arrays.toString(test));
    }
}
