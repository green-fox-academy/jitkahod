import java.util.Scanner;

public class LoopDrawTriangle {
    public static void main(String[] args) {

        String str = "";
        int i;
        int input;
        Scanner sca = new Scanner(System.in);
        System.out.println("Please write a number:");
        input = sca.nextInt();

        for (i = 0; i < input; i++) {
            str += "*";
            System.out.println(str);
        }
    }
    }

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
