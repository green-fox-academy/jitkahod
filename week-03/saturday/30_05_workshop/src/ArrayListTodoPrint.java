import java.util.ArrayList;

public class ArrayListTodoPrint {

    public static void main(String[] args) {
        ArrayList<String> todo = new ArrayList<>();
        todo.add("My todo:");
        todo.add(" - Download games");
        todo.add(" \t- Diablo");

        for (int i = 0; i < todo.size(); i++) {
            System.out.println(todo.get(i));
        }
    }
}
// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo