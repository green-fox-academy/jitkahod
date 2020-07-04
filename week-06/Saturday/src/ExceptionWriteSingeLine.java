import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ExceptionWriteSingeLine {

    public static void main(String[] args) {

        writeName();
    }

    public static void writeName() {

        try {

            File file = new File("my-file.txt");
            Path path = file.toPath();
            file.createNewFile();
            //Path path = Paths.get("my-file.txt");
            List<String> newLine = new ArrayList<>();
            newLine.add("Jitka");
             
            Files.write(path, newLine, StandardOpenOption.APPEND); //StandardOpenOption.APPEND zaruci neprepsani;

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}

// Write a function that is able to manipulate a file

// By writing your name into it as a single line
// The file should be named "my-file.txt"

// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

/*
class String {
    char[] znaky;


}

class File2 {

    private String cesta = "";


    void File2(String fileName){
        cesta=fileName;
    }

    void createNewFile(){
        //vytvor
    }

    Path toPath(){
        return Paths.get(cesta);
    }

}*/