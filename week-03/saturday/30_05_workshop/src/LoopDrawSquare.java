import java.util.Scanner;

public class LoopDrawSquare {
    public static void main(String[] args) {

        int i;
        int input;
        String proc = "";
        String space = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write a number: ");
        input = scan.nextInt();

        //Top
        for (i = 0; i < input; i++) {
            proc += "%";
        }
        System.out.println(proc);

        //middle collons %
        for (i = 1; i < input - 1; i++) {
            space += " ";
        }
        for (i = 0; i < input - 2; i++)
            System.out.println("%"+space+"%");

        //Bottom
        System.out.println(proc);
    }

}
//%%%%%
//%   %
//%   %
//%   %
//%%%%%

   /* Mohla jsem i :
                if (i == 0) {
                proc += input * proc;
                System.out.println(proc);

            else if (i <= input)
                    proc += input * proc;
                System.out.println(proc);
                ......

            }*/