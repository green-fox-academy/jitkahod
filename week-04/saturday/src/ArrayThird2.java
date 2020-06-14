public class ArrayThird2 {
    public static void main(String[] args) {

        int[] firstArrayOfNumbers = new int[3];

        firstArrayOfNumbers[0] = 1;
        firstArrayOfNumbers[1] = 2;
        firstArrayOfNumbers[2] = 3;

        int[] secondArrayOfNumbers = new int[2];

        secondArrayOfNumbers[0] = 4;
        secondArrayOfNumbers[1] = 5;


        if (firstArrayOfNumbers.length > secondArrayOfNumbers.length)
            System.out.println("firstArrayOfNumbers is longer");
        else
            System.out.println("secondArrayOfNumbers is longer");
    }
}

/*
    int[] firstArrayOfNumbers = new int[5];

        firstArrayOfNumbers[0] = 1;
                firstArrayOfNumbers[1] = 2;
                firstArrayOfNumbers[2] = 3;

                int SUM1 = 0;
                for (int i = 0; i < firstArrayOfNumbers.length; i++) {
        SUM1 += 1;
        }
        int[] secondArrayOfNumbers = new int[2];

        secondArrayOfNumbers[0] = 4;
        secondArrayOfNumbers[1] = 5;

        int SUM2 = 0;
        for (int i = 0; i < secondArrayOfNumbers.length; i++) {
        SUM2 += i;
        }
        if (SUM1 > SUM2)
        System.out.println("firstArrayOfNumbers is longer"+SUM1+"\n"+SUM2);
        else
        System.out.println("secondArrayOfNumbers is longer");
        }
        }*/