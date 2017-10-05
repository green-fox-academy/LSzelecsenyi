// This should be the basic replica of the 'cp' command
// If ran from the command line without arguments
// It should print out the usage:
// copy [source] [destination]
// When just one argument is provided print out
// No destination provided
// When both arguments provided and the source is a file
// Read all contents from it and write it to the destination

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Copy {
    public static void main(String[] args) {
        Copy cp = new Copy();

        if (args.length == 0) {
            cp.printUsage();
        } else if (args.length == 1){
            System.out.println("No destination provided");
        } else if (args.length == 3) {
            copyFile(args);
        }

    }

    public void printUsage() {
        try {
            Path myPath = Paths.get("printUsage.txt");
            List<String> lines = Files.readAllLines(myPath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
        }
    }

    public static void copyFile(String[] args) {
        String from = args[1];
        String to = args[2];
        try {
            Path myPath = Paths.get(from);
            List<String> lines = Files.readAllLines(myPath);
            Path destination = Paths.get(to);
            Files.write(destination, lines, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Cannot copy, code is lame");;
        }
    }





}