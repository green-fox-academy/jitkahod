import java.util.Scanner;

class UserInputOdd {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

    /*public static void main(String[] args) {
        int i = -1;
        while (i < 50){
            i += 2;
            System.out.println(i);
        }*/

        Scanner sca = new Scanner(System.in);
        System.out.println("Hello, please write a number: ");
        int userInput = sca.nextInt();

        if(userInput == 0)
            System.out.println("The number is zero which is even sude: ");
        else if (userInput % 2 != 0)  //celociselny zbytek po deleni 2 => cislo je delitelne 2 -> sude
            System.out.println("The number is odd = liche: ");
        else
            System.out.println("The number is even = sude ");

    }
}
