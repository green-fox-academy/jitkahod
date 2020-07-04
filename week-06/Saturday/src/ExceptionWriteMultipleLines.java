import java.io.File;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ExceptionWriteMultipleLines {


    public static void main(String[] args) {

        writeMultipleLines("my-file.txt", "apple", 5);
    }

    public static void writeMultipleLines(String path, String word, int num) {

        try {

            File file = new File(path);
            Path path_ = file.toPath();
            //Path path = Paths.get("my-file.txt");
            for (int i = 0; i < num; i++) {
                List<String> newLine = new ArrayList<>();
                newLine.add(word);
                Files.write(path_, newLine, StandardOpenOption.APPEND); //StandardOpenOption.APPEND zaruci neprepsani;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}

// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.

// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.