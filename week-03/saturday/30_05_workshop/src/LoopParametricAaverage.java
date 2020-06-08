import java.util.Scanner;

public class LoopParametricAaverage {

    public static void main(String[] args) {

        int input_number;
        int input_number_n;
        int sum = 0;
        double average;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please how many numbers do you have: ");
        input_number = scan.nextInt();

        //input_number
        for (i = 1; i <= input_number; i++) {
            System.out.println("Please eneter the number: ");
            input_number_n = scan.nextInt();
            sum = sum + input_number_n; //sum
        }
        average = 1.0 * sum / input_number;  //average


        System.out.println("Sum: " + sum + " Average: " + average);

    }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

