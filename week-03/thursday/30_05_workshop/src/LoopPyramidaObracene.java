
import java.util.Scanner;

public class LoopPyramidaObracene {
    public static void main(String[] args) {

        int i, j, k;
        int input;
        String str = "";
        String strm = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter number: ");
        input = scan.nextInt();

        // udelej n radku (i je cislo radku)
        //   udelej jeden radek
        //      priprav si hvez: I. radek= 2*input-1; II. radek = ubydou 2*; III. radek = ubydou 4*
        //      priprav si mez: I. r=0; II.r=1; III.r=2;....i.r=i mezer
        //      tiskni mez+hvez

        for (i = 0; i < input; i++) {
            str = ""; //BACHA :) str musim dat sem, aby se mi pri cyklech vzdy nuloval, jinak e opetovne nacita a napr tento nize nenuluje: str = str + "*";
            strm = "";//BACHA :) str musim dat sem, aby se mi pri cyklech vzdy nuloval, jinak e opetovne nacita a napr tento nize nenuluje: strm = strm + " ";
            for (j = 0; j < input*2-1-2*i; j++)
                str = str + "*";

            for (k = 0; k < i; k++)
                strm = strm + " ";

            System.out.println(strm + str);
        }

    }
}
//*******
// *****
//  ***
//   *
