import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Methods implements TodoMethodsInterface {

    List<String[]> todoContent;

    @Override
    public void printUsage() {
        try {
            Path myPath = Paths.get(
                    "PrintUsage.txt");
            List<String> lines = Files.readAllLines(myPath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
        }

//        @Override
//        public void listTasks () {
//            try {
//                CSVReader reader = new CSVReader(new FileReader("Tasks.csv"), ' ');
//                todoContent = reader.readAll();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }

//
//        @Override
//        public void removeTask () {
//
//        }
//
//        @Override
//        public void checkTask () {
//
//        }
//
//        @Override
//        public void checkCompleted () {
//
//        }
//
//        @Override
//        public void printHelp () {
//
//        }
    }

    @Override
    public void addNew(ArrayList tasks) {
        tasks.add(new Task());
    }
}
