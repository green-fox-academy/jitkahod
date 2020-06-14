import java.util.Scanner;

public class LoopDrawDiamond {
    public static void main(String[] args) {

        int i, j, k;
        int input;
        String str = "";
        String strm = " ";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter number: ");
        input = scan.nextInt();


        for (i = 0; i < input; i++) {
            str = "";
            strm = "";
            for (j = 0; j < i * 2 + 1; j++)
                str += "*";
            for (k = 0; k < input - 1 - i; k++)
                strm += " ";

            System.out.println(strm + str);
        }
        for (i = 1; i < input; i++) {
            str = "";
            strm = "";
            for (j = 0; j < input * 2 - 1 - 2 * i; j++)
                str += "*";
            for (k = 0; k < i; k++)
                strm += " ";

            System.out.println(strm + str);
        }
    }
}

//6
//     *
//    ***
//   *****
//  *******
// *********
//***********
// *********
//  *******
//   *****
//    ***
//     *
