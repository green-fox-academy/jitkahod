import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class FilePrintEachLine {

    public static void main(String[] args) {
        Path path = Paths.get("my-file.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            for (String s : lines) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
