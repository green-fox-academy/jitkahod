

public class RecursionSumDigits {

    public static void main(String[] args) {
        int m = 126;
        System.out.println(sumaCislic(m));
    }

    public static int sumaCislic(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumaCislic(n / 10);     //<=> sumaCislic((n%10)+(n/10))
                                                        

        //return 126%10 + sumaCislic(n / 10)        A
        //return 6 + sumaCislic(126 / 10)
        //return 6 + sumaCislic(12)
                    //return 12%10 + sumaCislic(12/10)    B
                    //return 2 + sumaCislic(1) (jelikoz int zahodi 0,2)
                                //return 1%10 + sumaCislic(1/10)   C
                                //return 1 + sumaCislic(0)   (jelikoz int zahodi 0,1)
                                         //n=0; 0=>   return if=return 0   D
                                //return 1 + 0                    C
                                //return 1
                    //return 2 + 1                     B
                    //return 3
        //return 6 + 3    A
        //return 9      => system.out.println(9)



    }
}
