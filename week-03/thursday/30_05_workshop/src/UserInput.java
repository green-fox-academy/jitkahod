    import java.util.Scanner;

    public class UserInput {
        public static void main(String[] args) {
            // Creates a scanner
            Scanner sca = new Scanner(System.in);

            // The program stops and waits for user input and to press enter
            String userInput1 = sca.nextLine();

            // It prints the whole line that was given by the user
            System.out.println(userInput1);

            // The program stops and waits for user input that is an integer and to press enter
            int userInput2 = sca.nextInt();

            // It prints the integer
            System.out.println(userInput2);
        }
    }

