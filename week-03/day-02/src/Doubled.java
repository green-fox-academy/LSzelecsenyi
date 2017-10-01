import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {

        doubled("duplicated-chars.txt", "simpleChars.txt");
    }

    public static void doubled(String source, String destination) {
        try {
            Path myPath = Paths.get(source);
            List<String> lines = new ArrayList<>();
            for (int i = 0; i < lines.size() - 1; i++) {
            new StringBuilder().append(lines.get(i)).append("\\nn").toString();
            }
            lines = Files.readAllLines(myPath);
            String simple = "";
            for (int i = 0; i < lines.size()  ; i++) {
                for (int j = 0; j < lines.get(i).length(); j += 2) {
                    simple += lines.get(i).charAt(j);
                }
            }
            List<String> myList = new ArrayList<String>(Arrays.asList(simple.split(",")));
            Path destinationPath = Paths.get("simpleChars.txt");
            Files.write(destinationPath, myList);

//                for (int j = 0; j < lines.get(j).length(); j += 2) {
//                    lines.get(i).replace(lines.get(i).charAt(j), "");

            } catch (Exception e) {

        }
    }

}
//            String str = lines.toString().replaceAll(",", "");


