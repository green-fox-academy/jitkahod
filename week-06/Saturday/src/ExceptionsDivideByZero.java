import java.util.Scanner;

public class ExceptionsDivideByZero {

    public static void main(String[] args) {
        int input1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number:");
        input1 = scan.nextInt();

        try {
            System.out.println(dividing(input1));
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }

    public static int dividing(int i) {
        int division;
        division =10 / i;
        return division;
    }

}

