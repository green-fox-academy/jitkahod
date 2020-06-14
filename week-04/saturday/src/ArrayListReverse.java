import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReverse {

    public static void main(String[] args) {

        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        reversing(toBeReversed);
    }

    public static void reversing(String s) {
        String reversed = "";
        ArrayList<String> rev = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            reversed += s.charAt(s.length() - i - 1);

        }
        System.out.println(reversed);
    }
}

// 'I' 'f' ...' '

// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

/*
    public static String reverse(String s) {
        //String reversed = "";
        ArrayList<String> rev = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            //reversed += s.charAt(s.length() - i - 1);
            char c = (s.charAt(s.length() -i -1));
            //rev.add(s.charAt(s.length() - i - 1));
            rev.add(Character.toString(c));
        }

        String reversedString = ArrayList(rev);
        //return reversed;
        return rev.toString();
    }
}*/
