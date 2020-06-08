import java.util.Scanner;

public class FuncSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int input = scan.nextInt();
        System.out.println(sum(input));

    }

    public static int sum(int a) {
        int sum =0;
        for (int i = 0; i < a; i++) {
            sum +=i;
            System.out.println("nacitani: " + i);
        }
        return sum;
    }
}


// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter