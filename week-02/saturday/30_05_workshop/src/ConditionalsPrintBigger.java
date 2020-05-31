import java.util.Scanner;
public class ConditionalsPrintBigger {
public static void main(String[]args){

    int input1;
    int input2;

    Scanner scan = new Scanner (System.in);
    System.out.println("Please write a number:");
    input1 = scan.nextInt();
    input2 = scan.nextInt();

    if (input1 > input2)
    System.out.println("input1");
    else if (input1 < input2)
    System.out.println("input2");
    else
    System.out.println("input1 = input2");
}

}
// Write a program that asks for two numbers and prints the bigger one