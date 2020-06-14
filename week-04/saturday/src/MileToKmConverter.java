import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        double userInput1;
        double km;

        Scanner sca = new Scanner(System.in);

        System.out.println("Hello, write distance in miles: ");
        userInput1 = sca.nextDouble();

        km = userInput1 * 1.609344;
        System.out.println("distance in km: "+km);

    }

}