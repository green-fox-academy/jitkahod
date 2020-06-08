import java.util.ArrayList;

public class ArrayListFindPartOfInteger {


    //public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of // Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        //    System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //  System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'

        //
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));

    }

    public static ArrayList<Integer> subInt(int n, int[] array) {

        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            //precti z array prvek na indexu i
            //preved ho na String
            //je v ziskanem Stringu hledana cislice n?
            //pokud ano, tak aktualni index pridej do listu indices
            indices.add(i);
        }
        return indices;
    }


   /*     ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(1, 11);
        list.add(2, 34);
        list.add(3, 52);
        list.add(4, 61);

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(0, 1);
        list.add(1, 11);
        list.add(2, 34);
        list.add(3, 52);
        list.add(4, 61);

        for (Integer i, i<list.size(), i++){
            if (list.contains(1)) {
                jednicky = list.add(i);
            }
        }
        System.out.println(jednicky));
        System.out.println(selection(vyber));

    public static selection(String[]args){
            Integer vyber =0;

            for (Integer i, i<list.size(), i++){
                if (list.contains()) {
                }
                return vyber;
            }
        }*/
}
}