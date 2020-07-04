import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class RecursionNumberadder {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(s(n));

    }

    public static int s(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return s(n - 1) + n;
        }
    }


}
//Write a recursive function that takes one parameter: n and adds numbers from 1 to n.