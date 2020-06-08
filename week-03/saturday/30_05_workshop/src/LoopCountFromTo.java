import java.util.Scanner;
public class LoopCountFromTo {

    public static void main(String[] args) {

        int input1;
        int input2;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write two numbers:");
        input1 = scan.nextInt();
        input2 = scan.nextInt();

        if (input1 > input2)
            System.out.println("The second number should be bigger");

        else if (input2 > input1)
            for (i=input1; i<input2; i++)
                System.out.println(i);
    }
}
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5