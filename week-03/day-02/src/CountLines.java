// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {

        System.out.println(countLines());

    }

    public static int countLines() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the file name please!");
        String fileName = sc.nextLine();
        int lineNumbers;
        try {
            Path myPath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(myPath);
            lineNumbers = lines.size();
            return lineNumbers;
        } catch (Exception e) {
            return 0;
        }

    }

}

