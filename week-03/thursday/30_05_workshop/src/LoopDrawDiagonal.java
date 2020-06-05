import java.util.Scanner;

public class LoopDrawDiagonal {


    public static void main(String[] args) {
/*
        int i, j, k;
        int input;
        String proc = "";
        String space = "";
        String space2 = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write a number: ");
        input = scan.nextInt();

        //Top
        for (i = 0; i < input; i++) {
            proc += "%";
        }
        System.out.println(proc);

        //Centre

        for (i = 1; i < input - 1; i++) {
            space = "";
            space2 = "";
            for (j = 0; j < i - 1; j++)
                space += " ";
            for (k = 1; k < input - (i + 1); k++)
                space2 += " ";

            System.out.println("%" + space + "%" + space2 + "%");
        }
        //Bottom
        System.out.println(proc);
    }
} */

        //Please write a number:
        //10
        //%%%%%%%%%%
        //%%       %
        //% %      %
        //%  %     %
        //%   %    %
        //%    %   %
        //%     %  %
        //%      % %
        //%       %%
        //%%%%%%%%%%


// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

        int i, j, k;
        int input;
        String proc = "";
        String space = "";
        String space2 = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write a number: ");
        input = scan.nextInt();

        //Top
        for (i = 0; i < input; i++) {
            proc += "%";
        }
        System.out.println(proc);

        //Centre

        for (i = 1; i < input - 1; i++) {
            space = "";
            space2 = "";

            for (j = 1; j < input - 1; j++)
                if(j == i)
                    space += "%";
                else
                    space +=  " ";

            System.out.println("%" + space + "%" );
        }

        //Bottom
        System.out.println(proc);
    }
}