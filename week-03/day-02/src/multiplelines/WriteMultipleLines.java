package multiplelines;// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

    public static void main(String[] args) {

        writeMultipleLines();
    }

    public static void writeMultipleLines() {
        List<String> content = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the file name you want to create!");
        String location = sc.nextLine();
        System.out.println("Please give the content of the file you want to multiplicate!");
        content.add(sc.nextLine());
        System.out.println("Please give the number of lines you want to have in the file!");
        int lines = sc.nextInt();
        try {
            Path myPath = Paths.get(location);
            for (int i = 0; i < lines; i++) {
                Files.write(myPath, content, StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
        }
    }
}
