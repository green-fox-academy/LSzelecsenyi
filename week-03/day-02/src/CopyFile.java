// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

    public static void main(String[] args) {

        System.out.println(copyFiles("fileToCopy.txt", "fileToCopyTo.txt"));

    }

    public static boolean copyFiles(String source, String destination) {
        try {
            Path myPathFileToCopy = Paths.get(source);
            Path myPathFileToCopyTo = Paths.get(destination);
            try {
                Files.copy(Paths.get(source), new FileOutputStream(destination));
            } catch (Exception e) {

            }
            } catch (Exception e) {
            return false;
        } return true;
    }

}
