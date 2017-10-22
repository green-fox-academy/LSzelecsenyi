import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LotteryMethods {

    List<String[]> csvContent;
    List<String[]> filteredContent;
    String source = "C:/Users/Lenovo/Desktop/Green Fox/LSzelecsenyi/week-06/day-03/Lottery/src/main/java/assets/otos.csv";
    String customSource = "C:/Users/Lenovo/Desktop/Green Fox/LSzelecsenyi/week-06/day-03/Lottery/src/main/java/assets/%s";
    String destination = "C:/Users/Lenovo/Desktop/Green Fox/LSzelecsenyi/week-06/day-03/Lottery/src/main/java/assets/out.csv";
    String customDestination = "C:/Users/Lenovo/Desktop/Green Fox/LSzelecsenyi/week-06/day-03/Lottery/src/main/java/assets/%s";

    public void readCSV() {
        try {
            CSVReader reader = new CSVReader( new FileReader(source), ',');
            csvContent = reader.readAll();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCustomFile(String input) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(String.format((customSource), input)), ',');
            csvContent = csvReader.readAll();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writer() {
        try {
            CSVWriter csvWriter = new CSVWriter( new FileWriter(destination), ',', CSVWriter.NO_QUOTE_CHARACTER );
            csvWriter.writeAll(csvContent);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void customFileWriter(String output) {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(String.format(customDestination, output)), ',', CSVWriter.NO_QUOTE_CHARACTER);
            csvWriter.writeAll(csvContent);
            csvWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeSpecificYear(int year) {
        getContent(year);
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(destination), ',', CSVWriter.NO_QUOTE_CHARACTER);
            csvWriter.writeAll(filteredContent);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileWriter(int year, String output) {
        getContent(year);
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(String.format(customDestination, output)), ',', CSVWriter.NO_QUOTE_CHARACTER);
            csvWriter.writeAll(filteredContent);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getContent(int year) {
        filteredContent = new ArrayList<>();
        for (int i = 0; i < csvContent.size(); i++) {
            if (Integer.parseInt(csvContent.get(i)[0]) == year) {
                filteredContent.add(csvContent.get(i));
            }
        }
    }


}
