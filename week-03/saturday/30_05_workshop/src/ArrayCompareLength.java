import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ArrayCompareLength {
    public static void main(String[] args) {

        int[] firstArrayOfNumbers = new int[3];

        int[] secondArrayOfNumbers = new int[2];

        for (int i = 0; i < firstArrayOfNumbers.length; i++) {
            firstArrayOfNumbers[i] = i + 1;
            System.out.println(firstArrayOfNumbers[i]);
        }

        for (int i = 0; i < secondArrayOfNumbers.length; i++) {
            secondArrayOfNumbers[i] = 4 + i;
            System.out.println(secondArrayOfNumbers[i]);
        }
        if (firstArrayOfNumbers.length > secondArrayOfNumbers.length)
            System.out.println("firstArrayOfNumbers is longer");
        else
            System.out.println("secondArrayOfNumbers is longer");
    }
}


// - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`