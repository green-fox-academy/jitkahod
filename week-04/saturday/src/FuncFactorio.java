import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FuncFactorio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int input = scan.nextInt();

        System.out.println("input is: " + input + " factorial is: " + factorio(input));
    }
    public static float factorio(int a) {

        float factorial = 1f; //v ramci nasobeni neni nula vhodna!!!!
        for (int i = 2; i <= a; i++) {
            factorial *= i;
        }
        return factorial;

    }

}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial