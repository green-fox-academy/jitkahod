public class ArrayMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            //System.out.println(i);
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j)
                    //int[] radek = matrix[i];
                    //radek[j] = 1
                    matrix[i][j] = 1;
            }
        }

        for (int[] radek : matrix) {
            for (int prvek : radek) {
                System.out.print(" " + prvek);
            }
            System.out.println();
        }
    }
}
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
/////////////////////////////////////////////
    /*   public static void main(String[] args) {

    int[][] numbers = new int[4][4];
//start pole poli pouze pro nuly
        for(int i=0;i<numbers.length;i++){
        for(int j=0;j<numbers.length;j++){

        System.out.print(numbers[i][j]);
        }
        System.out.println();
        }//konec pole poli pouze pro nuly

        System.out.println();
        System.out.println();

        //start pole poli pro nuly
        for(int i=0;i<numbers.length;i++){
        for(int j=0;j<numbers.length;j++){
        //start vnoreni jednicek
        if(i==j){
        numbers[i][j]=1;
        }//konec vnoreni jednicek
        System.out.print(numbers[i][j]);
        }
        System.out.println();
        } //konec pole poli pro nuly

        System.out.println();
        System.out.println();


        for(int i=0;i<numbers.length;i++){
        for(int j=0;j<numbers.length;j++){
        numbers[i][j]=0;//musim vynulovat, protoze si pamatuji jednicky z predchozich statementu
        //start vnoreni jednicek
        if(i!=j){
        numbers[i][j]=1;
        }//konec vnoreni jednicek
        System.out.print(numbers[i][j]);
        }
        System.out.println();
        }
        }
        }

        "C:\Program Files\Java\jdk1.8.0_251\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.1\lib\idea_rt.jar=61116:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_251\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\rt.jar;C:\Users\Dell\IdeaProjects\30_05_workshop\out\production\30_05_workshop" ArraySmaz
0000
0000
0000
0000


1000
0100
0010
0001


0111
1011
1101
1110

Process finished with exit code 0 */