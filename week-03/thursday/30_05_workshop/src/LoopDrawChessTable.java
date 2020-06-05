public class LoopDrawChessTable {
    public static void main(String[] args) {

        int i;
        int input;
        String proc;


        for (i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                proc = " % % % %";
                System.out.println(proc);
            } else {
                proc = "% % % %";
                System.out.println(proc);
            }

        }
    }
}