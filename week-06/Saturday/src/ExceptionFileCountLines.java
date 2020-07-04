import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;


public class ExceptionFileCountLines {

    public static void main(String[] args) {

        System.out.println(NumberOfLines("my-file.txt"));
    }


    public static int NumberOfLines(String fileName) {
        int count;
        try {
            Path path = Paths.get("my-file.txt");
            List<String> list = Files.readAllLines(path);
            count = list.size();
        }
       catch (IOException e) {
            e.printStackTrace();
           System.out.println("Unable to read file: my-file.txt");
           count = 0;
        }

        return count;
    }
}
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.