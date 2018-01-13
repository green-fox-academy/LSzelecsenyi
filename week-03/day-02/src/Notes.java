import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Notes {

    public static void main(String[] args) {

        File file = new File("day-02.iml");
        System.out.println(file.canRead() + ", " + file.canWrite());
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ex) {
        }
    }
}
