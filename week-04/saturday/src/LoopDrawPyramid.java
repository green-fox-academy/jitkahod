import java.util.Scanner;

public class LoopDrawPyramid {
    public static void main(String[] args) {

        String str = "*";
        int i, j;
        int input;
        String strm;

        Scanner sca = new Scanner(System.in);
        System.out.println("Please write a number:");
        input = sca.nextInt();

        for (i = 1; i <= input; i++) {

            // vyrob strm s n=(input-i) mezerama
            strm = "";
            for (j = input - i; j > 0; j--)
                strm +=" ";

            System.out.println(strm + str);
            str += "**";
        }

    }
}
//5
//    *
//   ***
//  *****
// *******
//*********

//nebo for (j = 0; j<input-1; j++)


// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was











