import java.io.File;
import java.io.IOException;
import java.util.Scanner;
    public class Notes {

public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        File file = new File("day-02.iml");

        System.out.println(file.canRead()+", "+file.canWrite());



        try {
            Scanner anotherScanner = new Scanner(file);
            while (anotherScanner.hasNext()) {
                System.out.println(anotherScanner.nextLine());
            }

        } catch (IOException ex) {

        }

    }

}
