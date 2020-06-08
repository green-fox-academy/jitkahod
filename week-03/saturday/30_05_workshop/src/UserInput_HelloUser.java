import java.util.Scanner;

public class UserInput_HelloUser {

public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user

    Scanner sca = new Scanner(System.in);

    System.out.println("Hello, please write your name: ");
    String userInput1 = sca.nextLine();
    System.out.println("your name is: "+userInput1);


}
}
