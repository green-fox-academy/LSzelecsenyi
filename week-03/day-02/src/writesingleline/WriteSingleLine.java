package writesingleline;// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

    public static void main(String[] args) {

        writeSingleLine();
    }

    public static void writeSingleLine() {
        List<String> content = new ArrayList<>();
        content.add("Laszlo Szelecsenyi");
        try {
            Path myPath = Paths.get("src/writesingleline/name.txt");
            Files.write(myPath, content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}

