import java.util.Scanner;

public class LoopMultiplicationTable {

    public static void main(String[] args) {

        int input;
        int i = 1;
        int output;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number: ");
        input = scan.nextInt();

        for (; i<11; i++) {
            output = i * input;
            System.out.println(i + " * " + input + " = " + output);
        }

        i = 1;
        while (i < 11) {
            output = i * input;
            System.out.println(i + " * " + input + " = " + output);
            i++;
        }
    }
}

// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150


