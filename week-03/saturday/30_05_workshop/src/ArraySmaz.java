public class ArraySmaz {
    public static void main(String[] args) {

        int[][] numbers = new int[4][4];
        //start pole poli pouze pro nuly
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }//konec pole poli pouze pro nuly

        System.out.println();
        System.out.println();

        //start pole poli pro nuly
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                //start vnoreni jednicek
                if (i == j)
                    numbers[i][j] = 1;
                //konec vnoreni jednicek
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }        //konec pole poli pro nuly

        System.out.println();
        System.out.println();


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = 0;//musim vynulovat, protoze si pamatuji jednicky z predchozich statementu
                //start vnoreni jednicek
                if (i != j)
                    numbers[i][j] = 1;
                //konec vnoreni jednicek
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j == numbers.length - i-1)
                    numbers[i][j] = 1;
                else
                    numbers[i][j] = 0;

                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}

