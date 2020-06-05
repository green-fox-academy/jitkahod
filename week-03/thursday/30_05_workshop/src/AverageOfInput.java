import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {

    // Write a program that asks for 5 integers in a row,

// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4


        Scanner sca = new Scanner(System.in);

        System.out.println("5 integers in a row: ");
        int Input1 = sca.nextInt();
        int Input2 = sca.nextInt();
        int Input3 = sca.nextInt();
        int Input4 = sca.nextInt();
        int Input5 = sca.nextInt();

        int sum = Input1 + Input2+ Input3 + Input4 + Input5;
        int average = sum/5;

        System.out.println("Sum: " +(sum) +" Average: "+(average));

    }
}
